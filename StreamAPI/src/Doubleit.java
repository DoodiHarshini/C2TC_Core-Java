import java.util.*;
public class Doubleit {
	public static void doubleit(int i) {
		System.out.println(i*2);
		
	}

	public static void main(String[] args) {
		List<Integer>list = Arrays.asList(1,2,3,4,5,6);
		list. forEach (i-> doubleit(i));
		list.forEach (Doubleit::doubleit); 

	}

}
