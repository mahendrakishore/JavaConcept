package com.collection.map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ProertiesDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
Properties p = new Properties();
FileInputStream fis = new FileInputStream("abc.properties");
p.load(fis);
System.out.println(p);
String s = p.getProperty("venki");
System.out.println(s);
p.setProperty("nag", "8888");
FileOutputStream fos = new FileOutputStream("abc.properties");
p.store(fos, "edited by durga");
System.out.println(p);
}

}
