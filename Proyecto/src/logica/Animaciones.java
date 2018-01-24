package logica;

import java.awt.event.KeyEvent;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import ventanas.VentanaJuego;
import ventanas.ventana;

public class Animaciones extends ventana {

	public Timer andartiemp;
	
	public TimerTask andando;
	
	public int segundos = 0;
	
	public int andarcont = 0;
	public int saltocont = 0;
	public int x;
	public int y;
	int Vel = 5;
	public JLabel fondo;
	
	
	
	public ImageIcon andar1 = new ImageIcon(
			VentanaJuego.class.getResource("/images/sprites_personajeEjemplo/personaje_andando_1.png"));
	public ImageIcon andar2 = new ImageIcon(
			VentanaJuego.class.getResource("/images/sprites_personajeEjemplo/personaje_andando_2.png"));
	public ImageIcon andar3 = new ImageIcon(
			VentanaJuego.class.getResource("/images/sprites_personajeEjemplo/personaje_andando_3.png"));
	public ImageIcon andar4 = new ImageIcon(
			VentanaJuego.class.getResource("/images/sprites_personajeEjemplo/personaje_andando_4.png"));
	public ImageIcon andar5 = new ImageIcon(
			VentanaJuego.class.getResource("/images/sprites_personajeEjemplo/personaje_andando_5.png"));
	public ImageIcon andar6 = new ImageIcon(
			VentanaJuego.class.getResource("/images/sprites_personajeEjemplo/personaje_andando_6.png"));
	public ImageIcon andar7 = new ImageIcon(
			VentanaJuego.class.getResource("/images/sprites_personajeEjemplo/personaje_andando_7.png"));
	public ImageIcon andar8 = new ImageIcon(
			VentanaJuego.class.getResource("/images/sprites_personajeEjemplo/personaje_andando_8.png"));
	public ImageIcon agachado = new ImageIcon(
			VentanaJuego.class.getResource("/images/sprites_personajeEjemplo/personaje_agachado.png"));

	public ImageIcon puñetazo = new ImageIcon(
			VentanaJuego.class.getResource("/images/sprites_personajeEjemplo/personaje_puñetazo.png"));
	
	public ImageIcon andar1_2 = new ImageIcon(
			VentanaJuego.class.getResource("/images/sprites_personajeEjemplo/personaje2_andando_1.png"));
	public ImageIcon andar2_2 = new ImageIcon(
			VentanaJuego.class.getResource("/images/sprites_personajeEjemplo/personaje2_andando_2.png"));
	public ImageIcon andar3_2 = new ImageIcon(
			VentanaJuego.class.getResource("/images/sprites_personajeEjemplo/personaje2_andando_3.png"));
	public ImageIcon andar4_2 = new ImageIcon(
			VentanaJuego.class.getResource("/images/sprites_personajeEjemplo/personaje2_andando_4.png"));
	public ImageIcon andar5_2 = new ImageIcon(
			VentanaJuego.class.getResource("/images/sprites_personajeEjemplo/personaje2_andando_5.png"));
	public ImageIcon andar6_2 = new ImageIcon(
			VentanaJuego.class.getResource("/images/sprites_personajeEjemplo/personaje2_andando_6.png"));
	public ImageIcon andar7_2 = new ImageIcon(
			VentanaJuego.class.getResource("/images/sprites_personajeEjemplo/personaje2_andando_7.png"));
	public ImageIcon andar8_2 = new ImageIcon(
			VentanaJuego.class.getResource("/images/sprites_personajeEjemplo/personaje2_andando_8.png"));
	public ImageIcon agachado_2 = new ImageIcon(
			VentanaJuego.class.getResource("/images/sprites_personajeEjemplo/personaje2_agachado.png"));

	public ImageIcon puñetazo_2 = new ImageIcon(
			VentanaJuego.class.getResource("/images/sprites_personajeEjemplo/personaje2_puñetazo.png"));
	
	
	
	public void fondo (JFrame e){
		JLabel fondo = new JLabel("");
		fondo.setBounds(0, -41, 1279, 675);
		e.getContentPane().add(fondo);
		fondo.setIcon(fondpred);
		
		
	}
	
	public void puñetazo(JLabel e, int i){
		if(i==1){
		e.setIcon(puñetazo);
		}
		if(i==2){
			e.setIcon(puñetazo_2);
		}
	}
	
