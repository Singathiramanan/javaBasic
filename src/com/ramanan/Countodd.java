package com.ramanan;

public class Countodd {
	public static void main(String[] args) {
		int[] arr={10,20,46,37,73,89};
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==1){
				count++;
			}
		}System.out.println(count);
	}
}
