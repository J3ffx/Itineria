package fr.uha.ensisa.itineria.donnees;

import java.util.ArrayList;
/**
 * 
 * @author weber
 *
 */
public class Ville {
	
	private int departement;
	private String nom;
	private double longitude;
	private double lattitude;
	private ArrayList<Route> routesVersVoisins;
	
	public Ville(int departement, String nom, double lattitude, double longitude)
	{
		this.departement = departement;
		this.nom = nom;
		this.longitude = longitude;
		this.lattitude = lattitude;
		this.routesVersVoisins= new ArrayList<Route>();
	}
	
	public String toString()
	{
		return departement+") "+nom;
	}

	public int getDepartement() {
		return departement;
	}

	public String getNom() {
		return nom;
	}

	public double getLongitude() {
		return longitude;
	}

	public double getLattitude() {
		return lattitude;
	}
	
	public void addRoutes(Route r)
	{
		routesVersVoisins.add(r);
	}

	public ArrayList<Route> getRoutesVersVoisins() {
		return routesVersVoisins;
	}
	
	/**
	 * Renvoie la route reliant la ville voisine donnée en argument
	 * @param v
	 * @return
	 */
	public Route getRouteTo(Ville v)
	{
		for(int i = 0; i < routesVersVoisins.size(); i++) {
			if(routesVersVoisins.get(i).getAutreVille(this).equals(v))
				return routesVersVoisins.get(i);
		}
		return null;
	}
	
	public boolean equals(Object o)
	{
		Ville v2 = (Ville) o;
		return (departement==v2.departement&&nom==v2.nom);
	}
}
