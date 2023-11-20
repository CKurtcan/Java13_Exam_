package com.CK.entity;

import com.CK.Enum.EGender;
import com.CK.Enum.ENation;
import com.CK.Enum.EReligion;
import com.CK.Enum.ESituation;
import com.CK.utility.DataBase;

import static com.CK.utility.DataBase.getVaccineNum;

public class NormalInsan extends Insan {

    private ESituation situation;

    public NormalInsan(String name, String surname, EGender gender, String age, EReligion religion, ENation nation, boolean vaccine, ESituation situation) {
        super(name, surname, gender, age, religion, nation, vaccine);
        this.situation = situation;
    }

    public ESituation getSituation() {
        return situation;
    }

    public void setSituation(ESituation situation) {
        this.situation = situation;
    }

    public void asilamaYap() {
        if (!isVaccine()){
            if (getSituation() == ESituation.CARRIER) {
                System.out.println("Aşı yapıldı: " + this);
                DataBase.getVaccinatedList()[getVaccineNum()] = this;
                DataBase.setVaccineNum(DataBase.getVaccineNum() + 1);
                System.out.println("Aşı yapılanlar listesine eklendi");
            } else {
                System.out.println("Aşı yapılamadı. İnsan hastalık taşımıyor veya hasta.");
            }
        }
        else {
            System.out.println();
            DataBase.getVaccinatedList()[getVaccineNum()] = this;
            DataBase.setVaccineNum(DataBase.getVaccineNum() + 1);
            System.out.println("Aşı yapılanlar listesine eklendi");
        }
    }
}
