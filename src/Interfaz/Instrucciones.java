package Interfaz;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;

/**
 * Clase encargada de mostrar las instrucciones del juego por medio de una
 * ventana
 * 
 * @author Daniel
 *
 */
public class Instrucciones extends JFrame {

	private JPanel contentPane = new JPanel();

	/**
	 * Ventana de instrucciones
	 */
	public Instrucciones() {

		Image patron = new ImageIcon(this.getClass().getResource("/patron.png")).getImage(); // imagen del tablero

		setTitle("Scrabble - Instrucciones");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 654, 626);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 5, 624, 310);
		contentPane.add(panel);
		panel.setPreferredSize(new Dimension(964, 430));
		panel.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 624, 310);
		panel.add(scrollPane);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		JTextArea txtrScrabbleScrabbleEs = new JTextArea();
		txtrScrabbleScrabbleEs.setEditable(false);
		scrollPane.setViewportView(txtrScrabbleScrabbleEs);
		txtrScrabbleScrabbleEs.setWrapStyleWord(true);
		txtrScrabbleScrabbleEs.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtrScrabbleScrabbleEs.setText(
				"Scrabble:\r\n\r\nScrabble es un juego de mesa en el cual cada jugador intenta ganar m\u00E1s puntos mediante la construcci\u00F3n de palabras sobre un tablero de 15x15 casillas. Las palabras pueden formarse horizontalmente o verticalmente y se pueden cruzar siempre y cuando aparezcan en el diccionario est\u00E1ndar.\r\n\r\nCaracteristicas:\r\n\r\nEl juego se realiza entre 2, 3 o 4 jugadores (en general se juega de a 2), sobre un tablero de 15x15 casillas, en las que cada jugador coloca sus fichas. Cada jugador recibe un n\u00FAmero espec\u00EDfico de fichas (o letras) extra\u00EDdas aleatoriamente. Las letras se encuentran numeradas con su respectivo valor, obteni\u00E9ndose por cada palabra formada una puntuaci\u00F3n que depende tanto del valor de las letras empleadas como de la posici\u00F3n de dichas letras dentro del tablero.\r\n\r\nEn total hay 100 fichas, 98 marcadas con letras y dos en blanco (sin puntos, act\u00FAan como comodines us\u00E1ndose para reemplazar letras). Seg\u00FAn su frecuencia de aparici\u00F3n, las letras tienen m\u00E1s o menos puntos, siempre las de mayor frecuencia valen menos. El tablero tiene tambi\u00E9n casillas de premiaci\u00F3n, que multiplican el n\u00FAmero de puntos concedidos: las casillas rojo oscuro son de \"triple palabra\", las rosas \"doble palabra\", azul oscuro \"triple letra\" y celeste \"doble letra\". El casillero central se marca con una estrella y cuenta como casilla de doble palabra, es obligatorio que el juego comience utilizando esta casilla.\r\n\r\nDiagrama tablero Scrabble:\r\n\r\n*Rojo:Triple palabra\r\n*Rosado: Doble palabra\r\n*Azul: Triple letra\r\n*Cyan: Doble letra\r\n\r\nSystema de letras:\r\n\r\n*2 fichas en blanco (0 puntos)\r\n*1 punto: A \u00D712, E \u00D712, O \u00D79, I \u00D76, S \u00D76, N \u00D75, L \u00D74, R \u00D75, U \u00D75, T \u00D74\r\n*2 puntos: D \u00D75, G \u00D72\r\n*3 puntos: C \u00D74, B \u00D72, M \u00D72, P \u00D72\r\n*4 puntos: H \u00D72, F \u00D71, V \u00D71, Y \u00D71\r\n*5 puntos: CH \u00D71, Q \u00D71\r\n*8 puntos: J \u00D71, LL \u00D71, \u00D1 \u00D71, RR \u00D71, X \u00D71\r\n*10 puntos: Z \u00D71,\r\n\r\nEn este programa, cada jugador ingresara su nombre, despues se definira el jugador que empezara; se define oprimiendo un boton que saca las \"FICHAS\" al azar, la ficha corresponde a una letra y la letra que mas se acerque a la \"A\" empezara jugando.\r\nCada jugador definira si la palabra ingresada por su contrincante es correcta, en caso de no serlo debera volver a ingresar hasta poner algo coherente.");
		txtrScrabbleScrabbleEs.setLineWrap(true);

		JLabel lblPatronJuego = new JLabel("Patron Juego:");
		lblPatronJuego.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPatronJuego.setBounds(10, 326, 175, 34);
		contentPane.add(lblPatronJuego);

		JTextArea txtrDiagramaDelTablero = new JTextArea();
		txtrDiagramaDelTablero.setText(
				"Diagrama del tablero de Scrabble.\r\n* Rojo - Triple palabra\r\n* Rosado - Doble palabra\r\n* Azul  - Triple letra\r\n* Azul claro -  Doble letra");
		txtrDiagramaDelTablero.setBackground(Color.WHITE);
		txtrDiagramaDelTablero.setWrapStyleWord(true);
		txtrDiagramaDelTablero.setPreferredSize(new Dimension(100, 100));
		txtrDiagramaDelTablero.setLineWrap(true);
		txtrDiagramaDelTablero.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtrDiagramaDelTablero.setEditable(false);
		txtrDiagramaDelTablero.setBounds(10, 360, 211, 105);
		contentPane.add(txtrDiagramaDelTablero);

		JButton btnVolver = new JButton("Volver"); // boton para regresar al incio
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (((JButton) e.getSource()).equals(btnVolver)) {
					Ventana1 volver = new Ventana1(); // abre la ventana de inicio y cierra esta
					dispose();
					volver.setVisible(true);
					volver.setResizable(false);
				}
			}
		});
		btnVolver.setBounds(542, 553, 89, 23);
		contentPane.add(btnVolver);

		JLabel label = new JLabel("");
		label.setBounds(221, 326, 311, 250);
		contentPane.add(label);
		label.setIcon(new ImageIcon(patron));

	}
}
