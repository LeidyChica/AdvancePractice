import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {
		
		// && (AND) both conditions must be true
		// || (OR) either condition must be true
		// ! (NOT) reverses boolean value of a condition

		/*AND
		
		int temp = 25;
		
		if(temp>30) {
			System.out.println("It's hot outside");
		}
		else if(temp>=20 && temp<=30) {
			System.out.println("It's warm outside");
		}
		else { 
			System.out.println("It's cold outside");
		} */
	
		/* OR
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("You're playing a game! Press q or Q to quit");
		String response = scanner.next();
		
		if (response.equals("q") || response.equals("Q")) {
			System.out.println("You quit the game");
		}
		
		else {
			System.out.println("You're still playing the game!");
			}*/
		
		/* NOT*/
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("You're playing a game! Press q or Q to quit");
		String response = scanner.next();
		
		if (!response.equals("q") && !response.equals("Q")) {
			System.out.println("You're still playing the game!");
		}
		else {
			System.out.println("You quit the game");
			}
		}
	}	
