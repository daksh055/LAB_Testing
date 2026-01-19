package pac2;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class TC_writeable {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Text:");
		String text=sc.nextLine();
		FileWriter fw =new FileWriter("C:\\Users\\Daksh.Dosi\\git\\Testing2026\\Jan2026_Test\\src\\test\\java\\pac2\\test.txt");
		fw.write(text);
		fw.close();

	}

}

