import java.util.stream.Collectors;

import data.StudentDataBase;

public class Counting {

	public static long count() {
		return StudentDataBase.getAllStudents()
				.stream()
				.collect(Collectors.counting());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(count());
	}

}
