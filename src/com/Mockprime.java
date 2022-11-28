package com;

import java.util.Scanner;

public class Mockprime {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		for(int i=n1;i<=n2;i++){
			int count=0;
			for(int j=1;j<n2;j++){
				if(i%j==0){
					count++;
				}
			}
			if(count==2){
				System.out.print(i+" ");
			}
		}

	}

}
