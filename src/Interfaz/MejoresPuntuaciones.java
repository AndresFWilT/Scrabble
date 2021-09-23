package Interfaz;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

/**
 * Clase encargada de abrir la ventana con las mejores puntuaciones
 * 
 * @author Daniel
 *
 */
public class MejoresPuntuaciones extends JFrame {

	private JPanel contentPane;
	private JTable table;
	// array que guarda los nombres almacenados en el archivo
	private ArrayList<String> nombres = new ArrayList<String>();
	// array que guarda las puntuaciones almacenadas en el archivo
	private ArrayList<Double> puntuaciones = new ArrayList<Double>();
	private String matrizmostrar[][]; // matriz que almacena los nombres y puntuaciones respetivamente

	/**
	 * Ventana de mejores puntuaciones
	 */
	public MejoresPuntuaciones() {

		Ordenar();// metodo que ordena las puntuaciones
		Image fondo = new ImageIcon(this.getClass().getResource("/fichas.jpg")).getImage();// imagen de fondo

		setTitle("Mejores Puntuaciones");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 702, 484);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		table = new JTable(); // tabla que muestra las puntuaciones por medio de la matriz
		table.setModel(new DefaultTableModel(matrizmostrar, new String[] { "NOMBRE", "PUNTUACIONES" }) {
			Class[] columnTypes = new Class[] { String.class, Integer.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(157);
		table.getColumnModel().getColumn(1).setPreferredWidth(199);
		table.setBounds(40, 40, 575, 191);
		contentPane.add(table);

		JButton btnVolver = new JButton("Volver"); // boton para volver al inicio
		btnVolver.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnVolver.setForeground(Color.WHITE);
		btnVolver.setBackground(Color.BLACK);
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Ventana2 volver = new Ventana2(); // abre la ventana de inicio y cierra esta
				volver.setVisible(true);
				dispose();
			}
		});
		btnVolver.setBounds(296, 314, 89, 23);
		contentPane.add(btnVolver);

		JLabel fondito = new JLabel("");
		fondito.setBounds(0, 0, 686, 446);
		fondito.setIcon(
				new ImageIcon(fondo.getScaledInstance(fondito.getWidth(), fondito.getHeight(), Image.SCALE_DEFAULT)));
		contentPane.add(fondito);
	}

	/**
	 * Metodo que lee el archivo y ordena de acuerdo a las puntuaciones mas altas
	 * almacenandolas en arrays y asignandolas despues en una matriz
	 */
	public void Ordenar() {
		File archivo; // variable de archivo
		FileReader leer; // variable para leer el archivo
		BufferedReader almacenamiento; // variable para leer cada linea del archivo
		String temp; // cadena que guarda lo leido en cada linea
		archivo = new File("puntuaciones.txt"); // busca el archivo
		try { // metodo try catch de manejo de archivos
			leer = new FileReader(archivo); // lee el archivo
			almacenamiento = new BufferedReader(leer); // lee cada linea
			temp = ""; // se inicializa la cadena
			while (temp != null) { // ciclo que lee las lineas hasta que el archivo se acabe
				try { // try catch de manejo de archivos
					temp = almacenamiento.readLine(); // lee la linea y se la asigna a la cadena
					if (temp != null) { // en caso de ser nula deja de leer el archivo
						nombres.add(temp); // agrega la line correspondiente a los nombres al array
						temp = almacenamiento.readLine(); // igual para las puntuaciones
						puntuaciones.add(Double.parseDouble(temp));
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// ciclo que ordena los arrays de mayor a menor para mostarlos
		for (int i = 0; i < puntuaciones.size() - 1; i++) {
			int menor = i;
			for (int j = i + 1; j < puntuaciones.size(); j++) {
				if (puntuaciones.get(j) > puntuaciones.get(menor)) {
					menor = j;
				}
			}
			if (i != menor) {
				double aux = puntuaciones.get(i);
				String auxiliar = nombres.get(i);
				nombres.set(i, nombres.get(menor));
				puntuaciones.set(i, puntuaciones.get(menor));
				nombres.set(menor, auxiliar);
				puntuaciones.set(menor, aux);
			}
		}
		matrizmostrar = new String[puntuaciones.size()][2];// crea la matriz
		for (int i = 0; i < puntuaciones.size(); i++) { // llena la matriz con los valores ya ordenados
			matrizmostrar[i][0] = nombres.get(i);
			matrizmostrar[i][1] = Double.toString(puntuaciones.get(i));
		}
	}
}
