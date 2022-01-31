import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.BoxLayout;
import net.miginfocom.swing.MigLayout;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calcular_Promedio extends JFrame {

	protected static final boolean String = false;
	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textNota1;
	private JTextField textNota2;
	private JTextField textNota3;
	private JLabel txtPromedio;
	private JLabel txtResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calcular_Promedio frame = new Calcular_Promedio();
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
	public Calcular_Promedio() {
		setTitle("CALCULO DE PROMEDIO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("CALCULAR PROMEDIO");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setPreferredSize(new Dimension(46, 30));
		lblNewLabel.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(Color.BLACK);
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new MigLayout("", "[][grow][][grow]", "[][][][][][][][]"));
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		panel.add(lblNewLabel_1, "flowx,cell 0 1,alignx center,aligny center");
		
		textNombre = new JTextField();
		panel.add(textNombre, "cell 1 1,growx");
		textNombre.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Nota 1:");
		panel.add(lblNewLabel_2, "cell 0 2,alignx trailing");
		
		textNota1 = new JTextField();
		panel.add(textNota1, "flowx,cell 1 2");
		textNota1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Nota 2:");
		panel.add(lblNewLabel_3, "cell 1 2");
		
		textNota2 = new JTextField();
		panel.add(textNota2, "cell 1 2");
		textNota2.setColumns(10);
		
		JLabel lblNota3 = new JLabel("Nota 3:");
		panel.add(lblNota3, "cell 1 2");
		
		textNota3 = new JTextField();
		panel.add(textNota3, "cell 1 2");
		textNota3.setColumns(10);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				
				
			String nombre = textNombre.getText();
			
			
			
			
			double num1=Double.parseDouble(textNota1.getText());
		
			double num2=Double.parseDouble(textNota2.getText());
			
			double num3=Double.parseDouble(textNota3.getText());
			
			double res=(num1+num2+num3)/3;
			txtPromedio.setText(Double.toString(res));
			
			if (res>= 5.0) {
			txtResultado.setText( nombre + " Ha aprobado la asignatura");
			} else {
			txtResultado.setText( nombre + " Toca recuperar");
			}
			}
			});
		
		panel.add(btnNewButton, "cell 1 4,alignx right");
		
		JLabel lblNewLabel_4 = new JLabel("Promedio:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(lblNewLabel_4, "cell 0 5");
		
		txtPromedio = new JLabel("");
		panel.add(txtPromedio, "cell 1 5");
		
		JLabel lblNewLabel_5 = new JLabel("Resultado:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(lblNewLabel_5, "cell 0 6");
		
		txtResultado = new JLabel("");
		panel.add(txtResultado, "cell 1 6");
	}

}
