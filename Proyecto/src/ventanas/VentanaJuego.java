package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import logica.Animaciones;

import javax.swing.ImageIcon;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JProgressBar;
import java.awt.Color;
import java.awt.Font;

public class VentanaJuego extends Animaciones   {

	protected static final int KeyEvent = 0;

	public JFrame frame;
	private JLabel personaje;
	private JLabel personaje2;
	public Timer reloj2;
	public TimerTask relcont;
	public String z;
	public int Xvida = 10;
			
	
	
	ImageIcon quieto = new ImageIcon(VentanaJuego.class.getResource("/images/sprites_personajeEjemplo/personaje_quieto.png"));

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
		
		JLabel reloj = new JLabel("0");
		reloj.setForeground(Color.BLUE);
		reloj.setFont(new Font("Trajan Pro", Font.BOLD | Font.ITALIC, 21));
		reloj.setBounds(598, 11, 46, 35);
		frame.getContentPane().add(reloj);
	
		JLabel lblNewLabel = new JLabel("player 1:");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Viner Hand ITC", Font.BOLD, 23));
		lblNewLabel.setBounds(30, 21, 136, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel Vida = new JLabel("");
		Vida.setForeground(Color.GREEN);
		Vida.setBackground(Color.GREEN);
		Vida.setVisible(true);
		Vida.setOpaque(true);
		Vida.setBounds(Xvida, 11, 530, 43);
		frame.getContentPane().add(Vida);
		
		
		personaje = new JLabel();
		personaje.setIcon(new ImageIcon(VentanaJuego.class.getResource("/images/sprites_personajeEjemplo/personaje_quieto.png")));
		personaje.setBounds(0, 264, 236, 349);
		personaje.setFocusable(true);
		frame.getContentPane().add(		personaje);

		personaje2 = new JLabel();
		personaje2.setIcon(new ImageIcon(VentanaJuego.class.getResource("/images/sprites_personajeEjemplo/personaje_quieto.png")));
		personaje2.setBounds(1030, 264, 236, 349);
		personaje2.setFocusable(true);
		frame.getContentPane().add(personaje2);

		fondo(frame);

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
				if (e.getKeyChar() == 'l') {
					andar(personaje2, e);
					moverDcha(personaje2);
					}
					
				if (e.getKeyChar() == 'j') {
					andar(personaje2, e);
					moverIzq(personaje2);
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
					pu�etazo(personaje);
				}
				if (e.getKeyChar() == 'h') {
					pu�etazo(personaje2);
					quitarVida(personaje,personaje2,Xvida,e);
				}
				
			
			}
			public void keyReleased(KeyEvent e) {
				if (e.getKeyChar() == 'd') {
					personaje.setIcon(quieto);
				}
				if (e.getKeyChar() == 'j') {
					personaje2.setIcon(quieto);
				}
				if (e.getKeyChar() == 'h') {
					personaje2.setIcon(quieto);
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
