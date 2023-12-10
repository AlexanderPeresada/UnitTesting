package org.example.app;

import org.example.app.service.BonusService;
import org.example.app.utils.Rounder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.example.app.App.getBonus;
import static org.example.app.App.getData;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    private App service;

    @BeforeEach
    void setUp() {
        service = new App();
    }

    @DisplayName("Test the getBonus method with a positive sales value")
    @Test
    void testGetBonusWithExpectedResult() {
        String result = service.getBonus(500);
        assertEquals("50,00", result);
    }

    @DisplayName("Test the getBonus method with a zero sales value")
    @Test
    void testGetBonusWithUnexpectedResult() {
        String result = service.getBonus(0);
        assertNotEquals("0.00", result);
        assertEquals("Incorrect value!", result);
    }

    @AfterEach
    void tearDown() {
        service=null;
    }
}