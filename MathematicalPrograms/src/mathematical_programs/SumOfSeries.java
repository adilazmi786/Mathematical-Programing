package mathematical_programs;

public class SumOfSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Given the number of terms i.e. n. Find the sum of the series 0.6, 0.06, 0.006, 0.0006, …to n terms.Given the number of terms i.e. n. 
		//Find the sum of the series 0.6, 0.06, 0.006, 0.0006, …to n terms.
		int num=2;
		sumOfSeries(num);
	}

	private static void sumOfSeries(int num) {
		// TODO Auto-generated method stub
		System.out.println("Sum Of nth term: "+(0.666)*(1-Math.pow(0.1, num)));
	}

}
