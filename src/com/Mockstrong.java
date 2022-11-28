package com;

import java.util.Scanner;

public class Mockstrong {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int add=0,copy=no;
		while(no>0){
			if(no!=0){
				int rem=no%10;
				add=add+fact(rem);
				no=no/10;	
			}
		}
		if(copy==add){
			System.out.println("Strong number");
		}else{
			System.out.println("Not a Strong no");
		}

	}
	static int fact(int f){
		int fac=1;
		for(int i=1;i<=f;i++){
			fac=fac*i;
		}
		return fac;

	}

}
