package pac2;
import java.util.Scanner;


public class lab8_enum {
	enum Gender{
		M,F
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String Gen =sc.next();
		if(Gen.equals(Gender.M.name())||Gen.equals(Gender.F.name())) {
			System.out.println("valid");
		}
		else {
			System.out.println("jasdsad");
		}
//		String s = sc.nextLine();
	
		

	}

}
