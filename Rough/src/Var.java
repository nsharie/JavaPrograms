
public class Var {
	
	static void count(String str) {
		String finalres = "";
		if(str==null) {
			System.out.println("0");
		}
		else {
			for(int i=0;i<str.length();i++) {
				finalres = str.substring(i,i+1);
				System.out.println(finalres);
				System.out.println(str);
			}
		}
	}
	public static void main(String... args) {
		var a = 10;
		System.out.println(a);
		
		a= 50;
		var b = 40;
		System.out.println(a);
		
		System.out.println(b);
		
		String v1 = "hel";
		System.out.println(v1.substring(0,0));
		
		count("hello");
		
	}
}
