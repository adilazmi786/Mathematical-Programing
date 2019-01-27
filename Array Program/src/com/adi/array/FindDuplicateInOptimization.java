package com.adi.array;

public class FindDuplicateInOptimization {

	public static void main(String[] args) {

		int a[] = { 2, 3, 4, 1, 2, 1, 5, 3 };
		int n = a.length;

		for (int i = 0; i < n; i++) {
			if (a[Math.abs(a[i])] < 0)
				System.out.println(Math.abs(a[i]));
			else
				a[Math.abs(a[i])] = -a[Math.abs(a[i])];
		}
	}
}
