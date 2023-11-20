package com.CK.entity;

import com.CK.Enum.EGender;
import com.CK.Enum.ENation;
import com.CK.Enum.EReligion;

import java.util.UUID;

public class Insan {

    String id;
    String name;
    String surname;
    EGender gender;
    String age;
    EReligion religion;
    ENation nation;
    boolean vaccine;

    public Insan() {
        id = UUID.randomUUID().toString();
    }

    public Insan (String name, String surname, EGender gender, String age, EReligion religion, ENation nation, boolean vaccine) {
        this();
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
        this.religion = religion;
        this.nation = nation;
        this.vaccine = vaccine;



    }

    @Override
    public String toString() {
        return "Insan{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender=" + gender +
                ", age='" + age + '\'' +
                ", religion=" + religion +
                ", nation=" + nation +
                ", vaccine=" + vaccine +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public EGender getGender() {
        return gender;
    }

    public void setGender(EGender gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public EReligion getReligion() {
        return religion;
    }

    public void setReligion(EReligion religion) {
        this.religion = religion;
    }

    public ENation getNation() {
        return nation;
    }

    public void setNation(ENation nation) {
        this.nation = nation;
    }

    public boolean isVaccine() {
        return vaccine;
    }

    public void setVaccine(boolean vaccine) {
        this.vaccine = vaccine;
    }
}
