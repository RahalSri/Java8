package streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Factory {

	public static void main(String[] args) {
		// of , itereate and generate
		
		Stream<String> stream1 = Stream.of("rahil","sira", "mara");
		stream1.forEach(System.out::println);
		
		System.out.println("/////////////////////////////////////////");
		Stream.iterate(1, x->x*2)
			.limit(10)
			.forEach(System.out::println);

		System.out.println("/////////////////////////////////////////");
		Supplier<Integer> sup = new Random()::nextInt;
		
		Stream.generate(sup).limit(10).forEach(System.out::println);
	}

}
