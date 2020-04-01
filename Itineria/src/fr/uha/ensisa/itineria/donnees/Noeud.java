package fr.uha.ensisa.itineria.donnees;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;

import fr.uha.ensisa.itineria.util.Heuristique;

/**
 * 
 * @author weber
 *
 */
public class Noeud implements Comparable<Noeud> {

	private Ville ville;
	private Noeud parent;
	private double cout;
	private int profondeur;

	public Noeud(Ville ville) {
		this(ville, null, 0.0, 0);
	}

	public Ville getVille() {
		return ville;
	}

	public Noeud getParent() {
		return parent;
	}

	public double getCout() {
		return cout;
	}
	
	public int getDuree() {
		int dur = 0;
		for (Route road : getTrajetFromRacine()) {
			dur += road.getDuree();
		}
		return dur;
	}

	public int getProfondeur() {
		return profondeur;
	}

	public void setParentToNull() {
		parent = null;
		ville = null;
	}

	public Noeud(Ville ville, Noeud parent, double cout, int profondeur) {
		this.ville = ville;
		this.parent = parent;
		this.cout = cout;
		this.profondeur = profondeur;
	}

	/**
	 * Renvoie la liste des routes entre le noeud et la racine
	 * 
	 * @return
	 */
	public ArrayList<Route> getTrajetFromRacine() {
		ArrayList<Route> res = new ArrayList<Route>();
		if (parent != null) {
			res = parent.getTrajetFromRacine();
			res.add(parent.getVille().getRouteTo(this.getVille()));
		}
		return res;
	}

	/**
	 * Renvoie la liste des villes entre le noeud et la racine (les deux comprises)
	 * 
	 * @return
	 */
	public ArrayList<Ville> getVillesFromRacine() {
		ArrayList<Ville> res = new ArrayList<Ville>();
		if (parent != null) {
			res = parent.getVillesFromRacine();
			res.add(parent.getVille());
		}
		return res;
	}

	public ArrayList<Noeud> getChild() {
		Ville parent = this.getVille();
		ArrayList<Noeud> result = new ArrayList<Noeud>();
		ArrayList<Route> routeVoisins = parent.getRoutesVersVoisins();
		for (int i = 0; i < routeVoisins.size(); i++) {
			Route road = routeVoisins.get(i);
			Ville child = road.getAutreVille(parent);
			result.add(new Noeud(child, this, this.getCout() + road.getDistance(), this.getProfondeur() + 1));
		}
		return result;
	}

	public PriorityQueue<Noeud> getPriorityChild() {
		Ville parent = this.getVille();
		PriorityQueue<Noeud> result = new PriorityQueue<Noeud>();
		ArrayList<Route> routeVoisins = parent.getRoutesVersVoisins();
		for (int i = 0; i < routeVoisins.size(); i++) {
			Route road = routeVoisins.get(i);
			Ville child = road.getAutreVille(parent);
			result.add(new Noeud(child, this, this.getCout() + road.getDistance(), this.getProfondeur() + 1));
		}
		return result;
	}

	public Noeud isBetter(ArrayList<Noeud> front) {
		Iterator<Noeud> value = front.iterator();
		while (value.hasNext()) {
			Noeud node = value.next();
			if (node.getVille().equals(this.getVille()) && node.getCout() > this.getCout()) {
				return node;
			}
		}
		return null;
	}
	
	public Noeud isBetter(Parametres param, ArrayList<Noeud> front) {
		return Heuristique.isBetter(this, param, front);
	}

	public boolean isIn(ArrayList<Noeud> list) {
		for (Noeud node : list) {
			if (node.getVille() == this.getVille()) {
				return true;
			}
		}
		return false;
	}

	public boolean isIn(PriorityQueue<Noeud> queue) {
		for (Noeud node : queue) {
			if (node.getVille() == this.getVille()) {
				return true;
			}
		}
		return false;
	}
	
	public ArrayList<Noeud> getAncester(){
		ArrayList<Noeud> res = new ArrayList<Noeud>();
		if (parent != null) {
			res = parent.getAncester();
			res.add(parent);
		}
		return res;
	}

	public void setCout(double cout) {
		this.cout = cout;

	}

	@Override
	public String toString() {
		return ville + "_" + (int) cout;
	}

	@Override
	public int compareTo(Noeud node) {
		if (node.cout < this.cout)
			return 1;
		return -1;
	}

}
