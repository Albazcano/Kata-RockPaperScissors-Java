package com.factoriaf5.rps.domain.models;

import com.factoriaf5.rps.domain.contracts.InterfaceObject;

public class Object {
    public Object() {
    }

    public InterfaceObject createObject(String obj){
        if (obj == null)
        return null;

        if (obj == "Rock")
        return new Rock(); 

        if (obj == "Paper")
        return new Paper(); 

        if (obj == "Scissors")
        return new Scissors();
        
        return null; 
    }
}
