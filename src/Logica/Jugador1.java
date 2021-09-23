package Logica;

/**
 * Clase que toma las fichas del banco de fichas ya generado y las asigna al
 * jugador 1
 * 
 * @author Daniel
 *
 */
public class Jugador1 extends Jugador {
	private String letraj1; // ficha que se va a enviar
	private int N1; // valor de la ficha en codigo ASCII

	/**
	 * asigna el numero de letras y puntos
	 * 
	 * @param NumeroLetras
	 *            - parametro
	 * @param puntos
	 *            - parametro
	 */
	Jugador1(int NumeroLetras, int puntos) {
		super(NumeroLetras, puntos); // se llama al constructor de herencia
	}

	/**
	 * Metodo que asigna las primeras 7 fichas para el jugador 1
	 * @return - regresa el array con las 7 fichas
	 */
	String[] PrimerTurno() {
		FichasAleatorias letras = new FichasAleatorias(); // se llama la clase que contiene el banco de fichas
		String[] PrimerTurno = new String[7];// se crea el array de fichas
		for (int i = 0; i < 7; i++) // se le asignan las 7 fichas correspondientes obtenidas del banco de fichas
			PrimerTurno[i] = letras.getBancoDeFichas()[i];
		return PrimerTurno; // se retorna el array con las 7 fichas ya asignadas
	}

	/**
	 * Obtiene una ficha aleatoria
	 */
	public Jugador1() {
		int aleatorio = (int) (Math.random() * 100); // asigna un valor aleatorio
		Letras letras = new Letras(); // crea el banco de fichas
		letraj1 = letras.getLetrasRandom()[aleatorio]; // le asigna la ficha al atributo
		for (int x = 0; x < letraj1.length(); x++) {
			N1 = letraj1.codePointAt(x); //se le asigna el valor ASCII de la ficha generada
		}
	}

	// getter y setter
	public int getN1() {
		return N1;
	}

	public String getLetraj1() {
		return letraj1;
	}
}