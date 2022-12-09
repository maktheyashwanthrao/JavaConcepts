package Interfaces;

public class CarClass implements VehicleInterface{
	
	int gears = 1;
	int topspeed = 20;

	public static void main(String[] args) {
		CarClass c = new CarClass();
		c.topSpeed(100);
		c.noOfGears(4);
	}

	@Override
	public void noOfGears(int a) {
		gears = gears + a;
		System.out.println("My car has gears " + gears);
		
	}

	@Override
	public void topSpeed(int b) {
		topspeed = topspeed+b;
		System.out.println("My car has topspeed of " +topspeed);
		
	}

}
