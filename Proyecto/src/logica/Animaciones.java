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
	public Timer saltartiemp;
	public TimerTask andando;
	public TimerTask saltando;
	public int andarcont = 0;
	public int saltocont = 0;
	public int x;
	public int y;
	int Vel = 5;

	public ImageIcon andar1 = new ImageIcon(
			VentanaJuego.class.getResource("/images/sprites_andar/personaje_andando_1.png"));
	public ImageIcon andar2 = new ImageIcon(
			VentanaJuego.class.getResource("/images/sprites_andar/personaje_andando_2.png"));
	public ImageIcon andar3 = new ImageIcon(
			VentanaJuego.class.getResource("/images/sprites_andar/personaje_andando_3.png"));
	public ImageIcon andar4 = new ImageIcon(
			VentanaJuego.class.getResource("/images/sprites_andar/personaje_andando_4.png"));
	public ImageIcon andar5 = new ImageIcon(
			VentanaJuego.class.getResource("/images/sprites_andar/personaje_andando_5.png"));
	public ImageIcon andar6 = new ImageIcon(
			VentanaJuego.class.getResource("/images/sprites_andar/personaje_andando_6.png"));
	public ImageIcon andar7 = new ImageIcon(
			VentanaJuego.class.getResource("/images/sprites_andar/personaje_andando_7.png"));
	public ImageIcon andar8 = new ImageIcon(
			VentanaJuego.class.getResource("/images/sprites_andar/personaje_andando_8.png"));
	public ImageIcon agachado = new ImageIcon(
			VentanaJuego.class.getResource("/images/sprites_andar/personaje_agachado.png"));

	public ImageIcon puñetazo = new ImageIcon(
			VentanaJuego.class.getResource("/images/sprites_andar/personaje_puñetazo.png"));
	
	
	public void puñetazo(JLabel e){
		
		e.setIcon(puñetazo);
	}
	
	public void agacharse (JLabel e){
		
		e.setIcon(agachado);
		
	}
	
	
	
	
	
	public void Salto(JLabel e , KeyEvent z) {

		e.setIcon(andar4);
		
		x = e.getX();
		y = e.getY();

		y=y-5;
		
		e.setLocation(x, y);
		
		
		//no funciona	

//		saltando = new TimerTask() {
//
//			public void run() {
//				
//				if (z.getKeyChar() == 'd') {
//				
//				switch (saltocont) {
//				
//				case 1:
//					saltocont = 2;
//					y--;
//					e.setLocation(x, y);
//					break;
//				case 2:
//					saltocont = 3;
//					y--;
//					e.setLocation(x, y);
//					break;
//				case 3:
//					saltocont = 4;
//					y--;
//					e.setLocation(x, y);
//					break;
//				case 4:
//					saltocont = 5;
//					y--;
//					e.setLocation(x, y);
//					break;
//				case 5:
//					saltocont = 6;
//					y++;
//					e.setLocation(x, y);
//					break;
//				case 6:
//					saltocont = 7;
//					y++;
//					e.setLocation(x, y);
//					break;
//				case 7:
//					saltocont = 8;
//					y++;
//					e.setLocation(x, y);
//					break;
//				case 8:
//					saltocont = 1;
//					y++;
//					e.setLocation(x, y);
//					break;
//				};
//				
//			};
//			saltartiemp = new Timer();
//
//			saltartiemp.schedule(saltando, Vel);
//			}
//			
//			};

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

				if (e.getKeyChar() == 'd' || e.getKeyChar() == 'a') {

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
