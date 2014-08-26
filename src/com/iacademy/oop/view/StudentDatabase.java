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
}
