import java.util.*;

public class esp {
	public static int getRandomNumber(int min, int max) {
		Random random = new Random();
		return random.ints(min,max).findFirst().getAsInt();
	}
	public static void main(String args[]){
		String[] colors = {"red","green","blue","orange","yellow"};

		int count = 0;
		for(int i = 0; i<=10; i++){
			String randomName = colors[getRandomNumber(0,4)];
			System.out.println("Guess the color [red, green, blue, yellow, orange]: ");
			Scanner user = new Scanner(System.in);
			String guess = user.nextLine();
			
			if (guess.equals(randomName)) {
				count++;
			}
			System.out.println("Total score is " + count + "/10");
		}
	}
}
