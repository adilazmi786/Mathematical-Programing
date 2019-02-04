package mathematical_programs;

public class PrimeNumberUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=17,start=2;
		boolean is=isPrimeNumber(num,start);
		if(is)
			System.out.println(num+" is a prime number");
		else
			System.out.println(num+" is not a prime number");

	}

	private static boolean isPrimeNumber(int num,int start) {
		// TODO Auto-generated method stub
		if(num==start)
			return true;
		if(num%start==0)
			return false;
		if(start>num/2)
			return true;
		return isPrimeNumber(num,start=start+1);
	}

}
