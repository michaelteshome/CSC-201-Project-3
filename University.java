import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.util.*;
public class University {
	
	
	int studentCount = 0;
	int totalTuition = 0;
	int totalLateFee = 0;
	int totalIncidental = 0;
	int totalHealthCare = 0;
	int totalMealPlan = 0;
	int instate = 0;
	int outstate = 0;
	
	
	public University(){
		
	}

	public void printDataForSchoolReport(Student person) {
		System.out.println("\nUniversity Of Computers");
		System.out.println("\nNumber Of Students: " + studentCount);
		System.out.println("\nOut Of State: " + outstate);
		System.out.println("\nInstate: " + instate);
		System.out.println("\nTotal Meal Plan: " + totalMealPlan);
		System.out.println("\nTotal Late Fee: " + totalLateFee);
		System.out.println("\nTotal Incidental Fee: " + totalIncidental);
		System.out.println("\nTotal Tuition:" + totalTuition);
	}
	public void collectDataForReport(Student person){
			/*person.getTuition();
			person.getLateFee();
			person.getIncidentalFee();
			person.getHealthCare();
			person.getMealPlan();
			person.getRate();*/
			
			
			if(person.getLocation() == true){
				instate ++;
			}
			else 
				outstate ++;
			
			totalTuition += person.getTuition();
			totalMealPlan += person.getMealPlan();
			totalIncidental += person.getIncidentalFee();
			totalLateFee += person.getLateFee();
			
			studentCount ++;
			
      }
}



	

