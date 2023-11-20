package com.CK.utility;

import com.CK.entity.Insan;
import com.CK.entity.NormalInsan;

public class DataBase {

    private static Insan[] vaccinatedList = new Insan[100];

    private static int vaccineNum = 0;

    public static void addVaccinatedList(NormalInsan patient) {
        vaccinatedList[vaccineNum] = patient;
        vaccineNum++;
    }


    public static Insan[] getVaccinatedList() {
        return vaccinatedList;
    }

    public static void setVaccinatedList(Insan[] vaccinatedList) {
        DataBase.vaccinatedList = vaccinatedList;
    }

    public static int getVaccineNum() {
        return vaccineNum;
    }

    public static void setVaccineNum(int vaccineNum) {
        DataBase.vaccineNum = vaccineNum;
    }
}
