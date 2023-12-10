package org.example.app.utils;

import org.example.app.service.BonusService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RounderTest {

    private Rounder service;

    @BeforeEach
    void setUp() {
        service =  new Rounder();
    }

    @DisplayName("Test the roundValue method")
    @Test
    void testRoundValue() {
        // Test the roundValue method with a positive value
        String result = service.roundValue(50.12345);
        assertEquals("50,12", result);
        // Test the roundValue method with a negative value
        result = service.roundValue(-25.6789);
        assertEquals("-25,68", result);
    }
    @AfterEach
    void tearDown() {
    }
}