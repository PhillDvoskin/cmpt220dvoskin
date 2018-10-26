package lab7dvoskin;

import java.util.Arrays;

public class Course {
	private int x = 5;
	private String courseName;
	private String[] students = new String[x];
	private int numberOfStudents;
	// if students array is not big enough make a bigStudents array that is the students array but 5 larger
	private String[] bigStudents = Arrays.copyOf(students, students.length + 5);
	
	public Course(String courseName) {
		this.courseName = courseName;
	}
	
	public void addStudent(String student) {
		if(getNumberOfStudents()>=2)
        {
             for (int i = 0; i < students.length; i++)
             {
                  bigStudents[i] = students[i];
             }
              students = bigStudents;
        }
		students[numberOfStudents] = student;
		numberOfStudents++;
	}
	
	public String getCourseName() {
		return courseName;
	}

	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	public void dropStudent(String student) {
		for (int i = 0; i < numberOfStudents; i++) {
			if (students[i].equals(student)) {
				for (int j=i+1; j < numberOfStudents; j++)
					students[j - 1] = students[j];
				numberOfStudents--;
				return;
			}
		}
	}
	
	public void clearCourse() {
		while (numberOfStudents != 0) {
			numberOfStudents--;
		}
	}
	
}
