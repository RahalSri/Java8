package streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDataBase;

public class CustomSorted {

	public static List<Student> sortByNameAsc() {
		return StudentDataBase.getAllStudents().stream()
				.sorted(Comparator.comparing(Student::getName))
				.collect(Collectors.toList());
	}
	
	public static List<Student> sortByNameDesc() {
		return StudentDataBase.getAllStudents().stream()
				.sorted(Comparator.comparing(Student::getName).reversed())
				.collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		sortByNameAsc()
			.forEach(System.out::println);
		System.out.println("////////////////////////////////////");
		sortByNameDesc()
		.forEach(System.out::println);

	}

}
