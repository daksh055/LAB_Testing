package COREJAVA;
import java.io.FileInputStream;
import java.io.IOException;

public class TC_FileIo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("C:\\Users\\Daksh.Dosi\\git\\Testing2026\\Jan2026_Test\\src\\test\\java\\pac2\\test.txt");
		int data;
		while((data=fis.read())!=-1)
		{
			System.out.print((char)data);
		}
		fis.close();

	}

}


