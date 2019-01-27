package mathematical_programs;

public class CalculateLcmWithoutHcf {

	public static void main(String args[]) {
		int x = 12, y = 5;
		int lcm = calculateLcm(x, y);
		System.out.println("lcm: " + lcm);
	}

	private static int calculateLcm(int x, int y) {
		// TODO Auto-generated method stub
		int max = 0, res = 0, min = 0;
		if (x > y) {
			max = x;
			min = y;
			res = max;
		} else {
			max = y;
			min = x;
			res = max;
		}
		while ((res % min) != 0) {
			res += max;
		}
		return res;
	}
}
