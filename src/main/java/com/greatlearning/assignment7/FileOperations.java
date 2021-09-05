package com.greatlearning.assignment7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOperations {
	public static <T> void write(T list[], String fileName) throws IOException {
		File file = new File(fileName);
		FileWriter fw = new FileWriter(file, true);
		for(int i=0;i<list.length;i++) {
			fw.write(list[i].toString() + "\n");
		}
		fw.close();
	}
	public static <T> void write(T item, String fileName) throws IOException {
		File file = new File(fileName);
		FileWriter fw = new FileWriter(file, true);
		fw.write(item+"\n");
		fw.close();
	}
	public static void read(String fileName) throws FileNotFoundException {
		File file = new File(fileName);
		Scanner fileReader = new Scanner(file);
		while(fileReader.hasNextLine()) {
			System.out.println(fileReader.nextLine());
		}
		
	}
}
