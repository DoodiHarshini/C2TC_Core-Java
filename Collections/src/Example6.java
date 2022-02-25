import java.util.List;
import java.util.ArrayList;
public class Example6 {

	public static void main(String[] args) {
		List<Integer>har1=new ArrayList<>();
		har1.add(1000);
		har1.add(2000);
List<Integer>har2=new ArrayList<>();
har2.add(5000);
har2.add(3000);
har2.addAll(har1);
System.out.println(har1);
	}

}
