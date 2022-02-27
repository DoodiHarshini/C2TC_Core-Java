import java.util.*;
public class Main6 {

	public static void main(String[] args) {
		TreeSet<Integer>set=new TreeSet<Integer>();
		set.add(3);
		set.add(53);
		set.add(36);
		set.add(37);
		set.add(54);
		System.out.println("InitialSet:"+set);
		System.out.println("Head Set:"+set.headSet(53));
		

	}

}
