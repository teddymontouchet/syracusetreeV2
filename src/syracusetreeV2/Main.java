package syracusetreeV2;

public class Main {

	public static void main(String[] args) {

		Arbre arbre = new Arbre(156421);
		for (Integer i : arbre.getArbre()) {
			System.out.print((i != 1) ? i + " -> " : i + "\n");
		}

		arbre.nombreNoeud();
		arbre.nombreDepart();
		arbre.nombreMax();
	}
}
