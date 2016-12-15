package Listener_classe_esterna;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class listener implements ActionListener {
	Window frame = null;
	public listener(Window frame) {
		this.frame = frame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(this.frame.testo.getText());
	}
}
