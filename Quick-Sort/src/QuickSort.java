
public class QuickSort {

	private static int[] array = {1,2,3,4,5,6,7,8};
	
	public static void quickSort(int[] ar, int start, int end)
	{
		for(int i=0; i<8;i++)
		{
			System.out.printf("%d ", array[i]);
		}
		System.out.println();
		
		if(start >= end)
		{
			System.out.println("Return");
			return;
		}
		
		int pivot = end;
		pivot = partition(ar, start, pivot-1, pivot);
		
		
		
		
		quickSort(ar, start, pivot-1);
		
		
		quickSort(ar,pivot+1, end);
		
		
		
		
	}
	
	private static int partition(int[] ar, int left, int right, int pivot)
	{
		while(true)
		{
			while(ar[left] < ar[pivot])
			{
				left++;
			}
			while(ar[right] > ar[pivot] && (right>0))
			{
				right--;
			}
			if(left >= right)
			{
				if(ar[pivot] < ar[left])
				{
					System.out.println("left: " + ar[left] + " pivot: " + ar[pivot]);
					pivot = swap(pivot, left, ar);
				}
				return pivot;
			} else
			{
				System.out.println("left: " + ar[left] + " right: " + ar[right]);
				swap(left, right, ar);
			}
		}
		
	}
	
	private static int swap(int pivot, int b, int[] ar)
	{
		int tempa = ar[pivot];
		ar[pivot] = ar[b];
		ar[b] = tempa;
		return b;
	}
	
	public static void main(String args[]) {
		quickSort(array, 0, 7);
		
		for(int i=0; i<8;i++)
		{
			System.out.printf("%d ", array[i]);
		}
	}
	
}
