package Listeners;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import xmas.AddFreeMember;
import xmas.Menu1etc;
import xmas.Menu4etc;
import xmas.WindowFrame;


public class ButtonAddFreeListener implements ActionListener{
	
	WindowFrame frame;
	JFrame jf;
	
	public ButtonAddFreeListener(WindowFrame frame, JFrame jf) {
		this.frame = frame;
		this.jf = jf;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton bt = (JButton) e.getSource();
		AddFreeMember addfr = new AddFreeMember(frame);
		frame.setupPanel(addfr);
		
		jf.dispose();
		
	}

}
