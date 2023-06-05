package xmas;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;


import javax.swing.*;

public class Menu1etc extends JFrame{
	public Menu1etc() {
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
		panel.add(new JButton("Cancel"));
		panel.add(new JButton("Save"));
		
		
		SpringUtilities.makeCompactGrid(panel, 6,2,6,6,6,6);
		
		this.setSize(500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(panel);
		this.setVisible(true);
		
		
	}
	
	/*PtMember realPTM = new PtMember();

	JPanel jp2 = new JPanel();
	JLabel jlb1 = new JLabel("Add Member");
	JTextField[] txtf = new JTextField[5];
	String[] strr = {"name","20","65" ,"20000000","20000000"};
	JButton addmem = new JButton("Confirm");
	JButton closing = new JButton("Close");
	
	JPanel insjp1 = new JPanel();
	JPanel jp1bt = new JPanel();
	
	Menu1etc(){
		
		super("Add Member");

		realPTM = null;
		addmem.addActionListener(this);
		closing.addActionListener(this);
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
	PtMember getPtMember() {
		PtMember PTM = new PtMember();
		PTM.name = txtf[0].getText();
		PTM.age = Integer.parseInt(txtf[1].getText());
		PTM.weight = Double.parseDouble(txtf[2].getText());
		PTM.PTstartdate = Integer.parseInt(txtf[3].getText());
		PTM.PTenddate = Integer.parseInt(txtf[4].getText());
		
		return PTM;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btmenu1 = (JButton)e.getSource();
		if(btmenu1 == addmem) {
			realPTM = getPtMember();
			realPTM.printInfo();
		}
		else dispose();
	}
	*/
	
	
}
