package com.adi.array;

public class SecondMaxNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 2, 3, 4, 1, 2, 1, 5, 3 };
		int n = a.length;
		int max = Integer.MIN_VALUE;
		int secmax = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			if (a[i] > max) {
				secmax = max;
				max = a[i];
			} else if (secmax < a[i] && a[i] != max)
				secmax = a[i];
		}
		System.out.println("sec_max: " + secmax);
	}

}
