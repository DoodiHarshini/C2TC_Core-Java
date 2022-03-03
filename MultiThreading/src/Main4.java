
  class Main4 extends Thread
{
	public void run() {
		System.out.println("Main4 thread ID is" + ""+Thread.currentThread().getId());
		System.out.println("Main4 thread Priority is" + ""+Thread.currentThread().getPriority());
	}
}

 class Magic extends Thread
{
	public void run() {
		System.out.println("Magic thread ID is" + ""+Thread.currentThread().getId());
		System.out.println("Magic  thread Priority is" + ""+Thread.currentThread().getPriority());
	}

 
public static void main(String[] args) {
	

	Main4 obj =new Main4();
		obj.run();
		obj.setPriority(7);
}
{
Magic obj1 = new Magic();
		obj1.run();
		obj1.setPriority(3);
}
}

 
 







