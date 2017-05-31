package com.file;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

FileWriter fw = new FileWriter("abc.txt");
fw.write(100);
fw.write("\n");
fw.write("durga\\software");
fw.write('\n');
char[] ch = {'a','b','c'};
fw.write('\n');
fw.write(ch);
fw.flush();
fw.close();
	}

}
