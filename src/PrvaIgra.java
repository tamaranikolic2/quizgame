import java.awt.Color;
import java.awt.EventQueue;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.ImageIcon;

public class PrvaIgra extends JFrame {

	/**
	 * 
	 */
	
	private JPanel contentPane;
	private JTextField odgovor1;
	private JTextField odgovor2;
	
	//Liste pitanja
	
	ArrayList<String> ls0 = new ArrayList<String>(); // prvo pitanje
	ArrayList<String> ls1 = new ArrayList<String>(); // drugo pitanje
	ArrayList<String> ls2 = new ArrayList<String>(); //trece pitanje
	ArrayList<String> ls3 = new ArrayList<String>(); //cetvrto pitanje
	ArrayList<String> ls4 = new ArrayList<String>(); //peto pitanje

	
	Korisnik k = new Korisnik();
	
	public int score=0;
	
	//Funkcija za postavku pitanja
	
	private static void postavka(JLabel lpitanje, ArrayList <String> pitanje) {
		lpitanje.setText(pitanje.get((int)(Math.random()*pitanje.size())));
	}
	
	
	
	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrvaIgra frame = new PrvaIgra();
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
	public PrvaIgra() {
		setTitle("Ko zna, zna");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 793, 670);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 51, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	
		//Pitanja
		
		ls0.add("'Pariska krvava svadba' poznatija je kao:");
		ls0.add("Ko je napisao roman 'Necista krv'?");
		ls0.add("Koja drzava je najmanja po povrsini?");
		
		ls1.add("Jabuka je zastitni znak kompanije?");
		ls1.add("Koja je skracenica za centralnu procesorsku jedinicu?");
		ls1.add("Kako se zvala preteca racunara?");
		
		ls2.add("Ko je bio prvak Italije u fudbalu u 2009.godini?");
		ls2.add("Koji je nadimak cuvenog gitariste grupe Smak, Radomira Mihajlovica?");
		ls2.add("Sta je to heraldika?");
		
		ls3.add("Koliko jedan galon ima litara?");
		ls3.add("Ljudski mozak /BRAIN/ se koristi kao asocijacija za?");
		ls3.add("Skener je?");
		
