package Programs;

import java.util.Scanner;

public class Threedarr {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] name=new String[n];
		int[][] details=new int[n][n];
		int[] stock=new int[n];
		int[] sale=new int[10];
		for(int i=0;i<n;i++){
			name[i]=sc.next();
			for(int j=0;j<3;j++){
				details[i][j]=sc.nextInt();
			}
			stock[i]=sc.nextInt();
			for(int j=0;j<10;j++){
				int pur=sc.nextInt();
				sale[i]+=pur;
			}
		}
		
		for(int i=0;i<sale.length;i++){
			for(int j=0;j<sale.length;j++){
				if(sale[i]<sale[j]){
					int temp=sale[i];
					sale[i]=sale[j];
					sale[j]=temp;
				}
					
			}
			
		}
				
	}

}
