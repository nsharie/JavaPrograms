
public class Methods {
	static boolean divisibleByTwo(int number) {
		boolean result = (number%2==0?true:false);
		return result;
	}
	
	static boolean divisibleByThree(int number) {
		boolean result = (number%3==0?true:false);
		return result;
	}
	
	static boolean divisibleByFive(int number) {
		boolean result = (number%5==0?true:false);
		return result;
	}
	
	static boolean divisibleByTwoAndFive(int number) {
		boolean result = (((number%2==0)&&(number%5==0))?true:false);
		return result;
	}
	
	static boolean divisibleByThreeAndComesInFive(int number) {
		boolean result = ((number%3==0) && (number%5==0))?true:false;
		return result;
	}
	
	static boolean evenNumberByThree(int number) {
		boolean result = ((number%2==0) && (number%3==0))?true:false;
		return result;
	}
}
