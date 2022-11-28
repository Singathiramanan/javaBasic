package com;

public class Revkingsku {

	public static void main(String[] args) {
		
		String s="Chennai super kingsku periyavizhil adinga";
		String[] arr=s.split(" ");
		for(int i=arr.length-1;i>=0;i--){
			if(i==(arr.length/2)){
				String a=arr[i];
				String rev="";
				for(int j=arr.length;j>=0;j--){
					rev=rev+a.charAt(j);
				}System.out.print(rev+" ");
			}else{
				System.out.print(arr[i]+" ");
			}
		}
	}

}
