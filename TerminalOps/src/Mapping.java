import java.util.List;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDataBase;

public class Mapping {

	public static void main(String[] args) {
		// apply transformation function first and then collects the data in a a collection
		List<String> students =  StudentDataBase.getAllStudents()
									.stream()
									.collect(Collectors.mapping(Student::getName, Collectors.toList()));
		
		System.out.println(students);
	}
}
