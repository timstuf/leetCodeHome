package com.nix;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        if (s == null) throw new NullPointerException();
        if (s.length() == 0) return 0;
        int max = 1, currentLength = 1, uniqueSymbolsActualLength = 1;

        int[] uniqueSymbols = new int[s.length()];
        char[] characters = s.toCharArray();
        uniqueSymbols[0] = 0;

        for (int i = 1; i < s.length(); i++) {
            for (int j = 0; j < uniqueSymbolsActualLength; j++) {
                if (characters[i] != characters[uniqueSymbols[j]]) {
                    continue;
                }
                i = uniqueSymbols[j] + 1;
                uniqueSymbolsActualLength = 0;
                currentLength = 0;
                uniqueSymbols = new int[s.length() - i];
                break;
            }
            uniqueSymbols[uniqueSymbolsActualLength++] = i;
            currentLength++;
            if (max < currentLength) {
                max = currentLength;
            }
        }

        return max;

    }

    public static void main(String[] args) {
        int a = lengthOfLongestSubstring("anvajkl");
    }
}
