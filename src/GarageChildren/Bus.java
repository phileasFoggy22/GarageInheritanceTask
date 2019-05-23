package GarageChildren;
import MainGarage.Vehicle;

public class Bus extends Vehicle {

	private int capacity;

	public Bus(String brand, String model, String registration, String category, int capacity) {
		super(4, brand, model, registration, category);
		this.capacity = capacity;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

}
