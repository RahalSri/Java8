import java.util.stream.IntStream;

public class SumMaxMin {

	public static void main(String[] args) {
		System.out.println(IntStream.range(1, 5).sum());
		System.out.println(IntStream.range(1, 5).min());
		System.out.println(IntStream.range(1, 5).max());
		System.out.println(IntStream.range(1, 5).average());

	}

}
