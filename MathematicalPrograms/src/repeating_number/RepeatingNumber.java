package repeating_number;

import java.util.Arrays;

public class RepeatingNumber {

	public static void main(String args[])
	{
		int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};
		int n=a.length;
		int res=0;
		int hmap[]=new int[10];
		/*
		 * for(int i=0;i<n;i++) { hmap[a[i]]++; res=res^a[i]; } for(int i=0;i<n;i++) {
		 * if(hmap[a[i]]> 1) { System.out.println(a[i]); break; } }
		 */
		/*
		 * for(int i=0;i<n;i++) { if(a[Math.abs(a[i])]<0)
		 * System.out.println(Math.abs(a[i])); else a[a[i]]=-1; }
		 */
		//System.out.println(res);
	//	Arrays.sort(a);
		/*
		 * int max=999; int secmax=999; int min=a[0];
		 */
		/*
		 * for(int i=0;i<n-1;i++) { if(Math.abs(a[i]-a[i+1])<min_diff)
		 * min_diff=Math.abs(a[i]-a[i+1]);
		 * 
		 * }
		 */
		/*
		 * for(int i=0;i<n;i++) { if(a[i]<max) { secmax=max; max=a[i]; } else
		 * if(secmax>a[i] && secmax!=max) secmax=a[i]; }
		 */
		
		/*
		 * int _max=0,sum=a[0]; for(int i=0;i<n;i++) { sum=sum+a[i]; if(sum<0) sum=0;
		 * 
		 * if(_max<sum) _max=sum; } System.out.println(_max);
		 */
		// find hcf
		int x=3,y=5;
		
		int rem=y;
		while(x!=y)
		{
			if(x>y)
				{
				/*
				 * rem=x%y; x=y; y=rem;
				 */
				x=x-y;
				}
			else
				{
				/*	rem=y%x;
					y=x;
					x=rem;*/
				y=y-x;
				}
		}
		//System.out.println(rem+""+x+""+y);
		//find fibonacci
		int num=9; int a1=0,b=1,res1=0;
		for(int i=2;i<=num;i++)
		{
			res1=a1+b;
			a1=b;
			b=res1;
		}
		System.out.println(b);
		//System.out.println("sec_max"+secmax);
	}
}
