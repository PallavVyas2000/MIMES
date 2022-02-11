package mimes;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.Timer;
import javax.swing.JProgressBar;

public class SplashScreen extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		SplashScreen scr = new SplashScreen();
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					scr.setLocationRelativeTo(null); // to center the loading screen
					scr.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		Window w = new Window();  //displaying new window
		try {
			for(int i=0;i<100;i++)
			{
				Thread.sleep(80);
				scr.progressBar.setValue(i);
			}
				scr.setVisible(false);
			}
		catch(Exception e)
			{	
			}
		
		new Window().frame.setVisible(false);
		w.frame.setVisible(true);
		w.frame.setLocationRelativeTo(null);

	}

	/*
	 * Create the frame.
	 */
	
	public SplashScreen() {
		getContentPane().setBackground(Color.BLACK);
		getContentPane().setLayout(null);
		
		
// Loading animation insertion		
		lblLoad = new JLabel("");
		ImageIcon icon = new ImageIcon(this.getClass().getResource("/load.gif"));
		lblLoad.setBounds(261, 244, 260, 195);
		getContentPane().add(lblLoad);
		
		
// Adding Delay to loading animation		
		ActionListener taskPerformer = new ActionListener() {
	        public void actionPerformed(ActionEvent evt) {
	            
	        	lblLoad.setIcon(icon);
	        }
	    };
		Timer timer = new Timer(3700 ,taskPerformer);
        timer.setRepeats(false);
        timer.start();
		
		
// MIMES animation insertion        
		Logo = new JLabel("");
		ImageIcon logo1 = new ImageIcon(this.getClass().getResource("/logo.gif"));
        Logo.setIcon(logo1);
		Logo.setBounds(10, 0, 780, 270);
		getContentPane().add(Logo);
		
		progressBar = new JProgressBar();
		progressBar.setBorderPainted(false);
		progressBar.setForeground(Color.WHITE);
		progressBar.setBackground(Color.BLACK);
		progressBar.setBounds(0, 447, 800, 3);
		getContentPane().add(progressBar);
		
		
		
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 500, 800, 450);
		
		
	}
	// Variable Declarations
	
	private javax.swing.JLabel Logo;
	private javax.swing.JProgressBar progressBar;
	private javax.swing.JLabel lblLoad;
	
}
