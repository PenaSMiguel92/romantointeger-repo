import java.util.*;

public class Solution {

    char[] symbols = new char[] { 'I', 'V', 'X', 'L', 'C', 'D', 'M' };
    int[] values = new int[] { 1, 5, 10, 100, 500, 1000 };

    public int romanToInt(String s) {
        
        int value = 0;

        for (int index = 0; index < s.length(); index++) {
            if ((index + 1) >= s.length())
                continue;

            char currentChar = s.charAt(index);
            char nextChar = s.charAt(index + 1);

            int currentCharIndex = indexOf(currentChar);
            int nextCharIndex = indexOf(nextChar);

            if (nextCharIndex > currentCharIndex) {
                int addVal = -values[currentCharIndex];
                value += addVal;
            } else {
                value += values[currentCharIndex];
            }
        }
        
        return value;
    }

    public int indexOf(char val) {
        for (int index = 0; index < symbols.length; index++) {
            if (symbols[index] == val) {
                return index;
            }
        }
        return 0;
    }


}
