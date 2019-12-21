import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ex1 {
	public static void main(String[] args) {
		Integer[] intArr = {1,2,3,4,5};
		Double[] dobArr = {1.1, 2.2, 3.3, 4.4, 5.5};
		
		Object ob = new Object();
		
		List<String> intStr = fromArrayToStringList(intArr, Object::toString) ;
		intStr.stream().forEach(System.out::print);
		
		List<String> dobStr = fromArrayToStringList(dobArr, Object::toString) ;
		dobStr.stream().forEach(System.out::print);
	}
	
	private static <T,G> List<G> fromArrayToStringList(T[] arr, Function<T,G> mapper) {
		
		return Arrays.stream(arr).map(mapper).collect(Collectors.toList());
		
	}
	
	
}


