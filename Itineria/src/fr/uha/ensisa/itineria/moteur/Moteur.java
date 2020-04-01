package fr.uha.ensisa.itineria.moteur;

import fr.uha.ensisa.itineria.donnees.Carte;
import fr.uha.ensisa.itineria.donnees.Parametres;
import fr.uha.ensisa.itineria.donnees.Resultat;
import fr.uha.ensisa.itineria.moteur.algorithmes.Algorithme;
import fr.uha.ensisa.itineria.moteur.algorithmes.ParcoursCoutUniforme;
import fr.uha.ensisa.itineria.moteur.algorithmes.ParcoursEnLargeur;
import fr.uha.ensisa.itineria.moteur.algorithmes.ParcoursEnProfondeur;
import fr.uha.ensisa.itineria.moteur.algorithmes.ParcoursEnProfondeurLimitee;
import fr.uha.ensisa.itineria.moteur.algorithmes.ParcoursIteratifEnProfondeur;
import fr.uha.ensisa.itineria.moteur.algorithmes.RechercheAStar;
import fr.uha.ensisa.itineria.moteur.algorithmes.RechercheGloutonne;
import fr.uha.ensisa.itineria.util.Constantes;
/**
 * 
 * @author weber
 *
 */
public class Moteur {
	
	private Carte carte;
	private Parametres parametres;
	private Resultat resultat;
	
	public Moteur()
	{
		System.out.println("*** Chargement des villes et des routes ***");
		long t=System.currentTimeMillis();
		this.carte = new Carte();
		t=System.currentTimeMillis()-t;
		System.out.println("*** "+carte.getNbVilles()+" villes et "+carte.getNbRoutes()+" routes chargÈes en "+t+"ms ***");
	}

	/**
	 * Liste toutes les villes dans une cha√Æne de caract√®re
	 * @return
	 */
	public String fromVillesToString() {
		return carte.fromVillesToString();
	}
	
	/**
	 * Transforme le r√©sultat en chaines de caract√®re pour affichage
	 * @return
	 */
	public String fromResultatToString() {
		if(resultat!=null)
			return resultat.toString();
		else
			return "Pas de rÈsultat pour ces paramËtres";
	}
	
	public void setParametres(int villeDepart, int villeArrivee, int methode, int heuristique, int profondeurLimite)
	{
		parametres= new Parametres(carte.getVille(villeDepart), carte.getVille(villeArrivee), methode, heuristique, profondeurLimite);
	}
	
	public void run()
	{
		Algorithme algorithme;
		switch(parametres.getAlgorithme())
		{
			case Constantes.RECHERCHE_COUT_UNIFORME :
				algorithme = new ParcoursCoutUniforme(carte, parametres);
				algorithme.launch();
				resultat=algorithme.getResultat();
				break;
			case Constantes.RECHERCHE_PROFONDEUR :
				algorithme = new ParcoursEnProfondeur(carte, parametres);
				algorithme.launch();
				resultat=algorithme.getResultat();
				break;
			case Constantes.RECHERCHE_PROFONDEUR_LIMITEE :
				algorithme = new ParcoursEnProfondeurLimitee(carte, parametres);
				algorithme.launch();
				resultat=algorithme.getResultat();
				break;
			case Constantes.RECHERCHE_PROFONDEUR_ITERATIF :
				algorithme = new ParcoursIteratifEnProfondeur(carte, parametres);
				algorithme.launch();
				resultat=algorithme.getResultat();
				break;
			case Constantes.RECHERCHE_A_STAR :
				algorithme = new RechercheAStar(carte, parametres);
				algorithme.launch();
				resultat=algorithme.getResultat();
				break;
			case Constantes.RECHERCHE_GLOUTONNE :
				algorithme = new RechercheGloutonne(carte, parametres);
				algorithme.launch();
				resultat=algorithme.getResultat();
				break;
			default :
				algorithme = new ParcoursEnLargeur(carte, parametres);
				algorithme.launch();
				resultat=algorithme.getResultat();
				break;
		}
	}
	

}
