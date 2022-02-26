import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example5 {

	public static void main(String[] args) {
		List<String>arrlist =new ArrayList<>();
		arrlist.add("practise");
		arrlist.add("code");
		arrlist.add("every");
		arrlist.add("day");
		arrlist.add("click");
		System.out.println("Original List:" +arrlist);
		Collections.rotate(arrlist, 2);;
		System.out.println("Rotated List:"+arrlist);
	

	}

}
