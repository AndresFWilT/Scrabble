package Interfaz;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Logica.Jugador1;
import Logica.Jugador2;

/**
 * Clase que muestra la ventana para seleccion del primer turno en el juego
 * 
 * @author Daniel
 *
 */
public class SeleccionPrimerTurno extends JFrame {

	private JPanel contentPane;
	int turno = 0; // variable que asigna el turno al ganador
	int Dado1; // valor de la ficha para comparar del jugador 1
	int Dado2; // valor de la ficha para comparar del jugador 1
	String PrimerJ; // el nombre que toma el primer jugador
	String SegundoJ; // nombre del segundo jugador

	/**
	 * Ventana de seleccion del primer turno
	 * 
	 * @param Jugador1
	 *            - nombre del jugador 1
	 * @param Jugador2
	 *            - nombre del jugador 2
	 */
	public SeleccionPrimerTurno(String Jugador1, String Jugador2) {

		setType(Type.UTILITY);
		setTitle("Scrabble - Turno");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 485, 345);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblSacarLetraAl = new JLabel("Sacar Ficha Al Azar");
		lblSacarLetraAl.setFont(new Font("Simplified Arabic", Font.BOLD, 20));
		lblSacarLetraAl.setBounds(128, 11, 205, 65);
		contentPane.add(lblSacarLetraAl);

		JLabel LetraJ1 = new JLabel();
		LetraJ1.setFont(new Font("Tahoma", Font.PLAIN, 41));
		LetraJ1.setBounds(24, 168, 58, 100);
		contentPane.add(LetraJ1);

		JLabel lblNewLabel = new JLabel("Ficha " + Jugador1);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(10, 279, 142, 16);
		contentPane.add(lblNewLabel);

		JLabel LetraJ2 = new JLabel();
		LetraJ2.setFont(new Font("Tahoma", Font.PLAIN, 41));
		LetraJ2.setBounds(361, 168, 58, 100);
		contentPane.add(LetraJ2);

		JLabel lblLetraJugador = new JLabel("Ficha " + Jugador2);
		lblLetraJugador.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblLetraJugador.setBounds(336, 279, 133, 16);
		contentPane.add(lblLetraJugador);

		JButton btnVolverAIntentar = new JButton("Sacar Fichas"); // Boton para generar las fichas
		btnVolverAIntentar.setBackground(new Color(255, 255, 255));
		btnVolverAIntentar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnVolverAIntentar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (((JButton) e.getSource()).equals(btnVolverAIntentar)) {
					Jugador1 j1 = new Jugador1(); // se crean los objetos para generar las fichas aleatorias
					Jugador2 j2 = new Jugador2();
					LetraJ1.setText(j1.getLetraj1()); // se le asignan las fichas generadas a los label
					LetraJ2.setText(j2.getLetraj2());
					Dado1 = j1.getN1(); // se asignan los valores para comprobar
					Dado2 = j2.getN2();
					do { // se verifica el mayor para saber quien empieza el primer turno
						if (Dado1 < Dado2) {
							JOptionPane.showMessageDialog(getContentPane(), Jugador1 + " empieza jugando", "¡Atencion!",
									JOptionPane.INFORMATION_MESSAGE);
							turno = 1;
							// se abre la ventana y se asignan losparametrospara elprimer turno
							VentanaPrincipal Juego = new VentanaPrincipal(Jugador1, Jugador2, turno);
							dispose();
							Juego.setVisible(true);
							Juego.setResizable(false);
						}
						if (Dado1 > Dado2) {
							JOptionPane.showMessageDialog(getContentPane(), Jugador2 + " empieza jugando", "¡Atencion!",
									JOptionPane.INFORMATION_MESSAGE);
							turno = 2;
							VentanaPrincipal Juego = new VentanaPrincipal(Jugador1, Jugador2, turno);
							dispose();
							Juego.setVisible(true);
							Juego.setResizable(false);
						}
						if (Dado1 == Dado2) { // en caso de empate se pude volver a lanzar
							JOptionPane.showMessageDialog(getContentPane(), "Las fichas han salido igual", "¡Empate!",
									JOptionPane.ERROR_MESSAGE);
							Jugador1 r1 = new Jugador1(); // se vuelven a generar fichas aleatorias
							Jugador2 r2 = new Jugador2();
							Dado1 = r1.getN1();
							Dado2 = r2.getN2();
							JOptionPane.showMessageDialog(getContentPane(),
									"Dale click otra vez al boton 'Sacar Fichas' ", "Informacion",
									JOptionPane.INFORMATION_MESSAGE);
						}
					} while (Dado1 == Dado2); // se repite el ciclo hasta que las fichas sean diferentes entre si
				}
			}
		});
		btnVolverAIntentar.setBounds(159, 98, 142, 25);
		contentPane.add(btnVolverAIntentar);
	}
}
