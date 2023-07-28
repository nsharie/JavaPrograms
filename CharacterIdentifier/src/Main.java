import java.util.Scanner;

public class Main{

	public static void identifyCharacter(char ch){
		boolean lower = Character.isLowerCase(ch);
		boolean upper = Character.isUpperCase(ch);
		boolean isDigit = Character.isDigit(ch);
//		boolean vowel = false;
		
		String vowels = "aeiouAEIOU";
		String specialCharacters = "!@#$%^&*+-_=:;(){}/'\'|[]";
		
		boolean specialCharactersResult = specialCharacters.indexOf(ch)!=-1?true:false;
		boolean vowelsResult = vowels.indexOf(ch)!=-1?true:false;
		if(lower && vowelsResult) {
			System.out.println("Lower Case Vowel");
		}
		else if(upper && vowelsResult) {
			System.out.println("Upper Case Vowel");
		}
		else if(upper) {
			System.out.println("Upper Case Consonant");
		}
		else if(lower) {
			System.out.println("Lower Case Consonant");
		}
		else if(isDigit) {
			System.out.println("Digit");
		}
		else if(specialCharactersResult) {
			System.out.println("Special Character");
		}
		else {
			System.out.println("Enter A Correct Character");
		}
		
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character");
		char ch = sc.next().charAt(0);
		identifyCharacter(ch);
		sc.close();

	}

}