package com.file;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileWriter fw = new FileWriter("abc.txt");
PrintWriter pw = new PrintWriter(fw);
PrintWriter pw1 = new PrintWriter("abcd.txt");
pw1.println("printwriter next line");
pw.print(100 );
pw1.print(100);
pw.flush();
pw1.flush();
pw.close();
pw1.close();
	}

}
