package com.greatlearning.assignment7;

import java.io.IOException;
import java.util.Scanner;
import com.greatlearning.assignment7.Reflection;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int choice;
        String continueChoice;
        String packageInput;
        Scanner in = new Scanner(System.in);
        while(true) {
        	System.out.println("Please enter the package name");
        	packageInput = in.nextLine();
        	System.out.println("Select Menu option");
        	System.out.println("1. Methods");
        	System.out.println("2. Class");
        	System.out.println("3. Subclasses");
        	System.out.println("4. Parent Classes");
        	System.out.println("5. Constructors");
        	System.out.println("6. Data Members");
        	choice = in.nextInt();
        	in.nextLine();
        	switch(choice) {
        	case 1: try {
					Reflection.showMethods(packageInput);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        		break;
        	case 2: try {
					Reflection.showClass(packageInput);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        		break;
        	case 3: try {
					Reflection.showSubclasses(packageInput);
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
        		break;
        	case 4: try {
					Reflection.showParentClasses(packageInput);
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
        		break;
        	case 5: try {
					Reflection.showConstructors(packageInput);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        		break;
        	case 6: try {
					Reflection.showDatamembers(packageInput);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        		break;
        	case 0:
        		return;
        	default:
        		System.out.println("Incorrect choice, please select again");
        	}
        	
        	System.out.println("Enter n to exit, y to continue");
        	continueChoice = in.nextLine();
        	if(continueChoice.equals("n")) {
        		return;
        	}
        	
        }
    }
}
