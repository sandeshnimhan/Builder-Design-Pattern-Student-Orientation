package studentOrientation.util.campusTour;

import studentOrientation.store.activities.CampusTourInterface;

public class BusTour implements CampusTourInterface {
	private int time;
	private double cost;
	private int calories;
	private double co2;
	
	/**
	 * This is a public constructor of class BusTour
	 * 
	 */
	public BusTour() {
		// TODO Auto-generated constructor stub
		cost = 2;
		calories = 10;
		time = 30;
		co2 = 0.82;
	}
	
	/**
	 * This method is used to calculate cost 
	 * @return double - returns cost
	 */
	@Override
	public double calculateCost() {
		// TODO Auto-generated method stub	
		return cost;
	}

	/**
	 * This method is used to calculate Calories 
	 * @return int - returns calories
	 */
	@Override
	public int calculateCalories() {
		// TODO Auto-generated method stub
		return calories;
	}

	/**
	 * This method is used to calculate time 
	 * @return int - returns int value of time
	 */
	@Override
	public int calculateTime() {
		// TODO Auto-generated method stub
		return time;
	}

	/**
	 * This method is used to calculate Carbon foot print 
	 * @return double - returns carbon foot print
	 */
	@Override
	public double calculateCO2() {
		// TODO Auto-generated method stub
		return co2;
	}
	
}
