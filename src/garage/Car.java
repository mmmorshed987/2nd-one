package garage;

abstract public class Car {
	abstract void window();
	abstract void tire();
	abstract void seat();
	abstract void fuel();
	abstract void stearing();
	
	public void gear() {
		System.out.println("Auto Gear");
	}
	
}

