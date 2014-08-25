package com.iacademy.oop.view;

import java.util.*;

public class StudentDatabase {
	
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
