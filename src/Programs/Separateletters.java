package Programs;

import java.util.Scanner;

public class Separateletters {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		String uc="";
		String lc="";
		String no="";
		String sp="";
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(ch>=65&&ch<=90){
				uc=uc+ch;
			}else if(ch>=97&&ch<=122){
				lc=lc+ch;
			}else if(ch>=48&&ch<=57){
				no=no+ch;
			}else{
				sp=sp+ch;
			}
		}
		System.out.println(uc);
		System.out.println(lc);
		System.out.println(no);
		System.out.println(sp);
		}
}
