package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import data.Student;

public class MinMax {
	
	public static Optional<Integer> findMax(List<Integer> lst) {
		return lst.stream()
				.reduce((x,y) -> x > y ? x : y);
	}

	public static void main(String[] args) {
		List<Integer> lst = Arrays.asList(1,6,7,8,9,10);
		Optional<Integer> higStu = findMax(lst);
		if(higStu.isPresent()) {
			System.out.println(higStu.get());
		}
	}

}
