package fr.uha.ensisa.itineria.donnees;
/**
 * 
 * @author weber
 *
 */
public class ArbreDeRecherche {

	private Noeud racine;
	
	
	public ArbreDeRecherche(Noeud racine)
	{
		this.racine=racine;
	}


	public Noeud getRacine() {
		return racine;
	}
}
