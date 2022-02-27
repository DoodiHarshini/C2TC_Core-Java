import java.util.*;

public class Main6 {

	public static void main(String [] args) {
		Set<Integer> list1=new LinkedHashSet<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		System.out.println(list1);
		ArrayList<Integer>list2 =new ArrayList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		System.out.println(list2);
list1.removeAll(list2);
System.out.println(list1);
	}




	}


