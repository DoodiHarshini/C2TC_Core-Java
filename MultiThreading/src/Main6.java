
public class Main6  extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Main6 thread ID is" + Thread.currentThread().getId());
	try {
		sleep(1000);
		
	}
	catch(Exception e) {
		System.out.println(e);
	}
		}
	}
	
public static void main(String[] args) {
		Main6 obj=new Main6();
		obj.run();

	}

}
