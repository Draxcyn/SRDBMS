package com.iacademy.oop.utility;

import java.util.Scanner;

import com.iacademy.oop.model.Student;
import com.iacademy.oop.view.StudentDatabase;

public class DBOperations {
	
	public void addStudent (StudentDatabase studentDB[],Student student, int indexUpdater) { //add
		
			if(indexUpdater!=5){
			studentDB[indexUpdater].setId(student.getId()); 	
			studentDB[indexUpdater].setLastName(student.getLastName());
			studentDB[indexUpdater].setFirstName(student.getFirstName());
			studentDB[indexUpdater].setCourse(student.getCourse());
			studentDB[indexUpdater].setYearLevel(student.getYearLevel());
			studentDB[indexUpdater].setUnitsEnrolled(student.getUnitsEnrolled());
			System.out.println("\nRecorded successfully created at location " + indexUpdater + ".\n");
			new BeanHelper().writeToXml(studentDB);
			}
			else{
				System.out.println("\nError record insert - Database is already full.\n");
			}
	}
		
	void deleteStudent (StudentDatabase studentDB[],String id) {} //delete
	
	public void listStudents (StudentDatabase studentDB[]) { //list
		int studentEnrolled = 0, cS = 0, iS = 0, iT = 0;
		
		studentDB = new BeanHelper().readFromXml();
		if(studentDB==null){System.out.println("WEWS");}
		
		System.out.println("\nLists of Students Enrolled");
		System.out.println("==========================");
		for(int ctr = 0; ctr < 5; ctr++){
			if(studentDB[ctr].getId()!="Empty"){
				System.out.println("\nID: " + studentDB[ctr].getId());
				System.out.println("Name: " + studentDB[ctr].getLastName() + ", " + studentDB[ctr].getFirstName());
				System.out.println("Course: " + studentDB[ctr].getCourse());	
				System.out.println("Year Level: " + studentDB[ctr].getYearLevel());
				System.out.println("Units Enrolled: " + studentDB[ctr].getUnitsEnrolled());
				studentEnrolled+=1;
				
				if(studentDB[ctr].getCourse().equalsIgnoreCase("BSCS")||studentDB[ctr].getCourse().equalsIgnoreCase("BS-CS")){
					cS+=1;
				}
				else if(studentDB[ctr].getCourse().equalsIgnoreCase("BSIS")||studentDB[ctr].getCourse().equalsIgnoreCase("BS-" + "IS")){
					iS+=1;
				}
				else if(studentDB[ctr].getCourse().equalsIgnoreCase("BSIT")||studentDB[ctr].getCourse().equalsIgnoreCase("BS-IT")){
					iT+=1;
				}
			}
		}
		
		System.out.println("\n\nTotal Students Enrolled: " + studentEnrolled); 
		System.out.println("Total # for CS  : " + cS);
		System.out.println("Total # for IS  : " + iS);
		System.out.println("Total # for IT  : " + iT + "\n");
		
	}
	
	public void purge (StudentDatabase studentDB[]) { //purge
		Scanner scan = new Scanner(System.in);
		System.out.print("\nAre you sure you want to purge all records? ");
		String yesOrNo = scan.nextLine();
		
		if(yesOrNo.equalsIgnoreCase("Y")){
			for (int ctr = 0; ctr < studentDB.length; ctr++) {
				studentDB[ctr] = new StudentDatabase();
				new BeanHelper().writeToXml(studentDB);
			}
			//forEach();
		System.out.println("\nALL records successfully deleted.\n");
		}
		else{}
	}
		
	void createReport (StudentDatabase studentDB[]) {}
	
	public void searchStudent (StudentDatabase studentDB[], String id) { //search
		for(int ctr = 0; ctr < 5; ctr++){
			if(studentDB[ctr].getId().equals(id)){
				System.out.println("\n\nRecord Found!");
				System.out.println("\nID: " + studentDB[ctr].getId());
				System.out.println("Name: " + studentDB[ctr].getLastName() + ", " + studentDB[ctr].getFirstName());
				System.out.println("Course: " + studentDB[ctr].getCourse());	
				System.out.println("Year Level: " + studentDB[ctr].getYearLevel());
				System.out.println("Units Enrolled: " + studentDB[ctr].getUnitsEnrolled() + "\n");
				break;
			}
			if(ctr==4){
				if(studentDB[4].getId()!=id){
					System.out.println("\n\nError on record search – Student ID " + id + " not found!\n");
				}
			}
		}
		
		//else{
			//System.out.println("Error on record search – Student ID " +  id + " not found!");
		//}
	}

	public void timeDelay(String message) throws InterruptedException{
		char letters[] = message.toCharArray();		
		for(char letter : letters){
			Thread.sleep(1200);
			System.out.print(letter);
		}
	}
	
}

	
	
	
		
	

