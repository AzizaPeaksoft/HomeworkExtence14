package com.company;

public class Person {
    private String name;
    private String designation;

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }
    public void Learn () {
        System.out.print(" Learn ,");
    }
    public void walk () {
        System.out.print(" Walk ,");
    }
    public void eat () {
        System.out.println(" Eat ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return " Name: " + name + ", Designation: " + designation;
    }
}

