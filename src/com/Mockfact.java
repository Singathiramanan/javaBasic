package com;

import java.util.Scanner;

public class Mockfact {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int fact=1;
		for(int i=1;i<=no;i++){
			fact=fact*i;
		}
		System.out.print(fact+" ");
		
	}

}
