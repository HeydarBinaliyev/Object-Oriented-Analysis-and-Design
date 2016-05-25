package com.aractakip.arackaskoyapimi.UI;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.aractakip.arackaskoyapimi.domain.Register;
import com.aractakip.arackaskoyapimi.domain.Sistem;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {
	private Sistem sistem;
	public Register register;
	
	JButton btnAracsec;
	JButton btnKartGir;
	JButton btnBitir;
	public JButton getBtnAracsec() {
		return btnAracsec;
	}
	public JButton getBtnKartGir() {
		return btnKartGir;
	}
	public JButton getBtnBitir() {
		return btnBitir;
	}
	public JTextField getAracid() {
		return aracid;
	}
	public JTextField getKartInfo() {
		return kart_info;
	}
	public MainFrame() {
		
		sistem=new   Sistem();
		register=sistem.getRegister();
		register.kaskobaslat();
		
		getContentPane().setLayout(null);
		
		JLabel lblAracid = new JLabel("AracID");
		lblAracid.setBounds(38, 31, 46, 14);
		getContentPane().add(lblAracid);
		
		aracid = new JTextField();
		aracid.setBounds(86, 28, 86, 20);
		getContentPane().add(aracid);
		aracid.setColumns(10);
		
		JLabel lblKartInfo = new JLabel("Kart \u0130nfo");
		lblKartInfo.setBounds(38, 84, 46, 14);
		getContentPane().add(lblKartInfo);
		
		kart_info = new JTextField();
		kart_info.setBounds(86, 81, 86, 20);
		getContentPane().add(kart_info);
		kart_info.setColumns(10);
		
		btnAracsec = new JButton("AracSec");
		btnAracsec.addActionListener(new OlayDinleyici(this));
		btnAracsec.setBounds(186, 27, 91, 23);
		getContentPane().add(btnAracsec);
		
		 btnKartGir = new JButton("Kart Gir");
		 btnKartGir.addActionListener(new OlayDinleyici(this));
		btnKartGir.setBounds(186, 80, 91, 23);
		getContentPane().add(btnKartGir);
		
		btnBitir = new JButton("Bitir");
		btnBitir.addActionListener(new OlayDinleyici(this));
		btnBitir.setBounds(86, 132, 91, 23);
		getContentPane().add(btnBitir);
	}

	
	private static final long serialVersionUID = 1L;
	private JTextField aracid;
	private JTextField kart_info;
	
	public static void main(String[] args) {
		new MainFrame().setVisible(true);
	}
}
class OlayDinleyici implements ActionListener{
	private MainFrame mainframe;
	public OlayDinleyici(MainFrame mf) {
		// TODO Auto-generated constructor stub
		mainframe=mf;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==mainframe.getBtnAracsec()){
			mainframe.register.AracSec(Integer.parseInt(mainframe.getAracid().getText()));
		}
		if(e.getSource()==mainframe.getBtnKartGir()){
			mainframe.register.KartBilgisiGir(mainframe.getKartInfo().getText());
		}
		if(e.getSource()==mainframe.getBtnBitir()){
			mainframe.register.kaydet();
			mainframe.setVisible(false);
		}
		
	}

}
