
public class Solution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				if(((j==2||j==3) && i==4) || (j==2) && i==3) {
					System.out.print(" ");
				}
				else System.out.print(j);
			}
			System.out.println();
		}
	}
}
