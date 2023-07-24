package chapter07;

import myutils.Person;

public class Chapter07Exercise14 {

	public static void main(String[] args) {
		// Test the constructor
		Person person1 = new Person();
		System.out.println("Person 1's name: " + person1.getName());

		// Test the setName and getName methods
		Person person2 = new Person();
		person2.setName("Rakib");
		System.out.println("Person 2's name: " + person2.getName());
	}

}
