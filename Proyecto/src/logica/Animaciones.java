package logica;

import java.awt.event.KeyEvent;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import ventanas.VentanaJuego;

public class Animaciones {

	public Timer andartiemp;
	public TimerTask andando;
	public int andarcont = 0;
	public int x;
	public int y;
	int Vel = 5;

	public ImageIcon andar1 = new ImageIcon(VentanaJuego.class.getResource("/images/sprites_andar/foto1.png"));
	public ImageIcon andar2 = new ImageIcon(VentanaJuego.class.getResource("/images/sprites_andar/foto2.png"));
	public ImageIcon andar3 = new ImageIcon(VentanaJuego.class.getResource("/images/sprites_andar/foto3.png"));
	public ImageIcon andar4 = new ImageIcon(VentanaJuego.class.getResource("/images/sprites_andar/foto4.png"));
	public ImageIcon andar5 = new ImageIcon(VentanaJuego.class.getResource("/images/sprites_andar/foto5.png"));
	public ImageIcon andar6 = new ImageIcon(VentanaJuego.class.getResource("/images/sprites_andar/foto6.png"));
	public ImageIcon andar7 = new ImageIcon(VentanaJuego.class.getResource("/images/sprites_andar/foto7.png"));
	public ImageIcon andar8 = new ImageIcon(VentanaJuego.class.getResource("/images/sprites_andar/foto8.png"));
	public ImageIcon andar9 = new ImageIcon(VentanaJuego.class.getResource("/images/sprites_andar/foto9.png"));
	public ImageIcon andar10 = new ImageIcon(VentanaJuego.class.getResource("/images/sprites_andar/foto10.png"));
	public ImageIcon andar11 = new ImageIcon(VentanaJuego.class.getResource("/images/sprites_andar/foto11.png"));

	public void Salto(JLabel e) {

		x = e.getX();
		y = e.getY();

		y--;

		e.setLocation(x, y);

	}

	public void moverIzq(JLabel e) {

		x = e.getX();
		y = e.getY();
		x = x - 10;
		e.setIcon(andar1);
		e.setLocation(x, y);

	}

	public void moverDcha(JLabel e) {
		x = e.getX();
		y = e.getY();
		x = x + 10;
		e.setLocation(x, y);

	}

	public void andar(JLabel y, KeyEvent e) {
		andando = new TimerTask() {

			public void run() {

				if (e.getKeyChar() == 'd') {

					Icon icono;

					switch (andarcont) {
					case 0:

						andarcont = 1;
						icono = andar1;
						y.setIcon(icono);

						break;
					case 1:
						andarcont = 2;
						icono = andar2;
						y.setIcon(icono);

						break;
					case 2:
						andarcont = 3;
						icono = andar3;
						y.setIcon(icono);

						break;
					case 3:
						andarcont = 4;
						icono = andar4;
						y.setIcon(icono);

						break;
					case 4:
						andarcont = 5;
						icono = andar5;
						y.setIcon(icono);

						break;
					case 5:

						andarcont = 6;
						icono = andar6;
						y.setIcon(icono);
						break;

					case 6:

						andarcont = 7;
						icono = andar7;
						y.setIcon(icono);
						break;

					case 7:

						andarcont = 8;
						icono = andar8;
						y.setIcon(icono);
						break;

					case 8:

						andarcont = 9;
						icono = andar9;
						y.setIcon(icono);
						break;
					case 9:

						andarcont = 10;
						icono = andar10;
						y.setIcon(icono);
						break;
					case 10:

						andarcont = 11;
						icono = andar11;
						y.setIcon(icono);
						break;

					case 11:

						andarcont = 1;
						break;

					}

				}

			};
		};

		andartiemp = new Timer();

		andartiemp.schedule(andando, Vel);

	}
}
