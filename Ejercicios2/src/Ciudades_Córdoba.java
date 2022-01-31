import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ciudades_Córdoba extends JFrame {

	private JPanel contentPane;
	private JLabel lblNombreSeleccionado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ciudades_Córdoba frame = new Ciudades_Córdoba();
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
	public Ciudades_Córdoba() {
		setTitle("Habilitar/Deshabilitar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][grow][][][][]", "[][][grow][grow,top][][][grow]"));
		
		JLabel lblCiudad = new JLabel("Ciudad:");
		lblCiudad.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(lblCiudad, "cell 1 1,alignx trailing");
		
		JComboBox comboCiudad = new JComboBox();
		comboCiudad.setModel(new DefaultComboBoxModel(new String[] {"", "Adamuz", "Cabra", "Aguilar", "Montilla", "Lucena", "Montalb\u00E1n", "Monturque"}));
		contentPane.add(comboCiudad, "cell 2 1,growx");
		
		JLabel lblSeleccionado = new JLabel("Has seleccionado: ");
		lblSeleccionado.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(lblSeleccionado, "cell 0 5");
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (comboCiudad.getSelectedIndex()==0) {
					JOptionPane.showMessageDialog(null, "Debe seleccionar una Ciudad");
				}
				else {
					String nombre=(String) comboCiudad.getSelectedItem();
					//JOptionPane.showMessageDialog(null,"Has seleccionado  "+nombre);--> Otra forma para sacar cuadro diálogo emergente.
					
					lblNombreSeleccionado.setText( nombre );
				}
			}
		});
		
		lblNombreSeleccionado = new JLabel("");
		contentPane.add(lblNombreSeleccionado, "cell 1 5");
		contentPane.add(btnAceptar, "cell 2 6");
	}

}
