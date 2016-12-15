package Listener_classe_esterna;

import java.awt.*;
import javax.swing.*;

public class index {
	public static void main(String[] args) {
		System.out.println("Listener come classe esterna");
		new Window();
	}
}

class Window extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField testo = new JTextField(20);
	public Window() {
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
