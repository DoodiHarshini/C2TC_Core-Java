
public class Main2  implements Runnable{
	public void run()
	{
		System.out.println("Eclipse thread ID is" + ""+Thread.currentThread().getId());
	}
}
class PPT1 implements Runnable{
	public void run() {
		System.out.println("PPT1 thread ID is" + ""+Thread.currentThread().getId());
	}


	public static void main(String[] args) {
Main2 obj =new Main2();
Thread t =new Thread(obj);
t.start();
PPT1 obj1 =new PPT1();
Thread t1 =new Thread(obj1);
t1.start();
		

	}

}
