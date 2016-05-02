package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;

import menjacnica.Valuta;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class ObrisiKursGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblSifra;
	private JLabel lblNaziv;
	private JTextField tfSifra;
	private JTextField tfNaziv;
	private JLabel lblProdajniKurs;
	private JLabel lblKupovniKurs;
	private JTextField tfProdajniKurs;
	private JTextField tfKupovniKurs;
	private JLabel lblSrednjiKurs;
	private JLabel lblSkraceniNaziv;
	private JTextField tfSrednjiKurs;
	private JTextField tfSkraceniNaziv;
	private JButton btnObrisi;
	private JButton btnOdus;
	private JCheckBox chckbxZaistaObrisiKurs;
	private JLabel label;
	
	
	private Valuta valuta;

	/**
	 * Create the frame.
	 */
	public ObrisiKursGUI(Valuta valuta) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ObrisiKursGUI.class.getResource("/icons/Screenshot.png")));
		setResizable(false);
		setTitle("Obrisi kurs");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 325);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 10, 10));
		contentPane.add(getLblSifra());
		contentPane.add(getLblNaziv());
		contentPane.add(getTfSifra());
		contentPane.add(getTfNaziv());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getTfProdajniKurs());
		contentPane.add(getTfKupovniKurs());
		contentPane.add(getLblSrednjiKurs());
		contentPane.add(getLblSkraceniNaziv());
		contentPane.add(getTfSrednjiKurs());
		contentPane.add(getTfSkraceniNaziv());
		contentPane.add(getChckbxZaistaObrisiKurs());
		contentPane.add(getLabel());
		contentPane.add(getBtnObrisi());
		contentPane.add(getBtnOdus());
		
		//podesavanje
		this.valuta = valuta;
		
		GUIKontroler.prikaziValutu(tfSifra, tfNaziv, tfProdajniKurs, tfKupovniKurs, tfSrednjiKurs, tfSkraceniNaziv, this.valuta);
	}

	private JLabel getLblSifra() {
		if (lblSifra == null) {
			lblSifra = new JLabel("Sifra");
			lblSifra.setVerticalAlignment(SwingConstants.BOTTOM);
		}
		return lblSifra;
	}
	private JLabel getLblNaziv() {
		if (lblNaziv == null) {
			lblNaziv = new JLabel("Naziv");
			lblNaziv.setVerticalAlignment(SwingConstants.BOTTOM);
		}
		return lblNaziv;
	}
	private JTextField getTfSifra() {
		if (tfSifra == null) {
			tfSifra = new JTextField();
			tfSifra.setEnabled(false);
			tfSifra.setColumns(10);
		}
		return tfSifra;
	}
	private JTextField getTfNaziv() {
		if (tfNaziv == null) {
			tfNaziv = new JTextField();
			tfNaziv.setEnabled(false);
			tfNaziv.setColumns(10);
		}
		return tfNaziv;
	}
	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setVerticalAlignment(SwingConstants.BOTTOM);
		}
		return lblProdajniKurs;
	}
	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setVerticalAlignment(SwingConstants.BOTTOM);
		}
		return lblKupovniKurs;
	}
	private JTextField getTfProdajniKurs() {
		if (tfProdajniKurs == null) {
			tfProdajniKurs = new JTextField();
			tfProdajniKurs.setEnabled(false);
			tfProdajniKurs.setColumns(10);
		}
		return tfProdajniKurs;
	}
	private JTextField getTfKupovniKurs() {
		if (tfKupovniKurs == null) {
			tfKupovniKurs = new JTextField();
			tfKupovniKurs.setEnabled(false);
			tfKupovniKurs.setColumns(10);
		}
		return tfKupovniKurs;
	}
	private JLabel getLblSrednjiKurs() {
		if (lblSrednjiKurs == null) {
			lblSrednjiKurs = new JLabel("Srednji kurs");
			lblSrednjiKurs.setVerticalAlignment(SwingConstants.BOTTOM);
		}
		return lblSrednjiKurs;
	}
	private JLabel getLblSkraceniNaziv() {
		if (lblSkraceniNaziv == null) {
			lblSkraceniNaziv = new JLabel("Skraceni naziv");
			lblSkraceniNaziv.setVerticalAlignment(SwingConstants.BOTTOM);
		}
		return lblSkraceniNaziv;
	}
	private JTextField getTfSrednjiKurs() {
		if (tfSrednjiKurs == null) {
			tfSrednjiKurs = new JTextField();
			tfSrednjiKurs.setEnabled(false);
			tfSrednjiKurs.setColumns(10);
		}
		return tfSrednjiKurs;
	}
	private JTextField getTfSkraceniNaziv() {
		if (tfSkraceniNaziv == null) {
			tfSkraceniNaziv = new JTextField();
			tfSkraceniNaziv.setEnabled(false);
			tfSkraceniNaziv.setColumns(10);
		}
		return tfSkraceniNaziv;
	}
	private JButton getBtnObrisi() {
		if (btnObrisi == null) {
			btnObrisi = new JButton("Obrisi");
			btnObrisi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIKontroler.obrisiValutu(valuta);
				}
			});
			btnObrisi.setEnabled(false);
		}
		return btnObrisi;
	}
	private JButton getBtnOdus() {
		if (btnOdus == null) {
			btnOdus = new JButton("Odustani");
			btnOdus.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
		}
		return btnOdus;
	}
	private JCheckBox getChckbxZaistaObrisiKurs() {
		if (chckbxZaistaObrisiKurs == null) {
			chckbxZaistaObrisiKurs = new JCheckBox("Zaista obrisi kurs");
			chckbxZaistaObrisiKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (chckbxZaistaObrisiKurs.isSelected())
						btnObrisi.setEnabled(true);
					else
						btnObrisi.setEnabled(false);
				}
			});
		}
		return chckbxZaistaObrisiKurs;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("");
		}
		return label;
	}
}
