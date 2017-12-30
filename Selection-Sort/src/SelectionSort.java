import com.calumb.util.*;

public class SelectionSort {

	public static int[] performSelectionSort(int[] array) {
		
		int length = array.length;
		
		PrintArray.printIntArray(array);
		
		//for every value in the array go up the list and swap it with the smallest value
		for(int i=0; i<length-1; i++) {
			int smallest = i;
			for(int j=i+1; j<length;j++) {
				if(array[j] < array[smallest]) {
					smallest = j;
				}
				
			}
			//if value of smallest has changed
			if(smallest != i) {
				swap(i, smallest, array);
			}
			
			PrintArray.printIntArray(array);
		}
		
		return array;
		
	}
	
	private static void swap(int a, int b, int[] array) {
		
		int tempa = array[a];
		array[a] = array[b];
		array[b] = tempa;
		
	}
}
