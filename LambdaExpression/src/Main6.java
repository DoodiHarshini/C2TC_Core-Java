
public class Main6 implements Runnable {
	public void run() {
		System.out.println("I am run method");
	}



	public static void main(String[] args) {
		Main6 obj =new Main6();
		Thread t=new Thread(obj);
		t.start();	
		}

}
