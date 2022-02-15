
public class Test4 {
	public static void main(String args[]) {
		int X=2;
		int Y=0;
		for(;Y<10;++Y) {
			if( Y%X == 0)
				continue;
			else if(Y==8)
			break;
			else
				System.out.println(Y+" ");
				
		}
		
	}

}
