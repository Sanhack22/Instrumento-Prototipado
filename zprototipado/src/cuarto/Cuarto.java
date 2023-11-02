package cuarto;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Cuarto extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtCiudad;
	JButton btnAceptar,btnActivar,btnDesactivar;
	JLabel txtFrase;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cuarto frame = new Cuarto();
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
	public Cuarto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 591, 382);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(128, 11, 131, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtCiudad = new JTextField();
		txtCiudad.setBounds(128, 56, 131, 20);
		contentPane.add(txtCiudad);
		txtCiudad.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setBounds(18, 14, 67, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ciudad:");
		lblNewLabel_1.setBounds(18, 59, 67, 14);
		contentPane.add(lblNewLabel_1);
		
		txtFrase = new JLabel("");
		txtFrase.setHorizontalAlignment(SwingConstants.LEFT);
		txtFrase.setVerticalAlignment(SwingConstants.TOP);
		txtFrase.setBounds(307, 14, 205, 62);
		contentPane.add(txtFrase);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(18, 122, 89, 23);
		contentPane.add(btnAceptar);
		
		btnActivar = new JButton("Activar");
		btnActivar.setBounds(125, 122, 89, 23);
		contentPane.add(btnActivar);
		btnActivar.addActionListener(this);
		
		btnDesactivar = new JButton("Desactivar");
		btnDesactivar.setBounds(234, 122, 89, 23);
		contentPane.add(btnDesactivar);
		btnDesactivar.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==btnAceptar) {
			
			txtFrase.setText("Su nombre es "+txtNombre.getText()+" y vive en "+txtCiudad.getText());
			
		}else if(e.getSource()==btnActivar) {
			
			txtCiudad.setEnabled(true);
			txtNombre.setEnabled(true);
			
		}else if(e.getSource()==btnDesactivar) {
			txtCiudad.setEnabled(false);
			txtNombre.setEnabled(false);
		}
		
	}
}
