package com.company;

public class Singer extends Person {
    private String bandName;
    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }
    void signingPlayGitar () {
        System.out.println(getName()  + " singer");
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    @Override
    public String toString() {
        return "Band name "  + bandName + super.toString();
    }
}

