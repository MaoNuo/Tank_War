package Tank_War;

import java.awt.Color;

public class Enemy extends Tank {
	
	public Enemy(int x, int y) {
		super(x, y);
		this.type = "Enemy";
		this.color = Color.YELLOW;
	}
}
