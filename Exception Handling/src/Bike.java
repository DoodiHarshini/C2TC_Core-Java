
 public class Bike{
	public void petrol (){}
 }
  class Test
{
	public static void main(String[] args) {
	Bike ha= null;
	try {
		ha.petrol();
		}
	catch(NullPointerException e) {
		System.out.println("There is a NullPointerException");
		
	}
	catch(Exception e) {
		System.out.println("There is an Exception.");
		
	}
	System.out.println("Everything went fine");
	}
}
	


