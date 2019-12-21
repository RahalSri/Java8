import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Range {

	public static void main(String[] args) {
		// These are primitve type steams
		// IntStream, LongStream, DoubleStream
		
		IntStream.range(1, 5).forEach(System.out::println);
		System.out.println("//////////////////////////////////////////");
		LongStream.rangeClosed(1, 5).forEach(System.out::println);
		System.out.println("//////////////////////////////////////////");
		System.out.println(LongStream.rangeClosed(1, 5).count());
	}

}
