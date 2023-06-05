package xmas;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.event.*;
import java.awt.*;
public class Menu4etc extends JFrame{
	public Menu4etc() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Name");
		model.addColumn("Age");
		model.addColumn("Weight");
		model.addColumn("PT start");
		model.addColumn("PT end");
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		
		this.add(sp);
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setVisible(true);
	}
	
}
