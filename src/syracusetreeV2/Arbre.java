package syracusetreeV2;

import java.util.ArrayList;
import java.util.List;

public class Arbre {

	public static int nombreDepart;

	private List<Branche> arbre;

	public Arbre(int nombreDepart) {
		Arbre.nombreDepart = nombreDepart;
		this.arbre = new ArrayList<Branche>();
		this.arbre.add(new Branche(nombreDepart));
	}

	public void nombreNoeud() {
		System.out.println("Le nombre de noeud est de : " + Noeud.nombreNoeud);
	}

	public void nombreDepart() {
		System.out.println("Le nombre de départ était : " + nombreDepart);
	}

	public void nombreMax() {
		System.out.println("Le nombre maximum atteint est de : " + Branche.nombreMax);
	}

	public List<Branche> getArbre() {
		return arbre;
	}

	public void affichageArbre() {
		for (Branche i : arbre) {
			for (Noeud j : arbre.get(0).getBranche()) {
				System.out.print((j.getNombre() != 1) ? j.getNombre() + " -> " : j.getNombre() + "\n");
			}
		}
		nombreNoeud();
		nombreDepart();
		nombreMax();
	}

}
