import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListenner implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		Button btn = (Button) e.getSource();
		System.out.println("un click " + e.getSource());
		System.out.println("un click " + btn.getName());
		
	}

}
