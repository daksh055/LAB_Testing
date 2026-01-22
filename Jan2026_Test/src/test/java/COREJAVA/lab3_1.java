package COREJAVA;
import java.util.Scanner;

public class lab3_1 {

	public static void main(String[] args) {
		try{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your name: ");
			String firstname = sc.nextLine();
			System.out.println("lastname");
			String lastname = sc.nextLine();
			
			
			if(firstname.trim().isEmpty()|| lastname.trim().isEmpty()) {
				throw new Exception("name blank");
			}
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
			
			}
		// TODO Auto-generated method stub

	}


