package programe;

import java.util.Scanner;

public class AlphaPattern {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int no=5;
		char ch=sc.next().charAt(0);
		switch(ch){
		case 'a':
		for(int i=1;i<=no;i++){
			for(int j=1;j<=no;j++){
				if((i==1&& j!=1 && j!=5)||(j==1&&i!=1)||(j==5&&i!=1)||(i==3)){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}				
			}
			System.out.println();
		}
		break;
		case 'c':
		for(int i=1;i<=no;i++){
			for(int j=1;j<=no;j++){
				if((i!=1&&i!=5&&j==1)||(i==1&&j!=1)||(i==5&&j!=1)){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}				
			}
			System.out.println();
		}
		break;
		case 'd':
			for(int i=1;i<=no;i++){
				for(int j=1;j<=no;j++){
					if(j==1||(i==1&&j!=5)||(i==5&&j!=5)||(j==5&&i!=1&&i!=5)){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}				
				}
				System.out.println();
			}
			break;
		case 'e':
			for(int i=1;i<=no;i++){
				for(int j=1;j<=no;j++){
					if(j==1||i==1||i==3||i==5){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}				
				}
				System.out.println();
			}
			break;
		case 'f':
			for(int i=1;i<=no;i++){
				for(int j=1;j<=no;j++){
					if(j==1||i==1||i==3){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}				
				}
				System.out.println();
			}
			break;
		case 'g':
			for(int i=1;i<=no;i++){
				for(int j=1;j<=no;j++){
					if((i==1&&j!=1&&j!=5)||(j==1&&i!=1)||(i==3&&j!=2)||(i==4&&j!=2&&j!=4)||(i==5&&j!=4)){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}				
				}
				System.out.println();
			}
			break;
		case 'h':
			for(int i=1;i<=no;i++){
				for(int j=1;j<=no;j++){
					if(j==1||j==5||i==3){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}				
				}
				System.out.println();
			}
			break;
		case 'i':
			for(int i=1;i<=no;i++){
				for(int j=1;j<=no;j++){
					if(i==1||i==5||j==3){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}				
				}
				System.out.println();
			}
			break;
		case 'j':
			for(int i=1;i<=no;i++){
				for(int j=1;j<=no;j++){
					if(i==1||(j==3&&i!=5)||(i==5&&j!=3&&j!=4&&j!=5)){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}				
				}
				System.out.println();
			}
			break;
		case 'k':
			for(int i=1;i<=no;i++){
				for(int j=1;j<=no;j++){
					if(j==1||(i==1&&j!=2&&j!=4&&j!=5)||(i==1&&j!=2&&j!=4&&j!=5)){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}				
				}
				System.out.println();
			}
			break;
		case 'l':
			for(int i=1;i<=no;i++){
				for(int j=1;j<=no;j++){
					if(j==1||i==5){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}				
				}
				System.out.println();
			}
			break;
		case 'm':
			for(int i=1;i<=no;i++){
				for(int j=1;j<=no;j++){
					if(j==1||j==5||(i==2&&j!=3)||(i==3&&j!=2&&j!=4)){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}				
				}
				System.out.println();
			}
			break;
		case 'n':
			for(int i=1;i<=no;i++){
				for(int j=1;j<=no;j++){
					if(j==1||j==5||j==i){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}				
				}
				System.out.println();
			}
			break;
		case 'o':
			for(int i=1;i<=no;i++){
				for(int j=1;j<=no;j++){
					if((i==1&&j!=1&&j!=5)||(i==5&&j!=1&&j!=5)||(j==1&&i!=1&&i!=5)||(j==5&&i!=1&&i!=5)){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}				
				}
				System.out.println();
			}
			break;
		case 'p':
			for(int i=1;i<=no;i++){
				for(int j=1;j<=no;j++){
					if(j==1||(i==1&&j!=5)||(i==3&&j!=5)||(i==2&&j!=2&&j!=3&&j!=4)){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}				
				}
				System.out.println();
			}
			break;
		case 'q':
			for(int i=1;i<=no;i++){
				for(int j=1;j<=no;j++){
					if((i==1&& j!=5)||(i==5&&j!=5)||(i==3&&j!=5)||(i!=1&&i!=3&&i!=5&&j==5)||j==1){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}				
				}
				System.out.println();
			}
			break;
		case 'r':
			for(int i=1;i<=no;i++){
				for(int j=1;j<=no;j++){
					if((i==1&& j!=5)||(i==5&&j!=5)||(i==3&&j!=5)||(i!=1&&i!=3&&i!=5&&j==5)||j==1){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}				
				}
				System.out.println();
			}
			break;
		case 's':
			for(int i=1;i<=no;i++){
				for(int j=1;j<=no;j++){
					if((i==1&& j!=5)||(i==5&&j!=5)||(i==3&&j!=5)||(i!=1&&i!=3&&i!=5&&j==5)||j==1){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}				
				}
				System.out.println();
			}
			break;
		case 't':
			for(int i=1;i<=no;i++){
				for(int j=1;j<=no;j++){
					if((i==1&& j!=5)||(i==5&&j!=5)||(i==3&&j!=5)||(i!=1&&i!=3&&i!=5&&j==5)||j==1){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}				
				}
				System.out.println();
			}
			break;
		case 'u':
			for(int i=1;i<=no;i++){
				for(int j=1;j<=no;j++){
					if((i==1&& j!=5)||(i==5&&j!=5)||(i==3&&j!=5)||(i!=1&&i!=3&&i!=5&&j==5)||j==1){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}				
				}
				System.out.println();
			}
			break;
		case 'v':
			for(int i=1;i<=no;i++){
				for(int j=1;j<=no;j++){
					if((i==1&& j!=5)||(i==5&&j!=5)||(i==3&&j!=5)||(i!=1&&i!=3&&i!=5&&j==5)||j==1){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}				
				}
				System.out.println();
			}
			break;
		case 'w':
			for(int i=1;i<=no;i++){
				for(int j=1;j<=no;j++){
					if((i==1&& j!=5)||(i==5&&j!=5)||(i==3&&j!=5)||(i!=1&&i!=3&&i!=5&&j==5)||j==1){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}				
				}
				System.out.println();
			}
			break;
		case 'x':
			for(int i=1;i<=no;i++){
				for(int j=1;j<=no;j++){
					if((i==1&& j!=5)||(i==5&&j!=5)||(i==3&&j!=5)||(i!=1&&i!=3&&i!=5&&j==5)||j==1){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}				
				}
				System.out.println();
			}
			break;
		case 'y':
			for(int i=1;i<=no;i++){
				for(int j=1;j<=no;j++){
					if((i==1&& j!=5)||(i==5&&j!=5)||(i==3&&j!=5)||(i!=1&&i!=3&&i!=5&&j==5)||j==1){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}				
				}
				System.out.println();
			}
			break;
		case 'z':
			for(int i=1;i<=no;i++){
				for(int j=1;j<=no;j++){
					if((i==1&& j!=5)||(i==5&&j!=5)||(i==3&&j!=5)||(i!=1&&i!=3&&i!=5&&j==5)||j==1){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}				
				}
				System.out.println();
			}
			break;
				
		}
	}

}
