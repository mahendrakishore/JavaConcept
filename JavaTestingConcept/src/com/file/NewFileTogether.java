package com.file;

import java.io.File;
import java.io.IOException;

public class NewFileTogether {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
File f  = new File("E:durga","abc.txt");
f.createNewFile();
System.out.println(f.exists());
	}

}
