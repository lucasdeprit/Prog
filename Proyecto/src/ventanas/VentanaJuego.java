package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import logica.Animaciones;

import javax.swing.ImageIcon;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class VentanaJuego extends Animaciones {

	protected static final int KeyEvent = 0;

	private JFrame frame;
	private JLabel personaje;
	
	
	ImageIcon quieto = new ImageIcon(VentanaJuego.class.getResource("/images/sprites_andar/personaje_quieto.png"));

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
		personaje.setIcon(new ImageIcon(VentanaJuego.class.getResource("/images/sprites_andar/personaje_quieto.png")));
		personaje.setBounds(0, 264, 236, 349);
		personaje.setFocusable(true);
		frame.getContentPane().add(		personaje);

		JLabel fondo = new JLabel("");
		fondo.setBounds(0, -51, 1279, 675);
		frame.getContentPane().add(fondo);
		fondo.setIcon(new ImageIcon(VentanaJuego.class.getResource("/images/fondo2.gif")));

		frame.addKeyListener(new KeyAdapter() {

			public void keyTyped(KeyEvent patada) {
				
			}
			
			

			public void keyPressed(KeyEvent e) {
				if (e.getKeyChar() == 'w') {
					Salto(personaje,e);
				}
				if (e.getKeyChar() == 's') {
					agacharse(personaje);
				}
				
				if (e.getKeyChar() == 'd') {
				andar(personaje, e);
				moverDcha(personaje);
				}
				
				if (e.getKeyChar() == 'a') {
					andar(personaje, e);
					moverIzq(personaje);
					}
				if (e.getKeyChar() == 'd' && e.getKeyChar() == 'w') {
					
					moverDcha(personaje);
					Salto(personaje,e);
				}
				if (e.getKeyChar() == 'f') {
					puñetazo(personaje);
				}
				
			
			}
			public void keyReleased(KeyEvent e) {
				if (e.getKeyChar() == 'd') {
					personaje.setIcon(quieto);
				}
				if (e.getKeyChar() == 'a') {
					personaje.setIcon(quieto);
				}
				if (e.getKeyChar() == 's') {
					personaje.setIcon(quieto);
				}
				if (e.getKeyChar() == 'f') {
					personaje.setIcon(quieto);
				}
				if (e.getKeyChar() == 'w') {
					personaje.setLocation(x,264);
					
					personaje.setIcon(quieto);
				}
			}

		});

	}
}
