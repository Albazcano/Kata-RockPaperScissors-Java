package com.factoriaf5.rps.domain.models;

import com.factoriaf5.rps.domain.contracts.InterfaceObject;

public class Rock implements InterfaceObject {
    String name = "Rock";

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

    @Override
    public String toString() {
        return "Rock {name: " + this.getName() + "}";
    }
    
    @Override
    public String getObject() {
        return "Rock";
    }
}