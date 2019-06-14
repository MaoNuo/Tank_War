package Tank_War;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuBar extends JMenuBar {
		
	private static final long serialVersionUID = 1L;
	
	public MenuBar() {
		super();
		
		JMenu NewGame = new JMenu("New");
		this.add(NewGame);
		JMenuItem New = new JMenuItem("New Game"); 
		NewGame.add(New);
	}
}
