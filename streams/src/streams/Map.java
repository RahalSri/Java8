package streams;

import java.util.Set;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDataBase;

public class Map {

	public static Set<String> studentNames() {
		return StudentDataBase.getAllStudents().stream()
				.map(Student::getName) //convert type to another
				.map(String::toUpperCase) // perform operationn
				.collect(Collectors.toSet());
	}
	public static void main(String[] args) {
		// Convert one type to another or perform operation
		System.out.println(studentNames());
	}

}
