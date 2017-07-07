
public abstract class BeweglichesObjekt {
	
	// Bewegliches Objekt als abstrakte Klasse für Spieler Zombies und Akten
	
	private int x, y;
	
	public void xIncrease() {
		
		x++;
		
	}
	
	public void xDecrease() {
		
		x--;
		
	}
	
	public void yIncrease() {
		
		y++;
		
	}
	
	public void yDecrease() {
		
		y--;
		
	}
	
	public BeweglichesObjekt (int x, int y) {
		
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	

}
