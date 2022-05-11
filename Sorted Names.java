import javax.swing.JOptionPane;

public class Sort 
{
     public static void main(String [] args)
     { 
		 String name1, name2, name3; 
		 String firstPlace = null; 
		 String secondPlace = null; 
		 String thirdPlace = null;
		 
		 
		 
		 name1 = JOptionPane.showInputDialog("Please enter a persons name:");
		 name2 = JOptionPane.showInputDialog("Now enter a second name:");
		 name3 = JOptionPane.showInputDialog("Now enter a third name:");
		 
		 if (name1.compareTo(name2) < 0)
		 {
		 	if (name2.compareTo(name3) < 0)
		 	{
		 		JOptionPane.showMessageDialog(null, "The order is: \n" 
		 						+ name1 + "\n" + name2 + "\n" + name3);
		 	}
		 	else
		 	{
		 		JOptionPane.showMessageDialog(null, "The order is: \n" 
		 						+ name1 + "\n" + name3 + "\n" + name2);
		 	}	
		 }
		 else if (name2.compareTo(name1) < 0)
		 {
		 	if (name1.compareTo(name3) < 0)
		 	{
		 		JOptionPane.showMessageDialog(null, "The order is: \n" 
		 						+ name2 + "\n" + name1 + "\n" + name3);
		 	}
		 	else
		 	{
		 		JOptionPane.showMessageDialog(null, "The order is: \n" 
		 						+ name2 + "\n" + name3 + "\n" + name1);
		 	}
		 }
		 else if (name3.compareTo(name1) < 0)
		 {
		 	if (name1.compareTo(name2) < 0)
		 	{
		 		JOptionPane.showMessageDialog(null, "The order is: \n" 
		 						+ name3 + "\n" + name1 + "\n" + name2);
		 	}
		 	else
		 	{
		 		JOptionPane.showMessageDialog(null, "The order is: \n" 
		 						+ name3 + "\n" + name2 + "\n"+ name1);
		 	}
                        System.exit(0);	
		 }	 
   }
 }
