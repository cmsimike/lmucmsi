package edu.lmu.cmsi.mike.mavenexample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestLameSubtract {

      @Test
    public void subtractGood() {
        LameSubtract ls = new LameSubtract();
        int output = ls.subtract(500, 100);
        assertEquals("failure - subtraction didn't return expected value", 500-100, output);
    }


    @Test
    public void subtractBad() {
        LameSubtract ls = new LameSubtract();
        int output = ls.subtract(500, 100);
        assertEquals("failure - subtraction didn't return expected value", 500-110, output);
  }
}