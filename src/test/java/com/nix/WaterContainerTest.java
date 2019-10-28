package com.nix;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WaterContainerTest {
    private WaterContainer waterContainerInstance;

    @Before
    public void before() {
        waterContainerInstance = new WaterContainer();
    }

    @Test(expected = IllegalStateException.class)
    public void NoArray() {
        waterContainerInstance.maxArea(null);
    }

    @Test(expected = IllegalStateException.class)
    public void TooLittle() {
        int[] height = new int[1];
        waterContainerInstance.maxArea(height);
    }

    @Test
    public void Leet()
    {
        int[]height = {1,8,6,2,5,4,8,3,7};
        int expected = 49;
       int actual =  waterContainerInstance.maxArea(height);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void AllZeros()
    {
        int[]height = {0,0,0,0,0,0};
        int expected = 0;
        int actual =  waterContainerInstance.maxArea(height);
        Assert.assertEquals(actual,expected);
    }

}
