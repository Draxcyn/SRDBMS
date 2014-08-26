package com.iacademy.oop.utility;

import com.iacademy.oop.model.Student;
import com.iacademy.oop.view.StudentDatabase;

public class DBOperations {
	
	public void addStudent (StudentDatabase studentDB[],Student student, int num) {
		
			if(num!=5){
			studentDB[num].setId(student.getId()); 	
			studentDB[num].setLastName(student.getLastName());
			studentDB[num].setFirstName(student.getFirstName());
			studentDB[num].setCourse(student.getCourse());
			studentDB[num].setYearLevel(student.getYearLevel());
			studentDB[num].setUnitsEnrolled(student.getUnitsEnrolled());
			
			System.out.println("\nRecorded successfully created at location " + num);
			new BeanHelper().writeToXml(studentDB);
			}
			
			else{
				System.out.println("\n\nError record insert - Database is already full.");
			}
	}
		
	void deleteStudent (StudentDatabase studentDB[],String id) {}
	
	public void listStudents (StudentDatabase studentDB[]) {
		System.out.println("\nLists of Students Enrolled");
		System.out.println("==========================");
		for(int ctr = 0; ctr < 5; ctr++){
			if(studentDB[ctr].getId()!="Empty"){
				System.out.println("\nID: " + studentDB[ctr].getId());
				System.out.println("Name: " + studentDB[ctr].getLastName() + ", " + studentDB[ctr].getFirstName());
				System.out.println("Course: " + studentDB[ctr].getCourse());	
				System.out.println("Year Level: " + studentDB[ctr].getYearLevel());
				System.out.println("Units Enrolled: " + studentDB[ctr].getUnitsEnrolled());
			}
		Student stdb[] = new BeanHelper().readFromXml();
		}
		
		System.out.println("\n\nTotal Students Enrolled: "); //all conc!
		System.out.println("Total # for CS  : ");
		System.out.println("Total # for IT  : ");
		System.out.println("Total # for GD  : ");
		System.out.println("Total # for MMA : ");
		System.out.println("Total # for A   : ");
		System.out.println("Total # for BA  : ");
		System.out.println("Total # for FD  : ");
	}
	void purge (StudentDatabase studentDB[]) {}
		
	void createReport (StudentDatabase studentDB[]) {}
	
	public void searchStudent (StudentDatabase studentDB[], String id) {
		//access xml
		//then compare ex. if(studentDB[0].getId==id){};
	}
	
	
	
}

	
	
	
		
	

