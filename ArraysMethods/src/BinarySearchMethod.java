import java.util.Arrays;

public class BinarySearchMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] {34,67,88,50,20};
		
		Arrays.sort(arr); //sorting
		
		int key = 88;
		
		System.out.println(key + " found at index "+Arrays.binarySearch(arr, key));
	}

}
