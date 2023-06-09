package xmas;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;


import javax.swing.*;

public class Menu1etc extends JPanel implements ActionListener{
	
	WindowFrame frame;
	
	JButton cancel = new JButton("Cancel");
	JButton save = new JButton("Save");

	public Menu1etc(WindowFrame frame) {
		
		this.frame=frame;
		
		cancel.addActionListener(this);
		save.addActionListener(this);
		
		JPanel panel = new JPanel();
		JPanel pn2 = new JPanel();
		
		panel.setLayout(new SpringLayout());
		
		JLabel labelname = new JLabel("ID: ", JLabel.TRAILING);
		JTextField fieldname = new JTextField(10);	
		labelname.setLabelFor(fieldname);
		panel.add(labelname);
		panel.add(fieldname);
		
		JLabel labelage = new JLabel("AGE: ", JLabel.TRAILING);
		JTextField fieldage = new JTextField(10);	
		labelage.setLabelFor(fieldage);
		panel.add(labelage);
		panel.add(fieldage);
		
		JLabel labelstart = new JLabel("PT start date: ", JLabel.TRAILING);
		JTextField fieldstart = new JTextField(10);	
		labelstart.setLabelFor(fieldstart);
		panel.add(labelstart);
		panel.add(fieldstart);
		
		JLabel labelend = new JLabel("PT end date: ", JLabel.TRAILING);
		JTextField fieldend = new JTextField(10);	
		labelend.setLabelFor(fieldend);
		panel.add(labelend);
		panel.add(fieldend);
		
		JLabel labelweight = new JLabel("WEIGHT: ", JLabel.TRAILING);
		JTextField fieldweight = new JTextField(10);	
		labelweight.setLabelFor(fieldweight);
		panel.add(labelweight);
		panel.add(fieldweight);
		panel.add(cancel);
		panel.add(save);
		
		
		SpringUtilities.makeCompactGrid(panel, 6,2,6,6,6,6);
		


		this.add(panel);
		this.setVisible(true);
		
	}

	public void actionPerformed(ActionEvent e) {
		JButton bt = (JButton)e.getSource();
		if(bt == save) {
			System.exit(0);
		}
		else System.exit(0);
	}
	
	
	
}
