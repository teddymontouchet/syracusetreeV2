package syracusetreeV2;

import java.util.List;

public class Branche {

	static int nombreBranche;

	int nombreDepart;

	int nombreMax;

	private List<Noeud> branche;

	public Branche(int nombreDepart) {

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
			this.nombreMax = (nombre > nombreMax) ? nombre : nombreMax;
		}

	}
}
