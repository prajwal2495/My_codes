import java.util.Scanner;


public class Permutation 
{ 
    public static void main(String[] args) 
    { 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		String str = scan.nextLine();
        //String str = "123"; 
        int n = str.length(); 
		
        Permutation permutation = new Permutation(); 
        permutation.permute(str, 0, n-1); 
		
    } 
  
    
    private void permute(String str, int l, int r) 
    { 
        if (l == r) 
		{
			System.out.println(str); 
			int result = Integer.parseInt(str);
			if(result%8 ==0)
			{
				System.out.print("divisible by 8");
			}
			else
			{
				System.out.println("Not divisible by 8");
			}
		}
        else
        { 
            for (int i = l; i <= r; i++) 
            { 
                str = swap(str,l,i); 
                permute(str, l+1, r); 
                str = swap(str,l,i); 
            } 
		}
		
		
    } 
  
    public String swap(String a, int i, int j) 
    { 
        char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
    } 
} 