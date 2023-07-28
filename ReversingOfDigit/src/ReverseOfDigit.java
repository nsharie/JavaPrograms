
public class ReverseOfDigit {
	int checkReverseOfDigit(int n) {
		int reverse =0;
		while(n!=0) {
			int lastDigit = n%10;
			reverse = lastDigit+reverse*10;
			n=n/10;
		}
		return reverse;
	}
}
