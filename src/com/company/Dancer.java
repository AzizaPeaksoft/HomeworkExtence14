package com.company;

public class Dancer extends Person {
    private String groupName;
    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }
    void dancing () {
        System.out.println(getName()  +  " dancer");
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "Group name: " + groupName + super.toString();
    }
}

