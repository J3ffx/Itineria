package fr.uha.ensisa.itineria.moteur.algorithmes;

import java.util.ArrayList;
import fr.uha.ensisa.itineria.donnees.Carte;
import fr.uha.ensisa.itineria.donnees.Noeud;
import fr.uha.ensisa.itineria.donnees.Parametres;
import fr.uha.ensisa.itineria.donnees.Resultat;
import fr.uha.ensisa.itineria.donnees.Ville;
import fr.uha.ensisa.itineria.util.Heuristique;

/**
 * 
 * @author weber
 *
 */
public class RechercheGloutonne extends Algorithme {

	public RechercheGloutonne(Carte carte, Parametres parametres) {
		super(carte, parametres);

	}

	public Resultat glouglou() {
		long t = System.currentTimeMillis();
		Noeud node = new Noeud(this.parametres.getDepart());
		Ville goal = this.parametres.getArrivee();

		ArrayList<Noeud> frontier = new ArrayList<Noeud>();
		frontier.add(node);
		ArrayList<Noeud> explored = new ArrayList<Noeud>();
		while (!frontier.isEmpty()) {
			node = Heuristique.glouglou(this.parametres, frontier);
			explored.add(node);
			if (goal.equals(node.getVille())) {
				t = System.currentTimeMillis() - t;
				return new Resultat(node.getTrajetFromRacine(), explored.size(), t, this.parametres);
			}
			ArrayList<Noeud> childs = node.getChild();
			for (Noeud child : childs) {
				if (!child.isIn(frontier))
					frontier.add(child);
			}
		}
		return null;
	}

	public void launch() {
		super.resultat = glouglou();
	}

}
