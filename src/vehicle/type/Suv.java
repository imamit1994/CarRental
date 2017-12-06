package vehicle.type;

import vehicle.Vehicle;
import vehicle.constant.Const;

public class Suv extends Vehicle {

	public Suv() {
		super(true,false);//SUV is always AC and always running on Diesel 
	}
	public double suvRent() {
		double totalexpence=0;
		totalexpence=getDistance()*(Const.STANDARD_RATE_DIESEl+Const.ADDITIONAL_CHARGE_FOR_AC);
		return totalexpence;
	}
}
