package com.iacademy.oop.controller;

import java.util.Scanner;

import com.iacademy.oop.model.Student;
import com.iacademy.oop.view.StudentDatabase;
import com.iacademy.oop.utility.*;

public class AccessDatabase extends StudentDatabase {
	static boolean menuLooper = false;
	static String selectionOption = "";
	static int indexUpdater = 0;
	public static StudentDatabase studentDB[] = new StudentDatabase[5]; 
	
	public static void main(String[] args) throws InterruptedException {
		Scanner scan = new Scanner(System.in);
		
		//initialize studentDB array
		studentDB = new BeanHelper().readFromXml();
		if(studentDB==null){
			for (int ctr = 0; ctr < studentDB.length; ctr++) {
				studentDB[ctr] = new StudentDatabase();			
			}
			
			System.out.println("WEWS");
		}
		
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
	
	public static void selectedOption(String selectionOption) throws InterruptedException {
		StudentDatabase sdb = new StudentDatabase();
		DBOperations dbo = new DBOperations();
		
		if(selectionOption.equalsIgnoreCase("A")){ 		//ADD
			Student student = new Student();
			
			student.setId(sdb.getString("\nEnter Student ID: "));
			student.setLastName(sdb.getString("Enter Student Last Name: "));
			student.setFirstName(sdb.getString("Enter Student First Name: "));
			student.setCourse(sdb.getString("Enter Student Course: "));
			student.setYearLevel(sdb.getInteger("Enter Student Year Level: "));
			student.setUnitsEnrolled(sdb.getInteger("Enter Number of Units Enrolled: "));
			
			dbo.addStudent(studentDB,student,indexUpdater);
			indexUpdater+=1; 
		}
		else if(selectionOption.equalsIgnoreCase("L")){ //LIST
			dbo.listStudents(studentDB);
		}
		else if(selectionOption.equalsIgnoreCase("S")){ //SEARCH
			Scanner scan = new Scanner(System.in);
			System.out.print("\nEnter Student ID: ");
			String searchId = scan.nextLine();
			System.out.print("\nPlease wait... searching for student record " + searchId);
			dbo.timeDelay(" ");
			dbo.searchStudent(studentDB,searchId);
		}
		else if(selectionOption.equalsIgnoreCase("D")){ //DELETE 
			
		}	
		else if(selectionOption.equalsIgnoreCase("R")){ //REPORT 	
			
		}
		else if(selectionOption.equalsIgnoreCase("P")){ //PURGE
			dbo.purge(studentDB);
		}
	}
	

}
