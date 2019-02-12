/*Given a column title as appear in an Excel sheet, return its corresponding column number.

For example:

    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 
    ...
*/


class excelTitleToNumber {
    public int titleToNumber(String s) {
        char[] chars = s.toCharArray();
        int len = s.length();
        int out = 0;
        for(int j=len-1, i=0; j>=0 && i<len; j--,i++) {
            out += ((chars[j] - 'A'+1) * (int)Math.pow(26, i));
        }
        return out;
    }
}
