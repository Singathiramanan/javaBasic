package com.ramanan;

public class deno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=423678;
int sum=0;
while(a!=0)
{
	int rem=a%100;
	if(rem%2==0)
	{
		sum=sum++;
	}
	a=a/100;	
	}
System.out.println(sum);
}
}
