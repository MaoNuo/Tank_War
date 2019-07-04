package Tank_War;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class WarPanel extends JPanel {
	private static final long serialVersionUID = 1L;

	Player pl = null;
	public WarPanel() {
		pl = new Player(10, 10);
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		pl.drawTank(pl.getX(), pl.getY(), true, "top", g);
	}
}
