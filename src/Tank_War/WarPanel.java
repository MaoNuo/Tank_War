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
	
	public WarPanel() {
		this.setBackground(Color.GRAY);
		pl = new Player(10, 10, this);
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		pl.drawTank(pl.getX(), pl.getY(), pl.type, pl.getDirect(), g);
	}
}
