package com.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
FileReader fr = new FileReader("abc.txt");
int i = fr.read();
while(i!=-1){
	System.out.print((char)i);
	i=fr.read();
}
	}

}
