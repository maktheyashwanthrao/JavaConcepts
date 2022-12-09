package FlowControls;

public class DesicionMakingStatments {

	public static void main(String[] args) {

		String today = "xyz";

		if (today == "Tuesday") {
			System.out.println("Tuesday");
		} else if (today == " Friday") {
			System.out.println("Friday");
		} else if (today == "Thursday") {
			System.out.println("Thursday");
		} else {
			System.out.println("Monday");
		}

		System.out.println("------------------------------------");

		switch (today) {
		case "Tuesday":
			System.out.println("Tuesday");
			break;

		case "Friday":
			System.out.println("Friday");
			break;
		case "Monday":
			System.out.println("Monday");
			break;
		case "Thursday":
			System.out.println("Thursday");
			break;

		default:
			System.out.println("Invalid input");
		}
	}
}
