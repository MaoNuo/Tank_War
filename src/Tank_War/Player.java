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
		this.wp = wp;
		this.dir = Direct.UP;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() == KeyEvent.VK_DOWN){
			this.setDirect(Direct.DOWN);
		}else if(e.getKeyCode() == KeyEvent.VK_UP) {
			this.setDirect(Direct.UP);	
		}else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			this.setDirect(Direct.RIGHT);	
		}else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			this.setDirect(Direct.LEFT);
		}
		this.move(getDirect());
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
