package mathematical_programs;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=121;
		isPalindrome(num);
	}

	private static void isPalindrome(int num) {
		// TODO Auto-generated method stub
			boolean isPalindrome=reverse(num);
			if(isPalindrome)
				System.out.println(num+" is a Palindrome");
			else
				System.out.println(num+" is not a Palindrome");
	}

	private static boolean reverse(int num) {
		// TODO Auto-generated method stub
		int res=0,temp=num,sum=0;
		while(num>0)
		{
			res=num%10;
			sum=sum*10+res;
			num/=10;

		}
		if(sum==temp)
			return true;
		return false;
	}
	
}
