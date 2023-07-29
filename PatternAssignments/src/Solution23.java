
public class Solution23 {
	public static void main(String[] args) {
		char ch = 'A';
		for(int i=1;i<=6;i++) {
			for(int j=6;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				if((i==3 && k==2)|| (i==4 && (k==2 || k==3))||(i==5 && (k==2 || k==3 || k==4)||(i==6 && (k==2||k==3||k==4||k==5)))) {
					System.out.print("  ");
				}
				else
					System.out.print(ch+" ");
			}
			ch++;
			System.out.println();
		}
		char ch1 = 'E';
		for(int i=1;i<=5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--) {
				if(i==1&&(k==2||k==3||k==4)||(i==2&&(k==4||k==3))||(i==3&&k==4)){
					System.out.print("  ");
				}
				else {
				System.out.print(ch1+" ");
				}
			}
			ch1--;
			System.out.println();
		}
	}
}
