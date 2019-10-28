package com.nix;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ZigZagTest {
    private ZigZag zigZagInstance;

    @Before
    public void before() {
        zigZagInstance = new ZigZag();
    }

    @Test(expected = NullPointerException.class)
    public void NullString() {
        zigZagInstance.convert(null, 5);
    }

    @Test(expected = IllegalStateException.class)
    public void ZeroString() {
        String s = "";
        zigZagInstance.convert(s, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ZeroRows() {
        zigZagInstance.convert("ss", 0);
    }

    @Test
    public void Paypal3() {
        String expected = "PAHNAPLSIIGYIR";
        String actual = zigZagInstance.convert("PAYPALISHIRING", 3);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void MoreRows() {
        String expected = "aqw";
        String actual = zigZagInstance.convert("aqw", 4);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void OneRow() {
        String expected = "aqw";
        String actual = zigZagInstance.convert("aqw", 1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void PayPal4() {
        String expected = "PINALSIGYAHRPI";
        String actual = zigZagInstance.convert("PAYPALISHIRING", 4);
        Assert.assertEquals(expected, actual);
    }
}
