class Box{
	double width=10;
	double height=20;
	double depth=10;
	
	double calvolume(){
		return width*height*depth;
	}
}
class don {
	int a =100;
	int b=200;
	int multi() {
		return a*b;
	}
}
public class Test_class {
	

	public static void main(String[] args) {
		Box obj =new Box();
		System.out.println(obj.calvolume());
		don obj1 = new don();
		System.out.println(obj1.multi());
		// TODO Auto-generated method stub

	}

}
