package mimes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.SwingConstants;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.Component;

public class Window{

	JFrame frame;
	JButton Encrypt;
	JButton Decrypt;
	JButton cross;
	JButton minim;
	JButton aes;
	JButton des;
	JButton rsa;
	JButton dh;
	JButton ecdsa;
	JButton Bfish;
	JButton encBut;
	JLabel header;
	JLabel choose;
	JLabel Asym;
	static String input;
	int posX=0,posY=0;
	static int k=0;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					Window window = new Window();
					window.frame.setLocationRelativeTo(null); // to center the screen
					window.frame.setVisible(true);
					window.frame.setResizable(false); // stop resizing of window
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Window() {
		initialize();
	}
	void initialize() {
		frame = new JFrame();
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setUndecorated(true);
		
// Draggable Window		
		frame.getContentPane().addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				frame.setLocation(frame.getX() + e.getX() - posX, frame.getY() + e.getY() - posY);
			}
		});
		frame.getContentPane().addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				posX = e.getX();
				posY = e.getY();
			}
		});
		
// Button Style		
		JButton Encrypt = new JButton("Encrypt");   // button encrypt
		Encrypt.setFocusPainted(false);
		Encrypt.setBorderPainted(false);
		Encrypt.setAutoscrolls(false);
		Encrypt.setPreferredSize(new Dimension(0, 23));
		Encrypt.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		Encrypt.setBounds(273, 320, 338, 67);
		Encrypt.setFont(new Font("Y-Andermo", Font.PLAIN, 64));
		Encrypt.setBackground(Color.BLACK);
		Encrypt.setForeground(Color.WHITE);
		Encrypt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(Encrypt);
		
		
		JButton Decrypt = new JButton("Decrypt");   // button decrypt
		Decrypt.setFocusPainted(false);
		Decrypt.setBorderPainted(false);
		Decrypt.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		Decrypt.setBackground(new Color(255, 255, 255));
		Decrypt.setFont(new Font("Y-Andermo", Font.PLAIN, 62));
		Decrypt.setBackground(Color.BLACK);
		Decrypt.setForeground(Color.WHITE);
		Decrypt.setBounds(273, 441, 338, 67);
		frame.getContentPane().add(Decrypt);
		
		
		JButton Symmetric = new JButton("Symmetric");  //button symmetric
		Symmetric.setVisible(false);
		Symmetric.setSize(338, 67);
		Symmetric.setLocation(273, 320);
		Symmetric.setFocusPainted(false);
		Symmetric.setBorderPainted(false);
		Symmetric.setPreferredSize(new Dimension(0, 23));
		Symmetric.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		Symmetric.setBounds(273, 320, 338, 67);
		Symmetric.setFont(new Font("Doctor Glitch", Font.PLAIN, 30));
		Symmetric.setBackground(Color.BLACK);
		Symmetric.setForeground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(Symmetric);
		
		
		JButton Asymmetric = new JButton("Asymmetric");  //button asymmetric
		Asymmetric.setVisible(false);
		Asymmetric.setSize(338, 67);
		Asymmetric.setLocation(273, 441);
		Asymmetric.setFocusPainted(false);
		Asymmetric.setBorderPainted(false);
		Asymmetric.setPreferredSize(new Dimension(0, 23));
		Asymmetric.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		Asymmetric.setFont(new Font("Doctor Glitch", Font.PLAIN, 30));
		Asymmetric.setBackground(Color.BLACK);
		Asymmetric.setForeground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(Asymmetric);
		
		
		JButton aes = new JButton("AES");   // button AES
		aes.setFocusPainted(false);
		aes.setBorderPainted(false);
		aes.setAutoscrolls(false);
		aes.setVisible(false);
		aes.setPreferredSize(new Dimension(0, 23));
		aes.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		aes.setBounds(273, 275, 338, 67);
		aes.setFont(new Font("MetalblockUltra", Font.PLAIN, 54));
		aes.setBackground(Color.BLACK);
		aes.setForeground(Color.WHITE);
		aes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(aes);
		
		
		JButton des = new JButton("Triple DES");   // button 3DES
		des.setFocusPainted(false);
		des.setBorderPainted(false);
		des.setVisible(false);
		des.setAutoscrolls(false);
		des.setPreferredSize(new Dimension(0, 23));
		des.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		des.setBounds(273, 365, 338, 67);
		des.setFont(new Font("MetalblockUltra", Font.PLAIN, 54));
		des.setBackground(Color.BLACK);
		des.setForeground(Color.WHITE);
		des.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(des);
		
		
		JButton Bfish = new JButton("Blow Fish");   // button Blow Fish
		Bfish.setFocusPainted(false);
		Bfish.setBorderPainted(false);
		Bfish.setVisible(false);
		Bfish.setAutoscrolls(false);
		Bfish.setPreferredSize(new Dimension(0, 23));
		Bfish.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		Bfish.setBounds(273, 455, 338, 67);
		Bfish.setFont(new Font("MetalblockUltra", Font.PLAIN, 54));
		Bfish.setBackground(Color.BLACK);
		Bfish.setForeground(Color.WHITE);
		Bfish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(Bfish);
		
		
		JButton rsa = new JButton("RSA");   // button RSA
		rsa.setFocusPainted(false);
		rsa.setBorderPainted(false);
		rsa.setVisible(false);
		rsa.setAutoscrolls(false);
		rsa.setPreferredSize(new Dimension(0, 23));
		rsa.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		rsa.setBounds(273, 275, 338, 67);
		rsa.setFont(new Font("MetalblockUltra", Font.PLAIN, 54));
		rsa.setBackground(Color.BLACK);
		rsa.setForeground(Color.WHITE);
		rsa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(rsa);
		
		
		JButton dh = new JButton("Diffle Hellman");   // button Diffle-Hellman
		dh.setFocusPainted(false);
		dh.setBorderPainted(false);
		dh.setAutoscrolls(false);
		dh.setVisible(false);
		dh.setPreferredSize(new Dimension(0, 23));
		dh.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		dh.setBounds(252, 365, 384, 67);
		dh.setFont(new Font("MetalblockUltra", Font.PLAIN, 54));
		dh.setBackground(Color.BLACK);
		dh.setForeground(Color.WHITE);
		dh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(dh);
		
		
		JButton ecdsa = new JButton("ECDSA");   // button ECDSA
		ecdsa.setFocusPainted(false);
		ecdsa.setBorderPainted(false);
		ecdsa.setAutoscrolls(false);
		ecdsa.setVisible(false);
		ecdsa.setPreferredSize(new Dimension(0, 23));
		ecdsa.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		ecdsa.setBounds(273, 455, 338, 67);
		ecdsa.setFont(new Font("MetalblockUltra", Font.PLAIN, 54));
		ecdsa.setBackground(Color.BLACK);
		ecdsa.setForeground(Color.WHITE);
		ecdsa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(ecdsa);
	//  Logo - Menu Screen
		JLabel header = new JLabel("");
		ImageIcon head1 = new ImageIcon(this.getClass().getResource("/mm2.gif"));
        header.setIcon(head1);
		header.setBounds(8, 0, 884, 306);
		frame.getContentPane().add(header);
		
	//  Logo - Program Screen
		JLabel plogo = new JLabel("");
		ImageIcon head2 = new ImageIcon(this.getClass().getResource("/stat.png"));
		plogo.setIcon(head2);
		plogo.setBounds(0, 0, 125, 40);
		frame.getContentPane().add(plogo);
		
	//  Window Control Buttons
		JLabel cross = new JLabel("");
		cross.setVisible(false);
		cross.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			System.exit(0);
			}
		});
		cross.setBounds(867, 7, 27, 27);
		frame.getContentPane().add(cross);
		ImageIcon close = new ImageIcon(this.getClass().getResource("/crs27.png"));
		cross.setIcon(close);
		
		JLabel minim = new JLabel("");  //minimize
		minim.setVisible(false);
		minim.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			frame.setState(Frame.ICONIFIED);
			}
		});
		minim.setBounds(867, 35, 27, 18);
		frame.getContentPane().add(minim);
		ImageIcon mini = new ImageIcon(this.getClass().getResource("/min27.png"));
		minim.setIcon(mini);
		
	// Choose Method Text	
		JLabel choose = new JLabel("Choose Encryption Method");
		choose.setFont(new Font("Vermin Vibes", Font.PLAIN, 48));
		choose.setForeground(Color.WHITE);
		choose.setBounds(144, 119, 612, 120);
		frame.getContentPane().add(choose);
	// Asymmetrical Encryption Text
		JLabel Asym = new JLabel("Asymmetrical Encryption");
		Asym.setForeground(Color.WHITE);
		Asym.setVisible(false);
		Asym.setFont(new Font("Y-Andermo", Font.PLAIN, 70));
		Asym.setBounds(158, 119, 584, 120);
		frame.getContentPane().add(Asym);
	// Symmetrical Encryption Text
		JLabel Sym = new JLabel("Syymmetrical Encryption");
		Sym.setForeground(Color.WHITE);
		Sym.setVisible(false);
		Sym.setFont(new Font("Y-Andermo", Font.PLAIN, 70));
		Sym.setBounds(158, 119, 584, 120);
		frame.getContentPane().add(Sym);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setLayout(null);
		
		JLabel credits = new JLabel("Submitted By :- Pallav Vyas, Suryaansh Gupta, Bhavya Sehl, Anshuman Goyal");
		credits.setAlignmentY(Component.TOP_ALIGNMENT);
		credits.setHorizontalAlignment(SwingConstants.CENTER);
		credits.setFont(new Font("Impact", Font.PLAIN, 17));
		credits.setForeground(Color.WHITE);
		credits.setBounds(5, 550, 891, 57);
		frame.getContentPane().add(credits);

		
		final String secretKey = "aesencryption";
		String text = AES.encrypt(input, secretKey);
		
		
		
	//  Window Attributes
		frame.setBounds(100, 100, 901, 601);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
