package com.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//FileReader fr = new FileReader("ab.txt");
FileReader fr = new FileReader("abcd.txt");
BufferedReader br = new BufferedReader(fr);
String line = br.readLine();
while(line!=null){
	System.out.println(line);
	line = br.readLine();
}
br.close();
	}

}
