package com.adil.set;

public class GeneratePowerSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char powSet[]= {'a','b','c'};
		generatePoweSet(powSet,powSet.length);
	}

	private static void generatePoweSet(char[] powSet, int n) {
		// TODO Auto-generated method stub
		for(int i=0;i<(1<<n);i++)
		{
			System.out.print("{");
			for(int j=0;j<n;j++)
			{
				if((i & (1<<j))>0)
				{
					System.out.print(powSet[j]);
				}
			}
			System.out.println("}");
		}
	}

}
