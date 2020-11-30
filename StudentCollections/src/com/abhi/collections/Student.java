package com.abhi.collections;

public class Student {

	private String name;
	private int age;
	private String course;
	private String collegeName;
	
	public Student(String name, int age, String course, String collegeName) {
		super();
		this.name = name;
		this.age = age;
		this.course = course;
		this.collegeName = collegeName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", course=" + course + ", collegeName=" + collegeName + "]";
	}


	

}
