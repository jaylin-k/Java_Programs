import java.util.Scanner;

public class WordGame {
	public static void main(String args[]) {
		Scanner user = new Scanner(System.in);

		System.out.println("What is your name: ");
		String name = user.nextLine();
		
		System.out.println("What is your age: ");
		int age = Integer.parseInt(user.nextLine());

		System.out.println("Enter a college name: ");
		String college = user.nextLine();

		System.out.println("Choose a profession: ");
		String profession = user.nextLine();

		System.out.println("Choose a type of animal: ");
		String animal = user.nextLine();

		System.out.println("Choose a pet name: ");
		String pet = user.nextLine();

		System.out.println("Enter a city: ");
		String city = user.nextLine();
		
		System.out.println("There once was a person named " + name + " who lived in " + city + ". \nAt the age of " + age + ", " + name + " went to college at " + college + "." + name + " graduated and went to work as a " + profession + ". \nThen, " + name + " adopted a(n) " + animal + " named " + pet + ". They both lived happily ever after!");
	}
}
