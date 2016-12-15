package Listener_in_JFrame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class index {
	public static void main(String[] args) {
		System.out.println("Listener in JFrame");
		new Window();
	}
}

class Window extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	JTextField testo = new JTextField(20);
	public Window() {
		JFrame principale = new JFrame("Hola");
		Container contenuto = principale.getContentPane();
		principale.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton tasto = new JButton("Cliccami");
		tasto.addActionListener(this);
		
		JPanel panel = new JPanel();
		panel.add(tasto);
		panel.add(testo);
		
		contenuto.add(panel);
		
		principale.pack();
		principale.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(testo.getText());
	}
}
