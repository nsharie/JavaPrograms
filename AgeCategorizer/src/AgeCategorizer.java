import java.util.Scanner;

public class AgeCategorizer {
	
	public static void categorizeAge(int age) {
		if(age>=0 && age<=12) {
			System.out.println("Child");
		}
		else if(age>=13 && age<=19) {
			System.out.println("Teen");
		}
		else if(age>=20 && age<=59) {
			System.out.println("Adult");
		}
		else {
			System.out.println("Senior");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age");
		
		int age = sc.nextInt();
		categorizeAge(age);
		sc.close();
	}

}
