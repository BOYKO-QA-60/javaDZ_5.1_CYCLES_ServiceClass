package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ServiceClassTest {
    @Test
    void for3() {
        ServiceClass service = new ServiceClass();

        int income = 10000;
        int expense = 3000;
        int threshold = 20000;

        int actual = service.calculate(income, expense, threshold);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void for2() {
        ServiceClass service = new ServiceClass();

        int income = 100000;
        int expense = 60000;
        int threshold = 150000;

        int actual = service.calculate(income, expense, threshold);
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }
}