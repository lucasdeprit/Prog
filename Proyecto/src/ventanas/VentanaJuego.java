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
	public int Xvida1 = 10;
	public int Xvida2 = 10;
	public int pers1 = 1;
	public int pers2 = 2;
			
	
	
	ImageIcon quieto = new ImageIcon(VentanaJuego.class.getResource("/images/sprites_personajeEjemplo/personaje_quieto.png"));
	ImageIcon quieto2 = new ImageIcon(VentanaJuego.class.getResource("/images/sprites_personajeEjemplo/personaje2_quieto.png"));
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
		reloj.setBounds(561, 11, 46, 35);
		frame.getContentPane().add(reloj);
		
		JLabel lblPlayer = new JLabel("player 2:");
		lblPlayer.setForeground(Color.BLACK);
		lblPlayer.setFont(new Font("Viner Hand ITC", Font.BOLD, 23));
		lblPlayer.setBounds(654, 19, 136, 25);
		frame.getContentPane().add(lblPlayer);
	
		JLabel lblNewLabel = new JLabel("player 1:");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Viner Hand ITC", Font.BOLD, 23));
		lblNewLabel.setBounds(30, 21, 136, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel Vida = new JLabel("");
		Vida.setForeground(Color.GREEN);
		Vida.setBackground(Color.GREEN);
		Vida.setOpaque(true);
		Vida.setBounds(633, 11, 530, 43);
		frame.getContentPane().add(Vida);
		
		JLabel vida2 = new JLabel("");
		vida2.setForeground(Color.GREEN);
		vida2.setBackground(Color.GREEN);
		vida2.setVisible(true);
		vida2.setOpaque(true);
		vida2.setBounds(Xvida2, 11, 500, 43);
		frame.getContentPane().add(vida2);
		
		
		
		personaje = new JLabel();
		personaje.setIcon(new ImageIcon(VentanaJuego.class.getResource("/images/sprites_personajeEjemplo/personaje_quieto.png")));
		personaje.setBounds(0, 264, 236, 349);
		personaje.setFocusable(true);
		frame.getContentPane().add(		personaje);

		personaje2 = new JLabel();
		personaje2.setIcon(new ImageIcon(VentanaJuego.class.getResource("/images/sprites_personajeEjemplo/personaje2_quieto.png")));
		personaje2.setBounds(1030, 264, 236, 349);
		personaje2.setFocusable(true);
		frame.getContentPane().add(personaje2);

		fondo(frame);

		frame.addKeyListener(new KeyAdapter() {

			public void keyTyped(KeyEvent patada) {
				
			}
			
			

			public void keyPressed(KeyEvent e) {
				
				comprobarTeclas(e);
				
				
				if (e.getKeyChar() == 'w') {
					Salto(personaje,e);
				}
				if (e.getKeyChar() == 's') {
					agacharse(personaje , pers1);
				}
				if (e.getKeyChar() == 'k') {
					agacharse(personaje2 ,pers2);
					
				}
				
				if (e.getKeyChar() == 'd') {
				andar(personaje, e,pers1);
				moverDcha(personaje);
				}
				if (e.getKeyChar() == 'l') {
					andar(personaje2, e, pers1);
					moverDcha(personaje2);
					}
					
				if (e.getKeyChar() == 'j') {
					andar(personaje2, e , pers2);
					moverIzq(personaje2);
					}
				
				if (e.getKeyChar() == 'a') {
					andar(personaje, e ,pers2);
					moverIzq(personaje);
					}
				if (e.getKeyChar() == 'd' && e.getKeyChar() == 'w') {
					
					moverDcha(personaje);
					Salto(personaje,e);
				}
				if (e.getKeyChar() == 'f') {
					puñetazo(personaje, pers1);
					quitarVida(personaje,personaje2,Xvida2,e);
				}
				if (e.getKeyChar() == 'h') {
					puñetazo(personaje2, pers2);
					quitarVida(personaje,personaje2,Xvida1,e);
				}
				
			
			}
			public void keyReleased(KeyEvent e) {
				if (e.getKeyChar() == 'd') {
					personaje.setIcon(quieto);
				}
				if (e.getKeyChar() == 'k') {
					personaje2.setIcon(quieto2);
				}
				if (e.getKeyChar() == 'j') {
					personaje2.setIcon(quieto2);
				}
				if (e.getKeyChar() == 'h') {
					personaje2.setIcon(quieto2);
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
