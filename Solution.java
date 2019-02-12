/*In a array A of size 2N, there are N+1 unique elements, and exactly one of these elements is repeated N times.

Return the element repeated N times.*/


class Solution {
    public int repeatedNTimes(int[] A) 
    {
        HashMap<Integer,Integer> result = new HashMap<Integer,Integer>();
        //int n = (A.length / 2);
        for(int i = 0; i < A.length; i++)
        {
            if(!result.containsKey(A[i]))
                result.put(A[i], 1);
            else
                result.put(A[i], result.get(A[i]) + 1);
        }
       for(int k : result.keySet())
        if(result.get(k) > 1)
            return k;
        
        throw null;
    }
}