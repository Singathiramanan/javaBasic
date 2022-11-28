package com;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Arrswap {

	public static void main(String[] args) {
		@SuppressWarnings("resource")   
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		Integer[] arr=new Integer[a];
		for(int i=0;i<a;i++){
			arr[i]=sc.nextInt();
		}
		List<Integer> q1=Arrays.asList(arr);
		//System.out.println(q1);
		for(int k=0;k<b;k++){
			Collections.swap(q1,b-1,k);
		}
		for(Object o:q1){
			System.out.print(o+" ");
		}
	}

}
