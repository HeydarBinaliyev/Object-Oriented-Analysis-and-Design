package com.aractakip.arackiralama.UI;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.aractakip.arackiralama.domain.Register;
import com.aractakip.arackiralama.domain.Sistem;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JTextField baslangic_tarihi;
	private JTextField bitis_tarihi;
	private JTextField aracID;
	private JTextField gunsayisi;
	private JTextField kart_info;
	
	private JButton btnTarihGir;
	private JButton btnAraSec;
	private JButton btnGnSayisiGir;
	private JButton btnKartGir;
	private JButton btnBitir;
	
	public JButton getBtnBitir() {
		return btnBitir;
	}

	private Sistem sistem;
	private Register register;
	
	public Sistem getSistem() {
		return sistem;
	}

	public void setSistem(Sistem sistem) {
		this.sistem = sistem;
	}

	public Register getRegister() {
		return register;
	}

	public void setRegister(Register register) {
		this.register = register;
	}

	public JTextField getAracID() {
		return aracID;
	}

	public JTextField getKart_info() {
		return kart_info;
	}

	public MainFrame(){
		
		sistem=new Sistem();
		register=sistem.getRegister();
		register.AracKiralamaBaslat();
		
		getContentPane().setLayout(null);
		setBounds(0, 0, 400, 400);
		
		JLabel lblBaslangiTarihi = new JLabel("Baslangi\u00E7 Tarihi");
		lblBaslangiTarihi.setBounds(0, 11, 83, 14);
		getContentPane().add(lblBaslangiTarihi);
		
		baslangic_tarihi = new JTextField();
		baslangic_tarihi.setBounds(80, 8, 86, 20);
		getContentPane().add(baslangic_tarihi);
		baslangic_tarihi.setColumns(10);
		
		JLabel lblBitiTarihi = new JLabel("Biti\u015F Tarihi");
		lblBitiTarihi.setBounds(24, 36, 71, 14);
		getContentPane().add(lblBitiTarihi);
		
		bitis_tarihi = new JTextField();
		bitis_tarihi.setBounds(80, 36, 86, 20);
		getContentPane().add(bitis_tarihi);
		bitis_tarihi.setColumns(10);
		
		btnTarihGir = new JButton("Tarih Gir");
		btnTarihGir.addActionListener(new OlayDinleyicisi(this));
		btnTarihGir.setBounds(32, 67, 99, 23);
		getContentPane().add(btnTarihGir);
		
		JLabel lblAracId = new JLabel("Arac ID");
		lblAracId.setBounds(24, 111, 46, 14);
		getContentPane().add(lblAracId);
		
		aracID = new JTextField();
		aracID.setBounds(80, 108, 86, 20);
		getContentPane().add(aracID);
		aracID.setColumns(10);
		
		btnAraSec = new JButton("Ara\u00E7 Se\u00E7");
		btnAraSec.addActionListener(new OlayDinleyicisi(this));
		btnAraSec.setBounds(34, 136, 97, 23);
		getContentPane().add(btnAraSec);
		
		JLabel lblGnSayisi = new JLabel("G\u00FCn Sayisi");
		lblGnSayisi.setBounds(24, 182, 71, 14);
		getContentPane().add(lblGnSayisi);
		
		gunsayisi = new JTextField();
		gunsayisi.setBounds(93, 179, 86, 20);
		getContentPane().add(gunsayisi);
		gunsayisi.setColumns(10);
		
	    btnGnSayisiGir = new JButton("G\u00FCn Sayisi Gir");
		btnGnSayisiGir.setBounds(32, 219, 120, 23);
		getContentPane().add(btnGnSayisiGir);
		btnGnSayisiGir.addActionListener(new OlayDinleyicisi(this));
		
		JLabel lblKartBilgisi = new JLabel("Kart Bilgisi");
		lblKartBilgisi.setBounds(24, 267, 71, 14);
		getContentPane().add(lblKartBilgisi);
		
		kart_info = new JTextField();
		kart_info.setBounds(100, 264, 120, 20);
		getContentPane().add(kart_info);
		kart_info.setColumns(10);
		
		btnKartGir = new JButton("Kart Gir");
		btnKartGir.setBounds(32, 295, 91, 23);
		getContentPane().add(btnKartGir);
		btnKartGir.addActionListener(new OlayDinleyicisi(this));
		
		btnBitir = new JButton("Bitir");
		btnBitir.setBounds(92, 334, 128, 23);
		getContentPane().add(btnBitir);
		btnBitir.addActionListener(new OlayDinleyicisi(this));
		
	}
	
	public JTextField getBaslangic_tarihi() {
		return baslangic_tarihi;
	}

	public JTextField getBitis_tarihi() {
		return bitis_tarihi;
	}

	public JTextField getGunsayisi() {
		return gunsayisi;
	}

	public JTextField getTextField() {
		return kart_info;
	}

	public JButton getBtnTarihGir() {
		return btnTarihGir;
	}

	public JButton getBtnAraSec() {
		return btnAraSec;
	}

	public JButton getBtnGnSayisiGir() {
		return btnGnSayisiGir;
	}

	public JButton getBtnKartGir() {
		return btnKartGir;
	}

	public static void main(String[] args) {
		new MainFrame().setVisible(true);
	}
	
}

	class OlayDinleyicisi implements ActionListener{

		private MainFrame mainframe;
		
	    public OlayDinleyicisi(MainFrame mainframe) {
			this.mainframe=mainframe;
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==mainframe.getBtnAraSec()){
				int aracID=Integer.parseInt(mainframe.getAracID().getText());
				mainframe.getRegister().AracSec(aracID);
			}
			if(e.getSource()==mainframe.getBtnTarihGir()){
				
				String tarih1=mainframe.getBaslangic_tarihi().getText();
				String tarih2=mainframe.getBitis_tarihi().getText();
				SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
				Date t1 = null,t2=null;
				try {
					t1=formatter.parse(tarih1);
					t2=formatter.parse(tarih2);
				} catch (ParseException eq) {
					eq.printStackTrace();
				}
				mainframe.getRegister().TarihSec(t1, t2);
			}
			if(e.getSource()==mainframe.getBtnGnSayisiGir()){
				int gun=Integer.parseInt(mainframe.getGunsayisi().getText());
				mainframe.getRegister().GunSayisiGir(gun);
			}
			if(e.getSource()==mainframe.getBtnKartGir()){
				String kart_info=mainframe.getKart_info().getText();
				mainframe.getRegister().KartBilgisiGir(kart_info);
			}
			if(e.getSource()==mainframe.getBtnBitir()){
				mainframe.getRegister().bitir();
				mainframe.setVisible(false);
			}
			
		}
		
	}
