package flyweight;

public class RaceCar extends Vehicle {
	private static int instances;
	private static final int SPEED = 160;
	
	
	public RaceCar() {
		super("Rick", SPEED);
		instances++;
	}
	
	public static int getInstances() {
		return instances;
	}
	
	@Override
	public void moveCar(int currentX, int currentY, int newX, int newY) {
		
		System.out.println("The RaceCar "  + getName() + " moved with the speed of " + getSpeed() + " to the position with coordinates of X: " + newX + " and Y: " + newY);
		
	}
}
