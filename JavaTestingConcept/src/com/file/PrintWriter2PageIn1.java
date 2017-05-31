package com.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter2PageIn1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
PrintWriter pw = new PrintWriter("file3.txt");
BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
String line = br.readLine();
while(line!=null){
	pw.println(line);
line =	br.readLine();}
br = new BufferedReader(new FileReader("abcd.txt"));
String line1 = br.readLine();
while(line1!=null){
	pw.println(line1);
line1= br.readLine();	
}
pw.flush();
br.close();
pw.close();

	}

}
