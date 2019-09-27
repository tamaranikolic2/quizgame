import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;

public class TrecaIgra extends JFrame {

	/**
	 * 
	 */
	private JPanel contentPane;
	private JTextField resenje;
	
	//liste slova i mogucih odgovora
	
	ArrayList<String> slova = new ArrayList<String>();
	ArrayList<String> odgovori = new ArrayList<String>();
	
	//funkcija za zadavanje slova
	
	private static void postavka(JLabel slovo, ArrayList <String> lslovo) {
		int n;
		slovo.setText(lslovo.get((int)(Math.random()*lslovo.size())));
		n = lslovo.indexOf(slovo.getText());
		lslovo.remove(n);
	}
	
	private String rec;
	public int score3=0;
	
	//funkcija za prebrojavanje slova u reci
	
	private static int brojSlova(String rec){
	    int brSlova = 0;
	    for(int i=0; i< rec.length(); i++) {
	    	brSlova++;
	    }
	    return brSlova;
	}
	

	/**
	 * Launch the application.
	 */
	public static void NewScreen3() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TrecaIgra frame = new TrecaIgra();
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
	public TrecaIgra() {
		setTitle("Slagalica");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 693, 390);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 102, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//slova koja se zadaju
		
		slova.add("P");
		slova.add("E");
		slova.add("E");
		slova.add("A");
		slova.add("G");
		slova.add("A");
		slova.add("R");
		slova.add("I");
		slova.add("V");
		slova.add("C");
		slova.add("U");
		slova.add("L");
		
		//resenja koji se prihvataju
		
