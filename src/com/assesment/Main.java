package com.assesment;
import java.util.ArrayList;

public class Main {
	
	static void print(String anything) {
		System.out.println(anything);
	}
	
	static void mataPelajaran(boolean anything, ArrayList<String> anything2) {
		if(anything == true) {
			System.out.println(anything2);
		}
		if(anything == false) {
			System.out.println("mata pelajaran sudah ditambahkan");
		}
	}
	
	static void hapusMapel(boolean anything, ArrayList<String> anything2) {
		if(anything == false) {
			System.out.println("mata pelajaran tidak ditemukan");
		}
		if(anything == true) {
			System.out.println(anything2);
		}
	}
	
	
	public static void main (String[] args) {
				
		Person org = new Person("Antok", "Negara");
		print(org.toString());
		
		Teacher guru = new Teacher("dodi", "provinsi");
		print(guru.toString());
		print(guru.getName());
		print(guru.getAddress());
		mataPelajaran(guru.addCourse("Math"), guru.allCourses());
		mataPelajaran(guru.addCourse("Science"), guru.allCourses());
		mataPelajaran(guru.addCourse("Science"), guru.allCourses());
		hapusMapel(guru.removeCourse("Language"), guru.allCourses());
		hapusMapel(guru.removeCourse("Science"), guru.allCourses());
		guru.setAddress("pindah");
		print(guru.toString());
		
		
		
		Student murid = new Student("budi", "kabupaten");
		print(murid.toString());
		print(murid.getName());
		print(murid.getAddress());
		murid.addCourseGrade("Math", 8);
		murid.addCourseGrade("Science", 10);
		murid.printGrades();
		System.out.println(murid.getAverageGrade());
		
	}
}
