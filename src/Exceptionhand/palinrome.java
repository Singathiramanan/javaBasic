package Exceptionhand;

import java.util.Scanner;

public class palinrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.next();	
		String rev="";
		for(int i=(str.length()-1);i>=0;i--){
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev)){
			System.out.println("It is palinrome");
		}else{
			System.out.println("It is not a palinrome");
		}
	}

}
