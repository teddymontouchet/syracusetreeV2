package syracusetreeV2;

public class Main {

	public static void main(String[] args) {

		Arbre arbre = new Arbre(156421);
		for (Noeud i : arbre.getArbre()) {
			System.out.print((i.getNombre() != 1) ? i.getNombre() + " -> " : i.getNombre() + "\n");
		}

		arbre.nombreNoeud();
		arbre.nombreDepart();
		arbre.nombreMax();
	}
}
