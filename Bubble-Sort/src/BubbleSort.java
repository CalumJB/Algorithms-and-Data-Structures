public class BubbleSort {

	

	public static void main(String args[]) {
		int size = 5;
		int[] array = {5, 4, 1, 2, 3};
		
		
		bubble(size, array);
		
		//print
		for(int i=0; i<size; i++)
		{
			System.out.printf("%d ", array[i]);
		}
		

		
	}
	
	//bubble sort method
	public static void bubble(int n, int[] ar)
	{
		int counter = 0;
		for(int j=0; j<n-1;j++)
		{
			//bubble largest value to end
			for(int k=0;k<n-1;k++)
			{
				//compare to ints
				if(ar[k]>ar[k+1])
				{
					swap(k,k+1, ar);
				}
				counter++;
			}
		}
		System.out.printf("Count: %d\n", counter);
	}
	
	
	//method to swap elements in array
	public static void swap(int a, int b, int[] ar)
	{
		int temp = ar[a];
		ar[a] = ar[b];
		ar[b] = temp;
	}
	
}
