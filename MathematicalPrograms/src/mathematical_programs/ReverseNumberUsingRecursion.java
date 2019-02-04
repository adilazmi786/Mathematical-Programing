package mathematical_programs;

public class ReverseNumberUsingRecursion {

	static int sum=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=12345;
		int res=reverseNumberUsingRecursion(n);
		System.out.print("reverse number is: "+res);

	}

	private static int reverseNumberUsingRecursion(int n) {
		// TODO Auto-generated method stub
		if(n<=0)
		return sum;
		
		sum=sum*10+n%10;
		n=n/10;
		return reverseNumberUsingRecursion(n);

	}

}