	public void agacharse (JLabel e, int i){
		if(i==1){
		e.setIcon(agachado);
		}
		if(i==2){
			e.setIcon(agachado_2);
		}
	}
	
	
	
	
	
	public void Salto(JLabel e , KeyEvent z) {

		
		
		
		
		
		
		//no funciona	

		andando = new TimerTask() {

			public void run() {
				
				
				
				x = e.getX();
				y = e.getY();

				
				
				switch (andarcont) {
				
				case 1:
					andarcont = 2;
					e.setIcon(andar4);
					e.setLocation(x, y - 10);
					break;
				case 2:
					andarcont = 3;
					e.setIcon(andar4);
					e.setLocation(x, y - 10);
					break;
				case 3:
					andarcont = 4;
					e.setIcon(andar4);
					e.setLocation(x, y - 10);
					break;
				case 4:
					andarcont = 5;
					e.setIcon(andar4);
					e.setLocation(x, y - 10);
					break;
				case 5:
					andarcont = 6;
					e.setIcon(andar4);
					e.setLocation(x, y + 10);
					break;
				case 6:
					andarcont = 7;
					e.setIcon(andar4);
					e.setLocation(x, y + 10);
					break;
				case 7:
					andarcont = 8;
					e.setIcon(andar4);
					e.setLocation(x, y + 10);
					break;
					
				case 8:
					andarcont = 1;
					e.setIcon(andar4);
					e.setLocation(x, y + 10);
					break;
				};
				
			
			andartiemp = new Timer();

			andartiemp.schedule(andando,5000, 5000);
			}
			
			};

	}

	public void moverIzq(JLabel e) {

		x = e.getX();
		y = e.getY();
		x = x - 10;
		e.setLocation(x, y);

	}

	public void moverDcha(JLabel e) {
		x = e.getX();
		y = e.getY();
		x = x + 10;
		e.setLocation(x, y);

	}

	public void andar(JLabel y, KeyEvent e, int i) {
		
		andando = new TimerTask() {

			public void run() {

				if (e.getKeyChar() == 'd' || e.getKeyChar() == 'a'  || e.getKeyChar() == 'j' || e.getKeyChar()=='l') {

					Icon icono;

					switch (andarcont) {
					case 0:

						andarcont = 1;
						if (i==1){
						icono = andar1;
						y.setIcon(icono);
						}
						if (i==2){
						icono = andar1_2;
						y.setIcon(icono);
						}

						break;
					case 1:
						andarcont = 2;
						if (i==1){
							icono = andar2;
							y.setIcon(icono);
							}
							if (i==2){
							icono = andar2_2;
							y.setIcon(icono);
							}
						break;
					case 2:
						andarcont = 3;
						if (i==1){
							icono = andar3;
							y.setIcon(icono);
							}
							if (i==2){
							icono = andar3_2;
							y.setIcon(icono);
							}
						break;
					case 3:
						andarcont = 4;
						if (i==1){
							icono = andar4;
							y.setIcon(icono);
							}
							if (i==2){
							icono = andar4_2;
							y.setIcon(icono);
							}
						break;
					case 4:
						andarcont = 5;
						if (i==1){
							icono = andar5;
							y.setIcon(icono);
							}
							if (i==2){
							icono = andar5_2;
							y.setIcon(icono);
							}
						break;
					case 5:

						andarcont = 6;
						if (i==1){
							icono = andar6;
							y.setIcon(icono);
							}
							if (i==2){
							icono = andar6_2;
							y.setIcon(icono);
							}
						break;

					case 6:

						andarcont = 7;
						if (i==1){
							icono = andar7;
							y.setIcon(icono);
							}
							if (i==2){
							icono = andar7_2;
							y.setIcon(icono);
							}
						break;

					case 7:

						andarcont = 8;
						if (i==1){
							icono = andar8;
							y.setIcon(icono);
							}
							if (i==2){
							icono = andar8_2;
							y.setIcon(icono);
							}
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
	
	public void quitarVida(JLabel p1 , JLabel p2 , int Xvida, KeyEvent e){
		if (p1.getX() == p2.getX() && e.getKeyChar()=='h'){
			Xvida = Xvida - 1;
		}
		
	}
	
}
