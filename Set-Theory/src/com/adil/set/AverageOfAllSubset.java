package com.adil.set;

public class AverageOfAllSubset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int powSet[]= {1,2,3};
		double avgSum=sumOfAverageOfSubset(powSet,powSet.length);
		System.out.println("Avg of power subset: "+avgSum);
	}

	private static double sumOfAverageOfSubset(int[] powSet, int n) {
		// TODO Auto-generated method stub
		int sum,counter;
		double avg=0,avgSum=0.0;
		for(int i=0;i<(1<<n);i++)
		{
			counter=0;
			sum=0;

			for(int j=0;j<n;j++)
			{
				if((i&(1<<j))>0)
				{
					sum=sum+powSet[j];
					counter++;
				}	
			}
			if(counter!=0)
			{
				avg=(double)sum/counter;
				avgSum+=avg;
			}
			
		}
		return avgSum;
	}

}
