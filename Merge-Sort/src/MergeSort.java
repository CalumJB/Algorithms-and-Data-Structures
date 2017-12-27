

public class MergeSort {
	
	MergeSort(){}
	public static void merge(int[] array)
	{
		int length = array.length;
		
		//if array only has one value the return
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
		
		//recursively call until only one element in each array
		merge(leftArray);
		merge(rightArray);

		//merge the left and right arrays into one so they are in order
		//The first merge will be on arrays with one element
		// At the next level up, it'll be on arrays with two elements in order thanks to the first merge
		// As the program comes out of the recursions it will continue to order correctly
		doMerge(leftArray, rightArray, array);
		
		
		
	}
	
	
	//do merge takes in the left and right array and puts them into another array
	//the result array is taken in so that a new array does not have to be created, saving memory.
	private static void doMerge(int[] leftA, int[] rightA, int[] resultA)
	{
		int ll = leftA.length;
		int rl = rightA.length;
		
		int i = 0;
		int j = 0;
		int k = 0;
		//while there are element left in both array
		while(i < ll && j < rl)
		{
			//check each of the smallest elements pointed to and put in result array
			//then increment the counter so it is pointing at the next element/
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
		
		//once one of the arrays are empty simply add the result of the elements in the other array to the result array
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
	
	


}
