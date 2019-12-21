package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
        Predicate<String> xxx = s -> s.startsWith("C");
		
		names.add("Charlie");
		names.add("Douglas");	         
		names.add("Sundaraman");	         
		names.add("Charlie");	         
		names.add("Yuki");
		
		//Streams are mainly used to perform operations on data        
		//like selecting only unique names
		
		//Method reference
		names.stream().distinct().forEach(System.out::println);
		
		System.out.println("----------------------------");
		
		//Lambda expressions
		names.stream().distinct().forEach((item) -> {
			System.out.println(item);
		});
		
		System.out.println("----------------------------");
		
		//Filter
		names.stream().filter(xxx)
        .forEach(System.out::println);
		
		System.out.println("----------------------------");
		
		//Filter and create new List
		List<String> result = names.stream().filter(xxx).collect(Collectors.toList());  
		result.stream().forEach(System.out::println);
        
	}
}
