package com.greatlearning.assignment7;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;
import com.greatlearning.assignment7.FileOperations;

public class Reflection {
	public static void showMethods(String className) throws ClassNotFoundException, IOException {
		int choice;
		Class<?> classInstance = Class.forName(className);
		Method methodList[]= classInstance.getMethods();
		for(int i=0;i<methodList.length;i++) {
			System.out.println(methodList[i]);
		}
		System.out.println("1. Store information to file");
		System.out.println("2. See all previous files created");
		System.out.println("3. Exit without storing");
		Scanner input = new Scanner(System.in);
		choice = input.nextInt();
		input.nextLine();
		switch(choice){
		case 1: FileOperations.write(methodList, className+".txt");
			break;
		case 2: FileOperations.read(className+".txt");
			break;
		case 3:
			break;
		}
	}
	public static void showClass(String className) throws ClassNotFoundException, IOException {
		int choice;
		Class<?> classInstance = Class.forName(className);
		Class gotClass = classInstance.getClass();
		System.out.println(classInstance.getName());
		System.out.println(gotClass);
		System.out.println("1. Store information to file");
		System.out.println("2. See all previous files created");
		System.out.println("3. Exit without storing");
		Scanner input = new Scanner(System.in);
		choice = input.nextInt();
		input.nextLine();
		switch(choice){
		case 1: FileOperations.write(gotClass, className+".txt");
			break;
		case 2: FileOperations.read(className+".txt");
			break;
		case 3:
			break;
		}
	}
	public static void showSubclasses(String className) throws ClassNotFoundException, IOException {
		int choice;
		Class<?> classInstance = Class.forName(className);
		Class subClassList[] = classInstance.getClasses();
		for(int i=0;i<subClassList.length;i++) {
			System.out.println(subClassList[i]);
		}
		System.out.println("1. Store information to file");
		System.out.println("2. See all previous files created");
		System.out.println("3. Exit without storing");
		Scanner input = new Scanner(System.in);
		choice = input.nextInt();
		input.nextLine();
		switch(choice){
		case 1: FileOperations.write(subClassList, className+".txt");
			break;
		case 2: FileOperations.read(className+".txt");
			break;
		case 3:
			break;
		}
	}
	public static void showParentClasses(String className) throws ClassNotFoundException, IOException  {
		int choice;
		Class<?> classInstance = Class.forName(className);
		Class parentClass = classInstance.getSuperclass();
		System.out.println(parentClass.getName());
		System.out.println("1. Store information to file");
		System.out.println("2. See all previous files created");
		System.out.println("3. Exit without storing");
		Scanner input = new Scanner(System.in);
		choice = input.nextInt();
		input.nextLine();
		switch(choice){
		case 1: FileOperations.write(parentClass, className+".txt");
			break;
		case 2: FileOperations.read(className+".txt");
			break;
		case 3:
			break;
		}
	}
	public static void showConstructors(String className) throws ClassNotFoundException, IOException {
		int choice;
		Class<?> classInstance = Class.forName(className);
		Constructor constructorList[]= classInstance.getConstructors();
		for(int i=0;i<constructorList.length;i++) {
			System.out.println(constructorList[i]);
		}
		System.out.println("1. Store information to file");
		System.out.println("2. See all previous files created");
		System.out.println("3. Exit without storing");
		Scanner input = new Scanner(System.in);
		choice = input.nextInt();
		input.nextLine();
		switch(choice){
		case 1: FileOperations.write(constructorList, className+".txt");
			break;
		case 2: FileOperations.read(className+".txt");
			break;
		case 3:
			break;
		}
	}
	public static void showDatamembers(String className) throws ClassNotFoundException, IOException {
		int choice;
		Class<?> classInstance = Class.forName(className);
		Field fieldList[]= classInstance.getFields();
		for(int i=0;i<fieldList.length;i++) {
			System.out.println(fieldList[i]);
		}
		System.out.println("1. Store information to file");
		System.out.println("2. See all previous files created");
		System.out.println("3. Exit without storing");
		Scanner input = new Scanner(System.in);
		choice = input.nextInt();
		input.nextLine();
		switch(choice){
		case 1: FileOperations.write(fieldList, className+".txt");
			break;
		case 2: FileOperations.read(className+".txt");
			break;
		case 3:
			break;
		}
	}
	//Uncomment for testing menu option parent class and subclass
//	public class example extends FileOperations{
//		private String example="test";
//		public String getString() {
//			return this.example;
//		}
//	}
}
