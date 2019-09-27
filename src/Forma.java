import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Window.Type;

public class Forma extends JFrame {

	/**
	 * 
	 */
	
	private JPanel contentPane;
	private JTextField UnosIme;
	private JTextField UnosPrezime;
	
	
	ArrayList<Korisnik>lista = new ArrayList<Korisnik>();
	
	
	public void clearFields() {
		UnosIme.setText("");
		UnosPrezime.setText("");
	}

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Forma frame = new Forma();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Forma() {
		setTitle("QUIZ GAME");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 467);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel title = new JLabel("");
		title.setIcon(new ImageIcon(Forma.class.getResource("/img/qtitle3.png")));
		title.setForeground(new Color(255, 51, 51));
		title.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.BOLD | Font.ITALIC, 60));
		title.setToolTipText("");
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setBounds(95, 38, 438, 111);
		contentPane.add(title);
		
		JLabel Unos = new JLabel("Uneti podatke:");
		Unos.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 20));
		Unos.setForeground(Color.RED);
		Unos.setHorizontalAlignment(SwingConstants.CENTER);
		Unos.setBounds(47, 160, 230, 24);
		contentPane.add(Unos);
		
		JLabel Ime = new JLabel("Ime:");
		Ime.setForeground(Color.RED);
		Ime.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 18));
		Ime.setBounds(47, 213, 74, 24);
		contentPane.add(Ime);
		
		UnosIme = new JTextField();
		UnosIme.setForeground(new Color(0, 51, 255));
		UnosIme.setHorizontalAlignment(SwingConstants.CENTER);
		UnosIme.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 18));
		UnosIme.setBounds(119, 207, 158, 30);
		contentPane.add(UnosIme);
		UnosIme.setColumns(10);
		
		JLabel Prezime = new JLabel("Prezime:");
		Prezime.setForeground(Color.RED);
		Prezime.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 18));
		Prezime.setBounds(47, 252, 74, 24);
		contentPane.add(Prezime);
		
		UnosPrezime = new JTextField();
		UnosPrezime.setForeground(new Color(0, 51, 255));
		UnosPrezime.setHorizontalAlignment(SwingConstants.CENTER);
		UnosPrezime.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 18));
		UnosPrezime.setColumns(10);
		UnosPrezime.setBounds(119, 248, 158, 30);
		contentPane.add(UnosPrezime);
		
		JButton btnPrvaIgra = new JButton("Prva igra");
		btnPrvaIgra.setForeground(new Color(0, 51, 255));
		btnPrvaIgra.setFont(new Font("Gill Sans Ultra Bold", Font.PLAIN, 15));
		btnPrvaIgra.setEnabled(false);
		btnPrvaIgra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PrvaIgra.NewScreen();
			}
		});
		btnPrvaIgra.setBounds(405, 207, 127, 42);
		contentPane.add(btnPrvaIgra);
		
		JButton btnDrugaIgra = new JButton("Druga igra");
		btnDrugaIgra.setForeground(new Color(0, 51, 255));
		btnDrugaIgra.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 15));
		btnDrugaIgra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DrugaIgra.NewScreen2();
				
			}
		});
		btnDrugaIgra.setEnabled(false);
		btnDrugaIgra.setBounds(405, 267, 127, 42);
		contentPane.add(btnDrugaIgra);
		
		JButton btnTreaIgra = new JButton("Treca igra");
		btnTreaIgra.setForeground(new Color(0, 51, 255));
		btnTreaIgra.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 15));
		btnTreaIgra.setEnabled(false);
		btnTreaIgra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TrecaIgra.NewScreen3();
			}
		});
		btnTreaIgra.setBounds(405, 320, 127, 42);
		contentPane.add(btnTreaIgra);
		
		JLabel lblIgrac = new JLabel("Igrac:");
		lblIgrac.setForeground(Color.RED);
		lblIgrac.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 20));
		lblIgrac.setBounds(355, 160, 74, 24);
		contentPane.add(lblIgrac);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setForeground(new Color(0, 51, 255));
		lblNewLabel_1.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(420, 154, 219, 30);
		contentPane.add(lblNewLabel_1);
		
		
	
		
		JButton btnZapocniIgru = new JButton("Zapocni igru");
		btnZapocniIgru.setForeground(new Color(0, 51, 255));
		btnZapocniIgru.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 15));
		btnZapocniIgru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String imek = UnosIme.getText();
				String prezimek =UnosPrezime.getText();
					
				
				
				if(imek != null && imek.length()>0 && prezimek != null && prezimek.length()>0) {
					
					Korisnik k = new Korisnik();
					k.setIme(imek);
					k.setPrezime(prezimek);
					
					lista.add(k);
					
					lblNewLabel_1.setText(k.toString());
					
					btnPrvaIgra.setEnabled(true);
					btnDrugaIgra.setEnabled(true);
					btnTreaIgra.setEnabled(true);
					
					clearFields();
				}
				
			}
		});
		btnZapocniIgru.setBounds(150, 302, 127, 30);
		contentPane.add(btnZapocniIgru);
		
		JLabel background = new JLabel("");
		background.setIcon(new ImageIcon(Forma.class.getResource("/img/IMG1 - Copy.jpg")));
		background.setBounds(0, 0, 649, 428);
		contentPane.add(background);
		
	}
}
