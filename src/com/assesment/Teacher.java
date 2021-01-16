package com.assesment;
import java.util.ArrayList;

public class Teacher extends Person{
	int numCourses = 0;
	ArrayList<String> courses = new ArrayList<String>();
	
	public Teacher(String name, String address) {
		super(name, address);
	}
	
	public boolean addCourse(String course) {
		if(courses.contains(course)) {
			return false;			
		}else {
			courses.add(course);	
			return true;
		}
	}
	
	public boolean removeCourse(String course) {
		if(courses.contains(course)) {
			courses.remove(course);
			return true;		
		}else {	
			return false;
		}
	}
	
	public ArrayList allCourses() {
		return courses;
	}
	
	@Override
	public String toString () {
		return "Teacher: " + name +" "+ address;
	}
}
