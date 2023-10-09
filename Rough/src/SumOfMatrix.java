import java.util.Scanner;

public class SumOfMatrix {
	
	public static int sumOfDiagonals(int arr[][]) {
		
		
		int right = 0,left = 0,res;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(i==j) {
					right = right+arr[i][j];
				}
			}
		}
		
		int j = arr.length-1;
		for(int i=0;i<arr.length;i++) {
				if(j>=0) {
				left = left+arr[i][j];
				j--;
			}
		}
		
		res = right + left;
		
		return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[3][3];
		
		System.out.println("Enter the values");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int res = sumOfDiagonals(arr);
		System.out.println("Sum of Diagonals: "+res);
	}
}
