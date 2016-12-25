import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class CombatInterface {
	Scanner keyboard;
	ArrayList<String> keywords = new ArrayList<String>();
	Enemy enemy;
	
	CombatInterface(Enemy e) {
		this.keyboard = new Scanner(System.in);
		createDefaultKeywords();
		this.enemy = e;
	}
	
	public void getNextMove() {
		String command = this.keyboard.next();
		if (!keywords.contains(command)) {
			System.out.printf("Not a valid command\n");
		} else {
			int num = generateNumber();
			switch (command) {
				case("attack"): enemy.decreaseHealth(num);
					System.out.printf("You hit the %s for %d\n", enemy.getType(), num);
					break;
				case("heal"): enemy.increaseHealth(num);
					System.out.printf("You heal the %s for %d\n", enemy.getType(), num);
					break;
			}
		}
	}
	
	public void getNextMove(String command) {
		int num = generateNumber();
		switch (command) {
			case("attack"): enemy.decreaseHealth(num);
				System.out.printf("You hit the %s for %d\n", enemy.getType(), num);
				break;
			case("heal"): enemy.increaseHealth(num);
				System.out.printf("You heal the %s for %d\n", enemy.getType(), num);
				break;
		}
	}
	
	public int generateNumber() {
		Random rand = new Random();
		return rand.nextInt(10) + 1;
	}
	
	private void createDefaultKeywords() {
		keywords.add("attack");
		keywords.add("heal");
	}
}