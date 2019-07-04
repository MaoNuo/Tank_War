/*
 * player
 * listening the key action and move the tank
 */
package Tank_War;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Player extends Tank implements KeyListener{
	
	private WarPanel wp = null;
	
	public Player(int x, int y, WarPanel wp) {
		super(x, y);
		this.type = "Player";
		this.color = Color.CYAN;
		this.wp = wp;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() == KeyEvent.VK_DOWN){
			this.setDirect("BOTTOM");
			if(this.wp.getHeight() >= this.getY() + Tank.rect1Height + speed) {
				this.setY(this.getY() + speed);
			}else {
				this.setY(this.wp.getHeight() - Tank.rect1Height);
			}			
		}else if(e.getKeyCode() == KeyEvent.VK_UP) {
			this.setDirect("TOP");
			if(this.getY() - speed  >= 0) {
				this.setY(this.getY() - speed);
			}else {
				this.setY(0);
			}	
		}else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			this.setDirect("RIGHT");
			if(this.wp.getWidth() >= this.getX() + Tank.rect1Height + speed) {
				this.setX(this.getX() + speed);
			}else {
				this.setX(this.wp.getWidth() - Tank.rect1Height);
			}	
		}else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			this.setDirect("LEFT");
			if(this.getX() - speed  >= 0) {
				this.setX(this.getX() - speed);
			}else {
				this.setX(0);
			}	
		}
		wp.repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
