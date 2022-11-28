package com;

public class Thirdhi {
	public static void main(String[] args) {
		int[] arr={10,6,8,38,12,42,73,2,63,47};
		int count=0;
		int len=arr.length;
		for(int i=0;i<len;i++){
			count=0;
			for(int j=0;j<len;j++){
				if(arr[i]<arr[j]){
					count++;
				}
			}
			if(count==2){
				System.out.println(arr[i]);
				break;
			}
		}
	}
}