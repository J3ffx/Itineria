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
public class ParcoursEnProfondeurLimitee extends Algorithme {

	public ParcoursEnProfondeurLimitee(Carte carte, Parametres parametres) {
		super(carte, parametres);

	}
	
	public Resultat dls(int l, long t, ArrayList<Noeud> explored, Noeud node) {
		Ville goal = this.parametres.getArrivee();
		if (goal.equals(node.getVille())) {
			t = System.currentTimeMillis() - t;
			return new Resultat(node.getTrajetFromRacine(), explored.size(), t, this.parametres);
		} else if (l <= 0) {
			return new Resultat(null, explored.size(), -1, this.parametres);
		} else {
			explored.add(node);
			ArrayList<Noeud> childs = node.getChild();
			boolean cutoff = false;
			for (Noeud child : childs) {
				if (!child.isIn(node.getAncester())) {
					Resultat result = dls(l - 1, t, explored, child);
					if (result != null) {
						if (result.cutoff())
							cutoff = result.cutoff();
						else
							return result;
					}
				}
			}
			if (cutoff)
				return new Resultat(null,explored.size(), -1, this.parametres);
			else
				return null;
		}
	}

	public void launch() {
		super.resultat = dls(parametres.getProfondeurLimite(), System.currentTimeMillis(), new ArrayList<Noeud>(),
				new Noeud(this.parametres.getDepart()));
	}

}
