package Logica;

/**
 * Clase que toma las fichas del banco de fichas ya generado y las asigna al
 * jugador 2 se puede decir que hace el mismo proceso que la clase Jugador1
 * 
 * @author Daniel
 *
 */
public class Jugador2 extends Jugador {
	private String letraj2;
	private int N2;

	/**
	 * asigna el numero de letras y puntos
	 * 
	 * @param NumeroLetras
	 *            - parametro
	 * @param puntos
	 *            - parametro
	 */
	Jugador2(int NumeroLetras, int puntos) {
		super(NumeroLetras, puntos);
	}

	/**
	 * Metodo que asigna las primeras 7 fichas para el jugador 1
	 * 
	 * @return - regresa el array con las 7 fichas
	 */
	String[] PrimerTurno() {
		int pos = -1; // variable de posicion
		FichasAleatorias letras = new FichasAleatorias();
		String[] PrimerTurno = new String[7];
		/*
		 * el jugador 2 comienza desde la posicion 7 ya que el jugador1 es el que toma
		 * las 7 primeras
		 */
		for (int i = 7; i < 14; i++) {
			pos++;
			PrimerTurno[pos] = letras.getBancoDeFichas()[i];
		}
		return PrimerTurno;
	}

	/**
	 * 
	 * Obtiene una ficha aleatoria
	 */
	public Jugador2() {
		int aleatorio = (int) (Math.random() * 100);
		Letras letras = new Letras();
		letraj2 = letras.getLetrasRandom()[aleatorio];

		for (int x = 0; x < letraj2.length(); x++) {
			N2 = letraj2.codePointAt(x);
		}
	}

	public String getLetraj2() {
		return letraj2;
	}

	public int getN2() {
		return N2;
	}
}
