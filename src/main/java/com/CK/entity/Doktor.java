package com.CK.entity;

import com.CK.Enum.EDSituation;
import com.CK.Enum.EGender;
import com.CK.Enum.ENation;
import com.CK.Enum.EReligion;

public class Doktor extends Insan{

    public EDSituation situation;

    public Doktor(String name, String surname, EGender gender, String age, EReligion religion, ENation nation, EDSituation situation) {
        super(name, surname, gender, age, religion, nation, true);
        this.situation = situation;
    }
}
