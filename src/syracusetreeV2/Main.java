package syracusetreeV2;

public class Main {

	public static void main(String[] args) {

		Arbre arbre = new Arbre(156421);
		for (Branche i : arbre.getArbre()) {
			for (Noeud j : arbre.getArbre().get(0).getBranche()) {
				System.out.print((j.getNombre() != 1) ? j.getNombre() + " -> " : j.getNombre() + "\n");
			}
		}

		arbre.nombreNoeud();
		arbre.nombreDepart();
		arbre.nombreMax();
	}
}
