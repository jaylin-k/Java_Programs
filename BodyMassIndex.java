import java.util.Scanner;


public class BMI{
	public static void main(String[] args){
		Scanner user = new Scanner(System.in);
		System.out.println("Enter Weight in pounds: ");
		int weight = user.nextInt();
		System.out.println("Enter Height in inches(ex. 5'10 = 70 inches): ");
		int height = user.nextInt();
		
		int bmiWeight = 703*weight;
		int bmiHeight = height*height;
		int bmi = bmiWeight / bmiHeight;
		
		if (bmi > 25) {
			System.out.println("Your BMI is " + bmi + " ,you are OVER-WEIGHT");
		}
		else if (bmi >= 18.5 && bmi <= 25) {
			System.out.println("Your BMI is " + bmi + " ,you are NORMAL-WEIGHT");
		}
		else {
			System.out.println("Your BMI is " + bmi + " ,you are UNDER-WEIGHT");
		}

	}
}
