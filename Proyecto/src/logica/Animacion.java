package logica;

import java.awt.event.KeyEvent;

public class Animacion {

	public boolean dchp = false;
	public boolean izqp = false;
	public boolean upp = false;
	public boolean downp = false;
	public boolean fp = false;
	public char tecla;
	public boolean ListaMov[] ;

	public void comprobarTeclas(KeyEvent e) {

		tecla = e.getKeyChar();
		ListaMov = new boolean []{dchp, izqp, upp, downp, fp} ;
		
		if (tecla == 'd') {
			ListaMov[0]  = true;
		
		} else {
			ListaMov[0] = false;
		}

		if (tecla == 'a') {
			ListaMov[1]  = true;

		} else {
			ListaMov[1]  = false;
		}
		
		if ( tecla == 'w'){
			ListaMov[2] =true;
		
		}else{
			ListaMov[2] =false;
		}
		
		
		if ( tecla == 's'){
			ListaMov[3] =true;
		
		}else{
			ListaMov[3] = false;
		}
		
		if (tecla == 'f'){
			ListaMov[4] = true;
		
		}else{
			ListaMov[4]=false;
		
		}
		
		
	       

	}

	public boolean getListaMov(int i) {
		return ListaMov[i];
	}

	public void setListaMov(boolean[] listaMov) {
		ListaMov = listaMov;
	}

}
