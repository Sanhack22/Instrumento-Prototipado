package primero;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.SwingConstants;

public class primero extends JFrame implements ActionListener{
	
	private JPanel contentPane;
	JLabel etiCiudad,etiNombre;
	JButton btnOculNombre,btnVisualizarNombre,btnOcultarCiudad,btnVisualizarCiudad;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					primero frame = new primero();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public primero() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 529, 397);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 etiCiudad = new JLabel("Ciudad");
		etiCiudad.setHorizontalAlignment(SwingConstants.CENTER);
		etiCiudad.setFont(new Font("Tahoma", Font.PLAIN, 20));
		etiCiudad.setBounds(327, 27, 91, 42);
		contentPane.add(etiCiudad);
		
		 etiNombre = new JLabel("Nombre");
		etiNombre.setHorizontalAlignment(SwingConstants.CENTER);
		etiNombre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		etiNombre.setBounds(39, 27, 91, 42);
		contentPane.add(etiNombre);
		
		 btnOculNombre= new JButton("Ocultar Nombre");
		btnOculNombre.addActionListener(this);
		btnOculNombre.setBounds(39, 201, 107, 35);
		contentPane.add(btnOculNombre);

		
		 btnVisualizarNombre = new JButton("Visualizar Nombre");
		btnVisualizarNombre.addActionListener(this);
		btnVisualizarNombre.setBounds(156, 201, 117, 35);
		contentPane.add(btnVisualizarNombre);
		
		 btnOcultarCiudad = new JButton("Ocultar Ciudad");
		btnOcultarCiudad.addActionListener(this);
		
		btnOcultarCiudad.setBounds(39, 247, 107, 35);
		contentPane.add(btnOcultarCiudad);
		
		 btnVisualizarCiudad = new JButton("Visualizar Ciudad");
		btnVisualizarCiudad.addActionListener(this);
		btnVisualizarCiudad.setBounds(156, 247, 117, 35);
		contentPane.add(btnVisualizarCiudad);
		
		
		
		
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnOculNombre ) {
			
			etiNombre.setVisible(false);
		}else if (e.getSource()==btnVisualizarNombre) {
			etiNombre.setVisible(true);

		}else if (e.getSource()==btnOcultarCiudad) {
			etiNombre.setVisible(false);

		}else if (e.getSource()==btnOcultarCiudad) {
			etiNombre.setVisible(true);

		}
		
	}	
}