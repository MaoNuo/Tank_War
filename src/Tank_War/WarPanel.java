/*
 * the panel for game
 */

package Tank_War;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class WarPanel extends JPanel{
	private static final long serialVersionUID = 1L;

	Player pl = null;
	Enemy ene = null;
	Enemy ene2 = null;
	Enemy ene3 = null;
	Enemy ene4 = null;
	
	public WarPanel() {
		this.setBackground(Color.GRAY);
		pl = new Player(10, 10, this);
		ene = new Enemy(50, 50);
		ene2 = new Enemy(70, 70);
		ene3 = new Enemy(100, 100);
		ene4 = new Enemy(140, 140);
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		pl.drawTank(pl.getX(), pl.getY(), pl.type, pl.getDirect(), g);
		ene.drawTank(ene.getX(), ene.getY(), ene.type, ene.getDirect(), g);
		ene2.drawTank(ene2.getX(), ene2.getY(), ene2.type, ene2.getDirect(), g);
		ene3.drawTank(ene3.getX(), ene3.getY(), ene3.type, ene3.getDirect(), g);
		ene4.drawTank(ene4.getX(), ene4.getY(), ene4.type, ene4.getDirect(), g);
	}
}
