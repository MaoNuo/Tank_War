package Tank_War;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;

public class MainFrame extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private final static int WIDTH = 1000;
	private final static int HEIGHT = 600;
	private final static String TITLE = "Tank";
	
	private MenuBar menuBar = null;
	private WarPanel warPanel = null;
	private Stage stage = null;
	
	public MainFrame(String title) {
		super(title);
		
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		
		this.menuBar = new MenuBar();
		contentPane.add(menuBar, BorderLayout.NORTH);
		
		this.warPanel = new WarPanel();
		contentPane.add(warPanel, BorderLayout.CENTER);
		
		this.stage = new Stage(warPanel);
		this.addKeyListener(warPanel.pl);
		
		this.setSize(WIDTH, HEIGHT);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new MainFrame(TITLE);
	}
}
