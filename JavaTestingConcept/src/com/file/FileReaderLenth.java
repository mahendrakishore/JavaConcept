package com.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderLenth {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("abc.txt");
FileReader fr = new FileReader(f);
char[] ch = new char[(int)f.length()];
for(char ch1:ch){
	System.out.println(ch1);
}
	
fr.close();
	}

}
