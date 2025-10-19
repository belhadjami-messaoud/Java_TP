import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TestAwt {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		MyFrame myFrame =new MyFrame();
		myFrame.init();
		myFrame.show();
		
		myFrame.closeWindow();
		
		/*
		myFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});		*/
		
		
		
		/*
		Frame frame = new Frame("this is my first frame in java");
		Button button = new Button("click me");
		frame.add(button);
		button.setBackground(new Color(255,220,25));
		button.setBounds(10, 100, 100, 50);
		button.setSize(200,50);
		frame.setSize(2000, 600);
		
		frame.setLayout(null);
		frame.show();
		
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		 */
	}

}
