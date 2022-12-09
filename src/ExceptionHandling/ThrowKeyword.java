package ExceptionHandling;

public class ThrowKeyword extends RuntimeException{

	public ThrowKeyword(String s) {
		super(s);
	}

	public static void main(String[] args) {
		int marks=18;
		if(marks<26) {
			throw new ThrowKeyword("Your are failed");
		}
	

	}

}
