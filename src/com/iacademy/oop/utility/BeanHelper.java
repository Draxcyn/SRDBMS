package com.iacademy.oop.utility;

import java.beans.XMLEncoder;
import java.beans.XMLDecoder;

import java.io.*;
import com.iacademy.oop.view.StudentDatabase;

public class BeanHelper {

	public void writeToXml(StudentDatabase studentDB[]) { 
		try {
			 XMLEncoder encoder = new XMLEncoder(
	                 new BufferedOutputStream(
	                 new FileOutputStream("C:\\xmlReport\\student.xml")));
			 
			 encoder.writeObject(studentDB);
			 encoder.close();
		} catch (FileNotFoundException fnfe) {
			System.err.println(fnfe.getMessage());
		}	
	}
	/*
	public StudentDatabase[] readFromXml() {
		StudentDatabase studentDB[] = null;
		
		try {
			XMLDecoder decoder = new XMLDecoder(
				new BufferedInputStream(
	            new FileInputStream("C:\\xmlReport\\student.xml")));
			
			studentDB = (StudentDatabase[]) decoder.readObject();
			decoder.close();
		} catch (FileNotFoundException fnfe) {
			System.err.println(fnfe.getMessage());
		}		
		return studentDB;
	}
	*/
	
}
