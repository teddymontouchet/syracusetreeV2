package syracusetreeV2;

import java.util.ArrayList;
import java.util.List;

public class Branche {

	static int nombreBranche;

	static int nombreMax;

	int nombreDepart;

	private List<Noeud> branche;

	public Branche(int nombreDepart) {

		this.branche = new ArrayList<Noeud>();

		this.nombreDepart = nombreDepart;

		generationBranche(nombreDepart);
	}

	private void generationBranche(int nombreDepart) {

		this.branche.add(new Noeud(nombreDepart));
		int nombre = branche.get(0).getNombre();
		while (nombre != 1) {
			if (nombre % 2 == 0) {
				nombre = nombre / 2;
				branche.add(new Noeud(nombre));
			} else if (nombre % 2 == 1) {
				nombre = nombre * 3 + 1;
				branche.add(new Noeud(nombre));
			}
			Noeud.nombreNoeud++;
			Branche.nombreMax = (nombre > nombreMax) ? nombre : nombreMax;
		}

	}

	public List<Noeud> getBranche() {
		return branche;
	}
}
