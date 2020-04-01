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
public class ParcoursEnProfondeur extends Algorithme {

	public ParcoursEnProfondeur(Carte carte, Parametres parametres) {
		super(carte, parametres);

	}

	public Resultat dfs(long t, ArrayList<Noeud> explored, Noeud node) {
		Ville goal = this.parametres.getArrivee();
		if (goal.equals(node.getVille())) {
			explored.add(node);
			t = System.currentTimeMillis() - t;
			return new Resultat(node.getTrajetFromRacine(), explored.size(), t, this.parametres);
		} else if (!node.isIn(explored)) {
			explored.add(node);
			ArrayList<Noeud> childs = node.getChild();
			for (Noeud child : childs) {
				if (!child.isIn(explored)) {
					Resultat result = dfs(t, explored, child);
					if (result != null) {
						return result;
					}
				}
			}
			
		}
		return null;
	}

	public void launch() {
		super.resultat = dfs(System.currentTimeMillis(), new ArrayList<Noeud>(),
				new Noeud(this.parametres.getDepart()));
	}

}
