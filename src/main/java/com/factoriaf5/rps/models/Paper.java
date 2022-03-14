package com.factoriaf5.rps.models;

public class Paper {
    private String name = "Paper";

    public Paper(){
    }

    public Paper (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
