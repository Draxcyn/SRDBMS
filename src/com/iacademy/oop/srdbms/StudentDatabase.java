package com.iacademy.oop.srdbms;

import java.util.*;

import com.iacademy.oop.srdbms.DBOperations;
import com.iacademy.oop.srdbms.Student;

public class StudentDatabase {
	
	static StudentDatabase studentDB[] = new StudentDatabase[5]; 
	static boolean menuLooper = false;
	static String selectionOption = "";
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DBOperations dbo = new DBOperations();
		Student stud1 = new Student();
		
		do{
		System.out.println("iACADEMY");
		System.out.println("Student Registration Management System");
		System.out.println("\n[A]-dd Student");
		System.out.println("[L]-ist Students");
		System.out.println("[S]-earch Student");
		System.out.println("[D]-elete Student");
		System.out.println("[R]-eport Generator");
		System.out.println("[P]-urge");
		System.out.println("[Q]-uit");
		
		System.out.print("\nSelection option: ");
		selectionOption = scan.nextLine();
		
		selectedOption(selectionOption);
		
		if(selectionOption.equalsIgnoreCase("Q")){
			menuLooper=true;
		}
		
		}while(menuLooper==false);
		
	}
	
	public static void selectedOption(String selectionOption){
		DBOperations dbo = new DBOperations();
		Student stud1 = new Student();
		
		if(selectionOption.equalsIgnoreCase("A")){ 		//add
			dbo.addStudent(studentDB, stud1);
		}
		else if(selectionOption.equalsIgnoreCase("L")){ //list
			dbo.listStudents(studentDB);
		}
		else if(selectionOption.equalsIgnoreCase("S")){ //search

		}
		else if(selectionOption.equalsIgnoreCase("D")){ //delete
			System.out.println("d");
		}
		else if(selectionOption.equalsIgnoreCase("R")){ //report
			System.out.println("r");
		}
		else if(selectionOption.equalsIgnoreCase("P")){ //purge
			System.out.println("p");
		}
	}
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
	
	
}
