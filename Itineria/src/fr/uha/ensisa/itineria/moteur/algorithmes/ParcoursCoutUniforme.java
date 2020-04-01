package fr.uha.ensisa.itineria.moteur.algorithmes;

import java.util.ArrayList;
import java.util.PriorityQueue;

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
public class ParcoursCoutUniforme extends Algorithme {

	public ParcoursCoutUniforme(Carte carte, Parametres parametres) {
		super(carte, parametres);

	}

	public Resultat ucs() {
		long t = System.currentTimeMillis();
		Noeud node = new Noeud(this.parametres.getDepart());
		Ville goal = this.parametres.getArrivee();
		if (goal.equals(node.getVille())) {
			t = System.currentTimeMillis() - t;
			return new Resultat(null, 0, t, this.parametres);
		} else {
			ArrayList<Noeud> front = new ArrayList<Noeud>();
			front.add(node);
			ArrayList<Noeud> explored = new ArrayList<Noeud>();
			while (!front.isEmpty()) {
				node = poll(front);
				if (goal.equals(node.getVille())) {
					t = System.currentTimeMillis() - t;
					return new Resultat(node.getTrajetFromRacine(), explored.size(), t, this.parametres);
				}
				explored.add(node);
				PriorityQueue<Noeud> childs = node.getPriorityChild();
				while (!childs.isEmpty()) {
					Noeud child = childs.poll();
					if (!child.isIn(explored) && !child.isIn(front)) {
						front.add(child);
					} else if (child.isIn(front) && child.isBetter(front) != null) {
						front.remove(child.isBetter(front));
						front.add(child);
					}
				}
			}
		}
		return null;
	}

	private Noeud poll(ArrayList<Noeud> frontier) {
		double cost = frontier.get(0).getCout();
		int index = 0;
		for (int i = 0; i < frontier.size(); i++) {
			Noeud node = frontier.get(i);
			if (node.getCout() < cost) {
				cost = node.getCout();
				index = i;
			}
		}
		return frontier.remove(index);
	}

	public void launch() {
		super.resultat = ucs();
	}

}