		ls4.add("Koje godine je osnovan kosarkaski savez Jugoslavije?");
		ls4.add("Maliciozan znaci?");
		ls4.add("Koliko puta godisnje Zemlja obidje oko Sunca?");
		
		
		JLabel lblKoZnaZna = new JLabel("PITANJA");
		lblKoZnaZna.setForeground(Color.ORANGE);
		lblKoZnaZna.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 30));
		lblKoZnaZna.setHorizontalAlignment(SwingConstants.CENTER);
		lblKoZnaZna.setBounds(10, 11, 688, 36);
		contentPane.add(lblKoZnaZna);
		
		JLabel pitanje1 = new JLabel("");
		pitanje1.setForeground(Color.ORANGE);
		pitanje1.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 18));
		pitanje1.setBounds(20, 58, 747, 36);
		contentPane.add(pitanje1);
		
		JRadioButton odg1 = new JRadioButton("");
		odg1.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 13));
		odg1.setBackground(new Color(255, 255, 0));
		odg1.setBounds(6, 101, 162, 23);
		contentPane.add(odg1);
		
		
		JRadioButton odg2 = new JRadioButton("");
		odg2.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 13));
		odg2.setBackground(new Color(255, 255, 0));
		odg2.setBounds(170, 101, 169, 23);
		contentPane.add(odg2);
		
		
		JRadioButton odg3 = new JRadioButton("");
		odg3.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 13));
		odg3.setBackground(new Color(255, 255, 0));
		odg3.setBounds(341, 101, 200, 23);
		contentPane.add(odg3);
		
		
		ButtonGroup grupa = new ButtonGroup();
		grupa.add(odg1);
		grupa.add(odg2);
		grupa.add(odg3);
		
		postavka(pitanje1, ls0);
		
		
		if(pitanje1.getText().equals("Ko je napisao roman 'Necista krv'?")) {
			odg1.setText("Borisav Stankovic");
			odg2.setText("Ivo Andric");
			odg3.setText("Mesa Selimovic");
			
			}else if(pitanje1.getText().equals("'Pariska krvava svadba' poznatija je kao:")) {
			odg2.setText("Vartolomejska noc");
			odg1.setText("Najtamnija noc");
			odg3.setText("Kristalna noc");
			
			}else if(pitanje1.getText().equals("Koja drzava je najmanja po povrsini?")) {
			odg3.setText("Vatikan");
			odg1.setText("Libija");
			odg2.setText("Sudan");
			
			}
		
		JButton btnPotvrdi_1 = new JButton("Potvrdi");
		btnPotvrdi_1.setForeground(new Color(255, 51, 51));
		btnPotvrdi_1.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 13));
		btnPotvrdi_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(pitanje1.getText().equals("Ko je napisao roman 'Necista krv'?") && odg1.isSelected()) {
					score=score+1;
				} else if(pitanje1.getText().equals("'Pariska krvava svadba' poznatija je kao:") &&  odg2.isSelected()) {
					score=score+1;
				} else if(pitanje1.getText().equals("Koja drzava je najmanja po povrsini?") && odg3.isSelected()) {
					score=score+1;
				}else {
					score=score-1;
				}
				
			}
		});
		btnPotvrdi_1.setBounds(559, 101, 89, 23);
		contentPane.add(btnPotvrdi_1);
		
		JLabel pitanje2 = new JLabel("");
		pitanje2.setForeground(Color.RED);
		pitanje2.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 18));
		pitanje2.setBounds(20, 154, 747, 36);
		contentPane.add(pitanje2);
		
		JRadioButton odg211 = new JRadioButton("");
		odg211.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 13));
		odg211.setBackground(new Color(255, 255, 0));
		odg211.setBounds(10, 213, 158, 23);
		contentPane.add(odg211);
		
		JRadioButton odg222 = new JRadioButton("");		
		odg222.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 13));
		odg222.setBackground(new Color(255, 255, 0));
		odg222.setBounds(170, 213, 169, 23);
		contentPane.add(odg222);
		
		JRadioButton odg233 = new JRadioButton("");
		odg233.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 13));
		odg233.setBackground(new Color(255, 255, 0));
		odg233.setBounds(341, 213, 200, 23);
		contentPane.add(odg233);
		
		ButtonGroup grupa1 = new ButtonGroup();
		grupa1.add(odg211);
		grupa1.add(odg222);
		grupa1.add(odg233);
		
		postavka(pitanje2, ls1);
		
		if(pitanje2.getText().equals("Jabuka je zastitni znak kompanije?")) {
			odg222.setText("Apple");
			odg233.setText("Microsoft");
			odg211.setText("Google");
			
			
		}else if(pitanje2.getText().equals("Koja je skracenica za centralnu procesorsku jedinicu?")) {
			odg233.setText("CPU");
			odg211.setText("RAM");
			odg222.setText("USB");
			
			
		}else if(pitanje2.getText().equals("Kako se zvala preteca racunara?")) {
			odg211.setText("Abakus");
			odg222.setText("Albatros");
			odg233.setText("Basic");
			
			
		}
		
		JButton btnPotvrdi_2 = new JButton("Potvrdi");
		btnPotvrdi_2.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 13));
		btnPotvrdi_2.setForeground(new Color(255, 51, 51));
		btnPotvrdi_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(pitanje2.getText().equals("Jabuka je zastitni znak kompanije?") && odg222.isSelected()) {
					score=score+1;
				} else if(pitanje2.getText().equals("Koja je skracenica za centralnu procesorsku jedinicu?") &&  odg233.isSelected()) {
					score=score+1;
				} else if(pitanje2.getText().equals("Kako se zvala preteca racunara?") && odg211.isSelected()) {
					score=score+1;
				}else {
					score=score-1;
				}
				
			}
		});
		btnPotvrdi_2.setBounds(559, 213, 89, 23);
		contentPane.add(btnPotvrdi_2);
		
		
		JLabel pitanje3 = new JLabel("");
		pitanje3.setForeground(Color.ORANGE);
		pitanje3.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 18));
		pitanje3.setBounds(20, 261, 747, 36);
		contentPane.add(pitanje3);
		
		JRadioButton odg311 = new JRadioButton("");
		odg311.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 13));
		odg311.setBackground(new Color(255, 255, 0));
		odg311.setBounds(10, 320, 158, 23);
		contentPane.add(odg311);
		
		JRadioButton odg322 = new JRadioButton("");
		odg322.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 13));
		odg322.setBackground(new Color(255, 255, 0));
		odg322.setBounds(170, 320, 169, 23);
		contentPane.add(odg322);
		
		JRadioButton odg333 = new JRadioButton("");
		odg333.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 13));
		odg333.setBackground(new Color(255, 255, 0));
		odg333.setBounds(341, 320, 200, 23);
		contentPane.add(odg333);
		
		ButtonGroup grupa3 = new ButtonGroup();
		grupa3.add(odg311);
		grupa3.add(odg322);
		grupa3.add(odg333);
		
		postavka(pitanje3, ls2);
		
		if(pitanje3.getText().equals("Ko je bio prvak Italije u fudbalu u 2009.godini?")) {
			odg333.setText("Inter");
			odg322.setText("Milan");
			odg311.setText("Juventus");
			
			
		}else if(pitanje3.getText().equals("Koji je nadimak cuvenog gitariste grupe Smak, Radomira Mihajlovica?")) {
			odg322.setText("Tocak");
			odg333.setText("Golub");
			odg311.setText("Kepa");
			
		}else if(pitanje3.getText().equals("Sta je to heraldika?")) {
			odg311.setText("Nauka o grbovima");
			odg333.setText("Nauka o mitovima");
			odg322.setText("Zvezda");
			
		}
		
		JButton btnPotvrdi_3 = new JButton("Potvrdi");
		btnPotvrdi_3.setForeground(new Color(255, 51, 51));
		btnPotvrdi_3.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 13));
		btnPotvrdi_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(pitanje3.getText().equals("Ko je bio prvak Italije u fudbalu u 2009.godini?") && odg333.isSelected()) {
					score=score+1;
				} else if(pitanje3.getText().equals("Koji je nadimak cuvenog gitariste grupe Smak, Radomira Mihajlovica?") &&  odg322.isSelected()) {
					score=score+1;
				} else if(pitanje3.getText().equals("Sta je to heraldika?") && odg311.isSelected()) {
					score=score+1;
				}else {
					score=score-1;
				}
				
			}
		});
		btnPotvrdi_3.setBounds(559, 320, 89, 23);
		contentPane.add(btnPotvrdi_3);
		
		
		
		JLabel pitanje4 = new JLabel("");
		pitanje4.setForeground(Color.RED);
		pitanje4.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 18));
		pitanje4.setText(ls3.get((int)(Math.random()*ls3.size())));
		pitanje4.setBounds(20, 362, 747, 36);
		contentPane.add(pitanje4);
		
		odgovor1 = new JTextField();
		odgovor1.setHorizontalAlignment(SwingConstants.CENTER);
		odgovor1.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 13));
		odgovor1.setBackground(Color.WHITE);
		odgovor1.setBounds(20, 409, 295, 38);
		contentPane.add(odgovor1);
		odgovor1.setColumns(10);
		
		
		JButton btnPotvrdi_4 = new JButton("Potvrdi");
		btnPotvrdi_4.setForeground(new Color(255, 51, 51));
		btnPotvrdi_4.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 13));
		btnPotvrdi_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(pitanje4.getText().equals("Koliko jedan galon ima litara?") && odgovor1.getText().equals("3.78")) {
					odgovor1.setBackground(new Color(51, 255, 153));
					score=score+1;
				} else if(pitanje4.getText().equals("Ljudski mozak /BRAIN/ se koristi kao asocijacija za?") && odgovor1.getText().equals("procesor") || odgovor1.getText().equals("Procesor")){
					odgovor1.setBackground(new Color(51, 255, 153));
					score=score+1;
				} else if(pitanje4.getText().equals("Skener je?") && odgovor1.getText().equals("ulazni uredjaj") || odgovor1.getText().equals("Ulazni uredjaj")) {
					odgovor1.setBackground(new Color(51, 255, 153));
					score=score+1;
				}else {
					score=score-1;
				}
			}
		});
		btnPotvrdi_4.setBounds(373, 424, 89, 23);
		contentPane.add(btnPotvrdi_4);
		
		JLabel pitanje5 = new JLabel("");
		pitanje5.setForeground(Color.ORANGE);
		pitanje5.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 18));
		pitanje5.setText(ls4.get((int)(Math.random()*ls4.size())));
		pitanje5.setBounds(20, 458, 747, 36);
		contentPane.add(pitanje5);
		
		odgovor2 = new JTextField();
		odgovor2.setHorizontalAlignment(SwingConstants.CENTER);
		odgovor2.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 13));
		odgovor2.setBackground(Color.WHITE);
		odgovor2.setColumns(10);
		odgovor2.setBounds(20, 505, 295, 38);
		contentPane.add(odgovor2);
		
		
		JButton btnPotvrdi_5 = new JButton("Potvrdi");
		btnPotvrdi_5.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 13));
		btnPotvrdi_5.setForeground(new Color(255, 51, 51));
		btnPotvrdi_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(pitanje5.getText().equals("Koje godine je osnovan kosarkaski savez Jugoslavije?") && odgovor2.getText().equals("1948")) {
					odgovor2.setBackground(new Color(51, 255, 153));
					score=score+1;
				} else if(pitanje5.getText().equals("Maliciozan znaci?") && odgovor2.getText().equals("zloban") || odgovor2.getText().equals("Zloban")){
					odgovor2.setBackground(new Color(51, 255, 153));
					score=score+1;
				} else if(pitanje5.getText().equals("Koliko puta godisnje Zemlja obidje oko Sunca?") && odgovor2.getText().equals("1") || odgovor2.getText().equals("jedan") || odgovor2.getText().equals("Jedan")) {
					odgovor2.setBackground(new Color(51, 255, 153));
					score=score+1;
				}else {
					score=score-1;
				}
			}
		});
		btnPotvrdi_5.setBounds(373, 513, 89, 23);
		contentPane.add(btnPotvrdi_5);
		
		
		JButton btnPotvrdiSve = new JButton("Potvrdi sve odgovore");
		btnPotvrdiSve.setForeground(new Color(255, 51, 51));
		btnPotvrdiSve.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 13));
		btnPotvrdiSve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Osvojili ste " +score+ " poena.");
			
			}
		});
		btnPotvrdiSve.setBounds(20, 584, 192, 36);
		contentPane.add(btnPotvrdiSve);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(PrvaIgra.class.getResource("/img/Children map PANORAMA_World sm.jpg")));
		lblNewLabel.setBounds(0, 0, 777, 631);
		contentPane.add(lblNewLabel);

	}
}
