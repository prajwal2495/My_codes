/*For a non-negative integer X, the array-form of X is an array of its digits in left to right order.  For example, if X = 1231, then the array form is [1,2,3,1].

Given the array-form A of a non-negative integer X, return the array-form of the integer X+K.*/




class addArrayAndConstant {
    public List<Integer> addToArrayForm(int[] A, int K) 
    {
        String str = "";
        for(int i = 0; i < A.length; i++)
        {
            str = str + A[i];
        }
        int result = Integer.parseInt(str);
        result = result + K;
        str = Integer.toString(result);
        
        List<Integer> digits = new ArrayList<Integer>();
        for(int i = 0; i < str.length(); i++)
        {
            //int digit = result % 10;  // Store digit in a variable
            //result = result/10;
            digits.add(str.charAt(i) - '0');
        }
        return digits;
    }
}