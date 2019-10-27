package com.nix;

public class WaterContainer {
    public int maxArea(int[] height) {
        if (height == null || height.length < 2) throw new IllegalStateException();
        int max = 0, temp = 0, line1 = 0, line2 = height.length - 1;
        while (line1 < line2) {
            temp = (line2 - line1) * Math.min(height[line1], height[line2]);
            max = Math.max(max, temp);
            if (height[line1] < height[line2]) line1++;
            else line2--;
        }
        return max;
        /*for(int i = 0; i< height.length-1; i++)
        {
            if(height[height.length-1-i]> height[line2]) line2 = height.length-1-i;
            if(height[i+1]> height[line1]) line1 = i+1;
        }

        /*for(int i = 0; i< height.length-1; i++)
        {
            for(int j = i+1; j<height.length; j++)
            {
                temp = (j-i)*Math.min(height[i], height[j]);
                max = Math.max(max, temp);
            }
        }*/
    }
}
