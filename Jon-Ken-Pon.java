import java.util.*;

public class jonkenpon {
    
    public static int randomchoice(int rc) {
        int min = 1;
        int max = 3;
        rc = (int)Math.floor(Math.random()*(max-min+1)+min);
        if (rc == 1){
            System.out.println("Computer chose Rock\n");
        }
        else if (rc == 2) {
            System.out.println("Computer chose Paper\n");
        }
        else{
            System.out.println("Computer chose Scissors\n");
        }
        return rc;
    }
    
    public static void main (String[] args) {
        
        Scanner player = new Scanner(System.in);
        int rc = 0;
        int playerScore = 0;
        int compScore = 0;
        System.out.println("\n---------------------JON KEN PON!!!!------------------------\n");
    
        for(int i = 0; i<=5; i++){
            
            System.out.println("Rock, Paper, Scissors!");
            System.out.println("Type 'R' = Rock, 'P' = Paper, or 'S' = Scissors\n");
        
            String playerOne = player.nextLine();
        
            int rps = randomchoice(rc);
        
        
            if (playerOne.equalsIgnoreCase("r") || playerOne.equalsIgnoreCase("rock")){
                
                if (rps==1) {
                    
                    System.out.println("It's a tie! Rock and Rock!\n");
                }
                else if (rps==2){
                    
                    System.out.println("You lose! Paper covers Rock!\n");
                    compScore++;
                }
                else {
                    
                    System.out.println("You win! Rock beats Scissors!\n");
                    playerScore++;
                }
            }
        
            else if (playerOne.equalsIgnoreCase("p") || playerOne.equalsIgnoreCase("paper")){
    
                if (rps==1){
                    
                    System.out.println("You win! Paper beats Rock!\n");
                    playerScore++;
                }
                else if (rps==2){
                    
                    System.out.println("It's a draw! Paper and Paper!\n");
                }
                else {
                    
                    System.out.println("Scissors cuts paper! You lose!\n");
                    compScore++;
                }
            }
            else if (playerOne.equalsIgnoreCase("s") || playerOne.equalsIgnoreCase("scissors")){
            
                if (rps==1){
                    
                    System.out.println("You lost! Scissors gets crushed by Rock!\n");
                    compScore++;
                }
                else if (rps==2){
                    
                    System.out.println("You win! Scissors beats Paper!\n");
                    playerScore++;
                }
                else {
                    
                    System.out.println("It's a tie! Scissors and Scissors!\n");
                } 
            }
        }
        System.out.println("Your score: " + playerScore + "\nComputer score: " + compScore);
    }
}
