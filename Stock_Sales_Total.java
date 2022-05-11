import java.util.*;


public class stockSales {
    
    public static double profit(double s1, double s2, double s3){
        double a = s1 + s2 + s3;
        
        double stockTotal = Math.round(a*100.0)/100.0;
        
        if (stockTotal < 0 ){
            System.out.println("Your total stock sales are at a loss of " + stockTotal);
        }
        else {
            System.out.println("Your total profit from stock sales are " + stockTotal);
        }
	        return stockTotal;
    }
    
    
    public static void main(String args[]) {
        Scanner user = new Scanner(System.in);
        double stockOne, stockTwo, stockThree, stockTotal;
        
        System.out.println("Enter total number of sales for stock one: ");
        stockOne = user.nextDouble();
        
        System.out.println("Enter total number of sales for stock two: ");
        stockTwo = user.nextDouble();
        
        System.out.println("Enter total number of sales for stock three: ");
        stockThree = user.nextDouble();
        
        profit(stockOne, stockTwo, stockThree);
    }
}
