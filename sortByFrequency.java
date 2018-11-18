public class sortByFrequency
{
	static int row_count = 0;
	public static void main(String[] args)
	{
		int elements[] = {4,3,1,6,4,3,6,4};
		int freqArray[][] = new int[elements.length][2];
		elements = sortArray(elements);
	
		freqArray[row_count][0] = elements[0];
		
		for(int i=1;i<elements.length;i++)
		{
			if(elements[i] == elements[i-1])
			{
				freqArray[row_count][1] = freqArray[row_count][1] + 1;
			}
			else
			{
				row_count++;
				freqArray[row_count][0] = elements[i];
			}
		}
		row_count++;
		freqArray = sortArray(freqArray);
		
		for(int i=0;i<row_count;i++)
		{
			for(int j=0;j<=freqArray[i][1];j++)
			{
				System.out.print(" " + freqArray[i][0]);
			}
		}
		System.out.println(" ");
		
	}
	public static int[] sortArray(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}
	public static int[][] sortArray(int b[][])
	{
		int c[] = new int[2];
		for(int i=0;i<row_count;i++)
		{
			for(int j=i;j<row_count;j++)
			{
				if(b[i][1] < b[j][1])
				{
					c = b[i];
					b[i] = b[j];
					b[j] = c;
				}
			}
		}
		return b;
	}
}
	