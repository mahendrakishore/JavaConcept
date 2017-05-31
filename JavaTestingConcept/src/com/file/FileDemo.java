package com.file;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//File f = new File("abc.txt");
		/*System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());*/
		
		File f = new File ("durga123");
		System.out.println(f.exists());
		f.mkdir();
		System.out.println(f.exists());
	}

}
