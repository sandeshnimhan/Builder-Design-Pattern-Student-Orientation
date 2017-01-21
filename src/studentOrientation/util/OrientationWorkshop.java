package studentOrientation.util;

public class OrientationWorkshop implements OrientationWorkshopInterface{
	
	/**This method takes in the OrientationInterface object and calls series of methods
     * @param orientationBuilder This parameter is reference from the abstract class OrientationBuilder
     * 
     */
	public void construct(OrientationBuilder orientationBuilder){
		orientationBuilder.buyBooks();
		orientationBuilder.campusTour();
		orientationBuilder.selectDorm();
		orientationBuilder.registerCourses();
		orientationBuilder.printResult();
	}
	
}
