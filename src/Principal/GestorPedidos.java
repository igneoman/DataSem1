package Principal;

import java.awt.EventQueue;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;

public class GestorPedidos {

	private JFrame frame;
	private JTextField textField_0;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestorPedidos window = new GestorPedidos();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GestorPedidos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 629, 421);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCifDelProveedor = new JLabel("CIF del proveedor");
		lblCifDelProveedor.setBounds(10, 10, 160, 14);
		frame.getContentPane().add(lblCifDelProveedor);
		
		JLabel lblRaznSocialDel = new JLabel("Raz\u00F3n Social del Proveedor");
		lblRaznSocialDel.setBounds(281, 10, 160, 14);
		frame.getContentPane().add(lblRaznSocialDel);
		
		JLabel lblNmeroDeFactura = new JLabel("N\u00FAmero de Factura");
		lblNmeroDeFactura.setBounds(10, 35, 160, 14);
		frame.getContentPane().add(lblNmeroDeFactura);
		
		JLabel lblDescripcinDeLa = new JLabel("Descripci\u00F3n de la Factura");
		lblDescripcinDeLa.setBounds(281, 160, 160, 14);
		frame.getContentPane().add(lblDescripcinDeLa);
		
		JLabel lblBaseImponible = new JLabel("Base Imponible");
		lblBaseImponible.setBounds(10, 217, 160, 14);
		frame.getContentPane().add(lblBaseImponible);
		
		JLabel lblIva = new JLabel("IVA");
		lblIva.setBounds(10, 243, 160, 14);
		frame.getContentPane().add(lblIva);
		
		JLabel lblTotalImporte = new JLabel("Total importe");
		lblTotalImporte.setBounds(10, 268, 160, 14);
		frame.getContentPane().add(lblTotalImporte);
		
		JLabel lblFechaDeFactura = new JLabel("Fecha de factura");
		lblFechaDeFactura.setBounds(10, 293, 160, 14);
		frame.getContentPane().add(lblFechaDeFactura);
		
		JLabel lblFechaDeVencimiento = new JLabel("Fecha de Vencimiento");
		lblFechaDeVencimiento.setBounds(10, 318, 160, 14);
		frame.getContentPane().add(lblFechaDeVencimiento);
		
		textField_0 = new JTextField();
		textField_0.setHorizontalAlignment(SwingConstants.CENTER);
		textField_0.setBounds(118, 7, 96, 20);
		frame.getContentPane().add(textField_0);
		textField_0.setColumns(10);
		textField_0.addKeyListener(new KeyAdapter() {
	        @Override
	        public void keyTyped(KeyEvent e) {
	            if (textField_0.getText().length() >= 10 ) // limit to 10
	                e.consume();
	        }
	    });
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(281, 35, 322, 90);
		frame.getContentPane().add(scrollPane);
		
		JTextPane textPane = new JTextPane();
		scrollPane.setViewportView(textPane);
		textPane.addKeyListener(new KeyAdapter() {
	        @Override
	        public void keyTyped(KeyEvent e) {
	            if (textPane.getText().length() >= 300 ) // limit to 300
	                e.consume();
	        }
	    });
		
		textField_1 = new JTextField();
		textField_1.setBounds(118, 35, 96, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(281, 185, 322, 90);
		frame.getContentPane().add(scrollPane_1);
		
		JTextPane textPane_1 = new JTextPane();
		scrollPane_1.setViewportView(textPane_1);
		textField_1.addKeyListener(new KeyAdapter() {
	        @Override
	        public void keyTyped(KeyEvent e) {
	            if (textField_1.getText().length() >= 11 ) // limit to 10
	                e.consume();
	        }
	    });
		
	}
}
