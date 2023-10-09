
public class Brackets {
	public static void main(String[] args) {
		String input = "(abd)hi[ef]{hi}}";
		
		int s=0,f=0,c=0;
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)=='(') {
				c++;
			}
			if(input.charAt(i)==')') {
				c--;
			}
			if(input.charAt(i)=='{') {
				f++;
			}
			if(input.charAt(i)=='}') {
				f--;
			}
			if(input.charAt(i)=='['){
				s++;
			}
			if(input.charAt(i)==']') {
				s--;
			}
		}
		if(s==0 && f==0 && c==0) {
			System.out.println("Valid Statement");
		}
		else {
			System.out.println("Invalid Statement");
		}
	}
}
