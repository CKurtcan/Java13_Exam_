package com.CK.entity;

import com.CK.Enum.EGender;
import com.CK.Enum.ENation;
import com.CK.Enum.EReligion;

public class SuperInsan extends Insan{
    public SuperInsan(String name, String surname, EGender gender, String age, EReligion religion, ENation nation, boolean vaccine) {
        super(name, surname, gender, age, religion, nation, vaccine);
    }
}
