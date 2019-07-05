package Tank_War;

import java.awt.Color;

public class Enemy extends Tank {
	WarPanel wp = null;
	
	public Enemy(int x, int y, WarPanel wp) {
		super(x, y);
		this.wp = wp;
		this.type = "Enemy";
		this.color = Color.YELLOW;
	}
	
}
