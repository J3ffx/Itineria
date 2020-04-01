package fr.uha.ensisa.itineria.moteur.algorithmes;

import fr.uha.ensisa.itineria.donnees.ArbreDeRecherche;
import fr.uha.ensisa.itineria.donnees.Carte;
import fr.uha.ensisa.itineria.donnees.Parametres;
import fr.uha.ensisa.itineria.donnees.Resultat;
import fr.uha.ensisa.itineria.donnees.Ville;
/**
 * Classe abstraite permettant de créer des classes implémentant les algorithmes de recherche
 * @author weber
 *
 */
public abstract class Algorithme {
	
	protected Carte carte;
	protected Parametres parametres;
	protected Resultat resultat;
	protected ArbreDeRecherche arbre;
	
	protected int nbNoeudsExplores;
	
	public Algorithme(Carte carte, Parametres parametres)
	{
		this.carte=carte;
		this.parametres=parametres;
		this.resultat=null;
		nbNoeudsExplores=0;
	}
	
	/**
	 * Lance l'algorithme de recherche
	 */
	public abstract void launch();
	
	/**
	 * Vérifie si la ville donnée en argument est l'objectif
	 * @param v ville
	 * @return ville==objectif ?
	 */
	protected final boolean verifierObjectif(Ville v)
	{
		return (v==parametres.getArrivee());
	}

	/**
	 * Renvoie l'instance de Resultat contenant le résultat de la recherche
	 * @return resultat de la recherche
	 */
	public Resultat getResultat()
	{
			return resultat;
	}
}
