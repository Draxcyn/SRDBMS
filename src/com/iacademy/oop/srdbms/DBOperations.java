package com.iacademy.oop.srdbms;

import com.iacademy.oop.srdbms.Student;
import com.iacademy.oop.srdbms.StudentDatabase;

class DBOperations {

	void addStudent (StudentDatabase studentDB[],Student student) {
		StudentDatabase sdb = new StudentDatabase();
		
		student.setId(sdb.getInteger("\nEnter Student ID: "));
		student.setLastName(sdb.getString("Enter Student Last Name: "));
		student.setFirstName(sdb.getString("Enter Student First Name: "));
		student.setCourse(sdb.getString("Enter Student Course: "));
		student.setYearLevel(sdb.getInteger("Enter Student Year Level: "));
		student.setUnitsEnrolled(sdb.getInteger("Enter Number of Units Enrolled: "));
		System.out.println("");
		
	}
	void deleteStudent (StudentDatabase studentDB[],int id) {}
	
	void listStudents (StudentDatabase studentDB[]) {
		System.out.println("Lists of Students Enrolled");
		System.out.println("==========================\n");
		//System.out.println("ID: " + sdb.getId());
		//System.out.println("Name: " + sdb.getName());
		//System.out.println("Course: " + sdb.getCourse());
		//System.out.println("Year Level: " + sdb.getYearLevel());
		//System.out.println("Units Enrolled: " + sdb.getUnitsEnrolled());
		
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
	
	void searchStudent (StudentDatabase studentDB[], int id) throws InterruptedException{
		System.out.println("Enter Student ID: ");
		forEach("\nPlease wait.... searching for student record "); //conc
		System.out.println("\nRecord Found!");
		
		//System.out.println("ID: " + studentDB[0].getId);
		//System.out.println("Name: " + studentDB[0].getName);
		//System.out.println("Course: " + studentDB[0].getCourse);
		//System.out.println("Year Level: " + studentDB[0].getYearLevel);
		//System.out.println("Units Enrolled: " + studentDB[0].getUnitsEnrolled);	
	}
	
	////////////////
	public static void forEach(String message) throws InterruptedException{
					char letters[] = message.toCharArray();
					System.out.println("\nPerforming for-each loop.");
					for(char letter : letters){
						Thread.sleep(200);
						System.out.print(letter);
					}
	}
}

	
	
	
		
	

