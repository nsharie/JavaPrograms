
public class SumOfDigits {
	static int sumOfDigits(int n) {
		int res = 0;
		while(n!=0) {
			int rem = n%10;
			res = res+rem;
			n=n/10;
		}
		return res;
	}
}
