package vehicle.rent;

import java.util.Scanner;

import vehicle.Vehicle;
import vehicle.constant.Const;
import vehicle.type.Bus;
import vehicle.type.Car;
import vehicle.type.Suv;

public class VehicleRateCalculation {
	static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {
		System.out.println("Trip Details");
		System.out.println("please choose Vehicle Type car/bus/suv");
		String vehicleType = sc.nextLine();

		if (vehicleType.equalsIgnoreCase("car")) {
			Car car = new Car();
			checkVehicleisAc(car);
			checkVehicleonPetrol(car);
			distanceTravelled(car);
			System.out.println(car.carRent());
		}

		else if (vehicleType.equalsIgnoreCase("bus")) {
			Bus bus=new Bus();
			checkVehicleisAc(bus);
			distanceTravelled(bus);
			System.out.println(bus.busRent());
		} 
		
		else if(vehicleType.equalsIgnoreCase("suv")){
			Suv suv=new Suv();
			distanceTravelled(suv);
			System.out.println(suv.suvRent());
		}
		else
		{
			System.out.println("You have entered wrong vehicle Type");
			System.exit(0);
		}
	}

	public static void checkVehicleisAc(Vehicle vehicle) {
		System.out.println("Is this car have AC yes/no");
		String carTypeAC = sc.nextLine();
		if (carTypeAC.equalsIgnoreCase("Yes")) {
			vehicle.setAc(true);
		}
	}

	public static void checkVehicleonPetrol(Vehicle vehicle) {
		System.out.println("Is car is running on Petrol Yes/no");
		String carTypePetrol = sc.nextLine();
		if (carTypePetrol.equalsIgnoreCase("Yes")) {
			vehicle.setPetrol(true);
		}

	}
	public static void distanceTravelled(Vehicle vehicle){
		String source;
		String destination;
		System.out.println("Please Enter Source of Your Journey please choose from pune/mumbai/banglore/delhi/chennai");
		source=sc.nextLine();
		System.out.println("Please Enter Destination of Your Journey please choose from mumbai/banglore/delhi/chennai");
		destination=sc.nextLine();
		double distance = 0;
		if(source.equalsIgnoreCase("pune")) {
			if(destination.equalsIgnoreCase("mumbai")) {
				distance=Const.PUNE_TO_MUMBAI;
			}
			else if(destination.equalsIgnoreCase("banglore")) {
				distance=Const.PUNE_TO_BANGLORE;
			}
			else if(destination.equalsIgnoreCase("delhi")) {
				distance=Const.PUNE_TO_DELHI;
			}
			else if(destination.equalsIgnoreCase("chennai")) {
				distance=Const.PUNE_TO_CHENNAI;
			}
			else {
				invalidSourceorDestination();
			}
		}
		else if(source.equalsIgnoreCase("mumbai")) {
			if(destination.equalsIgnoreCase("banglore")) {
				distance=Const.PUNE_TO_MUMBAI+Const.PUNE_TO_BANGLORE;
			}
			else if(destination.equalsIgnoreCase("delhi")) {
				distance=Const.PUNE_TO_DELHI+Const.PUNE_TO_MUMBAI;
			}
			else if(destination.equalsIgnoreCase("chennai")) {
				distance=Const.PUNE_TO_CHENNAI+Const.PUNE_TO_MUMBAI;
			}
			else {
				invalidSourceorDestination();
			}
		}
		else if(source.equalsIgnoreCase("banglore")) {
			if(destination.equalsIgnoreCase("mumbai")) {
				distance=Const.PUNE_TO_MUMBAI+Const.PUNE_TO_BANGLORE;
			}
			else if(destination.equalsIgnoreCase("delhi")) {
				distance=Const.PUNE_TO_DELHI+Const.PUNE_TO_BANGLORE;
			}
			else if(destination.equalsIgnoreCase("chennai")) {
				distance=Const.PUNE_TO_CHENNAI+Const.PUNE_TO_BANGLORE;
			}
			else {
				invalidSourceorDestination();
			}
		}
		else if(source.equalsIgnoreCase("delhi")) {
			if(destination.equalsIgnoreCase("mumbai")) {
				distance=Const.PUNE_TO_MUMBAI+Const.PUNE_TO_DELHI;
			}
			else if(destination.equalsIgnoreCase("banglore")) {
				distance=Const.PUNE_TO_BANGLORE+Const.PUNE_TO_DELHI;
			}
			else if(destination.equalsIgnoreCase("chennai")) {
				distance=Const.PUNE_TO_CHENNAI+Const.PUNE_TO_DELHI;
			}
			else {
				invalidSourceorDestination();
			}
		}
		else if(source.equalsIgnoreCase("chennai")) {
			if(destination.equalsIgnoreCase("mumbai")) {
				distance=Const.PUNE_TO_MUMBAI+Const.PUNE_TO_CHENNAI;
			}
			else if(destination.equalsIgnoreCase("banglore")) {
				distance=Const.PUNE_TO_BANGLORE+Const.PUNE_TO_CHENNAI;
			}
			else if(destination.equalsIgnoreCase("delhi")) {
				distance=Const.PUNE_TO_DELHI+Const.PUNE_TO_CHENNAI;
			}
			else {
				invalidSourceorDestination();
			}
		}
		else {
			invalidSourceorDestination();
		}
		vehicle.setDistance(distance);
	}
	
	public static void invalidSourceorDestination() {
		System.out.println("You have Entered Invalid Source or Destination");
		System.exit(0);
	}

}
