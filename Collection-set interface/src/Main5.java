import java.util.*;
public class Main5 {

	public static void main(String[] args) {
		LinkedHashSet<Integer> list1=new LinkedHashSet<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		System.out.println(list1);
		LinkedHashSet<Integer>list2 =new LinkedHashSet<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		System.out.println(list2);
list1.retainAll(list2);
System.out.println(list1);
	}

}
