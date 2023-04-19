package flyweight;

public class Car extends Vehicle {

	private static int instances;
	
	private static final int SPEED = 100;
	
	
	public Car() {
		super("Morty", SPEED);
		instances++;
	}
	
	public static int getInstances() {
		return instances;
	}
	
	@Override
	public void moveCar(int currentX, int currentY, int newX, int newY) {
	
		System.out.println("The Car " + getName() + " moved with the speed of " + getSpeed() + " to the position with coordinates of X: " + newX + " and Y: " + newY);
		
		
	}
}
