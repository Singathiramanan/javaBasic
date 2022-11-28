package com.ramanan;

import java.util.Scanner;

public class Fibonacci {

	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the number");
		int no=s1.nextInt();
		int fn=0,sn=1,i;
		System.out.println(fn);
		System.out.println(sn);
		for(i=1;i<=no;i++){
			int temp=fn+sn;
			System.out.println(temp);
			fn=sn;
			sn=temp;
			
		}
		
	}

}
