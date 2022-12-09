package FlowControls;

public class JumpStatements {

	public static void main(String[] args) {
		// stop print numbers if we got 6
		for (int i = 1; i <= 10; i++) {
			if (i == 8) {
				break;
			}
			System.out.println(i);
		}

		System.out.println("--------------------------------------");
		// stop print number if we got 6 and continue rest
		for (int i = 1; i <= 10; i++) {
			if (i == 6) {
				continue;
			}
			System.out.println(i);
		}

	}

}
