
public class Method1 {
				public static void main(String[] args) {
					Method1 obj=new Method1();
					obj.start();
				}
				void start() {
					String stra="do";
					String strb=method(stra);
					System.out.println(":"+stra+strb);
				}
				String method(String stra) {
					stra=stra+"good";
					System.out.println(stra);
					return "good";
				}
}
					
