package COREJAVA;
import java.util.Scanner;
public class lab7 {
	private String Firstname;
	private String Lastname;
	private char Gender;
	public int Mobile;
	
	
	public lab7 (String fn , String ln, char g) {
		this.Firstname=fn;
		this.Lastname=ln;
		this.Gender=g;
	}
	
	public void setphone() {
		System.out.println("set phone number");
		Scanner sc =new Scanner(System.in);
		Mobile = sc.nextInt();
		
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public char getGender() {
		return Gender;
	}
	public void setGender(char gender) {
		Gender = gender;
	}
	public void show() {
		System.out.println(this.Firstname);
		System.out.println(this.Lastname);
		System.out.println(this.Gender);
//		System.out.println(this.Mobile);
		System.out.println("number is "+ Mobile);
	
	}

	public static void main(String[] args) {
//		System.out.println();
		lab7 obj =new lab7("daksh","Jain",'M');
		obj.setphone();
		obj.show();
		
		// TODO Auto-generated method stub
		

	}

}
