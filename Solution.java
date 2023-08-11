public class Solution {

    public int romanToInt(String s) {

        int returnValue = 0;
        short nextVal = 0;
        short curVal = 0;
        for (int index = 0; index < s.length(); index++) {
            curVal = getRomanValue(s.charAt(index));
            if (index + 1 < s.length()) {
                nextVal = getRomanValue(s.charAt(index + 1));

                if (nextVal > curVal) {
                    returnValue -= curVal;
                } else {
                    returnValue += curVal;
                }
            } else {
                returnValue += curVal;
            }
        }

        return returnValue;
    }
    
    public short getRomanValue(char val) {
        switch (val) {
                case 'M':
                    return 1000;
                case 'D':
                    return 500;
                case 'C':
                    return 100;
                case 'L':
                    return 50;
                case 'X':
                    return 10;
                case 'V':
                    return 5;
                case 'I':
                    return 1;
                default:
                    return 0;
            }
    }


}
