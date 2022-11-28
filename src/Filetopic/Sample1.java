package Filetopic;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Sample1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f1=new File("E:\\Singathi");
		FileWriter fw=new FileWriter(f1);
		fw.write("Write");
		fw.write("Hello");
		fw.flush();
		System.out.println("Data is written");
		FileReader fr=new FileReader(f1);
		char[] arr=new char[10];
		fr.read(arr);
		String s1=new String(arr);
		System.out.println(s1);		
	}

}
