package Listeners;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import xmas.Menu4etc;
import xmas.WindowFrame;


public class ButtonViewListener implements ActionListener{
	
	WindowFrame frame;
	
	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton bt = (JButton) e.getSource();
		Menu4etc menu44 = frame.getMenu4();
		frame.setupPanel(menu44);
	}

}
