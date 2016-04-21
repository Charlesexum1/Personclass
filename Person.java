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
	public boolean comparePeople(Person otherPerson){
		return (this.name.equals(otherPerson.name)) &&
			   (this.age == otherPerson.age);
		}	
	public boolean compareNames(Person otherPerson){
		return (this.name.equals(otherPerson.name));
		}
	public boolean compareAge(Person otherPerson){
		return (this.age == otherPerson.age);
		}
	public boolean isOlder(Person otherPerson){
		return (this.age > otherPerson.age);
		}
	public boolean isYounger(Person otherPerson){
		return (this.age < otherPerson.age);
		}							
		
	
	public static void main (String args[]) {
		Person Graf = new Person();
		Graf.setInfo("Charles DeGrapharee Exum", 26);
		System.out.println(Graf.getAge() + " " + Graf.getName());
		Person alsoGraf = new Person();
		alsoGraf.setInfo("Graf", 26);
		System.out.println(alsoGraf.comparePeople(Graf));
		System.out.println(alsoGraf.compareNames(Graf));
		System.out.println(alsoGraf.compareAge(Graf));
		System.out.println(alsoGraf.isOlder(Graf));
		System.out.println(alsoGraf.isYounger(Graf));
		
	}
}

