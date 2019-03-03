package com.adi.array;

import java.util.HashMap;

public class SumOfSubArrayEqualZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] a = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };

		//int a[]= {13,2,-2,15,8,0,11};
		int a[]= {13,2,-15,6,0,4};
		sumOfSubArray(a,a.length);
	}

	private static void sumOfSubArray(int[] a, int length) {
		// TODO Auto-generated method stub
		int sum=0;
		HashMap<Integer, Integer> hmap=new HashMap<Integer, Integer>();
		insertValueInHashMap(hmap,0,-1);
		int diff,maxLen=Integer.MIN_VALUE;
		for(int i=0;i<length;i++)
		{
			
			sum=sum+a[i];
			if(hmap.containsKey(sum))
			{
				Integer value=hmap.get(sum);
				System.out.println("sub array is: ["+(value+1)+","+i+"]");
				diff=(value+1)-i;
				maxLen=Math.max(maxLen, diff);
				
			}
			insertValueInHashMap(hmap,sum,i);

		}
		System.out.println("longest subarray seq: "+maxLen);
	}

	private static void insertValueInHashMap(HashMap<Integer, Integer> hmap, int key, int value) {
		// TODO Auto-generated method stub
		if(!hmap.containsKey(key))
		{
			hmap.put(key,value);
		}
		
	}

}
