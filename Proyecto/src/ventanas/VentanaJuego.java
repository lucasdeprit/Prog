package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import logica.Animaciones;

import javax.swing.ImageIcon;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.TimerTask;

import java.util.Timer;

public class VentanaJuego extends Animaciones {

	protected static final int KeyEvent = 0;

	private JFrame frame;
	private JLabel personaje;
	Timer timer;
	Timer timer2;
	TimerTask tarea;
	TimerTask tarea2;
	public int x;
	public int y;
	public int contador;
	public int z = 0;

	ImageIcon andar = new ImageIcon(VentanaJuego.class.getResource("/images/gokuderecha.gif"));

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaJuego window = new VentanaJuego();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaJuego() {
		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();

		frame.setFocusable(true);
		frame.setBounds(0, 0, 1240, 663);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		
		personaje = new JLabel();
		personaje.setIcon(new ImageIcon(VentanaJuego.class.getResource("/images/gokuderecha.gif")));
		personaje.setBounds(0, 264, 300, 349);
		personaje.setFocusable(true);
		frame.getContentPane().add(		personaje);

		JLabel fondo = new JLabel("");
		fondo.setBounds(0, -51, 1279, 675);
		frame.getContentPane().add(fondo);
		fondo.setIcon(new ImageIcon(VentanaJuego.class.getResource("/images/fondo2.gif")));

		frame.addKeyListener(new KeyAdapter() {

			public void keyTyped(KeyEvent patada) {
				if (patada.getKeyChar() == 'w') {
					Salto(personaje);
				}
			}
			
			

			public void keyPressed(KeyEvent e) {
				if (e.getKeyChar() == 'd') {
				andar(personaje, e);
				moverDcha(personaje);
				}
				
				if (e.getKeyChar() == 'a') {
					
					moverIzq(personaje);
					}
				if (e.getKeyChar() == 'a' && e.getKeyChar() == 'a') {
					andar(personaje, e);
					moverDcha(personaje);
					moverIzq(personaje);
				}
				
			
			}
			public void keyReleased(KeyEvent e) {
				if (e.getKeyChar() == 'd') {
					personaje.setIcon(andar);
				}
				if (e.getKeyChar() == 'a') {
					personaje.setIcon(andar);
				}
			}

		});

	}
}
