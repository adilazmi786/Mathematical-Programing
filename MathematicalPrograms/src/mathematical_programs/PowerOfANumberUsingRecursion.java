package mathematical_programs;

public class PowerOfANumberUsingRecursion {

	static int ans=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=2,b=3;
		int res=powerOfANumberUsingRecursion(a,b);
		System.out.println(res);
	}

	private static int powerOfANumberUsingRecursion(int a, int b) {
		// TODO Auto-generated method stub
		if(b<=0)
			return ans;
		ans=ans*a;
		return powerOfANumberUsingRecursion(a, b=b-1);
	}

}
