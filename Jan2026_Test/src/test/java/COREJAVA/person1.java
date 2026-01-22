package COREJAVA;

public class person1 {
	private String Firstname;
	private String Lastname;
	private char Gender;
	
	public person1 (String fn , String ln, char g) {
		this.Firstname=fn;
		this.Lastname=ln;
		this.Gender=g;
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person1 obj = new person1("Daksh","Jain",'M');
//		obj.person("Daksh","Jain",'M');
		System.out.println(obj.getFirstname());

	}

}
