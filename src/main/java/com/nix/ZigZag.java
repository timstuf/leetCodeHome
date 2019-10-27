package com.nix;

import java.util.Arrays;

public class ZigZag {
    public String convert(String s, int numRows) {
        if (s == null) throw new NullPointerException();
        if (s.length() == 0) throw new IllegalStateException();
        if(numRows==0) throw new IllegalArgumentException();
        if(s.length()<=numRows || numRows==1)  return s;

        String[] result = new String[numRows];
        Arrays.fill(result, "");
        int columns = s.length()/(numRows*2-2);
        boolean down = true;
        int row = 0;

        for(int i = 0; i<s.length(); i++)
        {
            if(down) result[row++] += s.charAt(i);
            else result[row--] += s.charAt(i);
            if(row==0 || row==numRows-1) down = !down;
        }
        String stringResult = "";
        for(int i = 0; i<numRows; i++)
        {
            stringResult+=result[i];
        }
        return stringResult;
    }
}
