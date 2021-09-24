package Interfaz;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 * Clase que muestra la ventana de inicio
 * 
 * @author Andres Wilches, Daniel Rodriguez, Juan David Montes
 *		   Ing. Sistemas
 *		   Universidad Distrital Francisco Jose de Caldas				 
 */
public class Ventana1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Ventana de inicio
	 */
	public Ventana1() {

		setTitle("Scrabble");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 608, 427);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		Image Scrabble = new ImageIcon(this.getClass().getResource("/Scrabble.jpg")).getImage(); // imagenes
		Image ColorNegro = new ImageIcon(this.getClass().getResource("/ColorNegro.jpg")).getImage();

		JLabel lblBienvenido = new JLabel("Bienvenido:");
		lblBienvenido.setForeground(Color.WHITE);
		lblBienvenido.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblBienvenido.setBounds(10, 11, 153, 51);
		contentPane.add(lblBienvenido);

		JButton btnSalir = new JButton("Salir"); // boton salir
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose(); // cierra la ventana
			}
		});
		btnSalir.setBackground(Color.BLACK);
		btnSalir.setForeground(Color.WHITE);
		btnSalir.setBounds(464, 330, 89, 23);
		contentPane.add(btnSalir);

		JLabel lblCreadoPor = new JLabel(
				"Creado por: Juan David Montes Martinez - Andres Felipe Wilches Torres - Daniel Rodriguez Fuentes");
		lblCreadoPor.setForeground(Color.WHITE);
		lblCreadoPor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCreadoPor.setBounds(10, 357, 572, 14);
		contentPane.add(lblCreadoPor);

		JButton btnInstrucciones = new JButton("Instrucciones"); // boton de instrucciones
		btnInstrucciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (((JButton) e.getSource()).equals(btnInstrucciones)) {
					Instrucciones instruc = new Instrucciones(); // abre la ventana de instrucciones y cierra esta
					instruc.setVisible(true);
					instruc.setResizable(false);
					dispose();

				}
			}
		});
		btnInstrucciones.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnInstrucciones.setBackground(Color.BLACK);
		btnInstrucciones.setForeground(Color.WHITE);
		btnInstrucciones.setBounds(10, 330, 117, 23);

		contentPane.add(btnInstrucciones);

		JButton btnJugar = new JButton("Entrar"); // boton para seguir con el programa
		btnJugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (((JButton) e.getSource()).equals(btnJugar)) {
					Ventana2 usuarios = new Ventana2(); // abre la ventana de ingreso de usuarios y cierra esta
					usuarios.setVisible(true);
					usuarios.setResizable(false);
					dispose();
				}
			}
		});
		btnJugar.setForeground(Color.WHITE);
		btnJugar.setBackground(Color.BLACK);
		btnJugar.setBounds(222, 330, 117, 23);
		contentPane.add(btnJugar);

		JLabel label = new JLabel();
		label.setLabelFor(label);
		label.setBounds(0, 0, 600, 396);
		contentPane.add(label);
		label.setIcon(new ImageIcon(Scrabble));
		
		JLabel labelll = new JLabel("Ing. Sistemas - Uniersidad Distrital Francisco Jose de Caldas");
		labelll.setText("Ing. Sistemas - Uniersidad Distrital Francisco Jose de Caldas");
		labelll.setForeground(Color.WHITE);
		labelll.setFont(new Font("Tahoma", Font.PLAIN, 12));
		labelll.setBounds(10, 372, 572, 14);
		contentPane.add(labelll);

	}
}
