package Interfaz;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 * Clase que muestra la ventana de ingreso de nombres de los jugadores
 * 
 * @author Daniel
 *
 */
public class Ventana2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	String Jugador1; // nombre del primer jugador
	String Jugador2; // nombre del segundo jugador

	/**
	 * Ventana de ingreso de nombre para los jugadores
	 */
	public Ventana2() {

		setTitle("Scrabble - Nombre Jugadores");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 467, 291);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		Image Fondo = new ImageIcon(this.getClass().getResource("/FondoUSU.png")).getImage(); // imagen de fondo

		JLabel lblIngrese = new JLabel("Ingrese:");
		lblIngrese.setForeground(Color.WHITE);
		lblIngrese.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblIngrese.setBounds(34, 11, 89, 30);
		contentPane.add(lblIngrese);

		JLabel lblJugador = new JLabel("Jugador 1:");
		lblJugador.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblJugador.setForeground(Color.WHITE);
		lblJugador.setBounds(34, 72, 93, 14);
		contentPane.add(lblJugador);

		JLabel lblJugador_1 = new JLabel("Jugador 2:");
		lblJugador_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblJugador_1.setForeground(Color.WHITE);
		lblJugador_1.setBounds(34, 144, 93, 14);
		contentPane.add(lblJugador_1);

		textField = new JTextField();
		textField.setBounds(137, 70, 219, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(137, 141, 219, 20);
		contentPane.add(textField_1);

		JButton btnIngresar = new JButton("Ingresar"); // boton para comenzar el juego
		btnIngresar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnIngresar.setForeground(Color.WHITE);
		btnIngresar.setBackground(Color.BLACK);
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (((JButton) e.getSource()).equals(btnIngresar)) {
					// en caso de estar vacios se pide llenar los datos
					if (textField.getText().equals("") && textField_1.getText().equals("")) {
						JOptionPane.showMessageDialog(getContentPane(), "Los campos de jugadores deben ser completados",
								"Error", JOptionPane.ERROR_MESSAGE);
						/*
						 * en caso de faltar un nombre por ingresar se pide a los usuarios que los
						 * ingrese
						 */
					} else if (textField.getText().equals("")) {
						JOptionPane.showMessageDialog(getContentPane(), "El campo de 'Jugador 1' debe ser completado",
								"Error", JOptionPane.ERROR_MESSAGE);
					} else if (textField.getText().equals("") || textField_1.getText().equals("")) {
						JOptionPane.showMessageDialog(getContentPane(), "El campo de 'Jugador 2' debe ser completado",
								"Error", JOptionPane.ERROR_MESSAGE);
						// los jugadores deben llamarse distino
					} else if (textField.getText().equals(textField_1.getText())) {
						JOptionPane.showMessageDialog(getContentPane(),
								"El Jugador 1 y el Jugador 2 se llaman igual, cambiar", "Error",
								JOptionPane.ERROR_MESSAGE);
					} else {
						/*
						 * una vez ingresado los datos se abre la ventana de seleccion del primer turno
						 * y se cierra esta
						 */
						Jugador1 = textField.getText();
						Jugador2 = textField_1.getText();
						SeleccionPrimerTurno scrabble = new SeleccionPrimerTurno(Jugador1, Jugador2);
						dispose();
						scrabble.setVisible(true);
						scrabble.setResizable(false);
					}
				}
			}
		});
		btnIngresar.setBounds(335, 229, 107, 23);
		contentPane.add(btnIngresar);
		//boton para abrir la ventana de mejores puntuaciones
		JButton btnMejoresPuntuaciones = new JButton("Mejores Puntuaciones"); 
		btnMejoresPuntuaciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//abre la ventana de mejores puntuaciones y cierra esta
				MejoresPuntuaciones mostrar = new MejoresPuntuaciones(); 
				mostrar.setVisible(true);
				dispose();
			}
		});
		btnMejoresPuntuaciones.setBackground(Color.BLACK);
		btnMejoresPuntuaciones.setForeground(Color.WHITE);
		btnMejoresPuntuaciones.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnMejoresPuntuaciones.setBounds(0, 230, 201, 23);
		contentPane.add(btnMejoresPuntuaciones);

		JLabel label = new JLabel("");
		label.setBounds(0, 0, 464, 262);
		contentPane.add(label);
		label.setIcon(new ImageIcon(Fondo));

	}
}
