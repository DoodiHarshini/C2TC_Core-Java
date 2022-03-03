
public class Main1 extends Thread{
	public void run() {
		System.out.println("Eclipse thread ID is" + ""+Thread.currentThread().getId());
	}
	}
class PPT extends Thread{
	public void run() {
		System.out.println("PPT thread ID is"+ " "+Thread.currentThread().getId());
	}
public static void main(String[] args) {
		Main1 obj =new  Main1();
		obj.start();
		PPT obj1 =new PPT();
		obj1.start();
		
	}
		

	}


