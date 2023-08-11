public class Solution {

    char[] symbols = new char[] { 'I', 'V', 'X', 'L', 'C', 'D', 'M' };
    int[] values = new int[] { 1, 5, 10, 50, 100, 500, 1000 };

    public int romanToInt(String s) {
        
        int value = 0;

        for (int index = 0; index < s.length(); index++) {
            char currentChar = s.charAt(index);
            int currentCharIndex = indexOf(currentChar);
            if ((index + 1) < s.length()) {
                char nextChar = s.charAt(index + 1);
                int nextCharIndex = indexOf(nextChar);
                if (nextCharIndex > currentCharIndex) {
                    int addVal = -values[currentCharIndex];
                    value += addVal;
                } else {
                    value += values[currentCharIndex];
                }
            } 
            else {
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
