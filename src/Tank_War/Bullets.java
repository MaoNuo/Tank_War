package Tank_War;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;

public class Bullets {

	public static final int width = 10;
	public static final int length = 10;
	
	public WarPanel wp = null;
	public int speed = 10;
	public boolean alive = false;
	public static Toolkit tk = Toolkit.getDefaultToolkit();
	public static Image[] bulletImages = null;
	public Direct dir = null;
	
	static {
		bulletImages = new Image[] {
				tk.getImage(Bullets.class.getClassLoader().getResource(
						"images/bulletL.gif")),

				tk.getImage(Bullets.class.getClassLoader().getResource(
						"images/bulletU.gif")),

				tk.getImage(Bullets.class.getClassLoader().getResource(
						"images/bulletR.gif")),

				tk.getImage(Bullets.class.getClassLoader().getResource(
						"images/bulletD.gif")),

		};
	}
	
	private int x , y;	
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

	public Bullets (int x, int y, Direct dir, WarPanel wp) {
		this.x = x;
		this.y = y;
		this.dir = dir;
		this.wp = wp;
		this.alive = true;
	}
	
	public void move() {
		switch(dir) {
		case DOWN:{
			y += speed;
			break;
		}
		case UP:{
			y -= speed;
			break;
		}
		case LEFT:{
			x -= speed;
			break;
		}
		case RIGHT:{
			x += speed;
			break;
		}
		default:{
			break;
		}
		
		}
		frameOut();
		if( !alive ) {
			this.dead();
		}
	}
	
	public void draw(Graphics g) {	
		switch(dir) {
		case LEFT:{
			g.drawImage(bulletImages[0], x, y, null);
			break;
		}
		case UP:{
			g.drawImage(bulletImages[1], x, y, null);
			break;
		}
		case RIGHT:{
			g.drawImage(bulletImages[2], x, y, null);
			break;
		}
		case DOWN:{
			g.drawImage(bulletImages[3], x, y, null);
			break;
		}
		case STOP:
			break;
		default:
			break;
		}
		
		move();
	}
	
	public void dead() {
		this.wp.bullets.remove(this);
	}
	
	public void frameOut() {
		if( y >= MainFrame.HEIGHT || x >= MainFrame.WIDTH || x * y <= 0 )
		this.alive = false;
		
	}
	
	public Rectangle getRect() {
		return new Rectangle(x , y , width , length);
	}
	
	public void hitTanks() {
		
	}
}
