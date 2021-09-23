package Logica;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Clase encargada de la creacion y manejo del archivo
 * 
 * @author Daniel
 *
 */
public class Archivo {
	/**
	 * Metodo encargado de la creacion y escritura del archivo
	 * 
	 * @param jugador1-
	 *            Nombre del usuario
	 * @param puntuacion1-
	 *            Parametro que es enviado al final del juego donde se guarda la
	 *            puntuacion del primer usuario al terminar
	 * @param jugador2
	 *            - Nombre del segundo usuario
	 * @param puntuacion2
	 *            - Parametro que es enviado al final del juego donde se guarda la
	 *            puntuacion del primer usuario al terminar
	 */
	public Archivo(String jugador1, double puntuacion1, String jugador2, double puntuacion2) {
		File mpuntajes; // variable de archivo
		FileWriter escribir; // variable de escritura
		PrintWriter linea; // variable de impresion
		mpuntajes = new File("puntuaciones.txt");// busca el archivo
		if (!mpuntajes.exists())// verifica que el archivo existe
			try { // try catch de manejo de archivos
				mpuntajes.createNewFile(); // si el archivo no existe lo crea
				escribir = new FileWriter(mpuntajes, true); // una vez creado procede a escribir
				linea = new PrintWriter(escribir); // objeto para escribir en cada linea
				linea.println(jugador1); // escribe en una linea el nombre del jugador
				linea.println(puntuacion1); // despues su puntuacion
				linea.println(jugador2); // y asi con el siguiente jugador
				linea.println(puntuacion2);
				linea.close(); // termina de escribir
				escribir.close(); // termina de modificar el archivo
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		else // en caso de que el archivo si exista...
			try {
				escribir = new FileWriter(mpuntajes, true); // ...proceder a escribir en el archivo sin crear uno nuevo
				linea = new PrintWriter(escribir); // comienza el mismo proceso anterior
				linea.println(jugador1);
				linea.println(puntuacion1);
				linea.println(jugador2);
				linea.println(puntuacion2);
				linea.close();
				escribir.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
	}

}
