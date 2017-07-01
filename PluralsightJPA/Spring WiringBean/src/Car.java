
public class Car {
	
	private Wheel wheel;

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}
	
	public void move() {
		System.out.println("Car is Moving");
		this.getWheel().rotate();
	}

}
