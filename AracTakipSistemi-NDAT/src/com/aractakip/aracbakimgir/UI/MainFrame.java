package com.aractakip.aracbakimgir.UI;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.aractakip.aracbakimgir.domain.Register;
import com.aractakip.aracbakimgir.domain.Sistem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MainFrame extends JFrame{
	private Sistem sistem;
	public Register register;
	public MainFrame() {
		
		sistem=new Sistem();
		register=sistem.getRegister();
		register.bakimgirmebaslat();
		
		
		getContentPane().setLayout(null);
		
		JLabel lblAracid = new JLabel("aracID");
		lblAracid.setBounds(41, 24, 46, 14);
		getContentPane().add(lblAracid);
		
		aracid = new JTextField();
		aracid.setBounds(103, 21, 86, 20);
		getContentPane().add(aracid);
		aracid.setColumns(10);
		
		JLabel lblBakimSebebi = new JLabel("bakim sebebi");
		lblBakimSebebi.setBounds(10, 64, 77, 14);
		getContentPane().add(lblBakimSebebi);
		
		sebeb = new JTextField();
		sebeb.setBounds(103, 61, 86, 20);
		getContentPane().add(sebeb);
		sebeb.setColumns(10);
		
		JLabel lblMasraf = new JLabel("masraf");
		lblMasraf.setBounds(41, 122, 46, 14);
		getContentPane().add(lblMasraf);
		
		masraf = new JTextField();
		masraf.setBounds(103, 119, 86, 20);
		getContentPane().add(masraf);
		masraf.setColumns(10);
		
		btnBakimgir = new JButton("bakimgir");
		btnBakimgir.setBounds(98, 150, 91, 23);
		getContentPane().add(btnBakimgir);
		
		btnBitir = new JButton("bitir");
		btnBitir.setBounds(98, 184, 91, 23);
		getContentPane().add(btnBitir);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JTextField aracid;
	 JTextField sebeb;
	JTextField masraf;
	JButton btnBakimgir;
	JButton btnBitir;
	
}

class OlayDinleyici implements ActionListener{
	MainFrame mainframe;
	public OlayDinleyici(MainFrame mainframe) {
		// TODO Auto-generated constructor stub
		this.mainframe=mainframe;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==mainframe.btnBakimgir){
			mainframe.register.bakimgir(Integer.parseInt(mainframe.aracid.getText()),mainframe.sebeb.getText(),Integer.parseInt(mainframe.masraf.getText()));
		}
		if(e.getSource()==mainframe.btnBitir){
			mainframe.register.kaydet();
		}
	}
	
}