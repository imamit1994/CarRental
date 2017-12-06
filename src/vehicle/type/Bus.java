package vehicle.type;

import vehicle.Vehicle;
import vehicle.constant.Const;

public class Bus extends Vehicle{

	public Bus() {
		super(false);//Bus is always running on diesel so setting petrol false
	}
	public double busRent() {
		double totalexpence=0;
		double discount = 0;
		if(isAc()) {
			totalexpence=getDistance()*(Const.ADDITIONAL_CHARGE_FOR_AC+Const.STANDARD_RATE_DIESEl);
		}
		else {
			totalexpence=getDistance()*(Const.STANDARD_RATE_DIESEl);
		}
		discount=(totalexpence*0.02);//2 % additional discount for bus expences
		return totalexpence-discount;
	}
}
