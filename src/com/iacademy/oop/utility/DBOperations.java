package com.iacademy.oop.utility;

import com.iacademy.oop.model.Student;
import com.iacademy.oop.view.StudentDatabase;

public class DBOperations {

	public void addStudent (StudentDatabase studentDB[],Student student) {
		
		for(int ctr = 0; ctr < 5;ctr++){
			studentDB[0].equals(student);
		}
		
		new BeanHelper().writeToXml(studentDB);
	}
	
	void deleteStudent (StudentDatabase studentDB[],int id) {}
	
	void listStudents (StudentDatabase studentDB[]) {
		System.out.println("Lists of Students Enrolled");
		System.out.println("==========================\n");
		//System.out.println("ID: " + studentDB[0].getId());
		//System.out.println("Name: " + studentDB[0].getName());
		//System.out.println("Course: " + studentDB[0].getCourse());
		//System.out.println("Year Level: " + studentDB[0].getYearLevel());
		//System.out.println("Units Enrolled: " + studentDB[0].getUnitsEnrolled());
		
		//Student stdb[] = new BeanHelper().readFromXml();
		
		
		System.out.println("Total Students Enrolled: "); //all conc!
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

	
	
	
		
	

