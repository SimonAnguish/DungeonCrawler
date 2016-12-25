import java.util.Scanner;

class DungeonCrawler {
	public static void main(String[] args) {
		run();
	}
	
	public static void run() {
		Enemy b = new Bandit();
		CombatInterface ci = new CombatInterface(b);
		
		while (!b.isDead()) {
			b.displayHealthAsBar();
			ci.getNextMove();
			ci.getNextMove("heal");
		}
		
		System.out.printf("The %s has been killed", b.getType());
	}
}