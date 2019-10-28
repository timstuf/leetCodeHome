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
    }
}
