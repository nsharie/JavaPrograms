
public class Solution4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=3;i++) {
			System.out.print("*");
			System.out.print(" ");
			for(int j=3;j<=8;j++) {
				if((i==1 || i==3) && j%2!=0) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("*");
			System.out.println();
		}
	}
}

