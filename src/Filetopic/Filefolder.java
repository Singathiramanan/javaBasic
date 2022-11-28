package Filetopic;

import java.io.File;

public class Filefolder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1=new File("E://Singathi");
		if(f1.mkdir()){
			System.out.println("File is created");
		}
		if(f1.exists()){
			System.out.println("File is eixts");
		}else{
			System.out.println("File is not exits");
		}
		/*if(f1.delete()){
			System.out.println("File is deleted");
		}else{
			System.out.println("File is not deleted");
		}*/
		
	}

}
