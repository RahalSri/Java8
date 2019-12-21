import java.util.Comparator;
import java.util.function.Function;

public class FunctionalInterfaceEx {

	static Function<String, String> toUp = (x) -> x.toUpperCase();
	
	static Function<String, String> append = (x) -> x.concat(" Appended");
	
	public static void main(String[] args) {
		System.out.println(toUp.apply("hello world"));
		System.out.println(toUp.andThen(append).apply("hello world"));
	}
	
	private static void inbuildFunInterfaces() {
		// Runnable is a functional interface. this is how u use it with lambda
		
		Runnable runnable = () -> System.out.println("Running Thread 1");
		
		new Thread(runnable).start();

		
		new Thread(() -> System.out.println("Running Thread 2")).start();
		
		System.out.println("/////////////////////////////////////////////////");
		
		Comparator<Integer> comp = (a,b) -> a.compareTo(b);
		
		System.out.println(comp.compare(3, 4));
	}

	
}
