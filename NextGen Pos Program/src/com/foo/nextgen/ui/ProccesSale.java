package com.foo.nextgen.ui;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.foo.nextgen.domain.*;
import javax.swing.JScrollPane;
public class ProccesSale extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField itemID;
	private JTextField textField;
	private JTextField textField_1;
	public ProccesSale() {
		Store store=new Store();
		final Register register=store.getRegister();
		register.makeNewSale();
		getContentPane().setLayout(null);
		this.setBounds(0, 0, 500, 400);
		JLabel lblNewLabel = new JLabel("Item ID");
		lblNewLabel.setBounds(37, 36, 46, 14);
		getContentPane().add(lblNewLabel);
		
		itemID = new JTextField();
		itemID.setBounds(82, 33, 86, 20);
		getContentPane().add(itemID);
		itemID.setColumns(10);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setBounds(34, 83, 60, 14);
		getContentPane().add(lblQuantity);
		
		textField = new JTextField();
		textField.setBounds(82, 80, 46, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(176, 33, 148, 46);
		getContentPane().add(scrollPane);
		
		final JTextPane textPane = new JTextPane();
		scrollPane.setViewportView(textPane);
		
		JButton btnEnterItem = new JButton("Enter Item");
		btnEnterItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int itemid=Integer.parseInt(itemID.getText().toString());
				int quantity=Integer.parseInt(textField.getText().toString());
				register.enterItem(itemid, quantity);
				Integer money=register.currentSale.getTotal().money;
				textPane.setText("SubTotal:"+money.toString());
				
			}
		});
		btnEnterItem.setBounds(34, 137, 110, 23);
		getContentPane().add(btnEnterItem);
		
		JButton btnAndSoOn = new JButton("And so on");
		btnAndSoOn.setBounds(165, 137, 91, 23);
		getContentPane().add(btnAndSoOn);
		
		JLabel lblCash = new JLabel("Cash");
		lblCash.setBounds(176, 86, 51, 14);
		getContentPane().add(lblCash);
		
		textField_1 = new JTextField();
		textField_1.setBounds(210, 83, 46, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		btnAndSoOn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int cash=Integer.parseInt(textField_1.getText().toString());
				Money m=new Money(cash);
				register.makePayment(m);
				Integer money=register.currentSale.getBalance().money;
				textPane.setText("-----------------------/n");
				textPane.setText("Balance:"+money.toString());
			}
		});
		
		
	}
	public static void main(String[] args) {
		new ProccesSale().setVisible(true);
	}
}
