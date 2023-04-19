package flyweight;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public abstract class Vehicle {

	
	private String name;
	
	private int speed;
	
	private BufferedImage image;
	
	public Vehicle(String name, int speed) {
		this.name = name;
		this.speed = speed;
		try {
			File file;
			if (name.equals("Morty")) {
				file = new File("resources/Mechanical_Morty.png");
			} else {
				file = new File("resources/Rick_angry.png");
			}
			this.image = ImageIO.read(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public BufferedImage getImage() {
		return image;
	}
	
	public void setImage(BufferedImage image) {
		this.image = image;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	public abstract void moveCar(int currentX, int currentY, int newX, int newY);

}
