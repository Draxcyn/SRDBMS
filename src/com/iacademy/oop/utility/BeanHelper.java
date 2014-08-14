package com.iacademy.oop.utility;

import java.beans.XMLEncoder;
import java.beans.XMLDecoder;

import java.io.*;

//import com.iacademy.oop.model.Car;

public class BeanHelper {

	/*public void writeToXml(Car [] mgaKotse) {		
		try {
			 XMLEncoder encoder = new XMLEncoder(
	                 new BufferedOutputStream(
	                 new FileOutputStream("D:\\xmlReport\\car.xml")));
			 
			 encoder.writeObject(mgaKotse);
			 encoder.close();
		} catch (FileNotFoundException fnfe) {
			System.err.println(fnfe.getMessage());
		}	
	}
	
	public Car[] readFromXml() {
		Car cars[] = null;
		
		try {
			XMLDecoder decoder = new XMLDecoder(
				new BufferedInputStream(
	            new FileInputStream("D:\\xmlReport\\car.xml")));
			
			cars = (Car[]) decoder.readObject();
			decoder.close();
		} catch (FileNotFoundException fnfe) {
			System.err.println(fnfe.getMessage());
		}		
		return cars;
	}*/
}
