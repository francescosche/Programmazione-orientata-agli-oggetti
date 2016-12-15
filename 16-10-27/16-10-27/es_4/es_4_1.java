package es_4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class es_4_1 {
    private static JPasswordField textarea_invisibile = new JPasswordField();
    private static JTextArea textarea_visibile = new JTextArea();
	public static void main(String[] args) {
		
		// FINESTRA PRINCIPALE
	    JFrame frame = new JFrame("Pannello digitale");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    // CONTENITORE PRINCIPALE
	    Container contenuto = frame.getContentPane();
	    contenuto.setLayout(new FlowLayout());
	    
	    // PANNELLO DI SINISTRA
	    JPanel sinistra = new JPanel();
	    contenuto.add(sinistra, sinistra);
	    sinistra.setLayout(new BorderLayout());
	    
	    // CAMPO PASSWORD
	    textarea_invisibile.setEditable(false);
	    textarea_invisibile.setBorder(BorderFactory.createLineBorder(Color.lightGray));
	    sinistra.add(textarea_invisibile, BorderLayout.NORTH);
	    
	    // TASTIERA
	    JPanel tastiera = new JPanel();
	    tastiera.setLayout(new GridLayout(4,3));
	    String[] tasti = {"7","8","9","4","5","6","1","2","3","C","0","Mostra"};
	    for(int i=0; i<tasti.length; i++) {
	    	JButton tasto = new JButton(tasti[i]);
	    	tasto.addActionListener(new ModificaTesto());
		    tastiera.add(tasto);
	    }
	    sinistra.add(tastiera, BorderLayout.CENTER);
	    
	    // PANNELLO DESTRA
	    JPanel destra = new JPanel();
	    contenuto.add(destra, destra);
	    destra.setLayout(new BorderLayout());
	    
	    // TESTO DESTRA
	    destra.add(new JLabel("Codice digitato:"), BorderLayout.NORTH);
	    
	    // TEXTAREA VISIBILE
	    textarea_visibile.setEditable(false);
	    textarea_visibile.setBorder(BorderFactory.createLineBorder(Color.lightGray));
	    destra.add(textarea_visibile, BorderLayout.SOUTH);

	    frame.pack();
		frame.setLocationRelativeTo(null);
	    frame.setVisible(true);
	}

	static class ModificaTesto implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton button = (JButton) e.getSource();
			String tasto = button.getText();
			switch(tasto) {
				case "C":
					textarea_invisibile.setText("");
					textarea_visibile.setText("");
					break;
				case "Mostra":
					textarea_visibile.setText(String.valueOf(textarea_invisibile.getPassword()));
					break;
				default:
					textarea_invisibile.setText(String.valueOf(textarea_invisibile.getPassword())+tasto);
					textarea_visibile.setText("");
					break;
			}
		}
	}
}