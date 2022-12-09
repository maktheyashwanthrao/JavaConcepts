
public class VariablesConcept {

	int a ;//0
	static String b ;//null

	public static void main(String[] args) {
		System.out.println(b);
		VariablesConcept vc = new VariablesConcept();
		vc.methodone();
		System.out.println(vc.a);
		print();

	}

	public void methodone() {
		System.out.println(a);
		System.out.println(b);
		//System.out.println(x);
	}
	
	public static void print()
	{
		int a =1;
		for(int i=0;i<=5;i++) {
			System.out.println(a+i);
		}
	}
	

}
