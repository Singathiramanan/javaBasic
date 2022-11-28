package programe;

import java.util.Scanner;

public class Balan1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int no=sc.nextInt();
		for (int i = 1; i <= no; i++) {
			for (int j = 1; j <= no; j++) {
				if(i==j){
					System.out.print(j);
				}else if(j<i){
					System.out.print("  ");
				}else if(j==no){
					System.out.print(" "+(j+no-i));
				}else {
					System.out.print(" "+2*no);
				}
				
			}System.out.println("");
			 
		}
	}

}
