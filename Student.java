import java.util.Scanner;
public class Student {

	private double rate;
	Scanner kybd = new Scanner(System.in);
	private String firstName;
	private String lastName;
	private String address;
	private String phoneNumber;
	private int credits;
	private String state;
	private String city;
	private String[] mealPlanOption = new String[3];{
	mealPlanOption[0] = "Buffet";
	mealPlanOption[1] = "I cant stand this food";
	mealPlanOption[2] = "Diet ";
	}
	private int choice;
	private double mealPlan;
	private boolean location;
	private String college;
	private boolean lateFeeOption;
	private double lateFee;
	private double incidentalFee;
	private double healthCare;
	private boolean healthCareOption;
	private double tuition;

	
	public Student(){
		
	}

	public void readInput(){
		Scanner kybd = new Scanner(System.in);
		System.out.println("Enter First Name: ");
		firstName = kybd.nextLine();
		System.out.println("Enter Last Name: ");
		lastName = kybd.nextLine();
		System.out.println("Enter Street Address: ");
		address = kybd.nextLine();
		System.out.println("Enter City: ");
		city = kybd.nextLine();
		System.out.println("Enter State: ");
		state = kybd.nextLine();
		System.out.println("Enter Phone Number: ");
		phoneNumber = kybd.nextLine();
		System.out.println("Instate (true) or (false):");
		location = kybd.nextBoolean();
		System.out.println("Name of College or University: ");
		college = kybd.nextLine();
		System.out.println("Enter Credits: ");
		credits = kybd.nextInt();
		System.out.println("Is your tuition payed late (true) or (false): ");
		lateFeeOption = kybd.nextBoolean();
		System.out.println("Do you want to add a Health Care Option (true) or (false): ");
		healthCareOption = kybd.nextBoolean();
		System.out.println("\nChoose a meal plan:"
		+ "Enter 0 for option[0]: Buffet"
		+ "Enter 1 for option[1]: I cant stand this "
		+ "Enter 2 for option[2]: Diet");
		choice = kybd.nextInt();
		
	
		
		
	}
	
	private void calculateData(){
		
		getLateFee();
		
		if(healthCareOption == true){
			if(credits < 11){
				healthCare = 25.00;
			}
			
			if(credits > 10 && credits < 16){
				healthCare = 20.00 * (credits - 10) + 250;
			}
			
			if(credits > 15){
				healthCare = 15 * (credits - 15) + 250 + 100;
			}
		}
		
		incidentalFee = 20 * credits;
		if(incidentalFee > 250.00){
			incidentalFee = 250.00;
		}
		
		
		
		getRate();	
		if(choice == 0){
			mealPlan = 4999.00;
		}
		else if(choice == 1){
			mealPlan = 3499.00;
		}
		
		if(choice == 2)
			mealPlan = 2599.00;
			
		
		if(state.length() > 2){
			System.out.println("\nYou entered the state in a wrong format: ");
			System.exit(0);
		}
		
		
	}
	
	public String getMealPlanOption(){
		if(choice == 0){
			return mealPlanOption[0];
		}
		else if(choice == 1){
			return mealPlanOption[1];
		}
		else	
			choice = 2;
			return mealPlanOption[2];
	}
	
	public double getRate(){
		if (location == true){
	       if (credits < 12){
	           rate =  (credits * 102.50);
			}                
	       if(credits >= 12 || credits <= 18);{
	           rate = (credits* 75.45);     
	       }             
	    
	        if (credits > 18){
	           rate = (credits * 93.00);
	        }  
		}   
		
		if (location == false){
			if(credits < 12){
				rate = (credits * 351);
			}
			if(credits >= 11 || credits <= 18){
				rate = (credits * 255.00);
			}
			if(credits > 18){
				rate = (credits * 304.00);
			}
		}
		
		
		
		return rate;
	}
	
	
	
	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public String getAddress(){
		return address;
	}
	
	public String getPhoneNumber(){
		return phoneNumber;
	}
	
	public int getCredits(){
		return credits;
	}
	
	public String getState(){
		return state;
	}
	
	public String getCity(){
		return city;
	}
	
	public void writeOutput(){
		calculateData();
		System.out.println("\nStudent Name: " + firstName + "" + lastName);
		System.out.println("\nAddress: " + address );
		System.out.println("\n" + city + "," + state);
		System.out.println("\nName of College or University: " + college);
		System.out.println("\nPhone number: " + phoneNumber);
		System.out.println("\nCredits: " + credits);
		System.out.println("\nMeal Plan: " + getMealPlanOption() + 
				"Price of Meal Plan" + mealPlan);
		System.out.println("\nIs student instate: " + location);
		System.out.println("\nRate for tuition: " + getRate());
		System.out.println("\nHealth Care Cost: " + healthCare);
		System.out.println("\nLate Fee: " + getLateFee());
		System.out.println("\nIncidental Fee: " + incidentalFee);
		System.out.println("\nTotal Tuition: " + getTuition());
		
	}
	
	public void setRate(double newRate){
		rate = newRate;
	}
	
	public double getTuition(){
		tuition = mealPlan + incidentalFee + lateFee + healthCare + rate;
		return tuition;
	}
	
	public double getMealPlan(){
		return mealPlan;
	}
	
	public boolean getLocation(){
		return location;
	}
	
	public String getCollege(){
		return college;
	}

	public boolean getLateFeeOption(){
		return lateFeeOption;
	}
	
	public double getLateFee(){
		if(lateFeeOption == true){
			lateFee = rate / 10.0;
		}
		else
			lateFee = 0;
			return lateFee;
	}
	
	public double getIncidentalFee(){
		return incidentalFee;
	}
	
	public boolean getHealthCareOption(){
		return healthCareOption;
	}
	
	public double getHealthCare(){
		return healthCare;
	}
	
	

}
