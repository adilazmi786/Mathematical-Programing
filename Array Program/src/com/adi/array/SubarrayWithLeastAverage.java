package com.adi.array;

public class SubarrayWithLeastAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int  arr[] = {3, 7, 90, 20, 10, 50, 40}, k = 3;
		subarrayWithLeastAverage(arr,k,arr.length);
	}

	private static void subarrayWithLeastAverage(int[] arr, int k, int length) {
		// TODO Auto-generated method stub
		int sum,start=0,end=0,j,l=0;
		int avg,min=Integer.MAX_VALUE;
		for(int i=0;i<length-k+1;i++)
		{
			j=0;
			l=i;
			sum=0;
			while(j<k)
			{
				sum=sum+arr[l];
				j++;
				l++;
			}
			avg=sum/k;
			if(avg<min)
				{
					min=avg;
					start=i;
					end=i+k-1;
				}
		}
		System.out.println("Subarray between ["+start+","+end+"]");
	}

}
