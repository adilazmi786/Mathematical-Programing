package com.adi.array;

public class SecondMinNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 2, 3, 4, 1, 2, 1, 5, 3 };
		int n = a.length;
		int min = Integer.MAX_VALUE;
		int secmin = Integer.MAX_VALUE;

		for (int i = 0; i < n; i++) {
			if (a[i] < min) {
				secmin = min;
				min = a[i];
			} else if (secmin > a[i] && a[i] != min)
				secmin = a[i];
		}
		System.out.println("sec_min: " + secmin);
	}

}
