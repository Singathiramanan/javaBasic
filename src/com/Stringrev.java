package com;

public class Stringrev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Chennai super kingsku periya vizhil adinga";
		String[] arr=s.split(" ");
		for(int i=arr.length-1;i>=0;i--){
			System.out.print(arr[i]+" ");
		}
	}

}
