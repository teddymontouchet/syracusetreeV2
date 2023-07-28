package syracusetreeV2;

public class Noeud {

	public static int nombreNoeud;

	private int nombre;

	// private int poids;

	public Noeud(int nombre) {

		this.setNombre(nombre);
		// this.poids = poids;
	}

	public int getNombre() {
		return nombre;
	}

	public void setNombre(int nombre) {
		this.nombre = nombre;
	}

}
