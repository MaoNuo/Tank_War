package Tank_War;

import java.awt.Color;
import java.awt.Graphics;

public class Player extends Tank{
	public Player(int x, int y) {
		super(x, y);
	}
	
	public void drawTank(int x, int y, boolean type, String direct, Graphics g) {		
		g.setColor(Color.CYAN);
		g.fill3DRect(x, y, 5, 30, false);
		g.fill3DRect(x + 15, y, 5, 30, false);
		g.fill3DRect(x + 5, y +5, 10, 20, false);
		g.fillOval(x + 4, y + 10, 10, 10);
		g.drawLine(x + 10, y + 15, x + 10, y);
	}
}
