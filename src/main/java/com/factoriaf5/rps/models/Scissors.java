package com.factoriaf5.rps.models;

public class Scissors {
    private String name = "Scissors";

    public Scissors(){
    }

    public Scissors (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;  
    }
}
