import java.io.FileInputStream;
public class Example5 {

	public static void main(String[] args) {
FileInputStream fis =null;
fis =new FileInputStream("D:/myfile.txt");
int k;
while(( k=fis.read()) != -1)
{
	System.out.println((char)k);
	
}
fis.close();
	}

}
