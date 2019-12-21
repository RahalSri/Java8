package streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDataBase;

public class Filter {

	public static List<Student> filterFemale() {
		return StudentDataBase.getAllStudents().stream()
				.filter(student -> "female".equals(student.getGender()))
				.collect(Collectors.toList());
	}

	public static void main(String[] args) {
		filterFemale().forEach(System.out::println);

	}

}
