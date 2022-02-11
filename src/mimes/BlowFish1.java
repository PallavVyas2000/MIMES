package mimes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
public class BlowFish1 extends JFrame {

	JFrame fra;
	int posX=0,posY=0;
	public JPanel contentPane;
	public JTextField inp;
    public JTextField out;
    JLabel ptext;
    JLabel etext;
    byte[] skey = new byte[1000];
    String skeyString;
    static byte[] raw;
    String inputMessage,encryptedData,decryptedMessage;
    static String e;
    static String d;

    /////

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		BlowFish1 b = new BlowFish1();

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					b.fra.setVisible(true);
					b.fra.setLocationRelativeTo(null); // to center the screen
					b.fra.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the frame.
	 */
	public BlowFish1() {
		try {
			initialize();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void initialize() throws Exception {
		///////////
		 // create a key generator based upon the Blowfish cipher
	    KeyGenerator keygenerator = KeyGenerator.getInstance("Blowfish");

	    // create a key
	    SecretKey secretkey = keygenerator.generateKey();

	    // create a cipher based upon Blowfish
	    Cipher cipher = Cipher.getInstance("Blowfish");

	    // initialise cipher to with secret key
	    cipher.init(Cipher.ENCRYPT_MODE, secretkey);

	    // get the text to encrypt
	    String inputText = inp.getText();

	    // encrypt message
	    byte[] encrypted = cipher.doFinal(inputText.getBytes());
	    // re-initialize the cipher to be in decrypt mode
	    cipher.init(Cipher.DECRYPT_MODE, secretkey);
	    // decrypt message
	    byte[] decrypted = cipher.doFinal(inputText.getBytes());
	    // and display the results
//	    JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),
//	                                  "encrypted text: " + new String(encrypted) + "\n" +
//	                                  "decrypted text: " + new String(decrypted));
	    e = new String(encrypted);
	    d = new String(decrypted);

		/////////
		fra = new JFrame();
		fra.setLocationRelativeTo(null);
		fra.getContentPane().setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		fra.getContentPane().setBackground(Color.BLACK);
		fra.setUndecorated(true);

		
		// Draggable Window		
				fra.getContentPane().addMouseMotionListener(new MouseMotionAdapter() {
					@Override
					public void mouseDragged(MouseEvent e) {
						fra.setLocation(fra.getX() + e.getX() - posX, fra.getY() + e.getY() - posY);
					}
				});
				fra.getContentPane().addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						posX = e.getX();
						posY = e.getY();
					}
				});
		fra.setBounds(100, 100, 901, 601);
		fra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
	//  Logo - Program Screen
			JLabel plogo = new JLabel("");
			ImageIcon head2 = new ImageIcon(this.getClass().getResource("/stat.png"));
			plogo.setIcon(head2);
			plogo.setBounds(0, 0, 125, 40);
			fra.getContentPane().add(plogo);
			
		//  Window Control Buttons
		JLabel cross = new JLabel("");
		cross.setVisible(true);
		cross.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			System.exit(0);
			}
		});
		fra.getContentPane().setLayout(null);
		cross.setBounds(867, 7, 27, 27);
		fra.getContentPane().add(cross);
		ImageIcon close = new ImageIcon(this.getClass().getResource("/crs27.png"));
		cross.setIcon(close);
		
		JLabel minim = new JLabel("");  //minimize
		minim.setVisible(true);
		minim.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			fra.setState(Frame.ICONIFIED);
			}
		});
		minim.setBounds(867, 35, 27, 27);
		fra.getContentPane().add(minim);
		ImageIcon mini = new ImageIcon(this.getClass().getResource("/min27.png"));
		minim.setIcon(mini);
		
		JButton encBut = new JButton("Submit");
		encBut.setFocusPainted(false);
		encBut.setBorderPainted(false);
		encBut.setVisible(true);
		encBut.setAutoscrolls(false);
		encBut.setPreferredSize(new Dimension(0, 23));
		encBut.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		encBut.setFont(new Font("Y-Andermo", Font.PLAIN, 64));
		encBut.setBackground(Color.BLACK);
		encBut.setForeground(Color.WHITE);
		fra.getContentPane().setLayout(null);
		encBut.setBounds(362, 477, 177, 67);
		fra.getContentPane().add(encBut);
		
		inp = new JTextField();
		inp.setFont(new Font("OCR-A BT", Font.PLAIN, 35));
		inp.setBorder(null);
		inp.setOpaque(false);
		inp.setForeground(Color.WHITE);
		inp.setBackground(Color.BLACK);
		inp.setBounds(142, 186, 616, 201);
		fra.getContentPane().add(inp);
		inp.setColumns(10);
		
		out = new JTextField();
		out.setVisible(false);

		out.setEditable(false);
		out.setFont(new Font("OCR-A BT", Font.PLAIN, 35));
		out.setBorder(null);
		out.setOpaque(false);
		out.setForeground(Color.WHITE);
		out.setBackground(Color.BLACK);
		out.setBounds(142, 186, 616, 201);
		fra.getContentPane().add(out);
		out.setColumns(10);
		
		JLabel ptext = new JLabel("Enter PlainText :");
		if(Window.k>0) {
			ptext.setVisible(true);
		}
		else {
			ptext.setVisible(false);
		}
		ptext.setFont(new Font("Interstate", Font.PLAIN, 35));
		ptext.setForeground(Color.WHITE);
		ptext.setBounds(95, 94, 433, 66);
		fra.getContentPane().add(ptext);
		
		JLabel etext = new JLabel("Encrypted Text :");
		if(Window.k>0) {
			etext.setVisible(false);
		}
		else {
			etext.setVisible(true);
		}
		etext.setForeground(Color.WHITE);
		etext.setFont(new Font("Interstate", Font.PLAIN, 35));
		etext.setBounds(95, 94, 433, 66);
		fra.getContentPane().add(etext);
		
		JLabel dtext = new JLabel("Decrypted Text :");
		dtext.setVisible(false);
		dtext.setForeground(Color.WHITE);
		dtext.setFont(new Font("Interstate", Font.PLAIN, 35));
		dtext.setBounds(95, 94, 433, 66);
		fra.getContentPane().add(dtext);

		encBut.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				BlowFish1 bf = new BlowFish1();
				try {
					bf = new BlowFish1();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				inp.setVisible(false);
				out.setVisible(true);
			    inputMessage=inp.getText();
				//if(Window.k<1) {encrypted = inputText.getBytes();}
			    System.out.println(new String(encrypted));
			    System.out.println(new String(decrypted));
				if(Window.k>0)
				{
					ptext.setVisible(false);
					etext.setVisible(true);
					out.setText(BlowFish1.e);
				}
				else 
				{
					etext.setVisible(false);
					dtext.setVisible(true);
					out.setText(BlowFish1.d);
				}
				encBut.setVisible(false);
		        
		        
			}
		});
		////////////////////////////////////////////////////////////////////////////////

		////////////////////////////////////////////////////////////////////////////////
		
	}
}
