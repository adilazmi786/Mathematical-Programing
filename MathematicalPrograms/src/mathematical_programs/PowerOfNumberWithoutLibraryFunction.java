package mathematical_programs;

public class PowerOfNumberWithoutLibraryFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=2;
		int b=5;
		findPowerofa(a,b);
		
		
	}

	private static void findPowerofa(int a, int b) {
		// TODO Auto-generated method stub
		int res=1;
		for(int i=0;i<b;i++)
		{
			res=res*a;
		}
		System.out.println("b pow of a: "+res);
	}

}
