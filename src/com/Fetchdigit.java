package com;

public class Fetchdigit
{

	public static void main(String[] args) 
	{
		int add=0;
		int[] arr={34,687,890,323,433,677,787};
		for (int i = 0; i < arr.length; i++) 
		{
			while(arr[i]!=0)
			{
				int rem=arr[i]%10;
				add=add+rem;
				arr[i]=arr[i]/10;
			}
			System.out.println(add);
			add=0;
		}
		
		
	}

}
