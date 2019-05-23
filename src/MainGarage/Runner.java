package MainGarage;

import GarageChildren.Bus;
import GarageChildren.Car;
import GarageChildren.Garage;
import GarageChildren.Motorbike;

public class Runner {
	public static void main(String[] args) {

		Car car1 = new Car("Kia", "Soul", "AB12 ABC", "CUV", 15.2, 5);
		Car car2 = new Car("Ford", "Fiesta", "AB24 ABC", "Hatchback", 10, 5);
		Car car3 = new Car("Fiat", "Panda", "AB89 ABC", "Hatchback", 9.72, 3);
		Car car4 = new Car("Fiat", "500", "AB12 KFC", "Hatchback", 11.9, 3);
		Car car5 = new Car("Ferrari", "Enzo", "DS12 MEA", "Supercar", 1.2, 3);
		Garage salesCourt = new Garage();
		salesCourt.addGarageVehicle(car1);
		salesCourt.addGarageVehicle(car2);
		salesCourt.addGarageVehicle(car3);
		salesCourt.addGarageVehicle(car4);
		salesCourt.addGarageVehicle(car5);

		Motorbike bike1 = new Motorbike("Triumph", "Daytona", "DN14 VCC", "Racing", "Blue");
		Motorbike bike2 = new Motorbike("Triumph", "Tiger", "DN45 VCC", "Touring", "Red and White");

		salesCourt.addGarageVehicle(bike1);
		salesCourt.addGarageVehicle(bike2);

		Bus bus1 = new Bus("Ford", "LittleBus", "AD14 VCC", "Minibus", 15);
		Bus bus2 = new Bus("Ford", "BigBus", "AG45 VCC", "Coach", 49);

		salesCourt.addGarageVehicle(bus1);
		salesCourt.addGarageVehicle(bus2);

		System.out.println(salesCourt.getPrices(salesCourt.getGarageVehicles()));

		salesCourt.removeGarageVehicle(null, bus1);
		salesCourt.removeGarageVehicle("bus", null);

		System.out.println(salesCourt.getPrices(salesCourt.getGarageVehicles()));

		salesCourt.fixVehicle(car5);

		salesCourt.emptyGarage(salesCourt.getGarageVehicles());
	}
}
