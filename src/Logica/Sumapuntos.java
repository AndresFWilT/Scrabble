package Logica;

/**
 * Clase encargada de la suma de los puntos de cada usuario necesarios para el
 * juego
 * 
 * @author Daniel
 *
 */
public class Sumapuntos {

	// matriz donde se guarda los bonus de las palabras en el tablero
	private int[][] multiplicadorespalabra = new int[15][15];
	// matriz donde se guarda los bonus de las letras en el tablero
	private int[][] multiplicadoresletra = new int[15][15];
	private double puntuacion = 0; // valor que toma la puntuacion en cada turno

	/**
	 * Metodo encargado de crear las matrices que almacenan los bonus de puntos del
	 * tablero de juego en cada una de las posiciones
	 */
	public Sumapuntos() {
		/*
		 * por medio de ciclos se le asigna el valor de los bonus por palabra en cada
		 * posicion respecto al tablero
		 */
		for (int fil = 0; fil < 15; fil++) {
			/*
			 * condicionales que de acuerdo a la posicion en el tablero asignan el valor del
			 * bonus
			 */
			for (int col = 0; col < 15; col++) {
				if ((fil == 0 && col == 0) || (fil == 0 && col == 7) || (fil == 0 && col == 14)
						|| (fil == 7 && col == 0) || (fil == 7 && col == 14) || (fil == 14 && col == 0)
						|| (fil == 14 && col == 7) || (fil == 14 && col == 14))

					multiplicadorespalabra[fil][col] = 3;
				else if ((fil == 1 && col == 1) || (fil == 2 && col == 2) || (fil == 3 && col == 3)
						|| (fil == 4 && col == 4) || (fil == 1 && col == 13) || (fil == 2 && col == 12)
						|| (fil == 3 && col == 11) || (fil == 4 && col == 10) || (fil == 10 && col == 4)
						|| (fil == 11 && col == 3) || (fil == 12 && col == 2) || (fil == 13 && col == 1)
						|| (fil == 10 && col == 11) || (fil == 11 && col == 11) || (fil == 12 && col == 12)
						|| (fil == 13 && col == 13) || (fil == 14 && col == 14))
					multiplicadorespalabra[fil][col] = 2;
				else
					multiplicadorespalabra[fil][col] = 1;
			}
		}
		for (int fil = 0; fil < 15; fil++) { // ciclo para los bonus por letra en el tablero
			for (int col = 0; col < 15; col++) {
				if ((fil == 0 && col == 3) || (fil == 0 && col == 11) || (fil == 2 && col == 6)
						|| (fil == 2 && col == 8) || (fil == 3 && col == 0) || (fil == 3 && col == 7)
						|| (fil == 3 && col == 14) || (fil == 6 && col == 2) || (fil == 6 && col == 6)
						|| (fil == 6 && col == 8) || (fil == 6 && col == 12) || (fil == 7 && col == 3)
						|| (fil == 7 && col == 11) || (fil == 8 && col == 2) || (fil == 8 && col == 6)
						|| (fil == 8 && col == 8) || (fil == 8 && col == 12) || (fil == 11 && col == 0)
						|| (fil == 11 && col == 7) || (fil == 11 && col == 14) || (fil == 12 && col == 6)
						|| (fil == 12 && col == 8) || (fil == 14 && col == 3) || (fil == 14 && col == 11))
					multiplicadoresletra[fil][col] = 2;
				else if ((fil == 1 && col == 5) || (fil == 1 && col == 9) || (fil == 5 && col == 1)
						|| (fil == 5 && col == 5) || (fil == 5 && col == 9) || (fil == 5 && col == 13)
						|| (fil == 9 && col == 1) || (fil == 9 && col == 5) || (fil == 9 && col == 9)
						|| (fil == 13 && col == 5) || (fil == 13 && col == 9))
					multiplicadoresletra[fil][col] = 3;
				else
					multiplicadoresletra[fil][col] = 1;
			}
		}
	}

	/**
	 * Metodo encargado de enviar el valor de cada letra y su respectivo bonus de
	 * acuerdo a su posicion en el tablero
	 * 
	 * @param letra
	 *            - la ficha que se uso en el turno
	 * @param posicionfila
	 *            - posicion de la fila en la que se uso la ficha
	 * @param posicioncolumna-
	 *            posicion de la colummna en la que se uso la ficha
	 * @return - regresa el valor total de la ficha con su respectivo bonus
	 */
	public double puntuacion(String letra, int posicionfila, int posicioncolumna) {
		/*
		 * por medio de condicionales se le asigna un valor a cada ficha y se le suma su
		 * respectivo bonus de acuerdo a la posicion
		 */
		if (letra.equals("A") || letra.equals("E") || letra.equals("O") || letra.equals("I") || letra.equals("S")
				|| letra.equals("N") || letra.equals("L") || letra.equals("R") || letra.equals("U")
				|| letra.equals("T"))
			puntuacion = 1 * multiplicadoresletra[posicionfila][posicioncolumna];
		else if (letra.equals("D") || letra.equals("G"))
			puntuacion = 2 * multiplicadoresletra[posicionfila][posicioncolumna];
		else if (letra.equals("C ") || letra.equals("B") || letra.equals("M") || letra.equals("P"))
			puntuacion = 3 * multiplicadoresletra[posicionfila][posicioncolumna];
		else if (letra.equals("H") || letra.equals("F") || letra.equals("V") || letra.equals("Y"))
			puntuacion = 4 * multiplicadoresletra[posicionfila][posicioncolumna];
		else if (letra.equals("Q") || letra.equals("CH"))
			puntuacion = 5 * multiplicadoresletra[posicionfila][posicioncolumna];
		else if (letra.equals("j") || letra.equals("Ñ") || letra.equals("X") || letra.equals("LL")
				|| letra.equals("RR"))
			puntuacion = 8 * multiplicadoresletra[posicionfila][posicioncolumna];
		else if (letra.equals("Z"))
			puntuacion = 10 * multiplicadoresletra[posicionfila][posicioncolumna];

		return puntuacion; // se regresa su valor total
	}

	/**
	 * metodo encargado de retornar el bonus pero por palabra de acuerdo a la
	 * posicion en el trablero
	 * 
	 * @param posicionfila
	 *            - el valor de la fila en el tablero
	 * @param posicioncolumna
	 *            - el valor de la columna en el tablero
	 * @return - regresa el bonus total de acuerdo a la posicion
	 */
	public double puntuacion(int posicionfila, int posicioncolumna) {
		// si el valor de acuerdo a la posicion es distinto de 1 retorna ese valor
		if (multiplicadorespalabra[posicionfila][posicioncolumna] != 1) {
			return multiplicadorespalabra[posicionfila][posicioncolumna];
		} else // en caso contrario solo retorna 1
			return 1;
	}

	// getter y setter
	public int[][] getMultiplicadorespalabra() {
		return multiplicadorespalabra;
	}

	public void setMultiplicadorespalabra(int[][] multiplicadorespalabra) {
		this.multiplicadorespalabra = multiplicadorespalabra;
	}

	public int[][] getMultiplicadoresletra() {
		return multiplicadoresletra;
	}

	public void setMultiplicadoresletra(int[][] multiplicadoresletra) {
		this.multiplicadoresletra = multiplicadoresletra;
	}

	public double getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(double puntuacion) {
		this.puntuacion = puntuacion;
	}

}
