package Principal;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GestorProveedores {

	private JFrame fraGestProv;
	private JFrame padre;
	
	private JTextField textField_0;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestorProveedores window = new GestorProveedores();
					window.fraGestProv.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public GestorProveedores() {
		initialize();
	}
	
	public void setFrame(JFrame frame) {
		this.fraGestProv = frame;
	}
	
	public GestorProveedores(JFrame padre) {
		initialize();
		this.padre = padre;
	}
	
	public JFrame getFrame() {
		return fraGestProv;
	}
	
	public void getFather(JFrame frmGestorDePedidos) {
		padre=frmGestorDePedidos;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		fraGestProv = new JFrame();
		fraGestProv.setTitle("Gestor proveedores");
		fraGestProv.setBounds(100, 100, 450, 300);
		fraGestProv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fraGestProv.getContentPane().setLayout(null);
		
		JLabel label_0 = new JLabel("CIF del proveedor:");
		label_0.setHorizontalAlignment(SwingConstants.RIGHT);
		label_0.setBounds(10, 11, 170, 14);
		fraGestProv.getContentPane().add(label_0);
		
		JLabel label_2 = new JLabel("Registro notarial:");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setBounds(10, 36, 170, 14);
		fraGestProv.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("Cod. ressponsabilidad civil:");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setBounds(10, 61, 170, 14);
		fraGestProv.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("Importe seguro R.C.:");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setBounds(10, 86, 170, 14);
		fraGestProv.getContentPane().add(label_4);
		
		JLabel label_1 = new JLabel("Raz\u00F3n Social del Proveedor:");
		label_1.setBounds(10, 137, 192, 14);
		fraGestProv.getContentPane().add(label_1);
		
		JLabel lblFecha = new JLabel("Fecha homologaci\u00F3n:");
		lblFecha.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFecha.setBounds(10, 111, 170, 14);
		fraGestProv.getContentPane().add(lblFecha);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 162, 320, 88);
		fraGestProv.getContentPane().add(scrollPane);
		
		JTextPane textPane = new JTextPane();
		textPane.setEnabled(false);
		textPane.addKeyListener(new KeyAdapter() {
	        @Override
	        public void keyTyped(KeyEvent e) {
	            if (textPane.getText().length() >= 180 ) // limit to 180
	                e.consume();
	        }
	    });
		scrollPane.setViewportView(textPane);
		
		textField_0 = new JTextField();
		textField_0.setEnabled(false);
		textField_0.setHorizontalAlignment(SwingConstants.CENTER);
		textField_0.setColumns(10);
		textField_0.setBounds(190, 8, 96, 20);
		textField_0.addKeyListener(new KeyAdapter() {
	        @Override
	        public void keyTyped(KeyEvent e) {
	            if (textField_0.getText().length() >= 10 ) // limit to 10
	                e.consume();
	        }
	    });
		fraGestProv.getContentPane().add(textField_0);
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setColumns(10);
		textField_1.setBounds(190, 33, 96, 20);
		textField_1.addKeyListener(new KeyAdapter() {
	        @Override
	        public void keyTyped(KeyEvent e) {
	            if (textField_1.getText().length() >= 10 ) // limit to 10
	                e.consume();
	        }
	    });
		fraGestProv.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setEnabled(false);
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setColumns(10);
		textField_2.setBounds(190, 58, 96, 20);
		textField_2.addKeyListener(new KeyAdapter() {
	        @Override
	        public void keyTyped(KeyEvent e) {
	            if (textField_2.getText().length() >= 10 ) // limit to 10
	                e.consume();
	        }
	    });
		fraGestProv.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setEnabled(false);
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setColumns(10);
		textField_3.setBounds(190, 83, 96, 20);
		textField_3.addKeyListener(new KeyAdapter() {
	        @Override
	        public void keyTyped(KeyEvent e) {
	            if (textField_3.getText().length() >= 10 ) // limit to 10
	                e.consume();
	        }
	    });
		fraGestProv.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setEnabled(false);
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setColumns(10);
		textField_4.setBounds(190, 108, 96, 20);
		textField_4.addKeyListener(new KeyAdapter() {
	        @Override
	        public void keyTyped(KeyEvent e) {
	            if (textField_4.getText().length() >= 10 ) // limit to 10
	                e.consume();
	        }
	    });
		fraGestProv.getContentPane().add(textField_4);
		
		JButton btnAgregar = new JButton("Agregar");
		
		btnAgregar.setBounds(335, 7, 89, 23);
		fraGestProv.getContentPane().add(btnAgregar);
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(335, 36, 89, 23);
		fraGestProv.getContentPane().add(btnEliminar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(340, 227, 89, 23);
		fraGestProv.getContentPane().add(btnSalir);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setVisible(false);
		btnAceptar.setBounds(335, 133, 89, 23);
		fraGestProv.getContentPane().add(btnAceptar);
		
		
		//Acciones
		
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_0.setEnabled(true);
				textField_1.setEnabled(true);
				textField_2.setEnabled(true);
				textField_3.setEnabled(true);
				textField_4.setEnabled(true);
				textPane.setEnabled(true);
				btnAceptar.setVisible(true);
				btnAceptar.setEnabled(true);
				btnAgregar.setEnabled(false);
				btnEliminar.setEnabled(false);
			}
		});
		
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_0.setEnabled(true);
				btnAceptar.setVisible(true);
				btnAceptar.setEnabled(true);
				btnAgregar.setEnabled(false);
				btnEliminar.setEnabled(false);
			}
		});
		
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnAceptar.setVisible(false);
				btnAceptar.setEnabled(false);
				textField_0.setEnabled(false);
				textField_1.setEnabled(false);
				textField_2.setEnabled(false);
				textField_3.setEnabled(false);
				textField_4.setEnabled(false);
				textPane.setEnabled(false);
				textField_0.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_4.setText(null);
				textPane.setText(null);
				btnAgregar.setEnabled(true);
				btnEliminar.setEnabled(true);
			}
		});
		
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				padre.setVisible(true);
				fraGestProv.dispose();
			}
		});
	}

}
