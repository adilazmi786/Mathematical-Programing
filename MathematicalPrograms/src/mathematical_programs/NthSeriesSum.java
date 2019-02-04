package mathematical_programs;

public class NthSeriesSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=2;
		// Given a series 2, 12, 36, 80, 150.. Find the n-th term of the series.
		double nthTerm=calculateSumOfNthTerm(num);
		System.out.println("Nth term of series: "+(int)nthTerm);
	}

	private static double calculateSumOfNthTerm(int num) {
		// TODO Auto-generated method stub
		
		return Math.pow(num, 2)+Math.pow(num, 3);
	}
}
