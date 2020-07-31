package com.mastek.ho.Lambda;

import java.io.File;
import java.io.FileFilter;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
		//normal method of creating TextFileFilter class implementing filefilter interface
		
		/* TextFileFilter textFileFilter = new TextFileFilter(); 
		 * File[] textFiles = dir.listFiles(textFileFilter); 
		 * for (File file : textFiles) {
		 * 	System.out.println(file.getName()); 
		 * }
		 */
		
		
		//Anonymous inner class instance

		/* FileFilter javaFileFilter = new FileFilter() {
		 * 
		 * @Override public boolean accept(File pathname) { return
		 * pathname.getName().endsWith(".java"); } };
		 */
		 
		
		//Lambda expression
		FileFilter lambdaFilter = (File pathname) ->
			pathname.getName().endsWith(".java");
		
		File dir = new File("D:\\Product\\training-workspace\\Inventory\\src\\main\\java\\com\\mastek\\dao");
		File[] javaFiles = dir.listFiles(lambdaFilter);
		for (File file : javaFiles) {
			System.out.println(file.getName());
		}

	}
}
