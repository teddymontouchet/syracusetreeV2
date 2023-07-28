package syracusetreeV2;

import java.util.ArrayList;
import java.util.List;

public class Arbre {

	private int nombreDepart;

	private int nombreMax = nombreDepart;

	private List<Noeud> arbre;

	public Arbre(int nombreDepart) {
		this.nombreDepart = nombreDepart;
		this.arbre = new ArrayList<Noeud>();
		generationArbre(this.arbre);
	}

	public void nombreNoeud() {
		System.out.println("Le nombre de noeud est de : " + Noeud.nombreNoeud);
	}

	public void nombreDepart() {
		System.out.println("Le nombre de départ était : " + nombreDepart);
	}

	public void nombreMax() {
		System.out.println("Le nombre maximum atteint est de : " + nombreMax);
	}

	private void generationArbre(List<Noeud> arbre) {
		this.arbre.add(new Noeud(nombreDepart));
		int nombre = arbre.get(0).getNombre();
		while (nombre != 1) {
			if (nombre % 2 == 0) {
				nombre = nombre / 2;
				arbre.add(new Noeud(nombre));
			} else if (nombre % 2 == 1) {
				nombre = nombre * 3 + 1;
				arbre.add(new Noeud(nombre));
			}
			Noeud.nombreNoeud++;
			this.nombreMax = (nombre > nombreMax) ? nombre : nombreMax;
		}
	}

	public List<Noeud> getArbre() {
		return arbre;
	}

}
