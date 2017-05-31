package com.file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileWriter fw = new FileWriter("abcd.txt");
BufferedWriter bw = new BufferedWriter(fw);
bw.write(100);
bw.write("urga\\software");
bw.newLine();
char[] ch = {'a','b','c'};
bw.write(ch);
bw.flush();
bw.close();
	}

}
