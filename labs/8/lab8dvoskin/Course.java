package lab8dvoskin;

import java.util.ArrayList;

public class Course {
	// private variables
	private String courseName;
	private ArrayList<String> students;

	// create a Course object
	public Course(String courseName) {
		this.courseName = courseName;
		students = new ArrayList<String>();
	}

	// add student method
	public void addStudent(String student) {
		students.add(student);
	}

	// return students already in the class
	public String[] getStudents() {
		String[] a = new String[students.size()];
		return students.toArray(a);
	}

	// return number of students in the class
	public int getNumberOfStudents() {
		return students.size();
	}

	// return the name of the course
	public String getCourseName() {
		return courseName;
	}

	// drop student from the course
	public void dropStudent(String student) {
		students.remove(student);
	}
}
