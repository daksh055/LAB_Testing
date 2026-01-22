package COREJAVA;

class car {
	int noofcylinder;
	int noofvalves;
	int enginepower;
	boolean ispowersteering;
	
	car(){
		
		noofcylinder=3;
		noofvalves=4;
		enginepower=46;
		ispowersteering=false;
		
	}
	car(boolean ispowersteering){
		this.ispowersteering=ispowersteering;
	}
	
	car(int noofcylinder,int noofvalves, int enginepower){
		this.noofcylinder=noofcylinder;
		this.noofvalves=noofvalves;
		this.enginepower=enginepower;
		this.ispowersteering=true;
	}
	
}


public class overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car obj = new car();
		System.out.println(obj.noofcylinder);
		car obj2 = new car(true);
		System.out.println(obj2.ispowersteering);
		
		car obj3=new car(100,150,14);
		System.out.println("noofcylinder :"+obj3.noofcylinder);
		System.out.println("noofvalves :"+obj3.noofvalves);
		System.out.println("power steering :"+obj3.ispowersteering);
	}

}
