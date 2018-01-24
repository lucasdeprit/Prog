package logica;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BDD {
public int victorias;
public int derrotas;
public String jugador;





public BDD(int victorias, int derrotas, String jugador) {
	super();
	this.victorias = victorias;
	this.derrotas = derrotas;
	this.jugador = jugador;
	
}

public int getVictorias() {
	return victorias;
}

public void setVictorias(int victorias) {
	this.victorias = victorias;
}

public int getDerrotas() {
	return derrotas;
}

public void setDerrotas(int derrotas) {
	this.derrotas = derrotas;
}

public String getJugador() {
	return jugador;
}

public void setJugador(String jugador) {
	this.jugador = jugador;
}



public void escribirArchivo(int victorias, int derrotas, String jugador) {
	
	FileWriter baseDeDatos = null;
	try {
		//crea el flujo para escribir en el archivo
		baseDeDatos = new FileWriter("C:\\Users\\Imanol\\git\\Prog4\\.git\\BaseDeDatos.txt");
		//crea un buffer o flujo intermedio antes de escribir directamente en el archivo
		BufferedWriter bfwriter = new BufferedWriter(baseDeDatos);
		
			//escribe los datos en el archivo
			bfwriter.write("Jugadores         " + "Victorias         "+ "Derrotas         "+"\n"
			+ jugador + "         "+victorias+"         "+derrotas+"         "+"\n"
			);
		
		//cierra el buffer intermedio
		bfwriter.close();
		System.out.println("Archivo creado satisfactoriamente..");

	} catch (IOException e) {
		e.printStackTrace();
	} finally {
		if (baseDeDatos != null) {
			try {//cierra el flujo principal
				baseDeDatos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
	
	
	
}

