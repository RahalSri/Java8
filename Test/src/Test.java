import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> x1 = new ArrayList<>();
		x1.add("ykc 82 01");
		x1.add("eo first qpx");
		x1.add("09z cat hamster");
		x1.add("06f 12 25 6");
		x1.add("az0 first qpx");
		x1.add("236 cat dog rabbit snake");
		
		
		List<String> x2 = new ArrayList<>();
		x2.add("mi2 jog mid pet");
		x2.add("wz3 34 54 398");
		x2.add("a1 alps cow bar");
		x2.add("x4 45 21 7");
		
		List<String> x3 = new ArrayList<>();
		x3.add("t2 13 121 98");
		x3.add("r1 box ape bit");
		x3.add("b4 xi me nu");
		x3.add("br8 eat nim did");
		x3.add("w1 has uni gry");
		x3.add("f3 52 54 31");
		
		
		xxx(4, new ArrayList<>());
		
	}
	
	public static List<String> xxx (int length, List<String> lst){
		List<String> older = new ArrayList<>();
		List<String> newest = new ArrayList<>();
		List<String> result = new ArrayList<>();
		
		if(lst == null) {
			return result;
		}
		for(String box : lst) {
			if (isOld(box) ) {
				older.add(box);
			} else {
				newest.add(box);
			}
		}
		
		Collections.sort(older, new Comparator<String> () {
			@Override
	        public int compare(String str1, String str2) {
	            
				String str1Ver = str1.substring(str1.indexOf(' ') + 1);
				String str2Ver = str2.substring(str2.indexOf(' ') + 1);
				String str1Id = str1.substring(0, str1.indexOf(' '));
				String str2Id = str2.substring(0, str2.indexOf(' '));
				
				if(str1Ver.equals(str2Ver)) {
					return str1Id.compareTo(str2Id);
				} else {
					return str1Ver.compareTo(str2Ver);
				}
	        }
		});

		result.addAll(older);
		result.addAll(newest);
//		for(String str : result) {
//			System.out.println(str);
//		}
		
		return result;
	}
	
	
	private static boolean isOld(String box) {
		String[] identifiers = box.split(" ");
		
		return !identifiers[1].matches("[0-9]+");
		
	}
}
