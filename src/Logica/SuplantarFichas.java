package Logica;

/**
 * Clase encargada de enviar las fichas que el jugador necesita al terminar cada
 * turno
 * 
 * @author Daniel
 *
 */
public class SuplantarFichas {
	String DevolverFicha[]; // array que almacena las fichas para enviar
	int help; // atributo
	int LetrasContador; // numero de fichas que se necesitan para enviar
	String[] combobox; // array de fichas al final de cada turno
	int pos = 15; // posicion desde la que inicia a tomar fichas en el array de fichas aleatorias
	int j = 0; // atributo de ciclo

	/**
	 * asigna el numero de fichas y el array de fichas
	 * 
	 * @param letrasContador
	 *            - numero de fichas
	 * @param ComboBox
	 *            - array de fichas al final de cada turno
	 */
	public SuplantarFichas(int letrasContador, String[] ComboBox) {
		this.LetrasContador = letrasContador; // asigna
		this.combobox = ComboBox;
	}

	/**
	 * metodo encargado de devolver las fichas necesarias al final de cada turno
	 * para ambos jugadores
	 * 
	 * @param contador
	 *            - numero de fichas que se usaron en el turno
	 * @param FichasParaJugar
	 *            - banco de fichas ya ordenado aleatoriamente
	 * @return - regresa un array con las nuevas fichas
	 */
	public String[] DevolverFicha(int contador, String[] FichasParaJugar) {
		DevolverFicha = new String[contador]; // se crea el vector de acuerdo al numero de fichas necesarias
		LetrasContador = pos + contador; // se suma desde la posicion inicial hasta el numero de fichas solicitadas
		for (int i = pos; i < LetrasContador; i++) { // se toman las fichas necesarias
			j = 0; // se inicia siempre desde el punto 0 para el array de retorno
			DevolverFicha[j] = FichasParaJugar[i]; // se le asignan al array de retorno tomandola del banco de fichas
			j++;
		}
		pos = pos + contador; // se aumenta la poscion por cada turno
		return DevolverFicha; // regresa el array
	}
}
