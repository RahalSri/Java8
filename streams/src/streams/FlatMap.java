package streams;

import java.util.List;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDataBase;

public class FlatMap {

	public static List<String> printStuActivities() {
		return StudentDataBase.getAllStudents().stream()
				.map(Student::getActivities) //Strem<List<String>>
				.flatMap(List::stream) //Stream<String>
				.collect(Collectors.toList());
				
	}
	public static void main(String[] args) {
		// used to get each element in stream where stream represent multiple elements
		System.out.println(printStuActivities());
	}

}
