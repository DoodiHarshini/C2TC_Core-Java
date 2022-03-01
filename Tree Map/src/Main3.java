import java.util.*;
public class Main3 {

	public static void main(String[] args) {
		NavigableMap<Character,String>sd =new TreeMap<Character,String>();
		sd.put('h'," harsha");
		sd.put('g'," Angel");
		sd.put('b', "Kavitha");
		sd.put('r',"Friends");
		System.out.println(sd);
		System.out.println(sd.subMap('b', 'h'));

	}

}
