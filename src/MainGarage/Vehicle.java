package MainGarage;

public abstract class Vehicle {
	private int wheels;
	private String brand;
	private String model;
	private String registration;
	private String category;

	public Vehicle(int wheels, String brand, String model, String registration, String category) {
		super();
		this.wheels = wheels;
		this.brand = brand;
		this.model = model;
		this.registration = registration;
		this.category = category;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	public String toString() {
		return brand + " " + model;
	}

}
