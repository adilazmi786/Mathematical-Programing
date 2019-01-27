package mathematical_programs;

public class CalculateLcmUsingHcf {

	public static void main(String args[]) {
		// find hcf
		int x = 3, y = 5;
		int a=x,b=y;
		int rem = y;
		while (x != y) {
			if (x > y) {
				/*
				 * rem=x%y; x=y; y=rem;
				 */
				x = x - y;
			} else {
				/*
				 * rem=y%x; y=x; x=rem;
				 */
				y = y - x;
			}
		}
		// either x or y will be hcf
		System.out.println("hcf: " +y);
		int lcm=(a*b)/y;
		System.out.println("lcm: " + lcm);
	}
}
