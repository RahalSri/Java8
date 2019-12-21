import java.util.List;
import java.util.function.Consumer;

import data.Student;
import data.StudentDataBase;

public class ConsumerInterfaceEx {

	public static void main(String[] args) {
		
		List<Student> students = StudentDataBase.getAllStudents();
		
		Consumer<Student> cName= student -> System.out.print(student.getName());
		Consumer<Student> cActivities = student -> System.out.println(student.getActivities());
		
		cName.andThen(cActivities).accept(students.get(0));
		
		System.out.println("//////////////////////////////////////////////////");
		
		//consuer chaining "andTHen"
		students.forEach(cName.andThen(cActivities));
		
		System.out.println("//////////////////////////////////////////////////");
		
		//consuer chaining "andTHen"
		students.forEach(ConsumerInterfaceEx::xxx);
	}

	public static void xxx(Student s) {
		System.out.println(s.getName());
	}
}
