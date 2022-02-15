import java.util.Scanner;
public class Main1 {
public static void main(String[] args)	{
	Scanner sc=new Scanner(System.in);
	int num;
	System.out.println("Enterr a number:");
	num=sc.nextInt();
	if(num>0)
	{
		System.out.println("The number is positive.");
	}
	else {
		System.out.println("The number is negative.");
	}

	}
}
