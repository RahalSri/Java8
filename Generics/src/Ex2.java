import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ex2 {

	public static void main(String[] args) {
		String [] arr = {"1","2","3","4","5"};
		List<Integer> intList = fromStringArrayToTList(arr, Integer::valueOf);
		//intList.stream().forEach(System.out::println);
		
		Integer[] intArr = {1,2,3,4,5};
		List<Integer> lll = doublee(intArr);
		lll.stream().forEach(System.out::println);
	}
	
	
	public static <T extends Number> List<T> fromStringArrayToTList(String[] arr, Function<String,T> mapper) {
		
		return Arrays.stream(arr)
				.filter(s -> !s.isEmpty())
				.map(s -> {
                    try {
                        return mapper.apply(s.trim());
                    } catch (Exception e) {}
                    return null;
                })
				.filter(Objects::nonNull)
				.collect(Collectors.toList());
		
	}
	
	public static <T extends Number> List<T> doublee(T[] arr ){
		
		return Arrays.stream(arr)
				.map(num -> {
					if(num instanceof Integer) {
						return (T)((Integer)(num.intValue()*2));
					}
					return null;
				})
				.filter(Objects::nonNull)
				.collect(Collectors.toList());

	}

}
