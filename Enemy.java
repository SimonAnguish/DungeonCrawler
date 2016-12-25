public interface Enemy {
	int maxHealth = 15;
	int minHealth = 10;
	
	void displayHealth();
	void displayHealthAsBar();
	
	void decreaseHealth(int h);
	void increaseHealth(int h);
	
	boolean isDead();
	
	String getType();
}