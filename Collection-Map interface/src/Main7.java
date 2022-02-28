import java.util.*;
public class Main7 {

	public static void main(String[] args) {
		Map<String,String>map = new HashMap<String,String>();
		map.put("Name", "Harsha");
		map.put("Occupation", "Developer");
		map.put("Country", "India");
		System.out.println(map.get("Name"));
		Iterator<String>har =map.keySet().iterator();
		while(har.hasNext())
		{
			String Key=har.next();
			System.out.println(Key+""+map.get(Key));
		}

	}

}
