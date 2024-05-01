import java.util.Random;

public class DiceRoller {
	
	Random random;
	int number = 0;
	
	DiceRoller(){
		Random = new Random();
		roll();
	}

	void roll() {
		number = random.nextInt(6)+1;
		System.out.println(number);
	}
}
