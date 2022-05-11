import java.util.*;


public class retailPrice {

	public static void main(String args[])
  {
		
		Scanner user = new Scanner(System.in);

		System.out.println("Enter wholesale cost: ");
		double wholesaleCost = user.nextDouble();

		System.out.println("Enter markup percentage: ");
		double markupPrice = user.nextDouble()/100;

		calculateRetail(wholesaleCost, markupPrice);
	}
    
	public static void calculateRetail(double saleCost, double markPrice) 
  {
		double retailPrice;
    
		retailPrice = (saleCost * markPrice) + saleCost;
		System.out.println("Your total is: " + retailPrice);
	}
  
}
