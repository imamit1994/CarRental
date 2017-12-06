package vehicle.type;

import vehicle.Vehicle;
import vehicle.constant.Const;

public class Car extends Vehicle{
	public double carRent() {
		double totalexpence = 0;
		if(isAc()) {
			if(isPetrol()) {
				totalexpence=getDistance()*(Const.STANDARD_RATE_PETROL+Const.ADDITIONAL_CHARGE_FOR_AC);
			}
			else {
				totalexpence=getDistance()*(Const.STANDARD_RATE_DIESEl+Const.ADDITIONAL_CHARGE_FOR_AC);
			}
		}
		else {
			if(isPetrol()) {
				totalexpence=getDistance()*(Const.STANDARD_RATE_PETROL);
			}
			else {
				totalexpence=getDistance()*(Const.STANDARD_RATE_DIESEl);
			}
			
		}
		return totalexpence;
	}
}
