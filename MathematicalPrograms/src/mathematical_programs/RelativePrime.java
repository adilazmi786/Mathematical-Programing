package mathematical_programs;

public class RelativePrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		System.out.println(relativePrime(n));
	}

	private static boolean relativePrime(int n) {
		// TODO Auto-generated method stub
		boolean flag=false;
		for(int i=2;i<=n;i++)
		{
			if(getGcd(n,i)==1)
			{
				if(isPrime(i))
				{
					flag=true;
				}
				else
					return false;
			}
		}
		return flag;

	}

	private static boolean isPrime(int i) {
		// TODO Auto-generated method stub
		for(int j=2;j<=i/2;j++)
		{
			if(i%j==0)
				return false;
		}
			
		return true;
	}

	private static int getGcd(int a, int b) {
		// TODO Auto-generated method stub
		
		while(a%b>0)
		{
			int r=a%b;
			a=b;
			b=r;	
		}
		return b;
	}

}
