package com.file;

import java.io.File;
import java.io.IOException;

public class NewFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
File f = new File ("D:\\durga123") ;
f.mkdir();
//f.createNewFile();
System.out.println(f.exists());
File f1 = new File(f,"abc.txt");
f1.createNewFile();
System.out.println(f1.exists());
	}

}