// Buttons
		
		Decrypt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Decrypt.setBackground(Color.WHITE);
				Decrypt.setForeground(Color.BLACK);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Decrypt.setBackground(null);
				Decrypt.setForeground(Color.WHITE);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				header.setVisible(false);
				Encrypt.setVisible(false);
				Decrypt.setVisible(false);
				cross.setVisible(true);
				minim.setVisible(true);
				Symmetric.setVisible(true);
				Asymmetric.setVisible(true);
				credits.setVisible(false);
			}
		});	
		Encrypt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
			Encrypt.setBackground(Color.WHITE);
			Encrypt.setForeground(Color.BLACK);
			}
			@Override
			public void mouseExited(MouseEvent e) {
			Encrypt.setBackground(null);
			Encrypt.setForeground(Color.WHITE);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				header.setVisible(false);
				Encrypt.setVisible(false);
				Decrypt.setVisible(false);
				cross.setVisible(true);
				minim.setVisible(true);
				Symmetric.setVisible(true);
				Asymmetric.setVisible(true);
				credits.setVisible(false);
				k++;
			}
		});
		Symmetric.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Symmetric.setBackground(Color.WHITE);
				Symmetric.setForeground(Color.BLACK);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Symmetric.setBackground(null);
				Symmetric.setForeground(Color.WHITE);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Symmetric.setVisible(false);
				Asymmetric.setVisible(false);
				choose.setVisible(false);
				aes.setVisible(true);
				des.setVisible(true);
				Bfish.setVisible(true);
				Sym.setVisible(true);
			}
		});	
		Asymmetric.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
			Asymmetric.setBackground(Color.WHITE);
			Asymmetric.setForeground(Color.BLACK);
			}
			@Override
			public void mouseExited(MouseEvent e) {
			Asymmetric.setBackground(null);
			Asymmetric.setForeground(Color.WHITE);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Symmetric.setVisible(false);
				Asymmetric.setVisible(false);
				choose.setVisible(false);
				rsa.setVisible(true);
				dh.setVisible(true);
				ecdsa.setVisible(true);
				Asym.setVisible(true);
				
			}
		});
		aes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				aes.setBackground(Color.WHITE);
				aes.setForeground(Color.BLACK);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				aes.setBackground(null);
				aes.setForeground(Color.WHITE);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				aes.setVisible(false);
				des.setVisible(false);
				Bfish.setVisible(false);
				Sym.setVisible(false);
				AES1 a = new AES1();
				a.fra.setVisible(true);
				a.fra.setLocationRelativeTo(null);
				frame.setVisible(false);
			
			}
		});
		des.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				des.setBackground(Color.WHITE);
				des.setForeground(Color.BLACK);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				des.setBackground(null);
				des.setForeground(Color.WHITE);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				aes.setVisible(false);
				des.setVisible(false);
				Bfish.setVisible(false);
				Sym.setVisible(false);
				tripleDES1 b1 = new tripleDES1();
				b1.fra.setVisible(true);
				b1.fra.setLocationRelativeTo(null);
				frame.setVisible(false);
		
			}
		});
		Bfish.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Bfish.setBackground(Color.WHITE);
				Bfish.setForeground(Color.BLACK);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Bfish.setBackground(null);
				Bfish.setForeground(Color.WHITE);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				aes.setVisible(false);
				des.setVisible(false);
				Bfish.setVisible(false);
				Sym.setVisible(false);
				BlowFish1 b = new BlowFish1();
				b.fra.setVisible(true);
				b.fra.setLocationRelativeTo(null);
				frame.setVisible(false);
			}
		});
		rsa.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				rsa.setBackground(Color.WHITE);
				rsa.setForeground(Color.BLACK);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				rsa.setBackground(null);
				rsa.setForeground(Color.WHITE);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				RSA1 r = new RSA1();
				r.fra.setVisible(true);
				r.fra.setLocationRelativeTo(null);
				rsa.setVisible(false);
				dh.setVisible(false);
				ecdsa.setVisible(false);
				Asym.setVisible(false);
				frame.setVisible(false);
			}
		});
		dh.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				dh.setBackground(Color.WHITE);
				dh.setForeground(Color.BLACK);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				dh.setBackground(null);
				dh.setForeground(Color.WHITE);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Diffie_Hellman1 di = new Diffie_Hellman1();
				di.fra.setVisible(true);
				di.fra.setLocationRelativeTo(null);
				rsa.setVisible(false);
				dh.setVisible(false);
				ecdsa.setVisible(false);
				Asym.setVisible(false);
				frame.setVisible(false);
				
			}
		});
		ecdsa.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				ecdsa.setBackground(Color.WHITE);
			ecdsa.setForeground(Color.BLACK);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				ecdsa.setBackground(null);
				ecdsa.setForeground(Color.WHITE);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				ECDSA1 ec = new ECDSA1();
				ec.fra.setVisible(true);
				ec.fra.setLocationRelativeTo(null);
				rsa.setVisible(false);
				dh.setVisible(false);
				ecdsa.setVisible(false);
				Asym.setVisible(false);
				frame.setVisible(false);
			}
		});
	}
}