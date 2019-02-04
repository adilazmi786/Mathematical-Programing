package mathematical_programs;

public class PalindromeUsingRecursion {

	static int sum=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=121;
		int res=palindromeNumberUsingRecursion(n);
		if(res==n)
		System.out.print(n+" is a palindrome number");
		else
			System.out.print(n+" is not a palindrome number");


	}
	private static int palindromeNumberUsingRecursion(int n) {
		// TODO Auto-generated method stub
		
		if(n<=0)
			return sum;
		sum=sum*10+n%10;
		return palindromeNumberUsingRecursion(n/10);
	}
}
