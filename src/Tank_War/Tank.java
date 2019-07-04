package Tank_War;

import java.awt.Graphics;

public abstract class Tank {

	private int x = 0;
	private int y = 0;
	
	private String type;
	private int hp;
	private int speed;
	private int color;
	
	public Tank (int x, int y) {
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
	
	public void drawTank(int x, int y, boolean type, String direct, Graphics g) {
		
	}
}
