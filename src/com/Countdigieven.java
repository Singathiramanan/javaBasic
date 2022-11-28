package com;

public class Countdigieven 
{

	public static void main(String[] args) 
	{
		int count=0,add=0;
		int[] arr={34,687,890,323,433,677,787};
		for (int i = 0; i < arr.length; i++) 
		{
			int no=arr[i];
			while(no!=0)
			{
				int rem=no%10;
				add=add+rem;
				no=no/10;
			}
			if(add%2==0)
			{
				count++;
			}
			add=0;
		}
		System.out.println(count);
	}
}
