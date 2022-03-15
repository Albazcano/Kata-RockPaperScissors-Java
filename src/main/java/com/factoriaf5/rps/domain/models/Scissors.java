package com.factoriaf5.rps.domain.models;

import com.factoriaf5.rps.domain.contracts.InterfaceObject;

public class Scissors implements InterfaceObject {
    String name = "Scissors";

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

    @Override
    public String toString() {
        return "Scissors {name: " + this.getName() + "}";
    }
    
    @Override
    public String getObject() {
        return "Scissors";
    }
}
