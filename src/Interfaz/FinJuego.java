package Interfaz;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Logica.Archivo;

/**
 * Clase que genera la ventana al momento de terminar la partida
 * 
 * @author Daniel
 *
 */
public class FinJuego extends JFrame {

	private JPanel contentPane;
	private String jugadorganador = ""; // cadena que muestra el nombre del ganador

	/**
	 * Metodo que muestra la ventana de fin del juego
	 * 
	 * @param jugador1
	 *            - nombre del jugador 1 ingresado por el usuario
	 * @param puntajejugador1
	 *            - puntaje del jugador 1 al final de la partida
	 * @param jugador2
	 *            - nombre del jugador 2 ingresado por el usuario
	 * @param puntajejugador2
	 *            - puntaje del jugador 2 al final de la partida
	 */
	public FinJuego(String jugador1, double puntajejugador1, String jugador2, double puntajejugador2) {
		Ganador(jugador1, puntajejugador1, jugador2, puntajejugador2); // metodo que evalua quien es el ganador

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblFinDelJuego = new JLabel("FIN DEL JUEGO");
		lblFinDelJuego.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblFinDelJuego.setBounds(109, 22, 237, 81);
		contentPane.add(lblFinDelJuego);

		JLabel lblGanador = new JLabel("GANADOR: ");
		lblGanador.setBounds(10, 154, 113, 14);
		contentPane.add(lblGanador);

		JLabel lblNewLabel = new JLabel(jugadorganador); // label que almacena el nombre del ganador
		lblNewLabel.setBounds(90, 154, 46, 14);
		contentPane.add(lblNewLabel);

		JButton btnNewButton = new JButton("Salir"); // boton para volver al inicio
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Ventana1 Inicio = new Ventana1(); // se abre la ventana de incio y cierra esta
				Inicio.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(335, 228, 89, 23);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Mejores Puntuaciones"); // boton para mostrar las mejores puntuaciones
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// se abre la ventana de mejores puntuaciones y cierra esta
				MejoresPuntuaciones abrir = new MejoresPuntuaciones();
				abrir.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(10, 228, 165, 23);
		contentPane.add(btnNewButton_1);
	}

	/**
	 * Metodo encargado de comparar las puntuaciones y enviar el nombre de este
	 * 
	 * @param jugador1
	 *            - nombre del jugador 1 ingresado por el usuario
	 * @param puntajejugador1
	 *            - puntaje del jugador 1 al final de la partida
	 * @param jugador2
	 *            - nombre del jugador 2 ingresado por el usuario
	 * @param puntajejugador2
	 *            - puntaje del jugador 2 al final de la partida
	 * @return - envia la cadena con el nombre del jugador ganador
	 */
	public String Ganador(String jugador1, double puntajejugador1, String jugador2, double puntajejugador2) {
		// se llama la clase archivo para que guarde las puntuaciones
		Archivo guardar = new Archivo(jugador1, puntajejugador1, jugador2, puntajejugador2);

		if (puntajejugador1 == puntajejugador2) // se compara las puntuaciones y en caso de ser igual se envia empate
			jugadorganador = "Terminan en empate";
		/*
		 * en caso que alguna puntuacion sea mayor que la otra se envia el nombre del
		 * respectivo ganador
		 */
		else if (puntajejugador1 > puntajejugador2)
			jugadorganador = jugador1;
		else
			jugadorganador = jugador2;
		return jugadorganador;// se regresa el nombre
	}
}
