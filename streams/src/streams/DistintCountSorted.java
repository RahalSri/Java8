package streams;

import java.util.List;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDataBase;

public class DistintCountSorted {

	public static List<String> printStuActivities() {
		return StudentDataBase.getAllStudents().stream()
				.map(Student::getActivities) //Strem<List<String>>
				.flatMap(List::stream) //Stream<String>
				.distinct() // get distinct activities
				.sorted()
				.collect(Collectors.toList());
				
	}
	
	public static long countStuActivities() {
		return StudentDataBase.getAllStudents().stream()
				.map(Student::getActivities) //Strem<List<String>>
				.flatMap(List::stream) //Stream<String>
				.distinct() // get distinct activities
				.count();
				
	}
	public static void main(String[] args) {
		System.out.println(printStuActivities());
		System.out.println(countStuActivities());

	}

}
