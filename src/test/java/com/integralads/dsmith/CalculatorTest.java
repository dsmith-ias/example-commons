package com.integralads.dsmith;

import junit.framework.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Assert.assertEquals(Calculator.add(1, 2), 3);
    }

    @Test
    public void testMultiply() {
        Assert.assertEquals(Calculator.multiply(2, 3), 6);
    }
}