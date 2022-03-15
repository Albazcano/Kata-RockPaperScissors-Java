package com.factoriaf5.rps.models;

import static org.junit.Assert.*;

import com.factoriaf5.rps.domain.models.Rock;

import org.junit.Test;

public class RockTest {
    
    @Test
    public void isRock() {
        Rock obj = new Rock();

        String result = obj.getName();

        assertEquals("Rock", result);
    }

}