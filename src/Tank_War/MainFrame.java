package Tank_War;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;

public class MainFrame extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private final static int WIDTH = 1000;
	private final static int HEIGHT = 600;
	private final static String TITLE = "Tank";
	
	private MenuBar menuBar;
	private WarPanel warPanel;
	
	public MainFrame(String title) {
		super(title);
		
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		
		this.menuBar = new MenuBar();
		contentPane.add(menuBar, BorderLayout.NORTH);
		
		this.warPanel = new WarPanel();
		contentPane.add(warPanel, BorderLayout.CENTER);
	}
	
	public static void main(String[] args) {
		MainFrame mf = new MainFrame(TITLE);
		mf.setSize(WIDTH, HEIGHT);
		mf.setDefaultCloseOperation(EXIT_ON_CLOSE);
		mf.setLocationRelativeTo(null);
		mf.setVisible(true);
	}
}
