package studentOrientation.driver;

import studentOrientation.util.Orientation;
import studentOrientation.util.OrientationBuilder;
import studentOrientation.util.Orientation.BookStore;
import studentOrientation.util.Orientation.CampusTour;
import studentOrientation.util.Orientation.Course;
import studentOrientation.util.Orientation.Dorm;
import studentOrientation.util.OrientationWorkshop;
import studentOrientation.util.OrientationWorkshopInterface;

public class Driver {
	/**
	 * This is the main method of the Driver class.
	 * @param args - An array of command line arguments
	 *  
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrientationBuilder orientationBuilder = new Orientation(CampusTour.BUS_TOUR,BookStore.UNIVERSITY_BOOK_STORE,Dorm.ONLINE_GAMING_CONTEST,Course.ONLINE_APPLICATION_FORM);
		
		OrientationWorkshopInterface orientationWorkshopI=new OrientationWorkshop();
		orientationWorkshopI.construct(orientationBuilder);
		
	}

}
