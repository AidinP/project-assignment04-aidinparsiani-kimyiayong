/**
 * 
 * Assignment 4
 * @author Aidin Parsiani
 * @author Kim Yiayong
 * @version 1.0
 * 
 * 
 **/
package com.assignment_4.superclasses;

/** Setting attributes */
public class Human {

	protected String name;
	protected int age;

	public Human(String name, int age) {
		this.name = name;
		this.age = age;

	}

	/** getters and setters */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/** getters and setters */
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
