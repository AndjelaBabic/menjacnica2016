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
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

import menjacnica.Valuta;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class DodajKursGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblSifra;
	private JLabel lblNaziv;
	private JTextField tfNaziv;
	private JLabel lblProdajniKurs;
	private JLabel lblKupovniKurs;
	private JTextField tfProdajniKurs;
	private JTextField tfKupovniKurs;
	private JLabel lblSrednjiKurs;
	private JLabel lblSkraceniNaziv;
	private JTextField tfSrednjiKurs;
	private JTextField tfSkraceniNaziv;
	private JButton btnDodaj;
	private JButton btnOdus;
	private JSpinner spinnerSifra;

	/**
	 * Create the frame.
	 */
	public DodajKursGUI(MenjacnicaGUI glavniProzor) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(DodajKursGUI.class.getResource("/icons/Screenshot.png")));
		setResizable(false);
		setTitle("Dodaj kurs");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 10, 10));
		contentPane.add(getLblSifra());
		contentPane.add(getLblNaziv());
		contentPane.add(getSpinnerSifra());
		contentPane.add(getTfNaziv());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getTfProdajniKurs());
		contentPane.add(getTfKupovniKurs());
		contentPane.add(getLblSrednjiKurs());
		contentPane.add(getLblSkraceniNaziv());
		contentPane.add(getTfSrednjiKurs());
		contentPane.add(getTfSkraceniNaziv());
		contentPane.add(getBtnDodaj());
		contentPane.add(getBtnOdus());
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
	private JTextField getTfNaziv() {
		if (tfNaziv == null) {
			tfNaziv = new JTextField();
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
			tfProdajniKurs.setColumns(10);
		}
		return tfProdajniKurs;
	}
	private JTextField getTfKupovniKurs() {
		if (tfKupovniKurs == null) {
			tfKupovniKurs = new JTextField();
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
			tfSrednjiKurs.setColumns(10);
		}
		return tfSrednjiKurs;
	}
	private JTextField getTfSkraceniNaziv() {
		if (tfSkraceniNaziv == null) {
			tfSkraceniNaziv = new JTextField();
			tfSkraceniNaziv.setColumns(10);
		}
		return tfSkraceniNaziv;
	}
	private JButton getBtnDodaj() {
		if (btnDodaj == null) {
			btnDodaj = new JButton("Dodaj");
			btnDodaj.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIKontroler.unesiKurs((int) spinnerSifra.getValue(), tfNaziv.getText(), Double.parseDouble(tfProdajniKurs.getText()),
							Double.parseDouble(tfKupovniKurs.getText()), Double.parseDouble(tfSrednjiKurs.getText()), tfSkraceniNaziv.getText());
					dispose();
				}
			});
		}
		return btnDodaj;
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
	private JSpinner getSpinnerSifra() {
		if (spinnerSifra == null) {
			spinnerSifra = new JSpinner();
			spinnerSifra.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		}
		return spinnerSifra;
	}
}
