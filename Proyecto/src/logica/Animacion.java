package logica;

import java.awt.event.KeyEvent;

public class Animacion {

	public boolean dchp1 = false;
	public boolean izqp1 = false;
	public boolean upp1 = false;
	public boolean downp1 = false;
	public boolean fp1 = false;
	public boolean dchp2 = false;
	public boolean izqp2 = false;
	public boolean upp2 = false;
	public boolean downp2 = false;
	public boolean fp2 = false;
	public char tecla;
	public boolean ListaMov[] ;

	public void comprobarTeclas(KeyEvent e) {

		tecla = e.getKeyChar();
		ListaMov1 = new boolean []{dchp1, izqp1, upp1, downp1, fp1} ;
		ListaMov2 = new boolean[] {dchp2, izqp2, upp2, downp2, fp2};
		if (tecla == 'd') {
			ListaMov1[0]  = true;
		
		} else {
			ListaMov1[0] = false;
		}
		if (tecla == 'l') {
			ListaMov2[0]  = true;
		
		} else {
			ListaMov2[0] = false;
		}

		if (tecla == 'a') {
			ListaMov1[1]  = true;

		} else {
			ListaMov1[1]  = false;
		}
		if (tecla == 'j') {
			ListaMov2[1]  = true;

		} else {
			ListaMov2[1]  = false;
		}

		if ( tecla == 'w'){
			ListaMov1[2] =true;
		
		}else{
			ListaMov1[2] =false;
		}
		if ( tecla == 'i'){
			ListaMov2[2] =true;
		
		}else{
			ListaMov2[2] =false;
		}
		
		
		if ( tecla == 's'){
			ListaMov1[3] =true;
		
		}else{
			ListaMov1[3] = false;
		}
		if ( tecla == 'k'){
			ListaMov2[3] =true;
		
		}else{
			ListaMov2[3] = false;
		}
		
		if (tecla == 'f'){
			ListaMov1[4] = true;
		
		}else{
			ListaMov1[4]=false;
		
		}
		if (tecla == 'p'){
			ListaMov2[4] = true;
		
		}else{
			ListaMov2[4]=false;
		
		}
		
	       

	}

	public boolean getListaMov1(int i) {
		return ListaMov1[i];
	}

	public void setListaMov1(boolean[] listaMov1) {
		ListaMov1 = listaMov1;
	}

	public boolean getListaMov2(int i) {
		return ListaMov2[i];
	}

	public void setListaMov2(boolean[] listaMov2) {
		ListaMov2 = listaMov2;
	}

}
