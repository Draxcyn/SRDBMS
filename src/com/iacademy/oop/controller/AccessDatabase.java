package com.iacademy.oop.controller;

import java.util.Scanner;

import com.iacademy.oop.model.Student;
import com.iacademy.oop.utility.DBOperations;
import com.iacademy.oop.view.StudentDatabase;;

public class AccessDatabase {
	static boolean menuLooper = false;
	static String selectionOption = "";
	public static StudentDatabase studentDB[] = new StudentDatabase[5]; 
	
	public static void main(String[] args) throws InterruptedException{
		Scanner scan = new Scanner(System.in);
		
		do{
		menu();	
		System.out.print("\nSelection option: ");
		selectionOption = scan.nextLine();
	
		selectedOption(selectionOption);
			
		if(selectionOption.equalsIgnoreCase("Q")){
			menuLooper=true;
		}	
		}while(menuLooper==false);
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
	public static void selectedOption(String selectionOption) throws InterruptedException{
		StudentDatabase sdb = new StudentDatabase();
		DBOperations dbo = new DBOperations();
		
		if(selectionOption.equalsIgnoreCase("A")){ 		//add
			
			Student student = new Student();
			
			student.setId(sdb.getString("\nEnter Student ID: "));
			student.setLastName(sdb.getString("Enter Student Last Name: "));
			student.setFirstName(sdb.getString("Enter Student First Name: "));
			student.setCourse(sdb.getString("Enter Student Course: "));
			student.setYearLevel(sdb.getInteger("Enter Student Year Level: "));
			student.setUnitsEnrolled(sdb.getInteger("Enter Number of Units Enrolled: "));
			
			dbo.addStudent(studentDB,student);
			
		}
		else if(selectionOption.equalsIgnoreCase("L")){ //list
		}
		else if(selectionOption.equalsIgnoreCase("S")){ //search
			Scanner scan = new Scanner(System.in);
			System.out.print("\nEnter Student ID: ");
			String searchId = scan.nextLine();
			forEach("....");
			
			dbo.searchStudent(studentDB,searchId);
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
	public static void forEach(String message) throws InterruptedException{
		char letters[] = message.toCharArray();
		System.out.print("\nPlease wait");
		for(char letter : letters){
			Thread.sleep(500);
			System.out.print(letter);
		}
		System.out.println("searching for student record");
		System.out.println("\nRecord Found!\n");
	}

}
