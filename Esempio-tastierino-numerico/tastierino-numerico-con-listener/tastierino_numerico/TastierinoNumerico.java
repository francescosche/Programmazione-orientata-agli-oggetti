package tastierino_numerico;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TastierinoNumerico {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Tastierino numerico");
		Container content = frame.getContentPane();
		JPanel tastiera = new JPanel();
		tastiera.setLayout(new GridLayout(3,3));
		for(int i=1; i<10; i++) {
			JButton tasto = new JButton(""+i+"");
			tasto.addActionListener(new TastierinoListener());
			tastiera.add(tasto);
		}
		content.add(tastiera);
		frame.setSize(200, 200);
		frame.setVisible(true);
	}
}

class TastierinoListener implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		System.out.println("Hai premuto il tasto " + b.getText());
	}
}