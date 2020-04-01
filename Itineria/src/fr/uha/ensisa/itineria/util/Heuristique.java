package fr.uha.ensisa.itineria.util;

import java.util.ArrayList;
import java.util.Iterator;
import fr.uha.ensisa.itineria.donnees.Noeud;
import fr.uha.ensisa.itineria.donnees.Parametres;
import fr.uha.ensisa.itineria.donnees.Ville;

/**
 * Fichier permettant de calculer les différentes heuristiques
 * 
 * @author weber
 *
 */
public abstract class Heuristique {

	/**
	 * Renvoie la distance vol d'oiseau entre 2 villes
	 * 
	 * @param v1
	 * @param v2
	 * @return
	 */
	public static double getVolOiseau(Ville v1, Ville v2) {

		double latitude1 = v1.getLattitude() * Math.PI / 180;
		double longitude1 = v1.getLongitude() * Math.PI / 180;

		double latitude2 = v2.getLattitude() * Math.PI / 180;
		double longitude2 = v2.getLongitude() * Math.PI / 180;

		double r = 6372.8;

		double d = r * Math.acos(Math.cos(latitude1) * Math.cos(latitude2) * Math.cos(longitude2 - longitude1)
				+ Math.sin(latitude1) * Math.sin(latitude2));
		return d;
	}

	/**
	 * Renvoie une heuristique sur le temps de trajet entre deux villes
	 * 
	 * @param v1
	 * @param v2
	 * @return
	 */
	public static double getTempsRestant(Ville v1, Ville v2) {
		return getVolOiseau(v1, v2)/1.5;
	}

	/**
	 * Calcule une heuristique entre deux villes
	 * 
	 * @param heuristique
	 * @param v1
	 * @param v2
	 * @return
	 */
	public static double calcul(int heuristique, Ville v1, Ville v2) {
		double h;
		switch (heuristique) {
		case Constantes.HEURISTIQUE_VOL_OISEAU:
			h = getVolOiseau(v1, v2);
			break;
		case Constantes.HEURISTIQUE_TEMPS:
			h = getTempsRestant(v1, v2);
			break;
		default:
			h = getVolOiseau(v1, v2);
			break;
		}
		return h;
	}

	public static Noeud glouglou(Parametres param, ArrayList<Noeud> frontier) {
		int h_n = param.getHeuristique()-1;
		double heur = calcul(h_n, frontier.get(0).getVille(), param.getArrivee());
		int index = 0;
		for (int i = 0; i < frontier.size(); i++) {
			Noeud node = frontier.get(i);
			if (calcul(h_n, node.getVille(), param.getArrivee()) < heur) {
				heur = calcul(h_n, node.getVille(), param.getArrivee());
				index = i;
			}
		}
		return frontier.remove(index);
	}

	public static Noeud astar(Parametres param, ArrayList<Noeud> frontier, Noeud n) {
		int h_n = param.getHeuristique()-1;
		Ville goal = param.getArrivee();
		Noeud node = frontier.get(0);
		Noeud front;
		double heur;
		Iterator<Noeud> it = frontier.iterator();
		while(it.hasNext()) {
			front = it.next();
			heur = calcul(h_n, node.getVille(), goal);
			switch (h_n) {
			case Constantes.HEURISTIQUE_VOL_OISEAU:
				double dist = front.getCout() + calcul(h_n, front.getVille(), goal);
				if (dist < node.getCout() + heur) {
					heur = calcul(h_n, front.getVille(), goal);
					node = front;
				}
				break;
			case Constantes.HEURISTIQUE_TEMPS:
				double time = front.getDuree() + calcul(h_n, front.getVille(), goal);
				if (time < node.getCout() + heur) {
					heur = calcul(h_n, front.getVille(), goal);
					node = front;
				}
				break;
			default:
				break;
			}
		}
		System.out.println(frontier);
		System.out.println(node);
		frontier.remove(node);
		return node;
	}
	
	public static Noeud isBetter(Noeud n, Parametres param, ArrayList<Noeud> front) {
		Iterator<Noeud> value;
		switch (param.getHeuristique()-1) {
		case Constantes.HEURISTIQUE_VOL_OISEAU:
			value = front.iterator();
			while (value.hasNext()) {
				Noeud node = value.next();
				if (node.getVille().equals(n.getVille()) && node.getCout() > n.getCout()) {
					return node;
				}
			}
			return null;
		case Constantes.HEURISTIQUE_TEMPS:
			value = front.iterator();
			while (value.hasNext()) {
				Noeud node = value.next();
				if (node.getVille().equals(n.getVille()) && node.getDuree() > n.getDuree()) {
					return node;
				}
			}
			return null;
		default:
			return null;
		}
	}
}
