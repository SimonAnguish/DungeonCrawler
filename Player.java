import java.util.Random;

public class Player implements Enemy {
	int health;
	int fullHealth;
	
	Player() {
		Random rand = new Random();
		this.health = rand.nextInt(maxHealth - minHealth + 1) + minHealth;
		this.fullHealth = this.health;
	}

	public void displayHealth() {
		System.out.printf("Health:\t%d\n", health);
	}
	
	public void displayHealthAsBar() {
		String barString = "[";
		for (int i=0;i<health;i++) {
			barString += "#";
		}
		
		barString += "|";
		
		for (int i=health;i<fullHealth;i++) {
			barString += ".";
		}
		
		barString += "]\n";
		System.out.printf(barString);
	}
	
	public void decreaseHealth(int h) {
		this.health -= h;
	}
	
	public void increaseHealth(int h) {
		this.health += h;
	}
	
	public boolean isDead() {
		if (this.health <= 0) return true;
		return false;
	}
	
	public String getType() {
		return "Player";
	}
}