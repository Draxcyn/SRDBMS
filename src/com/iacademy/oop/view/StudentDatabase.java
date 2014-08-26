package com.iacademy.oop.view;

import java.util.*;
import com.iacademy.oop.model.Student;

public class StudentDatabase extends Student{
	
	public String getString(String message) {
		Scanner scan = new Scanner(System.in);

		System.out.print(message);
		String input = scan.nextLine();		
		return input;
	}
	public int getInteger(String message) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print(message);
		int input = scan.nextInt();		
		return input;
	}
	public static void menu(){
		System.out.println("iACADEMY");
		System.out.println("Student Registration Management System");
		System.out.println("\n[A]-dd Student");
		System.out.println("[L]-ist Students");
		System.out.println("[S]-earch Student");
		System.out.println("[D]-elete Student");
		System.out.println("[R]-eport Generator");
		System.out.println("[P]-urge");
		System.out.println("[Q]-uit");
	}
}
