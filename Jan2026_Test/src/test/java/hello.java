import java.util.Scanner;
 




public class hello {

	public class Variable{
		private static double w=20;
		private static double h =10;
		private static double d =5;
		private static int bid;

		public static double volume() {
			double temp =0;
			temp =w*h*d;
			return temp;
		}
	}
	public static void main(String[] args) {
		Variable square = new Variable();
		System.out.println(square.volume());
	}

//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//          System.out.println("hellooooo world");
//          System.out.println("First Name:joker");
//          System.out.println("Last Name:joker");
//          System.out.println("Gender :M");
//          System.out.println("Age :22");
//          System.out.println("weight:joker");
////          
////          Scanner sc = new Scanner(System.in);
////          int a =sc.nextInt();
////          if(a>=0)System.out.println("Positive");
////          else System.out.println("negative");
////          
//          int a =10;
//          int b =20;
//          System.out.println("addition"+ (a+b));
//          System.out.println("addition"+ (a-b));
//          System.out.println("addition"+ (a*b));
////          System.out.println("addition"+a/b);
//          int c =20;
//          if(c>=18) {
//        	  System.out.println("eligible for vote ");
//          }
//          else {
//        	  System.out.println("not eligible ");
//          }
//	}
//
}
