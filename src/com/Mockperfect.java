package com;

import java.util.Scanner;

public class Mockperfect {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int add=0,copy=no;  
		for(int i=1;i<no;i++){
			if(no%i==0){
				
				add=add+i;
			}
		}
		if(copy==add){
			System.out.println("Perfect number");
		}else{
			System.out.println("Not a Perfect no");
		}

	}

}
