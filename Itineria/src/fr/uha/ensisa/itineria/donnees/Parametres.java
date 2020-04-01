package fr.uha.ensisa.itineria.donnees;

/**
 * 
 * @author weber
 *
 */
public class Parametres {

	Ville depart = null, arrivee = null;
	int algorithme = 0, heuristique = 0, profondeurLimite = 0;

	public Parametres(Ville depart, Ville arrivee, int algorithme, int heuristique, int profondeurLimite) {
		this.depart = depart;
		this.arrivee = arrivee;
		this.algorithme = algorithme;
		this.heuristique = heuristique;
		this.profondeurLimite = profondeurLimite;
	}

	public Ville getDepart() {
		return depart;
	}

	public void setDepart(Ville depart) {
		this.depart = depart;
	}

	public int getProfondeurLimite() {
		return profondeurLimite;
	}

	public void setProfondeurLimite(int profondeurLimite) {
		this.profondeurLimite = profondeurLimite;
	}

	public Ville getArrivee() {
		return arrivee;
	}

	public void setArrivee(Ville arrivee) {
		this.arrivee = arrivee;
	}

	public int getAlgorithme() {
		return algorithme;
	}

	public void setAlgorithme(int algorithme) {
		this.algorithme = algorithme;
	}

	public int getHeuristique() {
		return heuristique;
	}

	public void setHeuristique(int heuristique) {
		this.heuristique = heuristique;
	}

}
