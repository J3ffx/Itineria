package fr.uha.ensisa.itineria.moteur.algorithmes;

import java.util.ArrayList;
import java.util.Iterator;

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
public class RechercheAStar extends Algorithme {

	public RechercheAStar(Carte carte, Parametres parametres) {
		super(carte, parametres);

	}

	public Resultat astar() {
		long t = System.currentTimeMillis();
		Noeud node = new Noeud(this.parametres.getDepart());
		Ville goal = this.parametres.getArrivee();

		ArrayList<Noeud> frontier = new ArrayList<Noeud>();
		frontier.add(node);
		ArrayList<Noeud> explored = new ArrayList<Noeud>();
		while (!frontier.isEmpty()) {
			node = Heuristique.astar(this.parametres, frontier, node);
			if (goal.equals(node.getVille())) {
				t = System.currentTimeMillis() - t;
				return new Resultat(node.getTrajetFromRacine(), explored.size(), t, this.parametres);
			}
			explored.add(node);
			ArrayList<Noeud> childs = node.getChild();
			Iterator<Noeud> it = childs.iterator();
			//for (Noeud child : childs) {
			while(it.hasNext()) {
				Noeud child = it.next();
				if (!child.isIn(explored) && !child.isIn(frontier))
					frontier.add(child);
				else if (child.isIn(frontier) && child.isBetter(this.parametres, frontier) != null) {
					frontier.remove(child.isBetter(this.parametres, frontier));
					frontier.add(child);
				} else if (child.isIn(explored) && child.isBetter(explored) != null)
					frontier.add(child);
			}
		}
		return null;
	}

	public void launch() {
		super.resultat = astar();
	}

}
