import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class MyFrame  extends Frame{
	Button btn1;
	Button btn2;
	public MyFrame() {
		super();
		init();
		}
	
	
	
	

	public void init() {
		this.setTitle("this is my first frame in java");
		//this.setSize(WIDTH, HEIGHT);
		this.setExtendedState(MAXIMIZED_BOTH);
		Panel panel = new Panel();
		
		this.add(panel);
		 btn1 = new Button("click me");
		 btn2 = new Button("click me");
		//btn.setBounds(200, 60,200,60);
		MyActionListenner ls = new MyActionListenner();
		btn1.addActionListener(ls);
		panel.add(btn1);
		
		btn2.addActionListener(ls);
		panel.add(btn2);
		//this.setLayout(null);

		//this.setVisible(true);
	}
	
	
	public void addWindowListener(WindowEvent e) {
		System.exit(0);
	}
	
	// for close the window
	public void closeWindow() {
			this.addWindowListener( new WindowAdapter() {
				@Override
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			});
	}
	
	

}
