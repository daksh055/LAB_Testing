package COREJAVA;
import java.io.*;

public class lab4_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileInputStream fis=new FileInputStream("C:\\Users\\Daksh.Dosi\\git\\Testing2026\\Jan2026_Test\\src\\test\\java\\pac2\\test.txt");
		
		int data;
		while((data=fis.read())!=-1)
		{
			if((int)data%2==0 && (char)data!=',')
			System.out.print((char)data+" ");
		}
		fis.close();

	}
}
