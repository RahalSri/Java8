import java.util.stream.Collectors;

import data.Student;
import data.StudentDataBase;

public class Joining {
	public static String Joining_1() {
		return StudentDataBase.getAllStudents()
			.stream()
			.map(Student::getName)
			.collect(Collectors.joining());
	}
	public static String Joining_2() {
		return StudentDataBase.getAllStudents()
			.stream()
			.map(Student::getName)
			.collect(Collectors.joining(" "));
	}
	public static String Joining_3() {
		return StudentDataBase.getAllStudents()
			.stream()
			.map(Student::getName)
			.collect(Collectors.joining(" ","(", ")"));
	}
	public static void main(String[] args) {
		//The joining() method of Collectors Class, in Java, is used to join 
		//various elements of a character or string array into a single string object.
		System.out.println(Joining_1());
		System.out.println(Joining_2());
		System.out.println(Joining_3());
	}
}
