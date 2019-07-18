package Tank_War;

import java.awt.Color;

public class Enemy extends Tank {
	WarPanel wp = null;
	
	public Enemy(int x, int y, WarPanel wp) {
		super(x, y);
		this.wp = wp;
		this.type = "Enemy";
		this.setDirect(Direct.DOWN);

	}

	@Override
	public Bullets fire() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
