

public class MergeSort {
	
	
	private static void merge(int[] array)
	{
		int length = array.length;
		if(length<2)
		{
			System.out.printf("%d ", array[0]);
			return;
		}
		int l = length/2;
		int r = length-l;
		
		//create left array and fill with values
		int[] leftArray = new int[l];
		for(int i=0; i<l; i++)
		{
			leftArray[i] = array[i];
		}
		
		//create right array and fill with values
		int[] rightArray = new int[r];
		for(int j=0; j<r;j++)
		{
			rightArray[j] = array[j + l];
		}
		
		merge(leftArray);
		merge(rightArray);
		
		doMerge(leftArray, rightArray, array);
		
		
		
	}
	
	private static void doMerge(int[] leftA, int[] rightA, int[] resultA)
	{
		int ll = leftA.length;
		int rl = rightA.length;
		
		int i = 0;
		int j = 0;
		int k = 0;
		while(i < ll && j < rl)
		{
			if(leftA[i] < rightA[j])
			{
				resultA[k] = leftA[i];
				i++;
			} else {
				resultA[k] = rightA[j];
				j++;
			}
			k++;
		}
		
		while(i<ll) {
			resultA[k] = leftA[i];
			i++;
			k++;
		}
		while(j<rl){
			resultA[k] = rightA[j];
			j++;
			k++;
		}
	}
	
	public static void main(String[] args)
	{
		
		int[] ar = {2,4,1,6,8,5,3,7};
		merge(ar);
		System.out.println();
		
		for(int i=0; i<8; i++)
		{
			System.out.printf("%d ", ar[i]);
		}
		
		
		
	}



}
