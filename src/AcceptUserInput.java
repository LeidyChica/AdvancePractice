import java.util.Scanner;

public class AcceptUserInput {

	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);
		
		System.out.println("What is your name?");
		String name = scanner.nextLine();
		
		System.out.println("How old are you?");
		int age = scanner.nextInt();
		
		System.out.println("What's your favorite food?");
		String food = scanner.next();
		
		System.out.println("Hello "+name);
		System.out.println("You're "+age+ " years old");
		System.out.println("You like "+food);
		
	}

}
