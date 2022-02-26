import java.util.*;
public class Example2 {

	public static void main(String[] args) {
		List<String>has =new ArrayList<String>();
		has.add("pen");
		has.add("pencil");
		has.add("eraser");
		System.out.println("List"+has);
		boolean res=has.contains("pencil");
		System.out.println("Is pencil present in the list:" +res);
	

	}

}
