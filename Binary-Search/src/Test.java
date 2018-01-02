
public class Test {
	
	public static void main(String[] args) {
		
		int[] array = {1,3,4,5,7,9,10};
		int value = 10;
		int position = BinarySearch.performBinarySearch(array, value);
		System.out.println("Value " + value + " found in position: " + position);
	}
	
}
