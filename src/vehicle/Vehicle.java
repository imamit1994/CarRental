package vehicle;

public class Vehicle {
	private boolean ac;
	private boolean petrol;
	private double distance;
	public Vehicle() {
		
	}
	
	public Vehicle(boolean ac, boolean petrol) {
		this.ac = ac;
		this.petrol = petrol;
	}
	
	public Vehicle(boolean petrol) {
		this.petrol = petrol;
	}
	
	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public boolean isAc() {
		return ac;
	}
	public void setAc(boolean ac) {
		this.ac = ac;
	}
	public boolean isPetrol() {
		return petrol;
	}
	public void setPetrol(boolean petrol) {
		this.petrol = petrol;
	}
	
}
