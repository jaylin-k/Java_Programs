import java.util.*;


public class StockProfits {
    
    public static double profit(double ns, double pp, double pc, double sp, double sc){
        double a = ((ns * sp) - sc) - ((ns * pp) + pc);
        double p = Math.round(a*100.0)/100.0;

	if (p > 0 ){
	System.out.println("Your Stock Profits are " + p + " dollars.");
	}
	else {
	System.out.println("Your Stock Profits is at a loss of " + p + " dollars.");
	}
        return p;
    }
    
    
    public static void main(String args[]) {
        Scanner user = new Scanner(System.in);
        double ns, pp, pc, sp, sc;
      
        System.out.println("Enter the number of shares: ");
        ns = user.nextDouble();
      
        System.out.println("Enter the purchase price per share: ");
        pp = user.nextDouble();
      
        System.out.println("enter the purchase commission paid: ");
        pc = user.nextDouble();
      
        System.out.println("enter the sale price per share: ");
        sp = user.nextDouble();
      
        System.out.println("Enter the sale commission paid:");
        sc = user.nextDouble();
       
        profit(ns, pp, pc, sp, sc);
    }
}
