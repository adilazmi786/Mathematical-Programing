package mathematical_programs;

public class FibonacciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// find fibonacci number without recursion
		int num = 5;
		int a = 0, b = 1, res = 0;
		for (int i = 2; i <= num; i++) {
			res = a + b;
			a = b;
			b = res;
		}
		System.out.println(b);
		// with recursion
		int fibNumber = fib(num);
		System.out.println(fibNumber);

	}

	private static int fib(int num) {
		// TODO Auto-generated method stub
		if (num <=1)
			return num;
		return fib(num-1) + fib(num-2);
	}

}
