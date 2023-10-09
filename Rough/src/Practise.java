
public class Practise {
	public static void main(String[] args) {
		String str = "New Hello Worl d";
		String[] rev = str.split(" ");
		String result ="";

//		for (String string : rev) {
//			System.out.println(string+" ");
//		}
		
		for(int i=0;i<rev.length;i++) {
			char ch[] = rev[i].toCharArray();
			char reverse[] = new char[ch.length];
			
			int k=ch.length-1;
			for(int j=0;j<reverse.length;j++) {
//				System.out.print(ch[j]+" ");
				reverse[j] = ch[k];
				k--;
			}
//			for (char ch1 : reverse) {
//				System.out.print(ch1+" ");
//			}
			
			result = result+new String(reverse)+" ";
		}
		System.out.println(result);
	}
}
