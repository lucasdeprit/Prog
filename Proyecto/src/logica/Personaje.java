import javax.swing.JFrame;

public class Personaje extends JFrame {

	public int pu�o=12;
	public int patada=12;
	public int vida=200;
	public Personaje(int pu�o, int patada, int vida) {
		
		this.pu�o = pu�o;
		this.patada = patada;
		this.vida = vida;
	}
	public int getPu�o() {
		return pu�o;
	}
	public void setPu�o(int pu�o) {
		this.pu�o = pu�o;
	}
	public int getPatada() {
		return patada;
	}
	public void setPatada(int patada) {
		this.patada = patada;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	@Override
	public String toString() {
		return "Personaje [pu�o=" + pu�o + ", patada=" + patada + ", vida=" + vida + "]";
	}
	
	public static void main (String[] args){
		
	}
}
