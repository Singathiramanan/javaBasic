package com;

import java.util.Scanner;

public class Mockarmstrog{

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int add=0,copy=no;
		while(no>0){
			if(no!=0){
				int rem=no%10;
				add=add+(rem*rem*rem);
				no=no/10;	
			}
		}
		if(copy==add){
			System.out.println("Armstrong number");
		}else{
			System.out.println("Not a armstrong no");
		}

	}

}
