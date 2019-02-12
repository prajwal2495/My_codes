/*Given a positive integer, return its corresponding column title as appear in an Excel sheet.

For example:

    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB 
    ...

Example 1:

Input: 1
Output: "A"
*/



class excelNumbertToTitle {
    public String convertToTitle(int columnNumber) 
    {
         StringBuilder columnName = new StringBuilder(); 
  
        while (columnNumber > 0) 
        { 
            // Find remainder 
            int rem = columnNumber % 26; 
  
            // If remainder is 0, then a  
            // 'Z' must be there in output 
            if (rem == 0) 
            { 
                columnName.append("Z"); 
                columnNumber = (columnNumber / 26) - 1; 
            } 
            else // If remainder is non-zero 
            { 
                columnName.append((char)((rem - 1) + 'A')); 
                columnNumber = columnNumber / 26; 
            } 
        }
        columnName = columnName.reverse();
        String result = columnName.toString();
        return result;
    }
}
