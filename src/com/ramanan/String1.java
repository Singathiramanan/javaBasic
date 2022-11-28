package com.ramanan;

public class String1 {

	public static void main(String[] args) {
		String s1="JavAmAVa";
		System.out.println(s1.concat("job"));
		System.out.println(s1.contains("JavA"));
		System.out.println(s1.endsWith("VA"));
		System.out.println(s1.startsWith("Ja"));
		System.out.println(s1.replace('a', 'A'));
		System.out.println(s1.indexOf('m'));
		System.out.print(s1.toUpperCase()+" ");
		System.out.println("");
		System.out.print(s1.toLowerCase()+" ");
		System.out.println("");
		char[] arr=s1.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println(s1.substring(2, 6));
	}
}
