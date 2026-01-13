
public class control_statment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =20;
		if(num%2==0) {
			System.out.println("even number ");
			
		}
		else {
			System.out.println("odd number ");
		}
		
		int marks =50;
		if(marks>=90) {
			System.out.println("grade A");
			
		}
		else if(marks>=75) {
			System.out.println("grade b ");
		}
		else {
			System.out.println("grade c ");
		}
	
	int day=10;
	switch(day) {
	case 1 : System.out.println("monday");
	break;
	case 2 :System.out.println("tuesday");
	break;
	case 3 : System.out.println("wednesday");
	break;
	case 4: System.out.println("thrudysday");
	break;
	default : System.out.println("hihihi");
	
	}
	
	for(int i =1;i<=5;i++) {
		System.out.println(i);
	}
	int j =1;
	System.out.println("change trypre ");
	while(j<=5) {
		System.out.println(j);
		j++;
	}
	for(int i =0 ; i< 5 ; i++) {
		for(int k =0 ; k<=i ; k++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	
	}
	
	

}
