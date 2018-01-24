import javax.swing.JFrame;

public class Personaje extends JFrame {

	public int puño=12;
	public int patada=12;
	public int vida=200;
	public Personaje(int puño, int patada, int vida) {
		
		this.puño = puño;
		this.patada = patada;
		this.vida = vida;
	}
	public int getPuño() {
		return puño;
	}
	public void setPuño(int puño) {
		this.puño = puño;
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
		return "Personaje [puño=" + puño + ", patada=" + patada + ", vida=" + vida + "]";
	}
	
	public static void main (String[] args){
		
	}
}
