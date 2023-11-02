package quinto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.w3c.dom.events.EventTarget;
import org.w3c.dom.events.MouseEvent;
import org.w3c.dom.views.AbstractView;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseListener;

import javax.swing.SwingConstants;

public class Quinto extends JFrame implements MouseListener{

	private JPanel contentPane;
	JLabel etiPal1,etiPal2,etiPal3,etiPal4,etiOcultar;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Quinto frame = new Quinto();
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
	public Quinto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		etiPal1 = new JLabel("A");
		etiPal1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		etiPal1.setBounds(41, 35, 46, 14);
		contentPane.add(etiPal1);
		
		etiPal2 = new JLabel("C");
		etiPal2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		etiPal2.setBounds(41, 194, 46, 14);
		contentPane.add(etiPal2);
		
		etiPal3 = new JLabel("B");
		etiPal3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		etiPal3.setBounds(346, 35, 46, 14);
		contentPane.add(etiPal3);
		
		etiPal4 = new JLabel("D");
		etiPal4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		etiPal4.setBounds(346, 194, 46, 14);
		contentPane.add(etiPal4);
		
		etiOcultar = new JLabel("OCULTAR");
		etiOcultar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		etiOcultar.setHorizontalAlignment(SwingConstants.CENTER);
		etiOcultar.setBounds(170, 107, 85, 25);
		etiOcultar.addMouseListener(this);
		contentPane.add(etiOcultar);
		
		
		
		
	}

	
	

	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) {
		etiPal1.setVisible(false);
		etiPal2.setVisible(false);
		etiPal3.setVisible(false);
		etiPal4.setVisible(false);
		
	}

	@Override
	public void mouseExited(java.awt.event.MouseEvent e) {
		etiPal1.setVisible(true);
		etiPal2.setVisible(true);
		etiPal3.setVisible(true);
		etiPal4.setVisible(true);		
	}
}
