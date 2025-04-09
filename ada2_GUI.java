package ada2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Stack;
import java.awt.event.ActionEvent;

public class ada2_GUI extends JFrame {
	Stack<persona> pilaPersonas = new Stack<persona>();

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_nom;
	private JTextField textField_edad;
	private JTextField textField_col;
	private Stack <persona> pila = new Stack<>();
	private JButton btnImprimir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ada2_GUI frame = new ada2_GUI();
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
	public ada2_GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 242);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("ADA 2");
		lblTitulo.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 16));
		lblTitulo.setBounds(192, 25, 61, 14);
		contentPane.add(lblTitulo);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblNombre.setBounds(119, 68, 91, 14);
		contentPane.add(lblNombre);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblEdad.setBounds(119, 93, 91, 14);
		contentPane.add(lblEdad);
		
		JLabel lblColor = new JLabel("Color favorito");
		lblColor.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblColor.setBounds(119, 118, 91, 14);
		contentPane.add(lblColor);
		
		textField_nom = new JTextField();
		textField_nom.setBounds(220, 66, 86, 20);
		contentPane.add(textField_nom);
		textField_nom.setColumns(10);
		
		textField_edad = new JTextField();
		textField_edad.setBounds(220, 91, 86, 20);
		contentPane.add(textField_edad);
		textField_edad.setColumns(10);
		
		textField_col = new JTextField();
		textField_col.setBounds(220, 116, 86, 20);
		contentPane.add(textField_col);
		textField_col.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre = textField_nom.getText();
				int edad = Integer.parseInt(textField_edad.getText());
				String color = textField_col.getText();

				persona persona1=new persona (nombre, color, edad);
				pilaPersonas.push (persona1);
				JOptionPane.showMessageDialog(null, "Datos agregados: " + nombre + ", " + edad + ", " + color);
				

				JOptionPane.showMessageDialog(null, "Datos agregados: " + nombre + ", " + edad + ", " + color);
				
				pila.push(new persona(nombre , color , edad));
				

			}
		});
		btnGuardar.setBounds(68, 156, 89, 23);
		contentPane.add(btnGuardar);
		
		JButton btnBorrar = new JButton("Borrar");

		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (pila.isEmpty()) {
					JOptionPane.showMessageDialog(null, "La pila está vacía");
				} else {
					persona eliminada = pila.pop();
					JOptionPane.showMessageDialog(null, "Se eliminó a " + eliminada.getNombre());
				}
			}
		});
		btnBorrar.setBounds(167, 156, 89, 23);
		contentPane.add(btnBorrar);

		btnBorrar.setBounds(164, 156, 89, 23);
		contentPane.add(btnBorrar);
		

		btnImprimir = new JButton("Imprimir");
		btnImprimir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(pila.isEmpty()) {
					JOptionPane.showMessageDialog(null, "La pila esta vacia");
					return;
				}
				String resultado = "";
				for(persona persona : pila) {
					resultado += persona.getNombre() + persona.getEdad() + persona.getColorFav();
				}
				JOptionPane.showMessageDialog(null, resultado);
			}
		});

		btnImprimir.setBounds(265, 156, 89, 23);
		contentPane.add(btnImprimir);
	}
}
