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

	private void nombreNoeud() {
		System.out.println("Le nombre de noeud est de : " + Noeud.nombreNoeud);
	}

	private void nombreDepart() {
		System.out.println("Le nombre de départ était : " + nombreDepart);
	}

	private void nombreMax() {
		System.out.println("Le nombre maximum atteint est de : " + Branche.nombreMax);
	}

	public List<Branche> getArbre() {
		return arbre;
	}

	private String espace(int nombre) {
		String espace = "";
		for (int i = 0; i < nombre / 2; i++) {
			espace += " ";
		}

		return espace;
	}

	public void affichageArbre() {
		for (Branche i : arbre) {
			for (Noeud j : arbre.get(0).getBranche()) {
				System.out.print(espace(Math.abs(
						Integer.toString(j.getNombre()).length() - Integer.toString(Arbre.nombreDepart).length())));
				System.out.println((j.getNombre() != 1)
						? j.getNombre() + "\n" + espace(Math.abs(Integer.toString(Arbre.nombreDepart).length())) + "|"
						: j.getNombre() + "\n");
			}
		}
		nombreNoeud();
		nombreDepart();
		nombreMax();
	}

}
