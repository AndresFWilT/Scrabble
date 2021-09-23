package Logica;

/**
 * Clase que recibe el numero de letras para cada jugador
 * 
 * @author Daniel
 *
 */
public abstract class Jugador {
	public int puntos; // atributo de puntos
	public int NumeroLetras; // numero de letras
	public String PrimeraLetra; // primera letra

	/**
	 * Recibe el numero de letras y puntos que requiere cada jugador
	 * 
	 * @param NumeroLetras
	 *            - parametro
	 * @param puntos
	 *            - parametro
	 */
	Jugador(int NumeroLetras, int puntos) {
		this.NumeroLetras = NumeroLetras; // asigna al atribtuto correspondiente
		this.puntos = puntos;
	}

	/**
	 * constructor
	 */
	public Jugador() {
	}
}
