
public class FibonacciSeries {
	public static String findFibonacciSeries(int n) {
		int fib1=0;
		int fib2=1;
		if(n==1) {
//			System.out.print(fib1 +" ");
			return "0";
		}
		
		else if(n==2) {
//			System.out.print(fib1 +" ");
//			System.out.print(fib2+" ");
			return "0 1";
		}
		
		else {
			String str = fib1 + " " +fib2;
			for(int i=3;i<=n;i++) {
				int nextNo = fib1+fib2;
//				System.out.print(nextNo+" ");
				fib1=fib2;
				fib2=nextNo;
				str = str+" "+nextNo;
			}
			return str;
		}
	}
}
