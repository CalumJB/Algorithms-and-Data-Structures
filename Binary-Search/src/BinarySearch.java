

public class BinarySearch {
	
	public static int performBinarySearch(int[] array, int value) {
		
		int length = array.length;
		int top = length-1;
		int bottom = 0;
		while(true) {
			int mid = ((top-bottom)/2)+bottom;
			
			if(top == bottom && array[mid] != value)
				return -1;
			
			if(array[mid] == value) {
				return mid;
			}
			else if(array[mid] > value) {
				top = mid-1;
			} else {
				bottom = mid + 1;
			}
		}
	}
}
