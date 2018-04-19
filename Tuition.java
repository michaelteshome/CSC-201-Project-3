import java.util.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;
public class Tuition {

	public static void main(String[] args) {
		Scanner kybd = new Scanner(System.in);
		NumberFormat moneyFormatter = NumberFormat.getCurrencyInstance();
        System.out.println(moneyFormatter.format(2003.4));
        String money = moneyFormatter.format(20043.44);
        System.out.println(money);
		University clerk = new University();
		Student person = new Student();
		int numberOfStudents, i, count;
		System.out.println("Enter number of students:");
		numberOfStudents = kybd.nextInt();
		
		for(i = 0; i < numberOfStudents ; i++){
			person.readInput(); // This method must call private methods to do the calculations
			person.writeOutput();
			clerk.collectDataForReport(person);
		}
		clerk.printDataForSchoolReport(person);
		
		
		
	}

	
	
	
}

