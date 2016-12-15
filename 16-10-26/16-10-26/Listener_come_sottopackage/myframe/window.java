package Listener_come_sottopackage.myframe;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class listener implements ActionListener {
	window frame = null;
	public listener(window frame) {
		this.frame = frame;
	}
	public void actionPerformed(ActionEvent e) {
		System.out.println(this.frame.testo.getText());
	}
}

public class window extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField testo = new JTextField(20);
	public window() {
		JFrame principale = new JFrame("Hola");
		Container contenuto = principale.getContentPane();
		principale.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton tasto = new JButton("Cliccami");
		tasto.addActionListener(new listener(this));
		
		JPanel panel = new JPanel();
		panel.add(tasto);
		panel.add(testo);
		
		contenuto.add(panel);
		
		principale.pack();
		principale.setVisible(true);
	}
}
