import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Aceptar_Condiciones extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aceptar_Condiciones frame = new Aceptar_Condiciones();
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
	public Aceptar_Condiciones() {
		setTitle("Panel de Scroll");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow]", "[][][:110px:110px,grow][][][]"));
		
		JLabel lblNewLabel = new JLabel("Aceptar las condiciones del servicio");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(lblNewLabel, "cell 0 0");
		
		JLabel lblNewLabel_1 = new JLabel("Acuerdo de licencia");
		contentPane.add(lblNewLabel_1, "cell 0 1");
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setToolTipText("");
		contentPane.add(scrollPane, "cell 0 2,grow");
		
		JTextPane txtpnLoremIpsumDolor = new JTextPane();
		txtpnLoremIpsumDolor.setEditable(false);
		txtpnLoremIpsumDolor.setText("Lorem ipsum dolor sit amet consectetur adipiscing elit ut fringilla ligula felis mus, vestibulum tincidunt orci justo blandit ad lacus at elementum tempor consequat. Aliquam pellentesque vitae dignissim ullamcorper lacus litora porta massa fames pharetra, consequat auctor nisl sociis ridiculus sagittis rutrum scelerisque odio, habitant diam pulvinar magnis ultricies sapien tempor nam mus. Duis sagittis mattis faucibus conubia morbi placerat eu bibendum curabitur massa, habitasse class dapibus cubilia fusce ad dis molestie mi, nisi pretium quis interdum pharetra ultrices platea non maecenas.\r\n\r\nNisl parturient lobortis cursus sollicitudin bibendum ligula velit hendrerit, cum aenean rutrum ante id porta aptent fringilla eu, sapien integer penatibus rhoncus torquent tincidunt ad. Erat nisi magna posuere molestie himenaeos curabitur a taciti vitae per velit eget viverra, interdum hendrerit habitant tristique ligula class montes potenti in fringilla tincidunt. Accumsan ridiculus aenean imperdiet tincidunt sociosqu ligula aliquam, consequat auctor nam conubia diam bibendum, penatibus fermentum molestie varius pharetra pulvinar.");
		scrollPane.setViewportView(txtpnLoremIpsumDolor);
		
		JRadioButton rdbtnAceptar = new JRadioButton("Aceptar condiciones del servicio");
		buttonGroup.add(rdbtnAceptar);
		contentPane.add(rdbtnAceptar, "cell 0 3");
		
		JRadioButton rdbtnNo = new JRadioButton("No aceptar");
		buttonGroup.add(rdbtnNo);
		contentPane.add(rdbtnNo, "cell 0 4");
		
		JButton btnNewButton = new JButton("Siguiente");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (rdbtnAceptar.isSelected())
					JOptionPane.showMessageDialog(null, "Pasa por caja...");
				
				if (rdbtnNo.isSelected()) {
					int confirmacion = JOptionPane.showConfirmDialog(null,"¿Estás seguro?", "Salir del programa",
							
					JOptionPane.YES_NO_OPTION);
					
					if (confirmacion == JOptionPane.YES_OPTION) {
					JOptionPane.showMessageDialog(null, "La próxima vez sera...");
					System.exit(0);
					}
					
					else if (confirmacion == JOptionPane.NO_OPTION) {
					JOptionPane.showMessageDialog(null, "Pasa por caja...");
					}
					}
					}
					});
					contentPane.add(btnNewButton, "cell 0 5 2 1,alignx center");
	}}


				/* ha aceptado el acuerdo deberás indicarle un mensaje al usuario diciendo 
				“Pasa por caja…”.
				• Si le ha pulsado a No aceptar deberemos mostrar una 
				JOptionPane.showConfirmDialog indicando “¿Estás Seguro?”.
				• Si en este caso pulsa que si le pondremos un mensaje diciendo “La 
				próxima vez será”.
				• Si no le mostraremos el mensaje “Pasa por caja…”*/
				
				
			
		
		


