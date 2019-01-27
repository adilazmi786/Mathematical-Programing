package com.adi.array;

public class FirstRepeatingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 2, 3, 4, 1, 2, 1, 5, 3 };
		int n = a.length;
		int hmap[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			hmap[a[i]]++;
		}
		for (int i = 0; i < n; i++) {
			if (hmap[a[i]] > 1) {
				System.out.println(a[i]);
				break;
			}
		}
	}

}
