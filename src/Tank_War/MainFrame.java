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
		
		this.addKeyListener(warPanel.pl);
		
		this.setSize(WIDTH, HEIGHT);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		System.out.println(this.getWidth());
		System.out.println(this.getHeight());
		System.out.println(contentPane.getWidth());
		System.out.println(contentPane.getHeight());
		System.out.println(this.warPanel.getHeight());
		System.out.println(this.warPanel.getWidth());
		System.out.println(this.warPanel.getHeight());
	}
	
	public static void main(String[] args) {
		new MainFrame(TITLE);
	}
}
