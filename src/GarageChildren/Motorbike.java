package GarageChildren;
import MainGarage.Vehicle;

public class Motorbike extends Vehicle {
	private String paintWork;

	public Motorbike(String brand, String model, String registration, String category, String paintWork) {
		super(2, brand, model, registration, category);
		this.paintWork = paintWork;
	}

	public String getPaintWork() {
		return paintWork;
	}

	public void setPaintWork(String paintWork) {
		this.paintWork = paintWork;
	}

}
