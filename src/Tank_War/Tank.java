/*
 * the parent class of the player and enemyTank
 */

package Tank_War;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public abstract class Tank {

	public static final int width = 35, length = 35;
	public static final int menubarLength = 45;
	private Toolkit tk = Toolkit.getDefaultToolkit();
	private Image[] tankImages = null;
	
	protected int x = 0;
	protected int y = 0;
	
	public String type = null;
	public boolean alive = true;
	public int speed = 5;
	public Direct dir = null;
	
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
	
	public Direct getDirect() {
		return dir;
	}

	public void setDirect(Direct dir) {
		this.dir = dir;
	}
	
	public void drawTank(int x, int y, String type, Direct direct, Graphics g) {
		switch(type) {
		case "Player":{
			tankImages = new Image[] {
					tk.getImage(Tank.class.getClassLoader().getResource("Images/tankD.gif")),
					tk.getImage(Tank.class.getClassLoader().getResource("Images/tankU.gif")),
					tk.getImage(Tank.class.getClassLoader().getResource("Images/tankL.gif")),
					tk.getImage(Tank.class.getClassLoader().getResource("Images/tankR.gif"))			
			};
			break;
		}
		case "Enemy":{
			tankImages = new Image[] {
					tk.getImage(Tank.class.getClassLoader().getResource("Images/HtankD.gif")), 
					tk.getImage(Tank.class.getClassLoader().getResource("Images/HtankU.gif")), 
					tk.getImage(Tank.class.getClassLoader().getResource("Images/HtankL.gif")),
					tk.getImage(Tank.class.getClassLoader().getResource("Images/HtankR.gif"))		
			};
			break;
		}
		
		}
		switch(direct) {
		case DOWN:{
			g.drawImage(tankImages[0], x, y, null);
			break;
		}
		case UP:{
			g.drawImage(tankImages[1], x, y, null);
			break;
		}
		case LEFT:{
			g.drawImage(tankImages[2], x, y, null);
			break;
		}
		case RIGHT:{
			g.drawImage(tankImages[3], x, y, null);
			break;
		}
		default: break;
		}

	}
	
	public void move(Direct dir) {
		switch(dir) {
		case DOWN:{
			if( ( y + speed + Tank.length + menubarLength) <= MainFrame.HEIGHT ) {
				y += speed;
			}else {
				y = MainFrame.HEIGHT - Tank.length - menubarLength;
			}
			break;
		}
		case UP:{
			if( (y - speed) >= 0 ) {
				y -= speed;
			}else {
				y = 0;
			}
			break;
		}
		case LEFT:{
			if( (x - speed) >= 0 ) {
				x -= speed;
			}else {
				x = 0;
			}
			break;
		}
		case RIGHT:{
			if( (x + speed + Tank.width) <= MainFrame.WIDTH ) {
				x += speed;
			}else {
				x = MainFrame.WIDTH - Tank.width;
			}
			break;
		}
		case STOP:{
			break;
		}
		
		}
	}
	
	public abstract Bullets fire();
}
