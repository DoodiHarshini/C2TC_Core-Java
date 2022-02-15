import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int X,Y,t;
	System.out.println("Enter the value of X and Y");
	X =sc.nextInt();
	Y=sc.nextInt();
	System.out.println("Before swapping numbers:"+X+" "+Y);
	t=X;
	X=Y;
	Y=t;
	System.out.println("After swapping:"+X+" "+Y);
	System.out.println();
}
}

