package seis;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Seis extends JFrame implements ActionListener,MouseListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JLabel etiNombre;
	JButton btnCentro,btnEsquina,btnAgrandar,btnAchicar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Seis frame = new Seis();
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
	public Seis() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 302);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 etiNombre = new JLabel("Santiago");
		etiNombre.setHorizontalAlignment(SwingConstants.CENTER);
		etiNombre.setForeground(Color.WHITE);
		etiNombre.setBackground(new Color(64, 0, 64));
		etiNombre.setOpaque(true);


		etiNombre.setBackground(new Color(51, 153, 255));
		etiNombre.setFont(new Font("Tw Cen MT", Font.PLAIN, 40));
		etiNombre.setBounds(114, 11, 200, 60);
		contentPane.add(etiNombre);
		
		 btnEsquina = new JButton("Esquina");
		btnEsquina.setBounds(101, 121, 89, 23);
		btnEsquina.addMouseListener(this);
		btnEsquina.addActionListener(this);
		contentPane.add(btnEsquina);
		
		 btnCentro = new JButton("Centro");
		btnCentro.setBounds(101, 155, 89, 23);
		btnCentro.addMouseListener(this);

		btnCentro.addActionListener(this);

		contentPane.add(btnCentro);
		
		 btnAgrandar = new JButton("Agrandar");
		btnAgrandar.setBounds(194, 121, 89, 23);
		btnAgrandar.addActionListener(this);
		btnAgrandar.addMouseListener(this);


		contentPane.add(btnAgrandar);
		
		 btnAchicar = new JButton("Achicar");
		btnAchicar.setBounds(200, 155, 89, 23);
		btnAchicar.addActionListener(this);
		btnAchicar.addMouseListener(this);

		contentPane.add(btnAchicar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==btnEsquina) {
				
			etiNombre.setLocation(20, 20);
			
		}else if (e.getSource()==btnCentro) {
			
		etiNombre.setLocation(120,20);
		
	}else if (e.getSource()==btnAgrandar) {
		
	etiNombre.setSize(200, 100);	
	}else if (e.getSource()==btnAchicar) {
		etiNombre.setSize(100, 30);
		

	}

	
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		
		if (e.getSource()==btnEsquina) {
			btnEsquina.setSize(100,30);
		} if (e.getSource()==btnCentro) {
			btnCentro.setSize(100,30);

		} if (e.getSource()==btnAchicar) {
			btnAchicar.setSize(100,30);

		} if (e.getSource()==btnAgrandar) {
			btnAgrandar.setSize(100,30);

		}
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public void mouseExited(MouseEvent e) {
		if (e.getSource()==btnEsquina) {
			btnEsquina.setSize(89,23);
		} if (e.getSource()==btnCentro) {
			btnCentro.setSize(89,23);

		} if (e.getSource()==btnAchicar) {
			btnAchicar.setSize(89,23);

		} if (e.getSource()==btnAgrandar) {
			btnAgrandar.setSize(89,23);

		}
		
		
	}
}
