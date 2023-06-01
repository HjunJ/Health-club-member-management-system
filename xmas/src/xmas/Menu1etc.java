package xmas;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Menu1etc extends JFrame implements ActionListener{
	JPanel jp2 = new JPanel();
	JLabel jlb1 = new JLabel("Add Member");
	JTextField[] txtf = new JTextField[5];
	String[] strr = {"name","age (20, etc..) ","initial weight (kg)" ,"PT start date (yyyymmdd)","PT end date (yyyymmdd)0"};
	JButton addmem = new JButton("Confirm");
	JButton closing = new JButton("Close");
	
	JPanel insjp1 = new JPanel();
	JPanel jp1bt = new JPanel();
	
	Menu1etc(){
		
		super("Add Member");
		insjp1.setLayout(new GridLayout(7,1,10,30));
		insjp1.add(jlb1);
		for(int i = 0; i<5; i++) {
			txtf[i] = new JTextField(strr[i]);
			insjp1.add(txtf[i]);
		}
		
		jp1bt.add(closing);
		jp1bt.add(addmem);
		
		insjp1.add(jp1bt);
		jp2.add(insjp1);
		Container cp = getContentPane();
		cp.add(jp2);
		jp2.setVisible(true);
		pack();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btmenu1 = (JButton)e.getSource();
		if(btmenu1 == addmem) {
			System.exit(0);
		}
		else System.exit(0);
	}
	
	
}
