package GarageChildren;
import java.util.ArrayList;
import java.util.HashMap;

import MainGarage.Vehicle;

public class Garage {
	private ArrayList<Vehicle> garageVehicles = new ArrayList<Vehicle>();

	public ArrayList<Vehicle> getGarageVehicles() {
		return garageVehicles;
	}

	public void setGarageVehicles(ArrayList<Vehicle> garageVehicles) {
		this.garageVehicles = garageVehicles;
	}

	public void addGarageVehicle(Vehicle newVehicle) {
		this.garageVehicles.add(newVehicle);
	}

	public void removeGarageVehicle(String Type, Vehicle newVehicle) {
		if (Type == null) {
			this.garageVehicles.remove(newVehicle);
		} else {
			for (Vehicle v : garageVehicles) {
				switch (Type) {
				case "Car": {
					if (v instanceof Car) {
						garageVehicles.remove(v);
					}
				}
					break;
				case "Bus": {
					if (v instanceof Bus) {
						garageVehicles.remove(v);
					}
				}
					break;
				case "Motorbike": {
					if (v instanceof Motorbike) {
						garageVehicles.remove(v);
					}
				}
					break;
				}
			}
		}

	}

	public double fixVehicle(Vehicle brokenVehicle) {

		HashMap<Vehicle, Double> vehiclePrice = new HashMap<Vehicle, Double>();
		ArrayList<Vehicle> broken = new ArrayList<Vehicle>();
		broken.add(brokenVehicle);
		vehiclePrice = this.getPrices(broken);
		Double price = vehiclePrice.get(brokenVehicle);
		System.out.println("This vehicle costs " + Double.toString(price / 10) + " to fix");
		return price;
	}

	public void emptyGarage(ArrayList<Vehicle> garageVehicles) {
		garageVehicles.clear();
	}

	public HashMap<Vehicle, Double> getPrices(ArrayList<Vehicle> garageVehicles) {
		double price;
		HashMap<Vehicle, Double> vehiclePrices = new HashMap<Vehicle, Double>();

		// vehiclePrices.putAll(garageVehicles.stream().filter(v -> (v instanceof
		// Car)).filter(v -> (((Car) v).getDoorNumber() == 5))
		// .collect(Collectors.toMap(Function.identity(), price * 2)));

		for (Vehicle v : garageVehicles) {
			price = 100;

			if (v instanceof Car) {
				price *= 10;
				if (((Car) v).getDoorNumber() == 5) {
					price *= 2;
				}
				if (((Car) v).getBrand().equals("Ferrari")) {
					price *= price;
				}
			} else if (v instanceof Bus) {
				price *= 50;
				if (((Bus) v).getCapacity() > 20) {
					price *= 2;
				}
			} else if (v instanceof Motorbike) {
				price *= 5;
				if (((Motorbike) v).getBrand().equals("Triumph")) {
					price *= 2;
				}
				if (((Motorbike) v).getPaintWork().equals("Blue")) {
					price -= (price * 0.2);
				}
			}

			vehiclePrices.put(v, price);
		}
		return vehiclePrices;
	}

}
