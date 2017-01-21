package studentOrientation.util.dorms;

import studentOrientation.store.activities.DormInterface;

public class LongQueue implements DormInterface{

	private int time;
	private double cost;
	private int calories;
	private double co2;
	
	/**
	 * This is the public constructor of class LongQueue
	 * 
	 */
	public LongQueue() {
		// TODO Auto-generated constructor stub
		cost = 20;
		calories = 38;
		time = 35;
		co2 = 0.15;
	}
	
	/**
	 * This method is used to calculate time 
	 * @return double - returns cost
	 */
	public double getCost() {
		return cost;
	}
	
	/**
	 * This method is used to set the cost
	 * 
	 */
	public void setCost(double cost) {
		this.cost = cost;
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
