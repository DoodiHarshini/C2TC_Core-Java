
public class Main3 extends Thread{ 
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Eclipse thread ID is" + ""+Thread.currentThread().getId());
		}
	}
	class PPT extends Thread{
		public void run() {
			for(int i=0;i<5;i++) {
				System.out.println("CAR thread ID is" + ""+Thread.currentThread().getId());
			}
		}
	}
	public static void main(String[] args) {
		Main3 obj =new Main3();
		Thread t=new Thread(obj);
		t.start();
		}
	{
		PPT obj1 = new PPT();
		Thread t1 =new Thread(obj1);
		t1.start();
	}

}

