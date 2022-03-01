import java.util.*;
public class Main4 {

	public static void main(String[] args) {
		NavigableMap<Integer,String>b1 =new TreeMap<Integer,String>();
		b1.put(5, "Harsha");
		b1.put(6, "Harshini");
		b1.put(8,"Hasini");
		b1.put(9, "Harika");
		b1.put(9, "Kavitha");
		System.out.println(b1);
		System.out.print(b1);
		SortedMap<Integer,String>n1 =new TreeMap<Integer,String>();
		n1=b1.headMap(5);
		System.out.println(n1);
		SortedMap<Integer,String>m1 =new TreeMap<Integer,String>();
		m1=b1.tailMap(6);
		System.out.println(m1);
		SortedMap<Integer,String>h1 =new TreeMap<Integer,String>();
		h1 =b1.subMap(8, 9);
		System.out.println(h1);
		

	}

}
