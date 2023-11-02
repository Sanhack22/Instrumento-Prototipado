package tercer;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class tercero extends JFrame implements KeyListener,ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JTextField txtTexto;
	JLabel etiTexto;
	JButton btnVaciar;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tercero frame = new tercero();
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
	public tercero() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtTexto = new JTextField();
		txtTexto.setBounds(22, 11, 288, 60);
		contentPane.add(txtTexto);
		txtTexto.addKeyListener(this);
		txtTexto.setColumns(10);
		
		etiTexto = new JLabel("");
		etiTexto.setVerticalAlignment(SwingConstants.TOP);
		etiTexto.setBounds(22, 106, 295, 145);
		contentPane.add(etiTexto);
		
		btnVaciar = new JButton("Vaciar");
		btnVaciar.setBounds(335, 11, 89, 23);
		btnVaciar.addActionListener(this);
		contentPane.add(btnVaciar);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		
		etiTexto.setText(txtTexto.getText());
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		etiTexto.setText(null);
		txtTexto.setText(null);
		
	}
}
