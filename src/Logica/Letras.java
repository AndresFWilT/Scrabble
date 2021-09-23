package Logica;

/**
 * Clase que almacena las 100 fichas y las reordena aleatoriamente
 * 
 * @author Daniel
 *
 */
public class Letras {
	public String[] LetrasRandom; // Array que guarda las fichas generadas aleatoriamente

	/**
	 * Constructor
	 */
	public Letras() {
	}

	/**
	 * Genera el array con las 100 fichas ordenadas aleatoriamente
	 * 
	 * @return - retorna el array
	 */
	public String[] getLetrasRandom() {
		LetrasRandom = new String[100]; // se crea el array que va a almacenar las fichas aleatorias
		int[] aleatorio = new int[100]; // se crea el array con las 100 fichas
		int j = 0; // variable de ciclo
		int i = 0; // variable de ciclo
		String[] abecedario = { "A", "A", "A", "A", "A", "A", "A", "A", "A", "A", "A", "A", "B", "B", "C", "C", "C",
				"C", "CH", "D", "D", "D", "D", "D", "E", "E", "E", "E", "E", "E", "E", "E", "E", "E", "E", "E", "E",
				"F", "G", "G", "H", "H", "I", "I", "I", "I", "I", "I", "J", "L", "L", "L", "L", "LL", "M", "M", "N",
				"N", "N", "N", "N", "O", "O", "O", "O", "O", "O", "O", "O", "O", "P", "P", "Q", "R", "R", "R", "R", "R",
				"RR", "S", "S", "S", "S", "S", "S", "T", "T", "T", "T", "U", "U", "U", "U", "U", "V", "X", "Y", "Z",
				" ", " " }; // se llena el vector con las fichas
		aleatorio[i] = (int) (Math.random() * 100); // se genera un numero aleatorio
		for (i = 1; i < 100; i++) { // se inicia un ciclo para asignar las fichas aleatoriamente en el array
			aleatorio[i] = aleatorio[i] = (int) (Math.random() * 100);
			for (j = 0; j < i; j++) {
				if (aleatorio[i] == aleatorio[j]) {
					i--;
				}
			}
		}
		for (i = 0; i < 100; i++) { //se comienza a llenar el array para retornarlo
			LetrasRandom[i] = abecedario[aleatorio[i]];
		}
		return LetrasRandom; //se retorna el array
	}
}
