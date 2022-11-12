package com.java.assignment.day5;

public class GrandChildClass extends Child1Class {
	
	String subject;
	
	public void displaySubject(String a) {
		
		System.out.println("Subject of Grand Child is : "+subject);
		
	}

	public static void main(String[] args) {
		GrandChildClass  gc=new GrandChildClass();
		gc.age=47;
		gc.displayAge(gc.age);
		gc.rollno=301;
		gc.displayRollNo(gc.rollno);
		gc.subject="Computer Science";
		gc.displaySubject(gc.subject);
	}
}
