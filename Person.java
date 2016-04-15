/*
 * Person.java
 * 
 * Copyright 2016 graf <graf@chillosphere.spacepotato>
 * 
 * 
 */


public class Person {
	
	private String name;
	private int age;
	
	public void setInfo(String newName, int newAge) { // mutator method
		name = newName;
		age = newAge;
		}
	public int getAge() { // accessor method
		return age;
		}
	public String getName() { // "" ""
		return name;
		}	
		
	
	public static void main (String args[]) {
		Person Graf = new Person();
		Graf.setInfo("Charles DeGrapharee Exum", 26);
		System.out.println(Graf.getAge() + " " + Graf.getName());
		
	}
}

