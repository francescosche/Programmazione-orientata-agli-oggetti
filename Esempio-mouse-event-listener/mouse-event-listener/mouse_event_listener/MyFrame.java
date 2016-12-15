package mouse_event_listener;

import java.awt.event.*;
import javax.swing.*;

class MouseSpy implements MouseListener {
	public void mouseClicked(MouseEvent e) {}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
}

public class MyFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	public MyFrame() {
        super("MouseTest");
        this.addMouseListener(new MouseSpy());
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new MyFrame();
    }
}

