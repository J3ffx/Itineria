package fr.uha.ensisa.itineria.donnees;
/**
 * 
 * @author weber
 *
 */
public class Route implements Comparable<Route> {

	private Ville v1;
	private Ville v2;
	
	private int distance;
	private int duree;
	
	public Route(Ville v1, Ville v2, int distance, int duree)
	{
		this.v1 = v1;
		this.v2 = v2;
		this.distance = distance;
		this.duree = duree;
		v1.addRoutes(this);
		v2.addRoutes(this);
	}

	public Ville getV1() {
		return v1;
	}

	public Ville getV2() {
		return v2;
	}

	public int getDistance() {
		return distance;
	}

	public int getDuree() {
		return duree;
	}
	
	/**
	 * Renvoie la ville à l'autre extrémité de la route par rapport à la ville donnée en argument
	 * @param v
	 * @return
	 */
	public Ville getAutreVille(Ville v)
	{
		if(v1.equals(v))
			return v2;
		else if(v2.equals(v))
			return v1;
		else
			return null;
	}
	
	public String toString() {
		return v1 +"->" + v2;
	}

	@Override
	public int compareTo(Route r) {
		if(this.distance>r.getDistance())
			return 1;
		return 0;
	}
	
}
