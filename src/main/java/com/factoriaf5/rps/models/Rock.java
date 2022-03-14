package com.factoriaf5.rps.models;

public class Rock {
    private String name = "Rock";

    public Rock(){
    }

    public Rock (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;  
    }
}