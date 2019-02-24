package com.adil.set;

public class SumPowerOfSubset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int powSet[]= {1,2,3};
		int sum=sumOfPowerOfSubset(powSet,powSet.length);
		System.out.println("Sum of power subset: "+sum);
		}

	private static int sumOfPowerOfSubset(int[] powSet, int n) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<(1<<n);i++)
		{
			for(int j=0;j<n;j++)
			{
				if((i & (1<<j))>0)
				{
					sum=sum+powSet[j];
				}
			}
		}
		return sum;
	}

}
