package streams;

import data.StudentDataBase;

public class Match {

	public static boolean allMatch() {
		return StudentDataBase.getAllStudents().stream()
				.allMatch(student -> student.getGpa() >= 3.9);
	}
	
	public static boolean anyMatch() {
		return StudentDataBase.getAllStudents().stream()
				.anyMatch(student -> student.getGpa() >= 3.9);
	}
	
	public static boolean noneMatch() {
		return StudentDataBase.getAllStudents().stream()
				.noneMatch(student -> student.getGpa() >= 4.1);
	}
	
	public static void main(String[] args) {
		// anyMatch() - Return true if any element match the predicate
		// allMatch() -  Return true if all elements match the predicate
		// noneMatch() - Return true none of element match the predicate
		
		System.out.println(allMatch());
		System.out.println(anyMatch());
		System.out.println(noneMatch());
	}

}
