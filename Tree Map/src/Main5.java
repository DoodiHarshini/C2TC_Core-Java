import java.util.*;
public class Main5 {

	public static void main(String[] args) {
		NavigableMap<Integer,String> b1 =new TreeMap<Integer,String>();
		b1.put(3, "Tamilnadu");
		b1.put(2,"Nellore");
		b1.put(6, "Gudur");
		b1.put(8, "tirupathi");
		System.out.println(b1);
		System.out.println(b1.pollFirstEntry());
		System.out.println(b1);
		

	}

}
