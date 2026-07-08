package com.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        Assert.assertEquals(calculator.add(10, 5), 15);
    }

    @Test
    public void testSubtract() {
        Assert.assertEquals(calculator.subtract(10, 5), 5);
    }

    @Test
    public void testMultiply() {
        Assert.assertEquals(calculator.multiply(10, 5), 50);
    }

    @Test
    public void testDivide() {
        Assert.assertEquals(calculator.divide(10, 5), 2);
    }
}