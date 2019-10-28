package com.nix;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class LongestSubstringTest {
    private LongestSubstring longestSubstringInstance;
    @Before
    public void before()
    {
        longestSubstringInstance = new LongestSubstring();
    }

    @Test(expected = NullPointerException.class)
    public void NullString() {
        longestSubstringInstance.lengthOfLongestSubstring(null);
    }

    @Test
    public void ZeroString() {
        int expected = 0;
        int actual = longestSubstringInstance.lengthOfLongestSubstring("");
    }

    @Test
    public void ABC()
    {
        int expected = 3;
        int actual = longestSubstringInstance.lengthOfLongestSubstring("acabcabc");
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void AllSame()
    {
        int expected = 1;
        int actual = longestSubstringInstance.lengthOfLongestSubstring("aaaa");
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void AllDifferent()
    {
        int expected = 5;
        int actual = longestSubstringInstance.lengthOfLongestSubstring("abcde");
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void RepeatOnce()
    {
        int expected = 7;
        int actual = longestSubstringInstance.lengthOfLongestSubstring("anviajkl");
        Assert.assertEquals(expected,actual);
    }
}
