package studentOrientation.store.storeResult;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Result {
	private int timeG=0;
	private double costG=0.0;
	private int caloriesG=0;
	private double co2G=0.0;
	HashMap resultMap = new HashMap();
	
	/**
	 * storeReult(): This is the method to store the result in a data structure(HashMap in our case). 
	 * @param time - int value for time
	 * @param cost - double type for cost
	 * @param co2 - double type for carbon foot print
	 * @param calories - int value for Calories
	 * @param choice - int value of the student's choice 
	 * @param key - A String value which acts as a key in HashMap
	 * 
	 */
	public void storeResult(int time,double cost,double co2,int calories,int choice, String key){
		String res = "Time-"+time+", Cost-$"+cost+", Calories-"+calories+", CarbonFootPrint-"+(float)co2+".";
		resultMap.put(key, res);
		timeG = timeG + time;
		costG = costG + cost;
		co2G = co2G + co2;
		caloriesG  = caloriesG + calories;
	}
	
	/**
	 * printResult(): This method is used to print the result on to the screen.
	 * 
	 */
	public void printResult(){
		System.out.println("Binghamton University Student Orientation Tool");
		System.out.println("------------------------------------------------");
		Iterator resultIterate = resultMap.entrySet().iterator();
		while(resultIterate.hasNext()){
			Map.Entry res = (Map.Entry)resultIterate.next();
			System.out.println(res.getKey()+" : "+ res.getValue());
			resultIterate.remove();
		}
		String res = "Total : Time-"+timeG+", Cost-$"+costG+", Calories-"+caloriesG+", CarbonFootPrint-"+(float)co2G+".";
		System.out.println("\n"+res);
	}
}
