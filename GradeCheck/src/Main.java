import java.util.Scanner;

public class Main {
	public static void checkGrade(int grade) {
		System.out.println(grade>50?"Pass":"Fail");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Marks");
		int grade = sc.nextInt();
		checkGrade(grade);
		sc.close();
	}

}
