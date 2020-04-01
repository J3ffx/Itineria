package fr.uha.ensisa.itineria.donnees;

import java.util.ArrayList;

/**
 * 
 * @author weber
 *
 */
public class Resultat {
	Parametres parametres;
	ArrayList<Route> trajet;
	int nbNoeudsExplores;
	long tempsDeCalcul;

	public Resultat(ArrayList<Route> trajet, int nbNoeudsExplores, long tempsDeCalcul, Parametres parametres) {
		this.trajet = trajet;
		this.nbNoeudsExplores = nbNoeudsExplores;
		this.tempsDeCalcul = tempsDeCalcul;
		this.parametres = parametres;
	}

	/**
	 * Renvoie la longueur en km du trajet résultat
	 * 
	 * @return
	 */
	public int getDistance() {
		int dist = 0;
		for (Route road : trajet) {
			dist += road.getDistance();
		}
		return dist;
	}

	public boolean cutoff() {
		return tempsDeCalcul == -1;
	}

	public int getExp() {
		return nbNoeudsExplores;
	}

	public void setExp(int exp) {
		this.nbNoeudsExplores = exp;
	}

	/**
	 * Renvoie la durée du trajet résultat
	 * 
	 * @return
	 */
	public int getDuree() {
		int dur = 0;
		for (Route road : trajet) {
			dur += road.getDuree();
		}
		return dur;
	}

	/**
	 * Renvoie la profondeur du trajet résultat
	 * 
	 * @return
	 */
	public int getProfondeur() {
		return this.trajet.size();
	}

	/**
	 * Renvoie une présentation textuelle de Résultat pour un affichage dans la
	 * console par exemple
	 */
	public String toString() {
		if (cutoff())
			return "limit";
		String s = "Trajet entre " + this.parametres.getDepart().getNom() + " et "
				+ this.parametres.getArrivee().getNom() + " :\n";
		Ville town = this.parametres.getDepart();
		for (Route road : trajet) {
			s += town.getNom() + " --> " + road.getAutreVille(town).getNom() + "\n";
			town = road.getAutreVille(town);
		}
		s += "Distance : " + this.getDistance() + "km" + "\n" + "Duree : " + this.getDuree() + " minutes" + "\n"
				+ "Profondeur de la solution : " + this.getProfondeur() + "\n" + "Temps de calcul : "
				+ this.tempsDeCalcul + "ms" + "\n" + "# noeuds explor�s : " + this.nbNoeudsExplores;

		return s;
	}
}
