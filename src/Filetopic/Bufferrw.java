package Filetopic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Bufferrw {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		File f1=new File("E://Singathi/buffer.txt");
		FileReader fr=new FileReader(f1);
		@SuppressWarnings("resource")
		BufferedReader br=new BufferedReader(fr);
		String s1=br.readLine();
		while(s1!=null){
			System.out.println(s1);
			s1=br.readLine();
		}
		
	}

}
