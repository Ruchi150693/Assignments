package com.java.assignment.day5;

public class FinalKeyword {
	

	 final String name="Ruchi";
	
	public void displayName(String name) {
		
		
		name="Jyoti";
		System.out.println("My name is :"+name);
		
	}
	
	public static void main(String[] args) {
		
		FinalKeyword fKey=new FinalKeyword();
		//fKey.name="Neha";
		fKey.displayName(fKey.name);
		System.out.println("My name is :"+fKey.name);
	
	}

}
