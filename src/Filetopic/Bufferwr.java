package Filetopic;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Bufferwr {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f1=new File("E://Singathi/buffer.txt");
		FileWriter fw=new FileWriter(f1);
		@SuppressWarnings("resource")
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("hello");
		bw.newLine();
		bw.write("hi");
		bw.flush();
		System.out.println("data is writen");
	}

}
