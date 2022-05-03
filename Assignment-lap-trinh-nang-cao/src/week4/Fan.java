package week4;

public class Fan {

	public static final int SLOW = 1, MEDIUM = 2, FAST = 3;
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5.0;
	private String color = "blue";

	public Fan() {

	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (on) {
			this.speed = speed;
		}else {
			System.out.println("Fan is  off");
		}
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		if (on == true) {
			return "Fan is on \n the speed is = " + speed + "\n the color is = " + color + "\n the radius is = "
					+ radius;
		} else {
			return "Fan is off \n the color of fan is = " + color + "\n the radius of fan is = " + radius;
		}
	}

	public static void main(String[] args) {
		Fan fan1 = new Fan();
		Fan fan2 = new Fan();
		fan1.setOn(true);
		fan1.setColor("yellow");
		fan1.setRadius(10.0);
		fan1.setSpeed(FAST);
		fan2.setSpeed(MEDIUM);

		System.out.println(fan1.toString());
		System.out.println(fan2.toString());

	}
}
