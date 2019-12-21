package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LimitSkip {

	
	public static void main(String[] args) {
		
		List<Integer> lst = Arrays.asList(1,6,7,8,9,10);
		Optional<Integer> limitResult = lst.stream()
										.limit(3)
										.reduce(Integer::min);
		if(limitResult.isPresent()) {
			System.out.println(limitResult.get());
		}
	}

}
