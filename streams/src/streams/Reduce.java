package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import data.Student;
import data.StudentDataBase;


public class Reduce {

	public static int multiplyList(List<Integer> lst) {
		return lst.stream()
				.reduce(1, (a,b) -> a*b);
		
		// Ite 1 : a=1;b=2
		// Ite 2 : a=2;b=3
		// Ite 3 : a=6;b=4
		// Ite 4 : a=24
	}
	
	public static int multiplyListWithoutIdentity(List<Integer> lst) {
		Optional<Integer> result = lst.stream()
				.reduce((a,b) -> a*b);
		if(result.isPresent())
			return result.get();
		else
			return 0;
	}
	
	public static Optional<Student> getHighestStu() {
		return StudentDataBase.getAllStudents().stream()
				.reduce((s1,s2) -> {
					return s1.getGpa() > s2.getGpa() ? s1 : s2;
						
				});
	}
	
	public static void main(String[] args) {
		// Terminal operation. Reduce content of stream to single value
		// First param = initial value ; identity
		// second para BinaryOperator

		List<Integer> lst = Arrays.asList(2,3,4);
		System.out.println(multiplyList(lst));
		System.out.println(multiplyListWithoutIdentity(lst));
		
		Optional<Student> higStu = getHighestStu();
		if(higStu.isPresent()) {
			System.out.println(higStu.get());
		}
	}

}
