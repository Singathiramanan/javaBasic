package Filetopic;

import java.io.File;
import java.io.IOException;

public class Fileexcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f1=new File("E://Singathi/file.xls");
		if(f1.createNewFile()){
			System.out.println("File is created");
		}else{
			System.out.println("File is not created");
		}
	}

}
