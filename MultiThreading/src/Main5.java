
public class Main5 {
	int count;
	public  void increment() {
		count++;
		
	}
	}
 class Demo {
	public static void main(String[] args) throws Exception {
		Main5 c=new Main5();
		Thread t1=new Thread(new Runnable() {
			public void run() {
				c.increment();
			}
		});
		t1.start();
		t1.join();
		Thread t2=new Thread(new Runnable() {
			public void run() {
				c.increment();
			}
			
			});
			t2.start();
			t2.join();
			System.out.println(c.count);
		}
	

	}

