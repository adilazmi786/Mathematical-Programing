package com.adi.array;

public class MaxSumOfSubArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 2, -3, 4, 1, -2, 1, -5, 3 };
		int n = a.length;
		
		int _max = 0, sum = a[0];
		for (int i = 1; i < n; i++) {
			sum = sum + a[i];
			if (sum < 0)
				sum = 0;

			if (_max < sum)
				_max = sum;
		}
		System.out.println(_max);
	}

}
