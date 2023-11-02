package siete;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Siete extends JFrame implements ActionListener {

	private JPanel contentPane ;
	JLabel etiTexto;
	JButton btnAzul,btnRojo,btnVerde,btnFondoAzul,btnFondoRojo,btnFondoVerde,btnOpaca,btnTransparente;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Siete frame = new Siete();
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
	public Siete() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 etiTexto = new JLabel("HOLA");
		 etiTexto.setBackground(new Color(128, 128, 128));
		etiTexto.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 33));
		etiTexto.setHorizontalAlignment(SwingConstants.CENTER);
		etiTexto.setBounds(93, 38, 247, 81);
		contentPane.add(etiTexto);
		
		
		 btnAzul = new JButton("Azul");
		btnAzul.setBounds(10, 176, 89, 23);
		contentPane.add(btnAzul);
		btnAzul.addActionListener(this);
		
		 btnRojo = new JButton("Rojo");
		btnRojo.setBounds(10, 210, 89, 23);
		contentPane.add(btnRojo);
		btnRojo.addActionListener(this);

		
		 btnVerde = new JButton("Verde");
		btnVerde.addActionListener(this);
		btnVerde.setBounds(106, 176, 89, 23);
		contentPane.add(btnVerde);
		
		 btnFondoAzul = new JButton("Fondo Azul");
		btnFondoAzul.setBounds(233, 176, 89, 23);
		contentPane.add(btnFondoAzul);
		btnFondoAzul.addActionListener(this);

		
		 btnFondoVerde = new JButton("Fondo Verde");
		btnFondoVerde.setBounds(334, 176, 100, 23);
		contentPane.add(btnFondoVerde);
		btnFondoVerde.addActionListener(this);
		
		btnFondoRojo = new JButton("Fondo Rojo");
		btnFondoRojo.setBounds(333, 210, 89, 23);
		contentPane.add(btnFondoRojo);
		btnFondoRojo.addActionListener(this);
		
		btnOpaca = new JButton("Opaca");
		btnOpaca.setBounds(111, 210, 89, 23);
		contentPane.add(btnOpaca);
		btnOpaca.addActionListener(this);
		
		btnTransparente = new JButton("Transparente");
		btnTransparente.setBounds(233, 210, 89, 23);
		contentPane.add(btnTransparente);
		btnTransparente.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnAzul) {
			etiTexto.setForeground(Color.BLUE);
			
		}else if (e.getSource()==btnRojo) {
			etiTexto.setForeground(Color.RED);

		}else if (e.getSource()==btnVerde) {
			etiTexto.setForeground(Color.GREEN);

		}else if (e.getSource()==btnFondoAzul) {
			etiTexto.setBackground(Color.BLUE);

		}else if (e.getSource()==btnFondoRojo) {
			etiTexto.setBackground(Color.RED);

		}else if (e.getSource()==btnFondoVerde) {
			etiTexto.setBackground(Color.GREEN);

		}else if (e.getSource()==btnTransparente) {
			etiTexto.setOpaque(false);

		}else if (e.getSource()==btnOpaca) {
			etiTexto.setOpaque(true);

		}
	}
}
