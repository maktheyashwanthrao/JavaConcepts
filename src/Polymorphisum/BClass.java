package Polymorphisum;

public class BClass extends AClass{

	public static void main(String[] args) {
		
		BClass b = new BClass();
		b.addition(2, 4);
	}

	public void addition(int a, int b) {
		int sum = a+b;
		System.out.println("Addition of two numbers from Class B is  " + sum);
		System.out.println("Addition of two numbers from Class B is  " + sum);
	}
}