		odgovori.add("uvredilac");
		odgovori.add("palidrvce");
		odgovori.add("palidrvca");
		odgovori.add("pridavale");
		odgovori.add("predavali");
		odgovori.add("gvadalupe");
		odgovori.add("pudarica");
		odgovori.add("grudvali");
		odgovori.add("grudvice");
		odgovori.add("ugradile");
		odgovori.add("upravila");
		odgovori.add("grdelica");
		odgovori.add("udvarali");
		odgovori.add("rugalice");
		odgovori.add("rugalica");
		odgovori.add("darivale");
		odgovori.add("glavurda");
		odgovori.add("glavurde");
		odgovori.add("pegavica");
		odgovori.add("padavicu");
		odgovori.add("padavice");
		odgovori.add("padalicu");
		odgovori.add("padalice");
		odgovori.add("gluperda");
		odgovori.add("varalicu");
		odgovori.add("varalice");
		odgovori.add("gradilac");
		odgovori.add("pravdale");
		odgovori.add("pravdali");
		odgovori.add("gavriela");
		odgovori.add("garavice");
		odgovori.add("carevali");
		odgovori.add("predlaga");
		odgovori.add("predilac");
		odgovori.add("gerilaca");
		odgovori.add("uvredila");
		odgovori.add("ugradila");
		odgovori.add("preudala");
		odgovori.add("prevlaci");
		odgovori.add("pregalac");
		odgovori.add("prevlada");
		odgovori.add("dragice");
		odgovori.add("previda");
		odgovori.add("prevaga");
		odgovori.add("prevali");
		odgovori.add("prevuci");
		odgovori.add("previla");
		odgovori.add("preliva");
		odgovori.add("prelivu");
		odgovori.add("predala");
		odgovori.add("predali");
		odgovori.add("guliver");
		odgovori.add("preduga");
		odgovori.add("predugi");
		odgovori.add("prediva");
		odgovori.add("gerilac");
		odgovori.add("gerilcu");
		odgovori.add("pridala");
		odgovori.add("gerilca");
		odgovori.add("prideva");
		odgovori.add("pridevu");
		odgovori.add("privela");
		odgovori.add("privedu");
		odgovori.add("prgavac");
		odgovori.add("pravilu");
		odgovori.add("pravila");
		odgovori.add("pravile");
		odgovori.add("pravicu");
		odgovori.add("pravica");
		odgovori.add("pravice");
		odgovori.add("gavrilu");
		odgovori.add("prugica");
		odgovori.add("plevara");
		odgovori.add("pledira");
		odgovori.add("placeva");
		odgovori.add("placevi");
		odgovori.add("pudlica");
		odgovori.add("pudlice");
		odgovori.add("gluvara");
		odgovori.add("pulicer");
		odgovori.add("pavlicu");
		odgovori.add("pavlice");
		odgovori.add("pavlica");
		odgovori.add("pavlaci");
		odgovori.add("parcela");
		odgovori.add("parcelu");
		odgovori.add("parceli");
		odgovori.add("gluvare");
		odgovori.add("gluvari");
		odgovori.add("glupara");
		odgovori.add("glupava");
		odgovori.add("glupave");
		odgovori.add("glupavi");
		odgovori.add("pelagra");
		odgovori.add("gluaci");
		odgovori.add("pegavca");
		odgovori.add("pegavac");
		odgovori.add("peglica");
		odgovori.add("perlica");
		odgovori.add("igarpe");
		odgovori.add("peglice");
		odgovori.add("perlice");
		odgovori.add("prevagu");
		odgovori.add("dragicu");
		odgovori.add("dragica");
		odgovori.add("dripaca");
		odgovori.add("duplira");
		odgovori.add("glavica");
		odgovori.add("glavice");
		odgovori.add("glavicu");
		odgovori.add("glavare");
		odgovori.add("rigveda");
		odgovori.add("euprava");
		odgovori.add("ludviga");
		odgovori.add("ludvig");
		odgovori.add("udavale");
		odgovori.add("udavali");
		odgovori.add("udavila");
		odgovori.add("udarali");
		odgovori.add("udarale");
		odgovori.add("udarile");
		odgovori.add("udarila");
		odgovori.add("glavari");
		odgovori.add("upadale");
		odgovori.add("upadali");
		odgovori.add("upadica");
		odgovori.add("upadice");
		odgovori.add("uparadi");
		odgovori.add("uparade");
		odgovori.add("gredica");
		odgovori.add("upravda");
		odgovori.add("uperila");
		odgovori.add("upecala");
		odgovori.add("upecali");
		odgovori.add("upirala");
		odgovori.add("upirale");
		odgovori.add("gruvali");
		odgovori.add("grupice");
		odgovori.add("uverila");
		odgovori.add("uvidela");
		odgovori.add("grupica");
		odgovori.add("gradivu");
		odgovori.add("uradila");
		odgovori.add("uradile");
		odgovori.add("uredila");
		odgovori.add("aralice");
		odgovori.add("aludira");
		odgovori.add("apelira");
		odgovori.add("vladica");
		odgovori.add("vladare");
		odgovori.add("vladari");
		odgovori.add("vladaru");
		odgovori.add("vedricu");
		odgovori.add("vedrica");
		odgovori.add("valcera");
		odgovori.add("valceru");
		odgovori.add("valceri");
		odgovori.add("varilac");
		odgovori.add("gradiva");
		odgovori.add("gradile");
		odgovori.add("ciglaru");
		odgovori.add("cipelar");
		odgovori.add("gradila");
		odgovori.add("vlade");
		odgovori.add("pega");
		odgovori.add("pege");
		odgovori.add("pegica");
		odgovori.add("pegice");
		odgovori.add("igla");
		odgovori.add("igle");
		odgovori.add("igra");
		odgovori.add("igre");
		odgovori.add("vir");
		odgovori.add("vlada");
		odgovori.add("udar");
		odgovori.add("cipela");
		odgovori.add("cipele");
		odgovori.add("gura");
		odgovori.add("gruva");
		
