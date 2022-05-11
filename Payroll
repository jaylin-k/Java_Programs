import java.util.*;


public class mypayroll {
	public static void main (String[] args) {
	    
	     String employeeName = " ";
	     String idNumber = " ";
	     double hourlyRate = 0;
	     double hoursWorked = 0;


		payroll pay = new payroll(employeeName, idNumber, hourlyRate, hoursWorked);
		
		Scanner person = new Scanner(System.in);

		System.out.println("Enter employee name: ");
		employeeName = person.nextLine();
		pay.setEmployeeName(employeeName);

		System.out.println("Enter employee ID number: ");
		idNumber = person.nextLine();
		pay.setIdNumber(idNumber);
		
		System.out.println("Enter hourly pay rate: ");
		hourlyRate = person.nextDouble();
		pay.setHourlyRate(hourlyRate);
		
		System.out.println("Enter hours worked: ");
		hoursWorked = person.nextDouble();
		pay.setHoursWorked(hoursWorked);
		
		System.out.println("\nEmployee: " + pay.getEmployeeName() + ", ID: " + pay.getIdNumber() + "\nWorked " + pay.getHoursWorked() + " hours\nRate of $" + pay.getHourlyRate());
		System.out.println("\nGross pay is $" + pay.getGrossPay());

	}

}

class payroll {

	private String employeeName = " ";
	private String idNumber = " ";
	private double hourlyRate = 0;
	private double hoursWorked = 0;


	public payroll(String eName, String idNum, double hrRate, double hrWork) {

		employeeName = eName;
		idNumber = idNum;
		hourlyRate = hrRate;
		hoursWorked = hrWork;
		
	}

	public void setEmployeeName(String eName) {

		employeeName = eName;
	}

	public void setIdNumber(String idNum) {

		idNumber = idNum;
	}
	public void setHourlyRate(double hrRate) {

		hourlyRate = hrRate;
	}

	public void setHoursWorked(double hrWork) {
		hoursWorked = hrWork;
	}

	public String getEmployeeName() {

		
		return employeeName;
	}

	public String getIdNumber() {
	
		return idNumber;
	}

	public double getHourlyRate() {

		return hourlyRate;

	}

	public double getHoursWorked() {

		return hoursWorked;
	}

	public double getGrossPay() {

		double a = getHoursWorked() * getHourlyRate();
		double grossPay = Math.round(a*100.0)/100.0;
		return grossPay;
	}
}
