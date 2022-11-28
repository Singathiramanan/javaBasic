package Programs;

import java.util.Scanner;

public class Fibonacci_serious {

	public static void main(String[] args) {
		int n1=0,n2=1,next,n;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.print(n1+" ");
		System.out.print(n2+" ");
		for(int i=1;i<n;i++){
			next=n1+n2;
			System.out.print(next+" ");
			n1=n2;
			n2=next;
		}
	}
}
