import java.util.*;
public class Example8 {

	public static void main(String[] args) {
		List<Integer>arrlist =new ArrayList<>();
		arrlist.add(15);
		arrlist.add(20);
		arrlist.add(25);
		arrlist.add(22);
		
		System.out.println("ORIGINAL LIST:" +arrlist);
		Collections.sort(arrlist);
		System.out.println("Sorted List:" +arrlist);


	}

}
