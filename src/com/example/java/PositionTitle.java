package com.example.java;


public enum PositionTitle {
    ADM("Administration"), PROD("Production"), SALE("Sales"), MNT("Maintenance"), TECH("Technical"), SECT("Secretarial");

    private final String name;

    private PositionTitle(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }


}
