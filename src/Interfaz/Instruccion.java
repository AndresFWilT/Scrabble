package Interfaz;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;

/**
 * Clase que contiene la ventana con las instrucciones del juego
 * 
 * @author Daniel
 *
 */
public class Instruccion extends JFrame {

	private JPanel contentPane;

	/**
	 * Ventana que muestra las instrucciones
	 */
	public Instruccion() {
		setType(Type.UTILITY);
		setTitle("Scrabble - Instrucciones");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(0, 0, 434, 261);
		contentPane.add(scrollPane);

		JTextArea Texto = new JTextArea();
		Texto.setFont(new Font("Dialog", Font.PLAIN, 13));
		Texto.setWrapStyleWord(true);
		Texto.setLineWrap(true);
		Texto.setText(
				"Todo lo que debes saber:\r\n\r\nScrabble es un juego de mesa en el cual cada jugador intenta ganar m\u00E1s puntos mediante la construcci\u00F3n de palabras sobre un tablero de 15x15 casillas. Las palabras pueden formarse horizontalmente o verticalmente y se pueden cruzar siempre y cuando aparezcan en el diccionario est\u00E1ndar.\r\n\r\nCaracteristicas:\r\n\r\nEl juego se realiza entre 2, 3 o 4 jugadores (en general se juega de a 2), sobre un tablero de 15x15 casillas, en las que cada jugador coloca sus fichas. Cada jugador recibe un n\u00FAmero espec\u00EDfico de fichas (o letras) extra\u00EDdas aleatoriamente. Las letras se encuentran numeradas con su respectivo valor, obteni\u00E9ndose por cada palabra formada una puntuaci\u00F3n que depende tanto del valor de las letras empleadas como de la posici\u00F3n de dichas letras dentro del tablero.\r\n\r\nEn total hay 100 fichas, 98 marcadas con letras y dos en blanco (sin puntos, act\u00FAan como comodines us\u00E1ndose para reemplazar letras). Seg\u00FAn su frecuencia de aparici\u00F3n, las letras tienen m\u00E1s o menos puntos, siempre las de mayor frecuencia valen menos. El tablero tiene tambi\u00E9n casillas de premiaci\u00F3n, que multiplican el n\u00FAmero de puntos concedidos: las casillas rojo oscuro son de \"triple palabra\", las rosas \"doble palabra\", azul oscuro \"triple letra\" y celeste \"doble letra\". El casillero central se marca con una estrella y cuenta como casilla de doble palabra, es obligatorio que el juego comience utilizando esta casilla.\r\n\r\nDiagrama tablero Scrabble:\r\n\r\n*Rojo:Triple palabra\r\n*Rosado: Doble palabra\r\n*Azul: Triple letra\r\n*Cyan: Doble letra\r\n\r\nSystema de letras:\r\n\r\n*2 fichas en blanco (0 puntos)\r\n*1 punto: A \u00D712, E \u00D712, O \u00D79, I \u00D76, S \u00D76, N \u00D75, L \u00D74, R \u00D75, U \u00D75, T \u00D74\r\n*2 puntos: D \u00D75, G \u00D72\r\n*3 puntos: C \u00D74, B \u00D72, M \u00D72, P \u00D72\r\n*4 puntos: H \u00D72, F \u00D71, V \u00D71, Y \u00D71\r\n*5 puntos: CH \u00D71, Q \u00D71\r\n*8 puntos: J \u00D71, LL \u00D71, \u00D1 \u00D71, RR \u00D71, X \u00D71\r\n*10 puntos: Z \u00D71,\r\n\r\nEn este programa, cada jugador ingresara su nombre, despues se definira el jugador que empezara; se define oprimiendo un boton que saca las \"FICHAS\" al azar, la ficha corresponde a una letra y la letra que mas se acerque a la \"A\" empezara jugando.\r\nCada jugador definira si la palabra ingresada por su contrincante es correcta, en caso de no serlo debera volver a ingresar hasta poner algo coherente.\r\n\r\n                                *Dar click en la 'x' para ocultar*");
		Texto.setEditable(false);
		scrollPane.setViewportView(Texto);
	}
}
