package COREJAVA;
 
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
 
 
 
 
public class lab4_1 {
	
	static void io(StringBuilder str) throws IOException {
	FileInputStream fis=new FileInputStream("C:\\Users\\Daksh.Dosi\\git\\Testing2026\\Jan2026_Test\\src\\test\\java\\pac2\\test.txt");
	
	int data;
	while((data=fis.read())!=-1)
	{
		str.append((char)data);
		System.out.print((char)data);
	}
	
	fis.close();
	
	}
 
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		StringBuilder str=new StringBuilder();
		io(str);
		str.reverse();
		FileWriter fw =new FileWriter("C:\\Users\\Daksh.Dosi\\git\\Testing2026\\Jan2026_Test\\src\\test\\java\\pac2\\test.txt");
		fw.write(str.toString());
		fw.close();
		
	}
 
}
 