package com.java.assignment.day5;

public class Selenium {
	
	public void second() {
		
		System.out.println("This is Selenium class");
		
	}
	
	public static void main(String[] args) {
		
		Selenium se=new Selenium();
		se.second();
		Automation automation=new Automation(); //has a relationship
		automation.first();
	}

}
