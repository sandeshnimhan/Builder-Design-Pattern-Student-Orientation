package studentOrientation.util.campusTour;

import studentOrientation.store.activities.CampusTourInterface;

public class FootTour implements CampusTourInterface{
	
	private int time;
	private double cost;
	private int calories;
	private double co2;
	
	/**
	 * This is the public constructor of class FootTour
	 * 
	 */
	public FootTour() {
		// TODO Auto-generated constructor stub
		time = 80;
		cost = 0.1;
		calories = 150;
		co2 = 0.01;
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
	 * This method is used to calculate Carbon foot print 
	 * @return double - returns carbon foot print
	 */
	@Override
	public double calculateCO2() {
		// TODO Auto-generated method stub
		return co2;
	}

}
