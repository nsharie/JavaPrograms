
public class ArmstrongNumber {
	int checkArmstrongNumber(int n) {
		int original=n;
		int NumberOfDigit = 0;
		while(n!=0) {
			n=n/10;
			NumberOfDigit++;
		}
		
		int sum=0;
		while(original!=0) {
			int lastDigit = original%10;
			sum = sum+(int)Math.pow(lastDigit,NumberOfDigit);
			original = original/10;
		}
		
		return sum;
	}

}
