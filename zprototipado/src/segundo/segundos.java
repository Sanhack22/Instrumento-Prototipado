package segundo;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class segundos extends JFrame {

	private JPanel contentPane;
	private JTextField txtTexto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					segundos frame = new segundos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public segundos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtTexto = new JTextField();
		txtTexto.setBounds(24, 26, 173, 34);
		contentPane.add(txtTexto);
		txtTexto.setColumns(10);
		
		JLabel etiTexto1 = new JLabel("New label");
		etiTexto1.setBounds(24, 71, 142, 30);
		contentPane.add(etiTexto1);
		
		JLabel etiTexto2 = new JLabel("New label");
		etiTexto2.setBounds(24, 110, 142, 30);
		contentPane.add(etiTexto2);
		
		JButton btnTraspasa1 = new JButton("Traspasa1");
		btnTraspasa1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				etiTexto1.setText(txtTexto.getText());
			}
		});
		btnTraspasa1.setBounds(253, 75, 106, 23);
		contentPane.add(btnTraspasa1);
		
		JButton btnTraspasa2 = new JButton("Traspasa2");
		btnTraspasa2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				etiTexto2.setText(txtTexto.getText());

			}
		});
		btnTraspasa2.setBounds(253, 114, 106, 23);
		contentPane.add(btnTraspasa2);
		
		
	}
}