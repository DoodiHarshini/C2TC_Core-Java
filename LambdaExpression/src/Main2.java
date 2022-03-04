interface Main{
	public void say();
	}
public class Main2 {

	public static void main(String[] args) {
		Main  s=() ->{System.out.println("I have nothing to say");};
		s.say();
	}

}
