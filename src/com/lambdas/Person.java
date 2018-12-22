package com.lambdas;

public class Person {
String firstname;
String lastname;
int age;
long salary;

public Person() {
	super();
}

public Person(String firstname, String lastname, int age, long salary) {
	super();
	this.firstname = firstname;
	this.lastname = lastname;
	this.age = age;
	this.salary = salary;
}

public String getFirstname() {
	return firstname;
}

public void setFirstname(String firstname) {
	this.firstname = firstname;
}

public String getLastname() {
	return lastname;
}

public void setLastname(String lastname) {
	this.lastname = lastname;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public long getSalary() {
	return salary;
}

public void setSalary(long salary) {
	this.salary = salary;
}





}
