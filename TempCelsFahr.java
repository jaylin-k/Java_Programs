import java.util.*;

public class celsiusTemp
{
    
    public static double celsius(double f)
   {
       double a = (0.5556)*(f-32);
       double c = Math.round(a*100.0)/100.0;
       return c;
   }
   
   
   public static void main(String[] args)
   {
            for (int fahrenheit = 0; fahrenheit<=20; fahrenheit++){
                
                System.out.println("Fahrenheit  " + fahrenheit + ":  " + "Celsius temp =  " + celsius(fahrenheit));
            }
        
    }

}
