package Collection;

import java.util.Scanner;

public class Tcs {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int[] arr=new int[no];
		float avg = 0;
		boolean flag=true;
		for(int i=0;i<no;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]>arr[i+1]){
				avg=(arr[i]+arr[i+1])/2;
				}
			if(avg<arr[i+1]){
				flag=true;
				
			}else{
				flag=false;
			}
		}
		if(flag==true){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
	}

}
