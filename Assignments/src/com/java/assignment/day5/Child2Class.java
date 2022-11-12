package com.java.assignment.day5;

public class Child2Class extends  ParentClass {
	
  String name;
  
  public void displayName(String n)
  {
	  System.out.println("Name of Child 2 is : "+n);
  }
  
  public static void main(String[] args) {
	Child2Class ch1=new Child2Class();
	ch1.age=55;
	ch1.displayAge(ch1.age);
	ch1.name="Rahul";
	ch1.displayName(ch1.name);
}

}
