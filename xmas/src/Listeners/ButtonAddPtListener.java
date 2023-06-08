package Listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import xmas.AddPtMember;
import xmas.Menu1etc;
import xmas.WindowFrame;

public class ButtonAddPtListener implements ActionListener{
	WindowFrame frame;
	JFrame jf;
	
	public ButtonAddPtListener(WindowFrame frame, JFrame jf) {
		this.frame = frame;
		this.jf = jf;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton bt = (JButton) e.getSource();
		AddPtMember addpt = new AddPtMember(frame);
		frame.setupPanel(addpt);
		jf.dispose();
		
	}
}
