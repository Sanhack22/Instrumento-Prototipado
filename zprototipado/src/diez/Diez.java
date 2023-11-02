package diez;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Diez extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPalabra1;
	private JTextField txtPalabra2;
	JLabel etiTexto;
	JButton btnConcatena;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Diez frame = new Diez();
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
	public Diez() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 479, 323);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtPalabra1 = new JTextField();
		txtPalabra1.setBounds(42, 41, 149, 20);
		contentPane.add(txtPalabra1);
		txtPalabra1.setColumns(10);
		
		txtPalabra2 = new JTextField();
		txtPalabra2.setColumns(10);
		txtPalabra2.setBounds(252, 41, 149, 20);
		contentPane.add(txtPalabra2);
		
		JLabel lblNewLabel = new JLabel("Palabra1");
		lblNewLabel.setBounds(42, 22, 149, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Palabra2");
		lblNewLabel_1.setBounds(252, 22, 149, 14);
		contentPane.add(lblNewLabel_1);
		
		 btnConcatena = new JButton("Concatenar");
		btnConcatena.setBounds(163, 114, 139, 32);
		btnConcatena.addActionListener(this);
		contentPane.add(btnConcatena);
		
		 etiTexto = new JLabel("Texto:");
		etiTexto.setBounds(42, 177, 359, 43);
		contentPane.add(etiTexto);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource()==btnConcatena) {
			
			etiTexto.setText("Texto: "+txtPalabra1.getText()+txtPalabra2.getText());
		}
		
	}
}
