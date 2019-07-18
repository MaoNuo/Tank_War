/*
 * player
 * listening the key action and move the tank
 */
package Tank_War;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Player extends Tank implements KeyListener{
	
	private WarPanel wp = null;
	
	public Player(int x, int y, WarPanel wp) {
		super(x, y);
		this.type = "Player";
		this.wp = wp;
		this.dir = Direct.UP;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() == KeyEvent.VK_DOWN){
			this.setDirect(Direct.DOWN);
			this.move(getDirect());
		}else if(e.getKeyCode() == KeyEvent.VK_UP) {
			this.setDirect(Direct.UP);	
			this.move(getDirect());
		}else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			this.setDirect(Direct.RIGHT);	
			this.move(getDirect());
		}else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			this.setDirect(Direct.LEFT);
			this.move(getDirect());
		}else if(e.getKeyCode() == KeyEvent.VK_SPACE) {
			this.fire();
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

	@Override
	public Bullets fire() {
		// TODO Auto-generated method stub
		int bulletx = this.x + Tank.width / 2 - Bullets.width / 2; 
		int bullety = this.y + Tank.length / 2 - Bullets.length / 2;
		Bullets bullet = new Bullets(bulletx, bullety, this.getDirect(), this.wp);
		this.wp.bullets.add(bullet);
		return bullet;
	}
}
