package mathematical_programs;

public class FibonacciUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=6;
		int res=fib(n);
		System.out.println(res);
	}

	private static int fib(int n) {
		// TODO Auto-generated method stub
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		return fib(n-1)+fib(n-2);
	}

}
