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

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import java.awt.ComponentOrientation;

public class Diffie_Hellman1 extends JFrame {

	JFrame fra;
	int posX=0,posY=0;
	public JPanel contentPane;
	public JTextField pm;
	public JTextField gm;
	public JTextField am;
	public JTextField bm;
    public JTextField out;
    JLabel mod;
    JLabel root;
    JLabel Alice;
    JLabel Bob;
    JLabel etext;
//    int p;
//    int a;
//    int g;
//    int b;
//    public int S_A;
//    public int S_B;
//    public int A;
//    public int B;
    /////
 
	
    

    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		Diffie_Hellman1 b = new Diffie_Hellman1();
		
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
	public Diffie_Hellman1() {
		initialize();
	}
	
	void initialize() {
		
		
		
		
		
		
		
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
		encBut.setAutoscrolls(false);
		encBut.setPreferredSize(new Dimension(0, 23));
		encBut.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		encBut.setFont(new Font("Y-Andermo", Font.PLAIN, 64));
		encBut.setBackground(Color.BLACK);
		encBut.setForeground(Color.WHITE);
		fra.getContentPane().setLayout(null);
		encBut.setBounds(362, 477, 177, 67);
		fra.getContentPane().add(encBut);
		fra.getContentPane().setLayout(null);
		
		pm = new JTextField();
		pm.setFont(new Font("OCR-A BT", Font.PLAIN, 35));
		pm.setBorder(null);
		pm.setOpaque(false);
		pm.setForeground(Color.WHITE);
		pm.setBackground(Color.BLACK);
		pm.setBounds(83, 186, 309, 79);
		fra.getContentPane().add(pm);
		pm.setColumns(10);
		
		gm = new JTextField();
		gm.setFont(new Font("OCR-A BT", Font.PLAIN, 35));
		gm.setBorder(null);
		gm.setOpaque(false);
		gm.setForeground(Color.WHITE);
		gm.setBackground(Color.BLACK);
		gm.setBounds(505, 186, 309, 79);
		fra.getContentPane().add(gm);
		gm.setColumns(10);

		am = new JTextField();
		am.setFont(new Font("OCR-A BT", Font.PLAIN, 35));
		am.setBorder(null);
		am.setOpaque(false);
		am.setForeground(Color.WHITE);
		am.setBackground(Color.BLACK);
		am.setBounds(83, 387, 309, 79);
		fra.getContentPane().add(am);
		am.setColumns(10);
		
		bm = new JTextField();
		bm.setFont(new Font("OCR-A BT", Font.PLAIN, 35));
		bm.setBorder(null);
		bm.setOpaque(false);
		bm.setForeground(Color.WHITE);
		bm.setBackground(Color.BLACK);
		bm.setBounds(505, 387, 309, 79);
		fra.getContentPane().add(bm);
		bm.setColumns(10);
		
		JLabel mod = new JLabel("Enter the value of modulo(p)");
		mod.setFont(new Font("Interstate", Font.PLAIN, 24));
		mod.setForeground(Color.WHITE);
		mod.setBounds(78, 94, 334, 66);
		fra.getContentPane().add(mod);
		
		JLabel root = new JLabel("Enter the root of modulo(p)");
		root.setForeground(Color.WHITE);
		root.setFont(new Font("Interstate", Font.PLAIN, 24));
		root.setBounds(505, 94, 327, 66);
		fra.getContentPane().add(root);
		
		JLabel Alice = new JLabel("Select 1st secret no of Alice");
		Alice.setForeground(Color.WHITE);
		Alice.setFont(new Font("Interstate", Font.PLAIN, 24));
		Alice.setBounds(83, 289, 327, 66);
		fra.getContentPane().add(Alice);
		
		JLabel Bob = new JLabel("Select 2nd secret no of Bob");
		Bob.setForeground(Color.WHITE);
		Bob.setFont(new Font("Interstate", Font.PLAIN, 24));
		Bob.setBounds(505, 289, 321, 66);
		fra.getContentPane().add(Bob);
		
		out = new JTextField();
		out.setText("Alice and Bob cannot share information  with each other");
		out.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		out.setHorizontalAlignment(SwingConstants.CENTER);
		out.setVisible(false);
		out.setEditable(false);
		out.setFont(new Font("OCR-A BT", Font.PLAIN, 26));
		out.setBorder(null);
		out.setOpaque(false);
		out.setForeground(Color.WHITE);
		out.setBackground(Color.BLACK);
		out.setBounds(24, 186, 853, 201);
		fra.getContentPane().add(out);
		out.setColumns(1);

		encBut.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				am.setVisible(false);
				root.setVisible(false);
				mod.setVisible(false);
				Alice.setVisible(false);
				Bob.setVisible(false);
				bm.setVisible(false);
				gm.setVisible(false);
				pm.setVisible(false);
				out.setVisible(true);
				encBut.setVisible(false);
				int p = Integer.valueOf(pm.getText());
				int g = Integer.valueOf(gm.getText());
				
				int a = Integer.valueOf(am.getText());
				int b = Integer.valueOf(bm.getText());
				int A = (int)Math.pow(g,a)%p; 
				int B = (int)Math.pow(g,b)%p; 
				int S_A = (int)Math.pow(B,a)%p; 
				int S_B =(int)Math.pow(A,b)%p; 
				if(S_A==S_B) {
					out.setText("They shared a secret key ="+ Integer.toString(S_A));}
				else { out.setText("Alice and Bob cannot share information with each other");}
			}
		});
		////////////////////////////////////////////////////////////////////////////////

		////////////////////////////////////////////////////////////////////////////////
		
		
		
}}