		resenje = new JTextField();
		resenje.setBackground(new Color(204, 255, 255));
		resenje.setForeground(Color.BLUE);
		resenje.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 20));
		resenje.setHorizontalAlignment(SwingConstants.CENTER);
		resenje.setBounds(26, 202, 620, 49);
		contentPane.add(resenje);
		resenje.setColumns(10);
		
		JLabel slovo1 = new JLabel("");
		slovo1.setHorizontalAlignment(SwingConstants.CENTER);
		slovo1.setForeground(Color.WHITE);
		slovo1.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 25));
		slovo1.setBounds(42, 30, 51, 49);
		contentPane.add(slovo1);
		
		JLabel slovo2 = new JLabel("");
		slovo2.setHorizontalAlignment(SwingConstants.CENTER);
		slovo2.setForeground(Color.WHITE);
		slovo2.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 25));
		slovo2.setBounds(150, 30, 51, 49);
		contentPane.add(slovo2);
		
		JLabel slovo3 = new JLabel("");
		slovo3.setHorizontalAlignment(SwingConstants.CENTER);
		slovo3.setForeground(Color.WHITE);
		slovo3.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 25));
		slovo3.setBounds(249, 30, 51, 49);
		contentPane.add(slovo3);
		
		JLabel slovo4 = new JLabel("");
		slovo4.setHorizontalAlignment(SwingConstants.CENTER);
		slovo4.setForeground(Color.WHITE);
		slovo4.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 25));
		slovo4.setBounds(347, 30, 51, 49);
		contentPane.add(slovo4);
		
		JLabel slovo5 = new JLabel("");
		slovo5.setHorizontalAlignment(SwingConstants.CENTER);
		slovo5.setForeground(Color.WHITE);
		slovo5.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 25));
		slovo5.setBounds(446, 30, 51, 49);
		contentPane.add(slovo5);
		
		JLabel slovo6 = new JLabel("");
		slovo6.setHorizontalAlignment(SwingConstants.CENTER);
		slovo6.setForeground(Color.WHITE);
		slovo6.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 25));
		slovo6.setBounds(555, 30, 51, 49);
		contentPane.add(slovo6);
		
		JLabel slovo7 = new JLabel("");
		slovo7.setHorizontalAlignment(SwingConstants.CENTER);
		slovo7.setForeground(Color.WHITE);
		slovo7.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 25));
		slovo7.setBounds(42, 104, 51, 49);
		contentPane.add(slovo7);
		
		JLabel slovo8 = new JLabel("");
		slovo8.setHorizontalAlignment(SwingConstants.CENTER);
		slovo8.setForeground(Color.WHITE);
		slovo8.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 25));
		slovo8.setBounds(150, 104, 51, 49);
		contentPane.add(slovo8);
		
		JLabel slovo9 = new JLabel("");
		slovo9.setHorizontalAlignment(SwingConstants.CENTER);
		slovo9.setForeground(Color.WHITE);
		slovo9.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 25));
		slovo9.setBounds(249, 102, 51, 49);
		contentPane.add(slovo9);
		
		JLabel slovo10 = new JLabel("");
		slovo10.setHorizontalAlignment(SwingConstants.CENTER);
		slovo10.setForeground(Color.WHITE);
		slovo10.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 25));
		slovo10.setBounds(347, 104, 51, 49);
		contentPane.add(slovo10);
		
		JLabel slovo11 = new JLabel("");
		slovo11.setHorizontalAlignment(SwingConstants.CENTER);
		slovo11.setForeground(Color.WHITE);
		slovo11.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 25));
		slovo11.setBounds(446, 102, 51, 49);
		contentPane.add(slovo11);
		
		JLabel slovo12 = new JLabel("");
		slovo12.setHorizontalAlignment(SwingConstants.CENTER);
		slovo12.setForeground(Color.WHITE);
		slovo12.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 25));
		slovo12.setBounds(555, 104, 51, 49);
		contentPane.add(slovo12);
		
		JButton postavka1 = new JButton("");	
		postavka1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				postavka1.setVisible(false);
				postavka(slovo1, slova);
			}
		});
		postavka1.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 20));
		postavka1.setForeground(Color.BLUE);
		postavka1.setBackground(Color.YELLOW);
		postavka1.setBounds(42, 30, 51, 51);
		contentPane.add(postavka1);
	
		
		JButton postavka2 = new JButton("");
		postavka2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				postavka2.setVisible(false);
				postavka(slovo2, slova);
			}
		});
		postavka2.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 20));
		postavka2.setForeground(Color.BLUE);
		postavka2.setBackground(Color.YELLOW);
		postavka2.setBounds(150, 30, 51, 51);
		contentPane.add(postavka2);
		
		
		JButton postavka3 = new JButton("");
		postavka3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				postavka3.setVisible(false);
				postavka(slovo3, slova);
			}
		});
		postavka3.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 20));
		postavka3.setForeground(Color.BLUE);
		postavka3.setBackground(Color.YELLOW);
		postavka3.setBounds(249, 30, 51, 51);
		contentPane.add(postavka3);
		
		JButton postavka4 = new JButton("");
		postavka4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				postavka4.setVisible(false);
				postavka(slovo4, slova);
			}
		});
		postavka4.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 20));
		postavka4.setForeground(Color.BLUE);
		postavka4.setBackground(Color.YELLOW);
		postavka4.setBounds(347, 30, 51, 51);
		contentPane.add(postavka4);
		
		JButton postavka5 = new JButton("");
		postavka5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				postavka5.setVisible(false);
				postavka(slovo5, slova);
			}
		});
		postavka5.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 20));
		postavka5.setForeground(Color.BLUE);
		postavka5.setBackground(Color.YELLOW);
		postavka5.setBounds(446, 30, 51, 51);
		contentPane.add(postavka5);
		
		JButton postavka6 = new JButton("");
		postavka6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				postavka6.setVisible(false);
				postavka(slovo6, slova);
			}
		});
		postavka6.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 20));
		postavka6.setForeground(Color.BLUE);
		postavka6.setBackground(Color.YELLOW);
		postavka6.setBounds(555, 30, 51, 51);
		contentPane.add(postavka6);
		
		JButton postavka7 = new JButton("");
		postavka7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				postavka7.setVisible(false);
				postavka(slovo7, slova);
			}
		});
		postavka7.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 20));
		postavka7.setForeground(Color.BLUE);
		postavka7.setBackground(Color.YELLOW);
		postavka7.setBounds(42, 102, 51, 51);
		contentPane.add(postavka7);
		
		JButton postavka8 = new JButton("");
		postavka8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				postavka8.setVisible(false);
				postavka(slovo8, slova);
			}
		});
		postavka8.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 20));
		postavka8.setForeground(Color.BLUE);
		postavka8.setBackground(Color.YELLOW);
		postavka8.setBounds(150, 102, 51, 51);
		contentPane.add(postavka8);
		
		JButton postavka9 = new JButton("");
		postavka9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				postavka9.setVisible(false);
				postavka(slovo9, slova);
			}
		});
		postavka9.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 20));
		postavka9.setForeground(Color.BLUE);
		postavka9.setBackground(Color.YELLOW);
		postavka9.setBounds(249, 102, 51, 51);
		contentPane.add(postavka9);
		
		JButton postavka10 = new JButton("");
		postavka10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				postavka10.setVisible(false);
				postavka(slovo10, slova);
			}
		});
		postavka10.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 20));
		postavka10.setForeground(Color.BLUE);
		postavka10.setBackground(Color.YELLOW);
		postavka10.setBounds(347, 102, 51, 51);
		contentPane.add(postavka10);
		
		JButton postavka11 = new JButton("");
		postavka11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				postavka11.setVisible(false);
				postavka(slovo11, slova);
			}
		});
		postavka11.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 20));
		postavka11.setForeground(Color.BLUE);
		postavka11.setBackground(Color.YELLOW);
		postavka11.setBounds(446, 102, 51, 51);
		contentPane.add(postavka11);
		
		JButton postavka12 = new JButton("");
		postavka12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				postavka12.setVisible(false);
				postavka(slovo12, slova);
			}
		});
		postavka12.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 20));
		postavka12.setForeground(Color.BLUE);
		postavka12.setBackground(Color.YELLOW);
		postavka12.setBounds(555, 102, 51, 51);
		contentPane.add(postavka12);
		
	
		JButton potvrdi = new JButton("Potvrdi");
		potvrdi.setForeground(Color.BLUE);
		potvrdi.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 16));
		potvrdi.setBackground(new Color(204, 255, 255));
		potvrdi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i=0; i<odgovori.size(); i++) {
					if(resenje.getText() != null && resenje.getText().equals(odgovori.get(i))) {
						resenje.setBackground(new Color(51, 255, 153));
						rec = resenje.getText();
						score3 =brojSlova(rec);
						JOptionPane.showMessageDialog(null, "Osvojili ste " +brojSlova(rec)+  " poena");
					}else {
						resenje.setBackground(Color.RED);
					}	
				}
			}
		});
		
		potvrdi.setBounds(274, 271, 124, 49);
		contentPane.add(potvrdi);
		
		JLabel Info = new JLabel("Resenje uneti malim slovima!");
		Info.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 16));
		Info.setForeground(Color.YELLOW);
		Info.setHorizontalAlignment(SwingConstants.CENTER);
		Info.setBounds(36, 271, 219, 49);
		contentPane.add(Info);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(TrecaIgra.class.getResource("/img/blue-vintage-wood-background.jpg")));
		label.setBounds(0, 0, 677, 351);
		contentPane.add(label);
		
		
		
	}
}
