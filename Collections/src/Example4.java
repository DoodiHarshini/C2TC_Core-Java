import java.util.ArrayList;
import java.util.List;

public class Example4 {

	public static void main(String[] args) {
	List<Integer>val =new ArrayList<>();
	val.add(54);
	val.add(37);
	val.add(53);
	val.add(36);
	for(Integer e : val)
	{
		System.out.println(e);
	}
	System.out.println("ArrayList:" +val);
	}
}
