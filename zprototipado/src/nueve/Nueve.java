package nueve;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.Color;

public class Nueve extends JFrame implements ActionListener {
	operaciones misProcesos = new operaciones();
	private JPanel contentPane;
	private JTextField txtPrimerTrimestre;
	private JTextField txtTercerTrimestre;
	private JTextField txtSegundoTrimestre;
	JLabel etiNotaFinal,etiResultado;
	JButton btnCalcular;
	String Notas,ResultadoTxt,NotaFinal;
	double nota1,nota2,nota3,resultadoN;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Nueve frame = new Nueve();
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
	public Nueve() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 881, 542);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtPrimerTrimestre = new JTextField();
		txtPrimerTrimestre.setBounds(31, 127, 136, 31);
		contentPane.add(txtPrimerTrimestre);
		txtPrimerTrimestre.setColumns(10);
		
		txtTercerTrimestre = new JTextField();
		txtTercerTrimestre.setBounds(31, 337, 134, 31);
		contentPane.add(txtTercerTrimestre);
		txtTercerTrimestre.setColumns(10);
		
		txtSegundoTrimestre = new JTextField();
		txtSegundoTrimestre.setBounds(31, 235, 136, 31);
		contentPane.add(txtSegundoTrimestre);
		txtSegundoTrimestre.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Trimestre 1");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(31, 102, 125, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblTrimestre = new JLabel("Trimestre 2");
		lblTrimestre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTrimestre.setBounds(31, 191, 125, 14);
		contentPane.add(lblTrimestre);
		
		JLabel lblTrimestre_1 = new JLabel("Trimestre 3");
		lblTrimestre_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTrimestre_1.setBounds(31, 300, 125, 14);
		contentPane.add(lblTrimestre_1);
		
		btnCalcular = new JButton("CALCULAR");
		btnCalcular.setBackground(new Color(128, 128, 0));
		btnCalcular.setBounds(289, 227, 125, 47);
		btnCalcular.addActionListener(this);
		contentPane.add(btnCalcular);
		
		 etiResultado = new JLabel("Resultado:");
		etiResultado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		etiResultado.setBounds(510, 212, 249, 31);
		contentPane.add(etiResultado);
		
		 etiNotaFinal = new JLabel("Nota Final:");
		etiNotaFinal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		etiNotaFinal.setBounds(510, 269, 249, 31);
		contentPane.add(etiNotaFinal);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==btnCalcular) {
			
			Notas=txtPrimerTrimestre.getText();
			nota1=Double.parseDouble(Notas);
			
			Notas=txtSegundoTrimestre.getText();
			nota2=Double.parseDouble(Notas);
			
			Notas=txtTercerTrimestre.getText();
			nota3=Double.parseDouble(Notas);
			
			resultadoN=misProcesos.calcularPromedio(nota1, nota2, nota3);
			
			if (resultadoN==0) {
				
				JOptionPane.showMessageDialog(null,"Numero Invalido");
			}else {
				
				
				ResultadoTxt=misProcesos.resultadoTxt(resultadoN);
				if (ResultadoTxt.equalsIgnoreCase("SUSPENSO")) {
					etiNotaFinal.setForeground(Color.red);
					etiResultado.setForeground(Color.red);
				}
				etiResultado.setText(ResultadoTxt);
			}
			
			NotaFinal=Double.toString(resultadoN);
			etiNotaFinal.setText(NotaFinal);
			
			
		}
		
	}
}
