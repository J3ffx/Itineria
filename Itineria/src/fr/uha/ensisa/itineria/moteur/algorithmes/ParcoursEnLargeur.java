package fr.uha.ensisa.itineria.moteur.algorithmes;

import java.util.ArrayList;
import fr.uha.ensisa.itineria.donnees.Carte;
import fr.uha.ensisa.itineria.donnees.Noeud;
import fr.uha.ensisa.itineria.donnees.Parametres;
import fr.uha.ensisa.itineria.donnees.Resultat;
import fr.uha.ensisa.itineria.donnees.Ville;

/**
 * 
 * @author weber
 *
 */
public class ParcoursEnLargeur extends Algorithme {

	public ParcoursEnLargeur(Carte carte, Parametres parametres) {
		super(carte, parametres);

	}

	public Resultat bfs() {
		long t = System.currentTimeMillis();
		Noeud node = new Noeud(this.parametres.getDepart());
		Ville goal = this.parametres.getArrivee();
		if (goal.equals(node.getVille())) {
			t = System.currentTimeMillis() - t;
			return new Resultat(null, 0, t, this.parametres);
		}
		ArrayList<Noeud> frontier = new ArrayList<Noeud>();
		frontier.add(node);
		ArrayList<Noeud> explored = new ArrayList<Noeud>();
		while (!frontier.isEmpty()) {
			node = frontier.remove(0);
			explored.add(node);
			ArrayList<Noeud> childs = node.getChild();
			for (Noeud child : childs) {
				if (goal.equals(child.getVille())) {
					t = System.currentTimeMillis() - t;
					return new Resultat(child.getTrajetFromRacine(), explored.size(), t, this.parametres);
				}
				if (!child.isIn(explored) && !child.isIn(frontier)) {
					frontier.add(child);
				}
			}
		}
		return null;
	}

	public void launch() {
		super.resultat = bfs();
	}

}
