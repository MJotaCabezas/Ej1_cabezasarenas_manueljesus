import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textUsuario;
	private JTextField textContraseña;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("Iniciar Sesi\u00F3n");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][grow]", "[][][][][][][][]"));
		
		JLabel lblUsuario = new JLabel("Usuario");
		contentPane.add(lblUsuario, "cell 1 2,alignx center");
		
		textUsuario = new JTextField();
		contentPane.add(textUsuario, "cell 3 2,growx");
		textUsuario.setColumns(10);
		
		JLabel lblNContraseña = new JLabel("Contrase\u00F1a");
		contentPane.add(lblNContraseña, "cell 1 4,alignx center");
		
		textContraseña = new JTextField();
		contentPane.add(textContraseña, "cell 3 4,growx");
		textContraseña.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textUsuario.getText().equals("Manuel") && (textContraseña.getText().equals("12345"))) {
					JOptionPane.showMessageDialog(null,"Contraseña aceptada");
					
				}else {
		            
		            JOptionPane.showMessageDialog(null,"Usuario y/o contraseña incorrectos");

			}
			}
		});
		contentPane.add(btnAceptar, "cell 0 7 4 1,alignx right");
		

		
		
		

}}
