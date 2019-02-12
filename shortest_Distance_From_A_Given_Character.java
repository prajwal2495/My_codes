/*Given a string S and a character C, return an array of integers representing the shortest distance from the character C in the string.

Example 1:

Input: S = "loveleetcode", C = 'e'
Output: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]*/



import java.lang.*;

class shortest_Distance_From_A_Given_Character {
    public int[] shortestToChar(String S, char C) 
    {
      int[] result = new int[S.length()];        
    for(int i=0;i<result.length;i++)
    {           
        int left = S.substring(0,i).lastIndexOf(C);
        int right= S.substring(i).indexOf(C);
            
        if(left>-1 && right>-1)
           result[i]=Math.min(i-left,right);
        else if(left>-1)
            result[i]=i-left;
        else
            result[i]=right;
    }
        
    return result;
        
        
    }
}
