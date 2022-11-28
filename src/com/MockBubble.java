package com;

import java.util.Scanner;

public class MockBubble {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int arr[]=new int[no];
		for(int i=0;i<no;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<no;i++){
			for(int j=0;j<no;j++){
				if(arr[i]<arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}	
		}
		for(int i=0;i<no;i++){
			System.out.print(arr[i]+" ");
			
		}

	}

}
