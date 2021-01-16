package com.assesment;
import java.util.ArrayList;

public class Student extends Person{
	int numCourses = 0;
	ArrayList<String> courses = new ArrayList<String>();
	ArrayList<Integer> grades = new ArrayList<Integer>();
	
	public Student(String name, String address) {
		super(name, address);
	}
	
	public void addCourseGrade(String course, int grade) {	
		courses.add(course);
		grades.add(grade);
	}
	
	public void printGrades() {
		System.out.println(grades);
	}
	
	@Override
	public String toString () {
		return "Student: " + name +" "+ address;
	}
	
	public double getAverageGrade() {
		int total = grades.stream().mapToInt(Integer::intValue).sum();
		int numCourses = grades.size();
		return (total / numCourses);	
	}
}
