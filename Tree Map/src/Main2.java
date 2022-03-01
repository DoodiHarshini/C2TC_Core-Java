import java.util.*;
public class Main2 {

	public static void main(String[] args) {
		SortedMap<Integer,String>t1 =new TreeMap<Integer,String>();
		t1.put(103,"May");
		t1.put(100, "the");
		t1.put(120, "Fourth");
		t1.put(500,"be with");
		System.out.println(t1.FirstEntry());
		System.out.println(t1.LastEntry());
		

	}

}
