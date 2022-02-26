import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example9 {

	public static void main(String[] args) {
		List<Integer>arrlist =new ArrayList<>();
		arrlist.add(15);
		arrlist.add(20);
		arrlist.add(25);
		arrlist.add(22);
		
		System.out.println("ORIGINAL LIST:" +arrlist);
		Collections.sort(arrlist,Collections.reverseOrder());
		System.out.println("Sorted List:" +arrlist);




	}

}
