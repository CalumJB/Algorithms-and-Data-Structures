import com.calumb.util.PrintArray;

public class InsertionSort {

	public static int[] performInsertionSort(int[] array) {
		int length = array.length;
		
		for(int i=1; i<length; i++) {
			for(int j = i; j>0;j--) {
				if(array[j-1] > array[j]) {
					swap(j-1,j,array);
				}
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
