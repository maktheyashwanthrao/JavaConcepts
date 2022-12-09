package Polymorphisum;

public class AClass {

	public static void main(String[] args) {
		AClass a  = new AClass();
		a.addition(2, 3);
		addition(2, 3, 4);

	}

	public void addition(int a, int b) {
		int sum = a+b;
		System.out.println("Addition of two numbers from Class A is  " + sum);
	}
	
	public static void addition(int a, int b, int c) {
		int sum1 = a+b+c;
		System.out.println("Addition of three numbers is  " + sum1);
	}

}
