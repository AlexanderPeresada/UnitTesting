package org.example.app.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    private BonusService service;

    @BeforeEach
    void setUp() {
        service = new BonusService();
    }

    @DisplayName("Test the calcBonus method with a positive sales value")
    @Test
    void testCalcBonusWithExpectedResult() {
        double result = service.calcBonus(500);
        assertEquals(50, result);
    }
    @DisplayName("Test the calcBonus method with a zero sales value")
    @Test
    void testCalcBonusWithUnexpectedResult() {
        double result = service.calcBonus(0);
        assertEquals(0, result);
    }

    @AfterEach
    void tearDown() {
        service=null;
    }
}