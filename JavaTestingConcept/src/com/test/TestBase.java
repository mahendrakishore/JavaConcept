package com.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
	
	static Properties properties ;
	static public void loadData() throws IOException{
	
		File file = new File("C:\\JavaTestingConcept\\src\\prop\\Test1.properties");
				//("user.dir")+("\\src\\prop\\Test1.properties"));
		FileReader reader = new FileReader(file);
		properties = new Properties();
		properties.load(reader);
		}
	static public String getObject(String data) throws IOException{
		loadData();
		String data1 = properties.getProperty(data);
		return data1;
	}
	
	
	}
