package fr.uha.ensisa.itineria.moteur.algorithmes;

import java.util.ArrayList;

import fr.uha.ensisa.itineria.donnees.Carte;
import fr.uha.ensisa.itineria.donnees.Noeud;
import fr.uha.ensisa.itineria.donnees.Parametres;
import fr.uha.ensisa.itineria.donnees.Resultat;

/**
 * 
 * @author weber
 *
 */
public class ParcoursIteratifEnProfondeur extends Algorithme {
	ParcoursEnProfondeurLimitee profLim;

	public ParcoursIteratifEnProfondeur(Carte carte, Parametres parametres) {
		super(carte, parametres);
		this.profLim = new ParcoursEnProfondeurLimitee(carte, parametres);
	}

	public Resultat ids() {
		long t = System.currentTimeMillis();
		int i = 0;
		int exp = 0;
		Resultat result = new Resultat(null, i, t, parametres);
		while (true) {
			t = System.currentTimeMillis() - t;
			result = this.profLim.dls(i, t, new ArrayList<Noeud>(), new Noeud(this.parametres.getDepart()));
			if (!result.cutoff()) {
				exp += result.getExp();
				result.setExp(exp);
				return result;
			}
			else
				exp += result.getExp();
			i++;
		}
	}
	
	public void launch() {
		super.resultat = ids();
	}

}
