
public class Test {
	
	public static void main(String[] args) {
		int[] array = {7,4,5,1,9,8,3,2,6};
	
		array = InsertionSort.performInsertionSort(array);
		
		
		for(int i=0; i<array.length; i++) {
			System.out.printf("%d ", array[i]);
		}
		
	}
}
