import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorInterface {

	static UnaryOperator<String> toUp = (x) -> x.toUpperCase();
	static BinaryOperator<Integer> mul = (x,y) -> x*y;
	
	public static void main(String[] args) {
		
		
		System.out.println(toUp.apply("heollow"));

	}

}
