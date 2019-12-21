package streams;

import java.util.Optional;

import data.Student;
import data.StudentDataBase;

public class Find {

	public static Optional<Student> findAny() {
		return StudentDataBase.getAllStudents().stream()
				.filter(student -> student.getGpa() >= 3.9)
				.findAny();
	}
	
	public static Optional<Student> findFirst() {
		return StudentDataBase.getAllStudents().stream()
				.filter(student -> student.getGpa() >= 3.9)
				.findFirst();
	}
	
	public static void main(String[] args) {
		// findAny() - Return first element that meet criteria
		// findAny() - Return first element that meet criteria
		//  - Diff is in prarall processing
		Optional<Student> stu = findAny();
		if(stu.isPresent()) {
			System.out.println(stu.get());
		}
		Optional<Student> firstStu = findAny();
		if(firstStu.isPresent()) {
			System.out.println(firstStu.get());
		}
	}

}
