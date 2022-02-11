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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;

public class box extends JFrame {

	JFrame fra;
	int posX=0,posY=0;
	private JPanel contentPane;
	private JTextField inp;
    String txt;
    private JTextField out;
    JLabel ptext;
    JLabel etext;
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		box b = new box();
		
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
	public box() {
		initialize();
	}
	
	private void initialize() {
		
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
		out.setText("V7uoW1UIkTJ57LhDNQMi9g==");
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
		ptext.setFont(new Font("Interstate", Font.PLAIN, 35));
		ptext.setForeground(Color.WHITE);
		ptext.setBounds(95, 94, 433, 66);
		fra.getContentPane().add(ptext);
		
		JLabel etext = new JLabel("Encrypted Text :");
		etext.setVisible(false);
		etext.setForeground(Color.WHITE);
		etext.setFont(new Font("Interstate", Font.PLAIN, 35));
		etext.setBounds(95, 94, 433, 66);
		fra.getContentPane().add(etext);
		

		encBut.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txt = inp.getText();
				inp.setVisible(false);
				out.setVisible(true);
				ptext.setVisible(false);
				etext.setVisible(true);
				encBut.setVisible(false);
			}
		});
		////////////////////////////////////////////////////////////////////////////////

		////////////////////////////////////////////////////////////////////////////////
		
	}
}
