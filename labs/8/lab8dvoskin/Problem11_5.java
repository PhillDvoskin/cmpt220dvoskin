package lab8dvoskin;

public class Problem11_5 {
	public static void main(String[] args) {
		Course course1 = new Course("SD1");
		Course course2 = new Course("SD2");

		course1.addStudent("Sally Kim");
		course1.addStudent("Jenna Urkle");
		course1.addStudent("Peter Thomas");

		course2.addStudent("Sally Kim");
		course2.addStudent("Jennifer Derasmo");

		System.out.println("Number of students in course1: "
			+ course1.getNumberOfStudents());
		String[] students = course1.getStudents();
		for (int i = 0; i < course1.getNumberOfStudents(); i++)
			System.out.print(students[i] + ", ");

		System.out.println();
		System.out.print("Number of students in course2: "
			+ course2.getNumberOfStudents());
	}
}