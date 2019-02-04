package mathematical_programs;

public class MultiplyNumberUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10, b = -5;
		int num = multiply(a, b);
		System.out.println("result is: "+num);
	}

	private static int multiply(int a, int b) {
		// TODO Auto-generated method stub
		if (b == 0)
			return 0;
		if (b > 0)
			return a + multiply(a, b - 1);
		else
			return -multiply(a, -b);
	}

}
