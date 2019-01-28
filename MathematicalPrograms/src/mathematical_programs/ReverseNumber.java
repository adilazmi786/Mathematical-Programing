package mathematical_programs;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=12345;
		reverseNumber(num);
	}
	private static void reverseNumber(int num) {
		// TODO Auto-generated method stub
		int res=0;
		while(num>0)
		{
			res=num%10;
			num=num/10;
			System.out.print(res);
		}
	}
}
