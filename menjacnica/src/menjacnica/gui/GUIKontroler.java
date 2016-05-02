package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableModel;

import menjacnica.Menjacnica;
import menjacnica.MenjacnicaInterface;
import menjacnica.gui.models.MenjacnicaTableModel;

public class GUIKontroler extends JFrame {

	private JPanel contentPane;
	private static MenjacnicaGUI glavniProzor;
	private static MenjacnicaInterface menjacnica;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menjacnica = new Menjacnica();
					glavniProzor = new MenjacnicaGUI();
					glavniProzor.setVisible(true);
					glavniProzor.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUIKontroler() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}
	
	public static void ugasiAplikaciju() {
		int opcija = JOptionPane.showConfirmDialog(null,
				"Da li ZAISTA zelite da izadjete iz apliacije", "Izlazak",
				JOptionPane.YES_NO_OPTION);

		if (opcija == JOptionPane.YES_OPTION)
			System.exit(0);
	}
	
	public static void prikaziDodajKursGUI() {
		DodajKursGUI prozor = new DodajKursGUI(glavniProzor);
		prozor.setLocationRelativeTo(null);
		prozor.setVisible(true);
	}
	
	public static void prikaziObrisiKursGUI(int red, MenjacnicaTableModel tableModel) {
		if (red != -1) {
				ObrisiKursGUI prozor = new ObrisiKursGUI(glavniProzor,
						tableModel.vratiValutu(red));
				prozor.setLocationRelativeTo(glavniProzor);
				prozor.setVisible(true);
			}
	}
	
	public static void prikaziIzvrsiZamenuGUI(int red, MenjacnicaTableModel tableModel) {
		if (red!= -1) {
			IzvrsiZamenuGUI prozor = new IzvrsiZamenuGUI(glavniProzor,
					tableModel.vratiValutu(red));
			prozor.setLocationRelativeTo(glavniProzor);
			prozor.setVisible(true);
		}
	}
	
	
	public static void ucitajIzFajla(MenjacnicaTableModel tableModel) {
		try {
			JFileChooser fc = new JFileChooser();
			int returnVal = fc.showOpenDialog(glavniProzor);

			if (returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
				menjacnica.ucitajIzFajla(file.getAbsolutePath());
				prikaziSveValute(tableModel);
			}	
		} catch (Exception e1) {
			JOptionPane.showMessageDialog(glavniProzor, e1.getMessage(),
					"Greska", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	protected static void prikaziSveValute(MenjacnicaTableModel tableModel) {
		tableModel.staviSveValuteUModel(menjacnica.vratiKursnuListu());	
	}
	
	public static void sacuvajUFajl() {
		try {
			JFileChooser fc = new JFileChooser();
			int returnVal = fc.showSaveDialog(glavniProzor);

			if (returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();

				menjacnica.sacuvajUFajl(file.getAbsolutePath());
			}
		} catch (Exception e1) {
			JOptionPane.showMessageDialog(glavniProzor, e1.getMessage(),
					"Greska", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public static void prikaziAboutProzor(){
		JOptionPane.showMessageDialog(glavniProzor,
				"Autor: Bojan Tomic, Verzija 1.0", "O programu Menjacnica",
				JOptionPane.INFORMATION_MESSAGE);
	}

	
}
