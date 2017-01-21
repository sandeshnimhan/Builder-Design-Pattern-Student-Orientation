package studentOrientation.util;

import studentOrientation.store.activities.BookStoreInterface;
import studentOrientation.store.activities.CampusTourInterface;
import studentOrientation.store.activities.CourseRegInterface;
import studentOrientation.store.activities.DormInterface;
import studentOrientation.store.storeResult.Result;
import studentOrientation.util.bookStore.MandoBookStore;
import studentOrientation.util.bookStore.UniversityBookStore;
import studentOrientation.util.campusTour.BusTour;
import studentOrientation.util.campusTour.FootTour;
import studentOrientation.util.courseReg.OnlineForm;
import studentOrientation.util.courseReg.SubmitForm;
import studentOrientation.util.dorms.GameContest;
import studentOrientation.util.dorms.LongQueue;

public class Orientation extends OrientationBuilder{
	
	public enum CampusTour{
		BUS_TOUR,
		WALK_TOUR
	}
	public enum BookStore{
		UNIVERSITY_BOOK_STORE,
		MANDO_BOOK_STORE
	}
	public enum Dorm{
		STAND_IN_QUEUE,
		ONLINE_GAMING_CONTEST
	}
	public enum Course{
		SUBMIT_FORM,
		ONLINE_APPLICATION_FORM
	}
	
	public CampusTour campusTour;
	public BookStore bookStore;
	public Dorm dorm;
	public Course course;
	
	private int time;
	private double cost;
	private int calories;
	private double co2;
	
	Result result=new Result();
	/**
	 * This is the constructor of the class Orientation
	 * @param campusTour - Reference to CampusTour activity
	 * @param bookStore - Reference to BookStore activity
	 * @param dorm - Reference to Dorm activity
	 * @param course - Reference to Course registration activity
	 * 
	 */
	public Orientation(CampusTour campusTour, BookStore bookStore, Dorm dorm, Course course)
	{
		Logger.writeMessage("Orientation Constructor", Logger.DebugLevel.CONSTRUCTOR);
		this.campusTour=campusTour;
		this.bookStore=bookStore;
		this.dorm=dorm;
		this.course=course;
	}
	
	/**
	 * This method is called when the student selects his book store choice
	 * 
	 */
	@Override
	public void buyBooks() {
		double referenceCost=80;
		BookStoreInterface bookStoreInterface; 
		// TODO Auto-generated method stub
		switch(bookStore){
		case UNIVERSITY_BOOK_STORE:{
			bookStoreInterface = new UniversityBookStore();
			bookStoreInterface.setCost(referenceCost);
			time=bookStoreInterface.calculateTime();
			cost=bookStoreInterface.calculateCost();
			co2=bookStoreInterface.calculateCO2();
			calories=bookStoreInterface.calculateCalories();
			result.storeResult(time,cost,co2,calories,0, "University Book Store");

			break;
		}
		case MANDO_BOOK_STORE:{
			bookStoreInterface = new MandoBookStore();
			referenceCost*=1.05;
			bookStoreInterface.setCost(referenceCost);
			time=bookStoreInterface.calculateTime();
			cost=bookStoreInterface.calculateCost();
			co2=bookStoreInterface.calculateCO2();
			calories=bookStoreInterface.calculateCalories();
			result.storeResult(time,cost,co2,calories,0, "Mando Book Store");
			break;
		}
		}
	}

	/**
	 * This method is called when the student selects campus tour activity
	 * 
	 */
	@Override
	public void campusTour() {
		CampusTourInterface campusTourInterface;
		// TODO Auto-generated method stub
		switch(campusTour){
		case BUS_TOUR:
			campusTourInterface = new BusTour();
			time=campusTourInterface.calculateTime();
			cost=campusTourInterface.calculateCost();
			co2=campusTourInterface.calculateCO2();
			calories=campusTourInterface.calculateCalories();
			result.storeResult(time,cost,co2,calories,1, "Bus tour");
			break;
		case WALK_TOUR:
			campusTourInterface = new FootTour();
			time=campusTourInterface.calculateTime();
			cost=campusTourInterface.calculateCost();
			co2=campusTourInterface.calculateCO2();
			calories=campusTourInterface.calculateCalories();
			result.storeResult(time,cost,co2,calories,1, "Walk Tour");
			break;
		}
	}

	/**
	 * This method is called when the student selects the Dorm activity
	 * 
	 */
	@Override
	public void selectDorm() {
		DormInterface dormInterface;
		double referenceCost=3000;
		// TODO Auto-generated method stub
		switch(dorm){
		case STAND_IN_QUEUE:
			dormInterface = new LongQueue();
			dormInterface.setCost(referenceCost);
			time=dormInterface.calculateTime();
			cost=dormInterface.calculateCost();
			co2=dormInterface.calculateCO2();
			calories=dormInterface.calculateCalories();
			result.storeResult(time,cost,co2,calories,2, "Stand In Queue");
			break;
		case ONLINE_GAMING_CONTEST:
			dormInterface = new GameContest();
			dormInterface.setCost(referenceCost*1.02);
			time=dormInterface.calculateTime();
			cost=dormInterface.calculateCost();
			co2=dormInterface.calculateCO2();
			calories=dormInterface.calculateCalories();
			result.storeResult(time,cost,co2,calories,2, "Online Gaming Contest");
			break;
		}
	}
	
	/**
	 * This method is called when the student selects course registration activity
	 * 
	 */
	@Override
	public void registerCourses() {
		CourseRegInterface courseRegInterface;
		double referenceCost=5000;
		// TODO Auto-generated method stub
		switch(course){
		case SUBMIT_FORM:
			courseRegInterface = new SubmitForm();
			courseRegInterface.setCost(referenceCost*0.97);
			time=courseRegInterface.calculateTime();
			cost=courseRegInterface.calculateCost();
			co2=courseRegInterface.calculateCO2();
			calories=courseRegInterface.calculateCalories();
			result.storeResult(time,cost,co2,calories,3, "Submit Form");
			break;
		case ONLINE_APPLICATION_FORM:
			courseRegInterface = new OnlineForm();
			courseRegInterface.setCost(referenceCost);
			time=courseRegInterface.calculateTime();
			cost=courseRegInterface.calculateCost();
			co2=courseRegInterface.calculateCO2();
			calories=courseRegInterface.calculateCalories();
			result.storeResult(time,cost,co2,calories,3, "Online Application Form");
			break;
		}
	}
	
	/**
	 * This method simply prints of the orientation schedule with constraints like Time, cost, efforts, etc
	 * 
	 */
	public void printResult(){
		result.printResult();
	}
}

