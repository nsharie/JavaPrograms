
public class Practise1 {
	public static void permutate(String input) {
		permutate("",input);
	}
	public static void permutate(String perm, String word) {
		if(word.isEmpty()) {
			System.out.println(perm + word);
		}
		
		else {
			for(int i=0;i<word.length();i++) {
				permutate(perm + word.charAt(i), word.substring(0,i)+word.substring(i+1 ,word.length()));
			}
		}
	}
	public static void main(String[] args) {
		String input = "ABC";
		
		permutate(input);
	}
}