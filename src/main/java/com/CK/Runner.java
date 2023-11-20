package com.CK;

import com.CK.Enum.EGender;
import com.CK.Enum.ENation;
import com.CK.Enum.EReligion;
import com.CK.Enum.ESituation;
import com.CK.entity.Insan;
import com.CK.entity.NormalInsan;
import com.CK.entity.Saglik;
import com.CK.utility.DataBase;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        console();

    }

    public static void raporGoruntule() {
        System.out.println("Aşılama Yapılan İnsanlar:");
        for (int i = 0; i < DataBase.getVaccineNum(); i++) {
            System.out.println(DataBase.getVaccinatedList()[i].getName() + " " + DataBase.getVaccinatedList()[i].getSurname());
        }
    }

    public static void console(){
        System.out.println("*******************************");
        System.out.println("***** ASI KONTROL SISTEMI *****");
        System.out.println("*******************************");

        System.out.println("Yapmak Istediğiniz Islemi Numarasını Girerek Seçiniz");
        System.out.println("1. Hasta Kayıt Oluşturma");
        System.out.println("2. Aşılı Insanlar Listesi");
        System.out.println("3. CIKIS");

        secim();

    }

    public static void secim(){
        int select = new Scanner(System.in).nextInt();
        process(select);
    }

    public static void process(int select) {

        while (select != 0){
            switch (select) {
                case 1:
                    hastaKayitOlustur();
                    break;
                case 2:
                    raporGoruntule();
                    break;
                case 0:
                    System.out.println("Programdan çıkılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz seçenek, lütfen tekrar deneyin.");
                    break;
            }
            console();
        }
    }

    public static void hastaKayitOlustur() {
        System.out.println("Enter patient name...: ");
        String name = new Scanner(System.in).next();

        System.out.println("Enter patient surname...: ");
        String surname = new Scanner(System.in).next();

        System.out.println("Enter patient gender (MALE/FEMALE)...: ");
        EGender gender = EGender.valueOf(new Scanner(System.in).next().toUpperCase());

        System.out.println("Enter patient age...: ");
        String age = new Scanner(System.in).next();

        System.out.println("Enter patient religion (MUSLIM, CHRISTIAN, JEWISH)...: ");
        EReligion religion = EReligion.valueOf(new Scanner(System.in).next().toUpperCase());

        System.out.println("Enter patient nation (TURK, ARABIC, UKRAINIAN, RUSSIAN)...: ");
        ENation nation = ENation.valueOf(new Scanner(System.in).next().toUpperCase());

        System.out.println("Is the patient vaccinated? (true/false): ");
        boolean vaccine = new Scanner(System.in).nextBoolean();

        System.out.println("Enter patient status (SICK, CARRIER, HEALTHY)...: ");
        ESituation situation = ESituation.valueOf(new Scanner(System.in).next().toUpperCase());

        NormalInsan patient = new NormalInsan(name, surname, gender, age, religion, nation, vaccine, situation);
        if (!vaccine){
            patient.asilamaYap();
            DataBase.addVaccinatedList(patient);
        }


        System.out.println("Patient successfully registered...:");
        System.out.println(patient);
    }

}
