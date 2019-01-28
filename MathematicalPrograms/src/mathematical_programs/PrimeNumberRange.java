package mathematical_programs;

public class PrimeNumberRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int start=50;
		int end=100;
		primeNumberRange(start,end);
		
		
	}

	private static void primeNumberRange(int start, int end) {
		// TODO Auto-generated method stub
		boolean isPrime=true;
		for(int i=start;i<end;i++)
		{
			int j=2;

			while(j<=(i/2))
			{
				if((i%j)==0)
				{
					isPrime=false;
					break;
				}
				isPrime=true;

				j++;
			}
			if(isPrime)
				System.out.print(i+",");
				
		}
	}

}
