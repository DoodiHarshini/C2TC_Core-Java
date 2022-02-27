import java.util.*;
public class Main4 {

	public static void main(String[] args) {
		Set<Integer>data =new LinkedHashSet<Integer>();
		data.add(36);
		data.add(53);
		data.add(43);
		System.out.println("Set:"+data);
		ArrayList<Integer>newData =new ArrayList<Integer>();
		newData.add(91);
		newData.add(54);
		newData.add(37);
		data.addAll(newData);
		System.out.println("Set:"+data);

	}

}
