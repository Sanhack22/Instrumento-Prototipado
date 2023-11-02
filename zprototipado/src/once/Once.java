package once;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Color;
import javax.swing.JButton;

public class Once extends JFrame implements MouseListener,ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JLabel etiUno,etiDos,etiTres,etiCuatro,etiCinco,etiSeis,etiSiete,etiOcho,etiNueve,etiDiez,txtNumero;
	JButton btnBorrar;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Once frame = new Once();
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
	public Once() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 437);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 etiUno = new JLabel("0");
		etiUno.setFont(new Font("Tahoma", Font.PLAIN, 15));
		etiUno.setHorizontalAlignment(SwingConstants.CENTER);
		etiUno.setBounds(111, 200, 52, 29);
		etiUno.addMouseListener(this);
		contentPane.add(etiUno);
		
		 etiDos = new JLabel("1");
		etiDos.setBackground(Color.WHITE);
		etiDos.setHorizontalAlignment(SwingConstants.CENTER);
		etiDos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		etiDos.setBounds(37, 40, 52, 29);
		etiDos.addMouseListener(this);

		contentPane.add(etiDos);
		
		 etiTres = new JLabel("2");
		etiTres.setHorizontalAlignment(SwingConstants.CENTER);
		etiTres.setFont(new Font("Tahoma", Font.PLAIN, 15));
		etiTres.setBounds(111, 40, 52, 29);
		etiTres.addMouseListener(this);

		contentPane.add(etiTres);
		
		 etiCuatro = new JLabel("3");
		etiCuatro.setHorizontalAlignment(SwingConstants.CENTER);
		etiCuatro.setFont(new Font("Tahoma", Font.PLAIN, 15));
		etiCuatro.setBounds(194, 40, 52, 29);
		etiCuatro.addMouseListener(this);

		contentPane.add(etiCuatro);
		
		 etiCinco = new JLabel("4");
		etiCinco.setHorizontalAlignment(SwingConstants.CENTER);
		etiCinco.setFont(new Font("Tahoma", Font.PLAIN, 15));
		etiCinco.setBounds(37, 95, 52, 29);
		etiCinco.addMouseListener(this);

		contentPane.add(etiCinco);
		
		 etiSeis = new JLabel("5");
		etiSeis.setHorizontalAlignment(SwingConstants.CENTER);
		etiSeis.setFont(new Font("Tahoma", Font.PLAIN, 15));
		etiSeis.setBounds(111, 95, 52, 29);
		etiSeis.addMouseListener(this);

		contentPane.add(etiSeis);
		 etiSiete = new JLabel("6");
		etiSiete.setHorizontalAlignment(SwingConstants.CENTER);
		etiSiete.setFont(new Font("Tahoma", Font.PLAIN, 15));
		etiSiete.setBounds(194, 95, 52, 29);
		etiSiete.addMouseListener(this);

		contentPane.add(etiSiete);
		
		 etiOcho = new JLabel("7");
		etiOcho.setHorizontalAlignment(SwingConstants.CENTER);
		etiOcho.setFont(new Font("Tahoma", Font.PLAIN, 15));
		etiOcho.setBounds(37, 147, 52, 29);
		etiOcho.addMouseListener(this);

		contentPane.add(etiOcho);
		
		 etiNueve = new JLabel("8");
		etiNueve.setHorizontalAlignment(SwingConstants.CENTER);
		etiNueve.setFont(new Font("Tahoma", Font.PLAIN, 15));
		etiNueve.setBounds(111, 147, 52, 29);
		etiNueve.addMouseListener(this);

		contentPane.add(etiNueve);
		
		 etiDiez = new JLabel("9");
		etiDiez.setHorizontalAlignment(SwingConstants.CENTER);
		etiDiez.setFont(new Font("Tahoma", Font.PLAIN, 15));
		etiDiez.setBounds(194, 147, 52, 29);
		etiDiez.addMouseListener(this);
		contentPane.add(etiDiez);
		
		 txtNumero = new JLabel("Numero:");
		txtNumero.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumero.setBounds(351, 104, 189, 20);
		contentPane.add(txtNumero);
		
		 btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(303, 205, 89, 23);
		btnBorrar.addActionListener(this);
		contentPane.add(btnBorrar);
		
	}

	
	@Override
	public void mouseEntered(MouseEvent e) {
		
		if (e.getSource()==etiUno) {
			
			txtNumero.setText(txtNumero.getText()+etiUno.getText());
			
		}else if (e.getSource()==etiDos) {
			txtNumero.setText(txtNumero.getText()+etiDos.getText());

		}else if (e.getSource()==etiTres) {
			txtNumero.setText(txtNumero.getText()+etiTres.getText());

		}else if (e.getSource()==etiCuatro) {
			txtNumero.setText(txtNumero.getText()+etiCuatro.getText());

		}else if (e.getSource()==etiCinco) {
			txtNumero.setText(txtNumero.getText()+etiCinco.getText());

		}else if (e.getSource()==etiSeis) {
			txtNumero.setText(txtNumero.getText()+etiSeis.getText());

		}else if (e.getSource()==etiSiete) {
			txtNumero.setText(txtNumero.getText()+etiSiete.getText());

		}else if (e.getSource()==etiOcho) {
			txtNumero.setText(txtNumero.getText()+etiOcho.getText());

		}else if (e.getSource()==etiNueve) {
			txtNumero.setText(txtNumero.getText()+etiNueve.getText());

		}else if (e.getSource()==etiDiez) {
			txtNumero.setText(txtNumero.getText()+etiDiez.getText());

		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource()==btnBorrar) {
			
			txtNumero.setText("Numero: ");
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
		// TODO Auto-generated method stub
		
	}

	

}
