package Logica;

/**
 * Clase encargada de recibir el array de fichas ordenadas aleatoriamente
 * 
 * @author Daniel
 *
 */
public class FichasAleatorias {
	// array donde se van a guardar las fichar ordenadas aleatoriamente
	private String[] BancoDeFichas = new String[100];

	/**
	 * Metodo encargado de asignar las fichas en el array
	 */
	public FichasAleatorias() {
		// objeto de la clase letras la cual crea el array de fichas aleatorias
		Letras letras = new Letras();
		// ciclo que asigna las fichas en el array
		for (int i = 0; i < 100; i++) {
			BancoDeFichas[i] = letras.getLetrasRandom()[i];
		}
	}

	// getter y setter
	public String[] getBancoDeFichas() {
		return BancoDeFichas;
	}

	public void setBancoDeFichas(String[] bancoDeFichas) {
		BancoDeFichas = bancoDeFichas;
	}

}
