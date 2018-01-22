import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PruebaBarrasVida {

	private JFrame frame;
	public Personaje p1 = new Personaje(12, 12, 200);
	public Personaje p2 = new Personaje(12, 12, 200);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PruebaBarrasVida window = new PruebaBarrasVida();
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
	public PruebaBarrasVida() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		double i = 0.12;
		int x = p2.getVida();
		int puño1 = p1.getPuño();
		int puño2 = p2.getPuño();

		JPanel vida1 = new JPanel();
		vida1.setBackground(Color.YELLOW);

		vida1.setBounds(10, 11, 200, 35);
		frame.getContentPane().add(vida1);
	
			vida1.setBackground(Color.GREEN);
		

		JPanel vida2 = new JPanel();

		vida2.setBounds(474, 11, 200, 35);
		
			vida2.setBackground(Color.GREEN);
		
		frame.getContentPane().add(vida2);

		JLabel lblJugador = new JLabel("Jugador 1:");
		lblJugador.setBounds(50, 86, 89, 14);
		frame.getContentPane().add(lblJugador);

		JLabel lblJugador_1 = new JLabel("Jugador 2:");
		lblJugador_1.setBounds(550, 86, 89, 14);
		frame.getContentPane().add(lblJugador_1);

		JCheckBox defensa1 = new JCheckBox("Defensa");
		defensa1.setBounds(50, 219, 97, 23);
		frame.getContentPane().add(defensa1);
		if (defensa1.isSelected() == true) {

			p2.setPuño(p2.getPuño()-5);

		}else {
			p2.setPuño(12);
		}

		JCheckBox defensa2 = new JCheckBox("Defensa");
		defensa2.setBounds(552, 219, 97, 23);
		frame.getContentPane().add(defensa2);
		if (defensa2.isSelected() == true) {

			p1.setPuño(p1.getPuño()-5);

		}else {
			p1.setPuño(12);
		}

		JButton ataque1 = new JButton("Ataque");
		ataque1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p2.setVida(p2.getVida() - p1.getPuño());
				System.out.println(p2.getVida());

				vida2.setBounds(474, 11, p2.getVida(), 35);
				if (p2.getVida() < 115 && p2.getVida()>50) {
					vida2.setBackground(Color.YELLOW);

					vida2.repaint();
				} else if (p2.getVida() < 50) {
					vida2.setBackground(Color.RED);

					vida2.repaint();
				}

				
			}
		});
		ataque1.setBounds(50, 155, 89, 23);
		frame.getContentPane().add(ataque1);

		JButton ataque2 = new JButton("Ataque");
		ataque2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				p1.setVida(p1.getVida() - p2.getPuño());
				System.out.println(p1.getVida());
				vida1.setBounds(10, 11, p1.getVida(), 35);
				if (p1.getVida() < 115 && p1.getVida()>50) {
					vida1.setBackground(Color.YELLOW);

					vida1.repaint();
				} else if (p1.getVida() < 50) {
					vida1.setBackground(Color.RED);

					vida1.repaint();
				}
			}
		});
		ataque2.setBounds(550, 155, 89, 23);
		frame.getContentPane().add(ataque2);
	}
}
