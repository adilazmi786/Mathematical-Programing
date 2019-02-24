package mathematical_programs;

public class MostSignificatBit {

	static int msb=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=18;
		setMSB(n);
	}

	private static void setMSB(int n) {
		// TODO Auto-generated method stub
		while(n>1)
		{
			n=n/2;
			msb++;
		}
		System.out.println("msb count:"+ msb);
		System.out.println(1<<msb);
	}

}
