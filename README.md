# Builder-Design-Pattern-Student-Orientation

Date: Friday, October 28, 2016

Author(s): Sandesh Nimhan, Deepak Kaku
e-mail(s): snimhan1@binghamton.edu, dkaku1@binghamton.edu


PURPOSE:

[
	Understanding and implementing Builder Design Pattern
  By implementing student orientation program and mandatory steps involved in orientation.
]

DATA STRUCTURE:
[
	Hash Map: key-activities (e.g. Bus Tour) value-string containing constraints (e.g. time)
	Its fast and easy to iterate through Hash Map 
	Time complexity is O(1) as with key in hand it takes single iteration to search the value.
]

FILES:
[
	studentOrientation.driver
	-Driver.java
	
	studentOrientation.store.activities
	-BookStoreInterface.java
	-CampusTourInterface.java
	-CourseRegInterface.java
	-DormInterface.java

	studentOrientation.store.constraints
	-CarbonFootPrintInterface.java
	-ConstraintsInterface.java
	-CostInterface.java
	-EffortInterface.java
	-TimeInterface.java

	studentOrientation.store.storeResult
	-Result.java
	
	studentOrientation.util
	-Logger.java
	-Orientation.java
	-OrientationBuilder.java
	-OrientationWorkshop.java
	-OrientationWorkshopInterface.java

	studentOrientation.util.bookStore
	-MandoBookStore.java
	-UniversityBookStore.java

	studentOrientation.util.campusTour
	-BusTour.java
	-FootTour.java

	studentOrientation.util.courseReg
	-OnlineForm.java
	-SubmitForm.java

	studentOrientation.util.dorms
	-GameContest.java
	-LongQueue.java
	
	build.xml
	README.txt
]


TO COMPILE USING ANT:
[
	ant all 
]

TO RUN: 
[
	ant run
]

SAMPLE OUTPUT:

[ 
	Binghamton University Student Orientation Tool
------------------------------------------------
University Book Store : Time-18, Cost-$80.0, Calories-20, CarbonFootPrint-0.35.
Online Gaming Contest : Time-45, Cost-$3060.0, Calories-20, CarbonFootPrint-0.28.
Online Application Form : Time-10, Cost-$5000.0, Calories-5, CarbonFootPrint-0.4.
Bus tour : Time-30, Cost-$2.0, Calories-10, CarbonFootPrint-0.82.

Total : Time-103, Cost-$8142.0, Calories-55, CarbonFootPrint-1.85.
]
