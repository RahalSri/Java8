import java.util.function.Predicate;

public class PredicateInterfaceEx {

	private static Predicate<Integer> even = i -> i%2 == 0;
	private static Predicate<Integer> fourth = i -> i%4 == 0;
	
	public static void main(String[] args) {
		
		System.out.println(even.test(4));
		System.out.println(even.and(fourth).test(10));
	}

}
