/*
 * the parent class of the player and enemyTank
 */

package Tank_War;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Tank {

	protected static final int rect1Width = 5;
	protected static final int rect1Height = 30;
	protected static final int rect1LocationOfX = 0;
	protected static final int rect1LocationOfY = 0;
	protected static final int rect1_2LocationOfX = 15;
	protected static final int rect1_2LocationOfY = 0;
	protected static final int rect2Width = 10;
	protected static final int rect2Height = 20;
	protected static final int rect2LocationOfX = 5;
	protected static final int rect2LocationOfY = 5;
	protected static final int ovalSize = 10;
	protected static final int ovalLocationOfX = 5;
	protected static final int ovalLocationOfY = 10;
	protected static final int lineLength = 10;
	protected static final int lineLocationOfX = 10;
	protected static final int lineLocationOfY = 15;

	private int x = 0;
	private int y = 0;
	
	protected String type;
	protected int hp;
	protected int speed = 5;
	private String direct = "TOP";
	protected Color color;
	
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
	
	public String getDirect() {
		return direct;
	}

	public void setDirect(String direct) {
		this.direct = direct;
	}
	
	public void drawTank(int x, int y, String type, String direct, Graphics g) {
		g.setColor(color);
		switch(type) {
		
		}
		switch(direct) {
		case "TOP":{
			g.fill3DRect(x + rect1LocationOfX, y + rect1LocationOfY, rect1Width, rect1Height, false);
			g.fill3DRect(x + rect1_2LocationOfX, y + rect1_2LocationOfY, rect1Width, rect1Height, false);
			g.fill3DRect(x + rect2LocationOfX, y + rect2LocationOfY, rect2Width, rect2Height, false);
			g.fillOval(x + ovalLocationOfX, y + ovalLocationOfY, ovalSize, ovalSize);
			g.drawLine(x + lineLocationOfX, y + lineLocationOfY, x + lineLength, y);
			break;
		}
		case "BOTTOM":{
			g.fill3DRect(x + rect1LocationOfX, y + rect1LocationOfY, rect1Width, rect1Height, false);
			g.fill3DRect(x + rect1_2LocationOfX, y + rect1_2LocationOfY, rect1Width, rect1Height, false);
			g.fill3DRect(x + rect2LocationOfX, y + rect2LocationOfY, rect2Width, rect2Height, false);
			g.fillOval(x + ovalLocationOfX, y + ovalLocationOfY, ovalSize, ovalSize);
			g.drawLine(x + lineLocationOfX, y + lineLocationOfY, x + lineLength, y + 2 * lineLocationOfY);
			break;
		}
		case "LEFT":{
			g.fill3DRect(x + rect1LocationOfX, y + rect1LocationOfY, rect1Height, rect1Width, false);
			g.fill3DRect(x + rect1_2LocationOfY, y + rect1_2LocationOfX, rect1Height, rect1Width, false);
			g.fill3DRect(x + rect2LocationOfY, y + rect2LocationOfX, rect2Height, rect2Width, false);
			g.fillOval(x + ovalLocationOfY, y + ovalLocationOfX, ovalSize, ovalSize);
			g.drawLine(x + lineLocationOfY, y + lineLocationOfX, x , y + lineLength);
			break;
		}
		case "RIGHT":{
			g.fill3DRect(x + rect1LocationOfX, y + rect1LocationOfY, rect1Height, rect1Width, false);
			g.fill3DRect(x + rect1_2LocationOfY, y + rect1_2LocationOfX, rect1Height, rect1Width, false);
			g.fill3DRect(x + rect2LocationOfY, y + rect2LocationOfX, rect2Height, rect2Width, false);
			g.fillOval(x + ovalLocationOfY, y + ovalLocationOfX, ovalSize, ovalSize);
			g.drawLine(x + lineLocationOfY, y + lineLocationOfX, x + 2 * lineLocationOfY, y + lineLength);
			break;
		}
		default: break;
		}

	}
}
