package com.factoriaf5.rps.models;

import static org.junit.Assert.*;

import org.junit.Test;

public class ScissorsTest {
    
    @Test
    public void isScissors() {
        Scissors obj = new Scissors();

        String result = obj.getName();

        assertEquals("Scissors", result);
    }

}