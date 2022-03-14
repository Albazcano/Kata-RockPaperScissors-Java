package com.factoriaf5.rps.models;

import static org.junit.Assert.*;

import org.junit.Test;

public class PaperTest {
    
    @Test
    public void isPaper() {
        Paper obj = new Paper();

        String result = obj.getName();

        assertEquals("Paper", result);
    }

}