import java.util.Iterator;

public class Sorting {
	static int[] sorting(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			int min = arr[i];
			int pos = i;
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<min) {
					min = arr[j];
					pos = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[pos];
			arr[pos] = temp;
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {40,60,5,10};
		sorting(arr);
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}

}
