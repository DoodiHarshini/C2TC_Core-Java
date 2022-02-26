import java.util.*;
public class Example7 {

	public static void main(String[] args) {
		ArrayList<String>list =new ArrayList<String>();
		list.add("C");
		list.add("Python");
		list.add(".net");
		list.add("Complier");
		Collections.shuffle(list);
		System.out.println( "Results after shuffle operator:" +list);
		Collections.shuffle(list);
		System.out.println("Results after shuffle operator:");

	}

}
