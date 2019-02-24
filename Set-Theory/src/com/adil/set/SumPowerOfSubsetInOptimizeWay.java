package com.adil.set;

public class SumPowerOfSubsetInOptimizeWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int powSet[]= {1,2,3};
		int sum=sumOfPowerOfSubset(powSet,powSet.length);
		System.out.println("Sum of power subset: "+sum);
		}

	private static int sumOfPowerOfSubset(int[] powSet, int n) {
		// TODO Auto-generated method stub
		
		// every element will appear exactly 2^n-1
		// sum the n elements
		int sum=(int) ((n*(n+1)/2)*Math.pow(2, n-1));
		return sum;
	}
	

}
