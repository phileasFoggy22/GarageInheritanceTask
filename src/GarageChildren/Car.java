package GarageChildren;
import MainGarage.Vehicle;

public class Car extends Vehicle {

	private double bootSpace;
	private int doorNumber;

	public Car(String brand, String model, String registration, String category, double bootSpace, int doorNumber) {
		super(4, brand, model, registration, category);
		this.bootSpace = bootSpace;
		this.doorNumber = doorNumber;
	}

	public double getBootSpace() {
		return bootSpace;
	}

	public void setBootSpace(double bootSpace) {
		this.bootSpace = bootSpace;
	}

	public int getDoorNumber() {
		return doorNumber;
	}

	public void setDoorNumber(int doorNumber) {
		this.doorNumber = doorNumber;
	}

}
