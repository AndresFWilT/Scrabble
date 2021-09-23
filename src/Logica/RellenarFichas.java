package Logica;

/**
 * Clase encargada de enviar las fichas necesarias para el primer turno a los
 * jugadores
 * 
 * @author Daniel
 *
 */
public class RellenarFichas {

	private String FichasParaJugar[] = new String[100]; // Array que almacena las fichas disponibles

	/**
	 * constructor
	 * 
	 * @param turno
	 */
	public RellenarFichas(int turno) {
	}

	/**
	 * Metodo encargado de enviar las primeras fichas a cada jugador
	 * 
	 * @param turno
	 *            - dependiendo del turno se asignan a un jugador u otro
	 * @return - devuelve las fichas en un array
	 */
	public String[] EnviarFichas(int turno) {
		String[] FichasTurno1 = new String[7]; // array para las fichas del jugador 1
		String[] FichasTurno2 = new String[7]; // array para las fichas del jugador 1
		String[] FichasEnviar = new String[7]; // array que almacena las fichas que se van a enviar
		FichasAleatorias letras = new FichasAleatorias(); // objeto que tiene el banco de fichas
		for (int j = 0; j < 100; j++) { // asigna las fichas al array
			FichasParaJugar[j] = letras.getBancoDeFichas()[j];
		}
		if (turno == 1) { // si el turno es 1 se envian al jugador 1
			for (int j = 0; j < 7; j++) {
				FichasTurno1[j] = FichasParaJugar[j];
				FichasEnviar[j] = FichasTurno1[j];
			}
		}
		if (turno == 2) { // de igual manera para el jugador 2
			for (int j = 0; j < 7; j++) {
				FichasTurno2[j] = FichasParaJugar[j];
				FichasEnviar[j] = FichasTurno2[j];
			}
		}
		return FichasEnviar; // retorna las fichas ya asignadas
	}

	// getter y setter
	public String[] getFichasParaJugar() {
		return FichasParaJugar;
	}

	public void setFichasParaJugar(String[] fichasParaJugar) {
		FichasParaJugar = fichasParaJugar;
	}

}