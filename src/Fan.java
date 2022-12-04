
public class Fan {
	private String make;
	private double radius;
	private String color;

	private boolean ison;
	private byte speed;

	Fan(String make, double radius, String color) {
		this.make = make;
		this.radius = radius;
		this.color = color;
	}

	public String toString() {
		return String.format("make- %s, radius-%f , color-%s ,ison- %b , speed- %d", make, radius, color, ison, speed);
	}
}
