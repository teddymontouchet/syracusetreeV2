package syracusetreeV2;

import java.util.ArrayList;
import java.util.List;

public class Arbre {

	private int nombreNoeud;

	private int nombreDepart;

	private int nombreMax = nombreDepart;

	private List<Integer> arbre;

	public Arbre(int nombreDepart) {
		this.nombreDepart = nombreDepart;
		this.nombreNoeud = 0;
		this.arbre = new ArrayList<Integer>();
		this.arbre.add(nombreDepart);
		generationArbre(getArbre());
	}

	public void nombreNoeud() {
		System.out.println("Le nombre de noeud est de : " + nombreNoeud);
	}

	public void nombreDepart() {
		System.out.println("Le nombre de départ était : " + nombreDepart);
	}

	public void nombreMax() {
		System.out.println("Le nombre maximum atteint est de : " + nombreMax);
	}

	private void generationArbre(List<Integer> arbre) {
		int nombre = arbre.get(0);
		while (nombre != 1) {
			if (nombre % 2 == 0) {
				nombre = nombre / 2;
				arbre.add(nombre);
			} else if (nombre % 2 == 1) {
				nombre = nombre * 3 + 1;
				arbre.add(nombre);
			}
			this.nombreNoeud++;
			this.nombreMax = (nombre > nombreMax) ? nombre : nombreMax;
		}
	}

	public List<Integer> getArbre() {
		return arbre;
	}

}
