import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;

public class DrugaIgra extends JFrame {

	private JPanel contentPane;
	private JTextField konacno;
	private JTextField resenje1;
	private JTextField resenje2;
	private JTextField resenje3;
	private JTextField resenje4;  

	//Liste pojmova
	
	ArrayList<String> kolonaA = new ArrayList<String>();
	ArrayList<String> kolonaB = new ArrayList<String>();
	ArrayList<String> kolonaC = new ArrayList<String>();
	ArrayList<String> kolonaD = new ArrayList<String>();
	
	
	public int score2=0;
	
	private static void clearField(JTextField textField) {
		textField.setText("");
	}
	
	//Metoda koja sprecava ponavljanje istih reci u koloni
	
	private static void postavka(JLabel lbl1, ArrayList <String> lista) {
		int n;
		lbl1.setText(lista.get((int)(Math.random()*lista.size())));
		n= lista.indexOf(lbl1.getText());
		lista.remove(n);
	}
	

	/**
	 * Launch the application.
	 */
	public static void NewScreen2() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DrugaIgra frame = new DrugaIgra();
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
	public DrugaIgra() {
		setTitle("Asocijacije");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 684, 579);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 153, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Pojmovi
		
		kolonaA.add("PASTI NA...");
		kolonaA.add("SOLITI...");
		kolonaA.add("PROSIPATI");
		kolonaA.add("KRATKA");
		
		kolonaB.add("TELEFON");
		kolonaB.add("SILA");
		kolonaB.add("PODSTICAJ");
		kolonaB.add("ELEKTRICNI");
		
		kolonaC.add("NAPAD");
		kolonaC.add("MONETARNI");
		kolonaC.add("DRZAVNI");
		kolonaC.add("VOJNI");
		
		kolonaD.add("SLOBODA");
		kolonaD.add("CRNA");
		kolonaD.add("AFORIZAM");
		kolonaD.add("RECENICA");
		
	
		
