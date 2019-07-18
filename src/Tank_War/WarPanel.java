/*
 * the panel for game
 */

package Tank_War;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

public class WarPanel extends JPanel implements Runnable{
	private static final long serialVersionUID = 1L;
	private static final int NumberOfEnemy = 10;
	public boolean drawable = true;
	Player pl = null;
	List<Bullets> bullets = new ArrayList<Bullets>();
	List<Enemy> enemyTanks = new ArrayList<Enemy>();
	
	public WarPanel() {
		this.setBackground(Color.GRAY);
		pl = new Player(350, 500, this);
		for(int i = 0 ; i < NumberOfEnemy ; i ++ ) {
			enemyTanks.add(new Enemy(i * 75 + 50 , 20, this));
		}
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		pl.drawTank(pl.getX(), pl.getY(), pl.type, pl.getDirect(), g);
		
		for( int i = 0 ; i < enemyTanks.size() ; i ++ ) {
			Enemy enemy = enemyTanks.get(i);
			enemy.drawTank(enemy.getX(), enemy.getY(), enemy.type, enemy.getDirect(), g);
		}
		
		for( int i = 0 ; i < bullets.size() ; i ++ ) {
			Bullets bullet = bullets.get(i);
			bullet.draw(g);
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while( drawable ) {
			repaint();
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
