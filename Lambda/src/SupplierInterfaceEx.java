import java.util.List;
import java.util.function.Supplier;

import data.Student;
import data.StudentDataBase;

public class SupplierInterfaceEx {

	public static void main(String[] args) {
		Supplier<List<Student>> stuList = () -> StudentDataBase.getAllStudents();
		
		System.out.println(stuList.get());

	}

}