		JLabel ImeIgre = new JLabel("Asocijacije");
		ImeIgre.setForeground(Color.RED);
		ImeIgre.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 20));
		ImeIgre.setHorizontalAlignment(SwingConstants.CENTER);
		ImeIgre.setBounds(23, 11, 624, 46);
		contentPane.add(ImeIgre);
		
			
			
			JButton potvrdiKonacno = new JButton("POTVRDI");
			potvrdiKonacno.setForeground(Color.RED);
			potvrdiKonacno.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 11));
			potvrdiKonacno.setEnabled(false);
			potvrdiKonacno.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(konacno.getText().equals("MOZAK") || konacno.getText().equals("Mozak") || konacno.getText().equals("mozak")) {
						score2=score2+10;
						JOptionPane.showMessageDialog(null, "Tacno resenje! Osvojili ste " +score2+ " poena");
						
				} else {
						JOptionPane.showMessageDialog(null, "Netacno. Pokusaj ponovo.");
					}
					
				}
			});
			potvrdiKonacno.setBounds(292, 493, 89, 23);
			contentPane.add(potvrdiKonacno);
		
		konacno = new JTextField();
		konacno.setForeground(new Color(255, 51, 51));
		konacno.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 20));
		konacno.setHorizontalAlignment(SwingConstants.CENTER);
		konacno.setBounds(162, 443, 347, 39);
		contentPane.add(konacno);
		konacno.setColumns(10);
		
		JButton A1 = new JButton("A1");
		A1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		A1.setBackground(new Color(0, 51, 255));
		A1.setForeground(new Color(255, 255, 0));
		A1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				A1.setVisible(false);
			}
		});
		A1.setBounds(23, 79, 118, 39);
		contentPane.add(A1);
		
		JLabel lblPrviA = new JLabel("prviA");
		lblPrviA.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrviA.setBounds(23, 79, 118, 39);
		contentPane.add(lblPrviA);

		postavka(lblPrviA, kolonaA);
		
		JButton A2 = new JButton("A2");
		A2.setForeground(new Color(255, 255, 0));
		A2.setBackground(new Color(0, 51, 255));
		A2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		A2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				A2.setVisible(false);
			}
		});
		A2.setBounds(23, 146, 118, 39);
		contentPane.add(A2);
		
		JLabel lblDrugiA = new JLabel("");
		lblDrugiA.setHorizontalAlignment(SwingConstants.CENTER);
		lblDrugiA.setBounds(23, 146, 118, 39);
		contentPane.add(lblDrugiA);
		
		postavka(lblDrugiA, kolonaA);
		
		JButton A3 = new JButton("A3");
		A3.setForeground(new Color(255, 255, 0));
		A3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		A3.setBackground(new Color(0, 51, 255));
		A3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				A3.setVisible(false);
			}
		});
		A3.setBounds(23, 209, 118, 39);
		contentPane.add(A3);
		
		JLabel lblTreciA = new JLabel("");
		lblTreciA.setHorizontalAlignment(SwingConstants.CENTER);
		lblTreciA.setBounds(23, 209, 118, 39);
		contentPane.add(lblTreciA);
		
		postavka(lblTreciA, kolonaA);
		
		JButton A4 = new JButton("A4");
		A4.setForeground(new Color(255, 255, 0));
		A4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		A4.setBackground(new Color(0, 51, 255));
		A4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				A4.setVisible(false);
			}
		});
		A4.setBounds(23, 273, 118, 39);
		contentPane.add(A4);
		
		JLabel lblCetvrtiA = new JLabel("");
		lblCetvrtiA.setHorizontalAlignment(SwingConstants.CENTER);
		lblCetvrtiA.setBounds(23, 273, 118, 39);
		contentPane.add(lblCetvrtiA);

		postavka(lblCetvrtiA, kolonaA);
		
		resenje1 = new JTextField();
		resenje1.setForeground(new Color(255, 51, 51));
		resenje1.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 15));
		resenje1.setHorizontalAlignment(SwingConstants.CENTER);
		resenje1.setBounds(23, 335, 118, 39);
		contentPane.add(resenje1);
		resenje1.setColumns(10);
		
		JButton B1 = new JButton("B1");
		B1.setForeground(new Color(255, 255, 0));
		B1.setBackground(new Color(0, 51, 255));
		B1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B1.setVisible(false);
			}
		});
		
		JButton potvrdi1 = new JButton("POTVRDI");
		potvrdi1.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 11));
		potvrdi1.setForeground(Color.RED);
		potvrdi1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(resenje1.getText().equals("PAMET") || resenje1.getText().equals("Pamet") || resenje1.getText().equals("pamet")) {
					score2=score2+1;
					resenje1.setBackground(new Color(51, 255, 153));
					potvrdiKonacno.setEnabled(true);
				
				}else {
					clearField(resenje1);	
				}
			}
		});
		potvrdi1.setBounds(52, 375, 89, 23);
		contentPane.add(potvrdi1);
		B1.setBounds(187, 79, 118, 39);
		contentPane.add(B1);
		
		JLabel lblPrviB = new JLabel("prviB");
		lblPrviB.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrviB.setBounds(187, 79, 118, 39);
		contentPane.add(lblPrviB);

		postavka(lblPrviB, kolonaB);
		
		JButton B2 = new JButton("B2");
		B2.setForeground(new Color(255, 255, 0));
		B2.setBackground(new Color(0, 51, 255));
		B2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		B2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B2.setVisible(false);
			}
		});
		B2.setBounds(187, 146, 118, 39);
		contentPane.add(B2);
		
		JLabel lblDrugiB = new JLabel("drugiB");
		lblDrugiB.setHorizontalAlignment(SwingConstants.CENTER);
		lblDrugiB.setBounds(187, 146, 118, 39);
		contentPane.add(lblDrugiB);

		postavka(lblDrugiB, kolonaB);
		
		JButton B3 = new JButton("B3");
		B3.setForeground(new Color(255, 255, 0));
		B3.setBackground(new Color(0, 51, 255));
		B3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		B3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B3.setVisible(false);
			}
		});
		B3.setBounds(187, 209, 118, 39);
		contentPane.add(B3);
		
		JLabel lblTreciB = new JLabel("treciB");
		lblTreciB.setHorizontalAlignment(SwingConstants.CENTER);
		lblTreciB.setBounds(187, 209, 118, 39);
		contentPane.add(lblTreciB);

		postavka(lblTreciB, kolonaB);
		
		JButton B4 = new JButton("B4");
		B4.setForeground(new Color(255, 255, 0));
		B4.setBackground(new Color(0, 51, 255));
		B4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		B4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B4.setVisible(false);
			}
		});
		B4.setBounds(187, 273, 118, 39);
		contentPane.add(B4);
		
		JLabel lblCetvrtiB = new JLabel("cetvrtiB");
		lblCetvrtiB.setHorizontalAlignment(SwingConstants.CENTER);
		lblCetvrtiB.setBounds(187, 273, 118, 39);
		contentPane.add(lblCetvrtiB);

		postavka(lblCetvrtiB, kolonaB);
		
		resenje2 = new JTextField();
		resenje2.setForeground(new Color(255, 51, 51));
		resenje2.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 15));
		resenje2.setHorizontalAlignment(SwingConstants.CENTER);
		resenje2.setColumns(10);
		resenje2.setBounds(187, 335, 118, 39);
		contentPane.add(resenje2);
		
		
		JButton C1 = new JButton("C1");
		C1.setForeground(new Color(255, 255, 0));
		C1.setBackground(new Color(0, 51, 255));
		C1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		C1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				C1.setVisible(false);
			}
		});
		
		JButton potvrti2 = new JButton("POTVRDI");
		potvrti2.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 11));
		potvrti2.setForeground(Color.RED);
		potvrti2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(resenje2.getText().equals("IMPULS") || resenje2.getText().equals("Impuls") || resenje2.getText().equals("impuls")) {
					score2=score2+1;
					resenje2.setBackground(new Color(51, 255, 153));
					potvrdiKonacno.setEnabled(true);
					
				}else {
					clearField(resenje2);	
				}
			}
		});
		potvrti2.setBounds(216, 375, 89, 23);
		contentPane.add(potvrti2);
		C1.setBounds(354, 79, 118, 39);
		contentPane.add(C1);
		
		JLabel lblPrviC = new JLabel("prviC");
		lblPrviC.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrviC.setBounds(354, 79, 118, 39);
		contentPane.add(lblPrviC);

		postavka(lblPrviC, kolonaC);
		
		JButton C2 = new JButton("C2");
		C2.setForeground(new Color(255, 255, 0));
		C2.setBackground(new Color(0, 51, 255));
		C2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		C2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				C2.setVisible(false);
			}
		});
		C2.setBounds(354, 146, 118, 39);
		contentPane.add(C2);
		
		JLabel lblDrugiC = new JLabel("drugiC");
		lblDrugiC.setHorizontalAlignment(SwingConstants.CENTER);
		lblDrugiC.setBounds(354, 146, 118, 39);
		contentPane.add(lblDrugiC);

		postavka(lblDrugiC, kolonaC);
		
		JButton C3 = new JButton("C3");
		C3.setForeground(new Color(255, 255, 0));
		C3.setBackground(new Color(0, 51, 255));
		C3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		C3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				C3.setVisible(false);
			}
		});
		C3.setBounds(354, 209, 118, 39);
		contentPane.add(C3);
		
		JLabel lblTreciC = new JLabel("treciC");
		lblTreciC.setHorizontalAlignment(SwingConstants.CENTER);
		lblTreciC.setBounds(354, 209, 118, 39);
		contentPane.add(lblTreciC);

		postavka(lblTreciC, kolonaC);
		
		JButton C4 = new JButton("C4");
		C4.setForeground(new Color(255, 255, 0));
		C4.setBackground(new Color(0, 51, 255));
		C4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		C4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				C4.setVisible(false);
			}
		});
		C4.setBounds(354, 273, 118, 39);
		contentPane.add(C4);
		
		JLabel lblCetvrtiC = new JLabel("cetvrtiC");
		lblCetvrtiC.setHorizontalAlignment(SwingConstants.CENTER);
		lblCetvrtiC.setBounds(354, 273, 118, 39);
		contentPane.add(lblCetvrtiC);

		postavka(lblCetvrtiC, kolonaC);
		
		JButton D1 = new JButton("D1");
		D1.setForeground(new Color(255, 255, 0));
		D1.setBackground(new Color(0, 51, 255));
		D1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		D1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				D1.setVisible(false);
			}
		});
		
		resenje3 = new JTextField();
		resenje3.setForeground(new Color(255, 51, 51));
		resenje3.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 15));
		resenje3.setHorizontalAlignment(SwingConstants.CENTER);
		resenje3.setColumns(10);
		resenje3.setBounds(354, 335, 118, 39);
		contentPane.add(resenje3);
		
		JButton potvrdi3 = new JButton("POTVRDI");
		potvrdi3.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 11));
		potvrdi3.setForeground(Color.RED);
		potvrdi3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(resenje3.getText().equals("UDAR") || resenje3.getText().equals("Udar") || resenje3.getText().equals("udar")) {
					score2=score2+1;
					resenje3.setBackground(new Color(51, 255, 153));
					potvrdiKonacno.setEnabled(true);
				}else {
					clearField(resenje3);	
				}
			}
		});
		potvrdi3.setBounds(383, 375, 89, 23);
		contentPane.add(potvrdi3);
		D1.setBounds(521, 79, 118, 39);
		contentPane.add(D1);
		
		JLabel lblPrviD = new JLabel("prviD");
		lblPrviD.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrviD.setBounds(521, 79, 118, 39);
		contentPane.add(lblPrviD);

		postavka(lblPrviD, kolonaD);
		
		JButton D2 = new JButton("D2");
		D2.setForeground(new Color(255, 255, 0));
		D2.setBackground(new Color(0, 51, 255));
		D2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		D2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				D2.setVisible(false);
			}
		});
		D2.setBounds(521, 146, 118, 39);
		contentPane.add(D2);
		
		JLabel lblDrugiD = new JLabel("drugiD");
		lblDrugiD.setHorizontalAlignment(SwingConstants.CENTER);
		lblDrugiD.setBounds(521, 146, 118, 39);
		contentPane.add(lblDrugiD);

		postavka(lblDrugiD, kolonaD);
		
		JButton D3 = new JButton("D3");
		D3.setForeground(new Color(255, 255, 0));
		D3.setBackground(new Color(0, 51, 255));
		D3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		D3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				D3.setVisible(false);
			}
		});
		D3.setBounds(521, 209, 118, 39);
		contentPane.add(D3);
		
		JLabel lblTreciD = new JLabel("treciD");
		lblTreciD.setHorizontalAlignment(SwingConstants.CENTER);
		lblTreciD.setBounds(521, 209, 118, 39);
		contentPane.add(lblTreciD);

		postavka(lblTreciD, kolonaD);
		
		JButton D4 = new JButton("D4");
		D4.setForeground(new Color(255, 255, 0));
		D4.setBackground(new Color(0, 51, 255));
		D4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		D4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				D4.setVisible(false);
			}
		});
		D4.setBounds(521, 273, 118, 39);
		contentPane.add(D4);
		
		JLabel lblCetvrtiD = new JLabel("cetvrtiD");
		lblCetvrtiD.setHorizontalAlignment(SwingConstants.CENTER);
		lblCetvrtiD.setBounds(521, 273, 118, 39);
		contentPane.add(lblCetvrtiD);

		postavka(lblCetvrtiD, kolonaD);
		
		resenje4 = new JTextField();
		resenje4.setForeground(new Color(255, 51, 51));
		resenje4.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 15));
		resenje4.setHorizontalAlignment(SwingConstants.CENTER);
		resenje4.setColumns(10);
		resenje4.setBounds(521, 335, 118, 39);
		contentPane.add(resenje4);
		
		JButton potvrdi4 = new JButton("POTVRDI");
		potvrdi4.setForeground(Color.RED);
		potvrdi4.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 11));
		potvrdi4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(resenje4.getText().equals("MISAO") || resenje4.getText().equals("Misao") || resenje4.getText().equals("misao")) {
					score2=score2+1;
					resenje4.setBackground(new Color(51, 255, 153));
					potvrdiKonacno.setEnabled(true);
					
				}else {
					clearField(resenje4);	
				}
			}
		});
		potvrdi4.setBounds(550, 375, 89, 23);
		contentPane.add(potvrdi4);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(DrugaIgra.class.getResource("/img/yellow.jpg")));
		label.setBounds(0, 0, 668, 540);
		contentPane.add(label);

	}
}
