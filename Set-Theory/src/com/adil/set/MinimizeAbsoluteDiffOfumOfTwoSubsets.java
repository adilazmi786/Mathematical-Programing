package com.adil.set;

public class MinimizeAbsoluteDiffOfumOfTwoSubsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int powSet[]= {1,2,3,4,5,6};
		int diff=absoluteDiff(powSet,powSet.length);
		System.out.println("Absolute diff of power subset: "+diff);
	}

	private static int absoluteDiff(int[] powSet, int n) {
		// TODO Auto-generated method stub
		int sum=n*(n+1)/2;
		if(n%4==0)
		{
			System.out.println("first subset sum: "+sum/2);
			System.out.println("second subset sum: "+sum/2);
			return 0;
		}
		else
		{
			if(n%4==1 || n%4==2)
			{
				System.out.println("first subset sum: "+sum/2);
				System.out.println("second subset sum: "+(sum/2+1));

				return 1;
			}else
			{
				System.out.println("first subset sum: "+sum/2);
				System.out.println("second subset sum: "+sum/2);
				return 0;
			}
		}
	}

}
