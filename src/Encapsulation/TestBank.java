package Encapsulation;

public class TestBank {
	
	private int Balance;
	private String Name;
	
	
	public int getBalance() {
		return Balance;
	}

	public void setBalance(int balance) {
		Balance = balance;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	

	public static void main(String[] args) {
		TestBank ts = new TestBank();
		ts.setBalance(1000);
		ts.setName("Yashwanth");
		
		System.out.println("Customer Name " + ts.getName());
		System.out.println("Customer Balance " + ts.getBalance());

				
	}
	
	

}
