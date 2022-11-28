package com.ramanan;

public class First1 {

	public static void main(String[] args) {
		String name="Singathi",res="";
		for(int i=(name.length()-1);i>=0;i--){
			res=res+name.charAt(i);
		}	
		System.out.println(res);
	}
}
