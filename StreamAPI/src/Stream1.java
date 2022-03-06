import java.util.*;
public class Stream1 {

	public static void main(String[] args) {
		List<Integer>har =Arrays.asList(1,2,3,4,5,6);
		for(int i=0;i<6;i++) {
			System.out.println(har.get(i));
		}
		Iterator <Integer>has=har.iterator();
		while(has.hasNext()) {
		System.out.println(has.next());
			
		}
		for(Integer i: har)
		{
			System.out.println(i);
	}
         har.forEach(values -> System.out.println(values));
	}
}
