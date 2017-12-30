
public class Test {

	public static void main(String[] args)
	{
		
		int[] ar = {2,4,1,6,8,5,3,7};
		MergeSort.merge(ar);
		System.out.println();
		
		for(int i=0; i<8; i++)
		{
			System.out.printf("%d ", ar[i]);
		}
		
		
		
	}

}
