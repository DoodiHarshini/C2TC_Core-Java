
public class Vilian  implements Actor {
	public void act() {
		System.out.println("I can act");
		
	}
	public void speak() {
		System.out.println("I can speak");
	}
	public void rude() {
		System.out.println("I can  be rude");
	}

	public static void main(String[] args) {
		Vilian h =new Vilian();
		h.act();
		h.speak();
		h.rude();
		h.comedy();

	}

    }


