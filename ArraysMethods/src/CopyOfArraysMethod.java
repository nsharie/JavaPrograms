import java.util.Arrays;

public class CopyOfArraysMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int originalArr[] = new int[] {10,20,30,40};
		
		int copyArr[] = Arrays.copyOf(originalArr, originalArr.length);
		
		System.out.println("Array Contents are...");
		for(int i=0;i<copyArr.length;i++) {
			System.out.print(copyArr[i]+" ");
		}

	}

}
