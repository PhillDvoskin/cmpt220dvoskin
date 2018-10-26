package lab7dvoskin;

public class Problem3 {

	public static void main(String[] args) {
		Course course1 = new Course("Software Development I");
		// add 3 students
		course1.addStudent("Peter Jones");
		course1.addStudent("Brian Smith");
		course1.addStudent("Anne Kennedy");
		// below was to check if array can hold more than 5 names which it could
		//course1.addStudent("Pete Davidson");
		//course1.addStudent("Taylor Callamaria");
		//course1.addStudent("Sherk Shrekson");
		//course1.clearCourse();
		// drop a student
		course1.dropStudent("Peter Jones");
		
		System.out.println("Number of students in " + course1.getCourseName() + " "
				+ course1.getNumberOfStudents());
		String[] students = course1.getStudents();
		for (int i = 0; i < course1.getNumberOfStudents(); i++)
			System.out.print(students[i] + ", ");
	}
}


