package fr.uha.ensisa.itineria.donnees;

import java.util.ArrayList;
/**
 * 
 * @author weber
 *
 */
public class Carte {
	//Les villes prÃ©sentes dans le systÃ¨me
	private ArrayList<Ville> villes;
	//Les routes reliant les villes prÃ©sentes
	private ArrayList<Route> routes;
	
	public Carte()
	{
		villes = new ArrayList<Ville>(95);
		routes = new ArrayList<Route>();
		
		chargerVilles();
		chargerRoutes();
		
	}
	
	
	private void chargerVilles() {
		villes.add(new Ville(1,"Bourg-en-Bresse",46.2055, 5.2288));
		villes.add(new Ville(2,"Laon",49.563889, 3.624444));
		villes.add(new Ville(3,"Moulins",46.56527, 3.333333));
		villes.add(new Ville(4,"Digne-les-Bains",44.0933333333, 6.23638888889));
		villes.add(new Ville(5,"Gap",44.5594444444, 6.07861111111));
		villes.add(new Ville(6,"Nice",43.695949, 7.271413));
		villes.add(new Ville(7,"Privas",44.7358333333,4.6 ));
		villes.add(new Ville(8,"Charleville-Mézières",49.771911,4.716122));
		villes.add(new Ville(9,"Foix",42.966389,1.60777));
		villes.add(new Ville(10,"Troyes",48.297419,4.074263));
		villes.add(new Ville(11,"Carcassone", 43.21306,2.352028 ));
		villes.add(new Ville(12,"Rodez",44.3505555556 ,2.575 ));
		villes.add(new Ville(13,"Marseille",43.296346 , 5.369889));
		villes.add(new Ville(14,"Caen",49.182222 ,-0.370556 ));
		villes.add(new Ville(15,"Aurillac",44.9261111,2.44055556 ));
		villes.add(new Ville(16,"Angoulême", 45.6489,0.1608 ));
		villes.add(new Ville(17,"La Rochelle",46.160037 ,-1.1499596 ));
		villes.add(new Ville(18,"Bourges",47.0844444444 ,2.39638888889 ));
		villes.add(new Ville(19,"Tulle", 45.267336, 1.765537));
		villes.add(new Ville(20,"Ajaccio",41.92667 , 8.73694 ));
		villes.add(new Ville(21,"Dijon",47.32167 , 5.04139));
		villes.add(new Ville(22,"Saint-Brieuc",48.513611 ,-2.765277));
		villes.add(new Ville(23,"Guéret", 46.171389, 1.869167));
		villes.add(new Ville(24,"Périgueux",45.18399, 0.715783));
		villes.add(new Ville(25,"Besançon", 47.24306, 6.02194));
		villes.add(new Ville(26,"Valence", 44.9333333333, 4.89166666667));
		villes.add(new Ville(27,"Évreux", 49.0587,1.1489 ));
		villes.add(new Ville(28,"Chartres", 48.455847, 1.484184));
		villes.add(new Ville(29,"Quimper", 47.996667, -4.096389));
		villes.add(new Ville(30,"Nîmes", 43.8377777778, 4.36083333333));
		villes.add(new Ville(31,"Toulouse", 43.604482, 1.443962));
		villes.add(new Ville(32,"Auch", 43.6465,0.5855));
		villes.add(new Ville(33,"Bordeaux", 44.837912, -0.579541));
		villes.add(new Ville(34,"Montpellier", 43.611944444444, 3.8772222222222));
		villes.add(new Ville(35,"Rennes", 48.114722, 1.679444));
		villes.add(new Ville(36,"Châteauroux", 46.8102777778, 1.69111111111));
		villes.add(new Ville(37,"Tours", 47.393611, 0.689167));
		villes.add(new Ville(38,"Grenoble", 45.187778, 5.726945));
		villes.add(new Ville(39,"Lons-le-saunier", 46.6752777778, 5.55444444444));
		villes.add(new Ville(40,"Mont-de-marsan", 43.89138888889, -0.49944444444));
		villes.add(new Ville(41,"Blois", 47.593889, 1.328056));
		villes.add(new Ville(42,"Saint-Etienne", 45.434722, 4.390278));
		villes.add(new Ville(43,"Le Puy-en-Velay", 45.0441666667, 3.88583333333));
		villes.add(new Ville(44,"Nantes", 47.21806, -1.55278));
		villes.add(new Ville(45,"Orléans", 47.9025, 1.909));
		villes.add(new Ville(46,"Cahors", 44.448333, 1.441389));
		villes.add(new Ville(47,"Agen", 44.204931, 0.621153));
		villes.add(new Ville(48,"Mende", 44.51944, 3.50139));
		villes.add(new Ville(49,"Angers", 47.47361,-0.55416 ));
		villes.add(new Ville(50,"Saint-Lô", 49.114444,-1.091667));
		villes.add(new Ville(51,"Châlons-en-Champagne", 48.9575, 4.365));
		villes.add(new Ville(52,"Chaumont", 48.1116666667, 5.13888888889));
		villes.add(new Ville(53,"Laval", 48.072778, -0.77));
		villes.add(new Ville(54,"Nancy", 48.6936, 6.1846));
		villes.add(new Ville(55,"Bar-le-Duc", 48.771944, 5.160278));
		villes.add(new Ville(56,"Vannes",47.6559 , -2.7603 ));
		villes.add(new Ville(57,"Metz", 49.1203, 6.1778));
		villes.add(new Ville(58,"Nevers", 46.992899, 3.161659));
		villes.add(new Ville(59,"Lille", 50.637222, 3.063333));
		villes.add(new Ville(60,"Beauvais", 49.430278, 2.0952));
		villes.add(new Ville(61,"Alençon", 48.429722, 0.091944));
		villes.add(new Ville(62,"Arras", 50.2897222222, 2.78083333333));
		villes.add(new Ville(63,"Clermont-Ferrand", 45.783088, 3.082352));
		villes.add(new Ville(64,"Pau", 43.3017, -0.3686));
		villes.add(new Ville(65,"Tarbes", 43.2307, 0.0726));
		villes.add(new Ville(66,"Perpignan", 42.698611, 2.895556));
		villes.add(new Ville(67,"Strasbourg", 48.573392, 7.752353));
		villes.add(new Ville(68,"Colmar", 48.08166667, 7.35555556));
		villes.add(new Ville(69,"Lyon", 45.759723, 4.842223));
		villes.add(new Ville(70,"Vesoul", 47.623055, 6.155833));
		villes.add(new Ville(71,"Mâcon", 46.3062, 4.8313));
		villes.add(new Ville(72,"Le Mans", 48.004167, 0.196944));
		villes.add(new Ville(73,"Chambéry", 45.5, 5.9118));
		villes.add(new Ville(74,"Annecy", 45.916, 6.133));
		villes.add(new Ville(75,"Paris", 48.856578, 2.351828));
		villes.add(new Ville(76,"Rouen", 49.443232, 1.099971));
		villes.add(new Ville(77,"Melun", 48.5405555556, 2.66));
		villes.add(new Ville(78,"Versailles", 48.8053, 2.135));
		villes.add(new Ville(79,"Niort", 46.3258333333, 0.460555556));
		villes.add(new Ville(80,"Amiens", 49.894293, 2.295736));
		villes.add(new Ville(81,"Albi", 43.928889, 2.146389));
		villes.add(new Ville(82,"Montauban", 44.018056, 1.355833));
		villes.add(new Ville(83,"Toulon", 43.1222, 5.93));
		villes.add(new Ville(84,"Avignon", 43.95, 4.817));
		villes.add(new Ville(85,"La Roche-sur-Yon", 46.669378,-1.418722 ));
		villes.add(new Ville(86,"Poitiers", 46.581945, 0.336112));
		villes.add(new Ville(87,"Limoges", 45.85, 1.25));
		villes.add(new Ville(88,"Épinal", 48.1744, 6.4512));
		villes.add(new Ville(89,"Auxerre", 47.7986, 3.5672));
		villes.add(new Ville(90,"Belfort", 47.637942, 6.862813));
		villes.add(new Ville(91,"Évry", 48.623832, 2.4295664));
		villes.add(new Ville(92,"Nanterre", 48.891919, 2.2073));
		villes.add(new Ville(93,"Bobigny", 48.9106, 2.4397));
		villes.add(new Ville(94,"Créteil", 48.791111, 2.462778));
		villes.add(new Ville(95,"Cergy", 49.0361111111, 2.06305555556));
		
	}
	
	private void chargerRoutes() {
		//Routes vers voisin de l'Ain (sauf dept dont num <)
		routes.add(new Route(villes.get(0),villes.get(37), 168,103));
		routes.add(new Route(villes.get(0),villes.get(38), 73,55));
		routes.add(new Route(villes.get(0),villes.get(68), 81,63));
		routes.add(new Route(villes.get(0),villes.get(70), 42,35));
		routes.add(new Route(villes.get(0),villes.get(72), 165,103));
		routes.add(new Route(villes.get(0),villes.get(73), 129,89));
		//Routes vers voisin de l'Aisne (sauf dept dont num <)
		routes.add(new Route(villes.get(1),villes.get(58), 161,98));
		routes.add(new Route(villes.get(1),villes.get(79), 134,91));
		routes.add(new Route(villes.get(1),villes.get(59), 135,108));
		routes.add(new Route(villes.get(1),villes.get(76), 165,117));
		routes.add(new Route(villes.get(1),villes.get(50), 111,80));
		routes.add(new Route(villes.get(1),villes.get(7), 114,95));
		//Routes vers voisin de l'Allier (sauf dept dont num <)
		routes.add(new Route(villes.get(2),villes.get(41), 174,134));
		routes.add(new Route(villes.get(2),villes.get(70), 137,101));
		routes.add(new Route(villes.get(2),villes.get(57), 58,51));
		routes.add(new Route(villes.get(2),villes.get(17), 99,83));
		routes.add(new Route(villes.get(2),villes.get(22), 147, 98));
		routes.add(new Route(villes.get(2),villes.get(62), 105,82));
		//Routes vers voisin des Alpes de Haute-Provence (sauf dept dont num <)
		routes.add(new Route(villes.get(3),villes.get(82), 193,120));
		routes.add(new Route(villes.get(3),villes.get(5), 149,144));
		routes.add(new Route(villes.get(3),villes.get(4), 88,70));
		routes.add(new Route(villes.get(3),villes.get(25), 207,188));
		routes.add(new Route(villes.get(3),villes.get(83), 174,123));
		routes.add(new Route(villes.get(3),villes.get(12), 141,96));
		//Routes vers voisin des Hautes-Alpes (sauf dept dont num <)
		routes.add(new Route(villes.get(4),villes.get(25), 162, 148));
		routes.add(new Route(villes.get(4),villes.get(37), 104,105));
		routes.add(new Route(villes.get(4),villes.get(72), 162,136));
		//Routes vers voisin des Alpes-MarÃ®times (sauf dept dont num <)
		routes.add(new Route(villes.get(5),villes.get(82), 150, 99));
		routes.add(new Route(villes.get(5),villes.get(19), 301, 562));
		//Routes vers voisin de l'ArdÃ¨che (sauf dept dont num <)
		routes.add(new Route(villes.get(6),villes.get(47), 141, 140 ));
		routes.add(new Route(villes.get(6),villes.get(29), 145, 94));
		routes.add(new Route(villes.get(6),villes.get(83), 122, 83));
		routes.add(new Route(villes.get(6),villes.get(25), 43, 42));
		routes.add(new Route(villes.get(6),villes.get(37), 134, 90));
		routes.add(new Route(villes.get(6),villes.get(68), 142, 97));
		routes.add(new Route(villes.get(6),villes.get(42), 91, 106));
		//Routes vers voisin des Ardennes (sauf dept dont num <)
		routes.add(new Route(villes.get(7),villes.get(54), 150, 121));
		routes.add(new Route(villes.get(7),villes.get(50), 104, 89));
		routes.add(new Route(villes.get(7),villes.get(58), 188, 148));
		//Routes vers voisin de l'AriÃ¨ge (sauf dept dont num <)
		routes.add(new Route(villes.get(8),villes.get(30), 87, 64));
		routes.add(new Route(villes.get(8),villes.get(10), 83, 76));
		routes.add(new Route(villes.get(8),villes.get(65), 139, 132));
		//Routes vers voisin de l'Aube (sauf dept dont num <)
		routes.add(new Route(villes.get(9),villes.get(88), 75, 74));
		routes.add(new Route(villes.get(9),villes.get(20), 152, 143));
		routes.add(new Route(villes.get(9),villes.get(51), 103, 70));
		routes.add(new Route(villes.get(9),villes.get(50), 86, 61));
		routes.add(new Route(villes.get(9),villes.get(76), 126, 81));
		//Routes vers voisin de l'Aude (sauf dept dont num <)
		routes.add(new Route(villes.get(10),villes.get(30), 93, 67));
		routes.add(new Route(villes.get(10),villes.get(80), 65, 69));
		routes.add(new Route(villes.get(10),villes.get(33), 152, 99));
		//Routes vers voisin de l'Aveyron (sauf dept dont num <)
		routes.add(new Route(villes.get(11),villes.get(33), 172, 119));
		routes.add(new Route(villes.get(11),villes.get(29), 230, 159));
		routes.add(new Route(villes.get(11),villes.get(47), 107, 86));
		routes.add(new Route(villes.get(11),villes.get(14), 92, 100));
		routes.add(new Route(villes.get(11),villes.get(45), 112, 100));
		routes.add(new Route(villes.get(11),villes.get(81), 131, 111));
		routes.add(new Route(villes.get(11),villes.get(80), 74, 57));
		//Routes vers voisin des Bouches-du-RhÃ´ne (sauf dept dont num <)
		routes.add(new Route(villes.get(12),villes.get(29), 122, 86));
		routes.add(new Route(villes.get(12),villes.get(83), 105, 73));
		routes.add(new Route(villes.get(12),villes.get(82), 66, 48));
		routes.add(new Route(villes.get(12),villes.get(19), 351, 550));
		//Routes vers voisin du Calvados (sauf dept dont num <)
		routes.add(new Route(villes.get(13),villes.get(26), 156, 103));
		routes.add(new Route(villes.get(13),villes.get(60), 111, 72));
		routes.add(new Route(villes.get(13),villes.get(49), 62, 48));
		//Routes vers voisin du Cantal (sauf dept dont num <)
		routes.add(new Route(villes.get(14),villes.get(47), 153, 129));
		routes.add(new Route(villes.get(14),villes.get(42), 162, 140));
		routes.add(new Route(villes.get(14),villes.get(62), 156, 125));
		routes.add(new Route(villes.get(14),villes.get(18), 80, 75));
		routes.add(new Route(villes.get(14),villes.get(45), 136, 125));
		//Routes vers voisin de la Charente (sauf dept dont num <)
		routes.add(new Route(villes.get(15),villes.get(16), 135, 110));
		routes.add(new Route(villes.get(15),villes.get(78), 115, 95));
		routes.add(new Route(villes.get(15),villes.get(85), 115, 86));
		routes.add(new Route(villes.get(15),villes.get(86), 104, 80));
		routes.add(new Route(villes.get(15),villes.get(23), 86, 80));
		//Routes vers voisin de la Charente-MarÃ®time (sauf dept dont num <)
		routes.add(new Route(villes.get(16),villes.get(84), 77, 74));
		routes.add(new Route(villes.get(16),villes.get(78), 63, 51));
		routes.add(new Route(villes.get(16),villes.get(32), 184, 117));
		//Routes vers voisin du Cher (sauf dept dont num <)
		routes.add(new Route(villes.get(17),villes.get(35), 67, 66));		
		routes.add(new Route(villes.get(17),villes.get(40), 113, 89));		
		routes.add(new Route(villes.get(17),villes.get(44), 125, 83));		
		routes.add(new Route(villes.get(17),villes.get(88), 145, 126));		
		routes.add(new Route(villes.get(17),villes.get(57), 68, 67));		
		routes.add(new Route(villes.get(17),villes.get(22), 126, 110));		
		//Routes vers voisin de la CorrÃ¨ze (sauf dept dont num <)
		routes.add(new Route(villes.get(18),villes.get(22), 131, 122));		
		routes.add(new Route(villes.get(18),villes.get(86), 89, 61));		
		routes.add(new Route(villes.get(18),villes.get(23), 109, 75));		
		routes.add(new Route(villes.get(18),villes.get(45), 131, 94));		
		routes.add(new Route(villes.get(18),villes.get(62), 143, 100));		
		//Routes vers voisin de la Corse (sauf dept dont num <)
		routes.add(new Route(villes.get(19),villes.get(82), 285, 506));		
		//Routes vers voisin de CÃ´te d'Or (sauf dept dont num <)
		routes.add(new Route(villes.get(20),villes.get(88), 150, 99));
		routes.add(new Route(villes.get(20),villes.get(57), 179, 155));			
		routes.add(new Route(villes.get(20),villes.get(70), 126, 79));			
		routes.add(new Route(villes.get(20),villes.get(38), 99, 66));			
		routes.add(new Route(villes.get(20),villes.get(69), 107, 92));			
		routes.add(new Route(villes.get(20),villes.get(51), 109, 74));			
		//Routes vers voisin des CÃ´tes d'Armor (sauf dept dont num <)
		routes.add(new Route(villes.get(21),villes.get(28), 144, 104));
		routes.add(new Route(villes.get(21),villes.get(55), 117, 93));
		routes.add(new Route(villes.get(21),villes.get(34), 101, 67));
		//Routes vers voisin de la Creuse (sauf dept dont num <)
		routes.add(new Route(villes.get(22),villes.get(86), 90, 58));
		routes.add(new Route(villes.get(22),villes.get(62), 126, 122));
		routes.add(new Route(villes.get(22),villes.get(35), 105, 81));
		//Routes vers voisin de la Dordogne (sauf dept dont num <)
		routes.add(new Route(villes.get(23),villes.get(86), 99, 92));
		routes.add(new Route(villes.get(23),villes.get(45), 175, 116));
		routes.add(new Route(villes.get(23),villes.get(46), 136, 119));
		routes.add(new Route(villes.get(23),villes.get(32), 137, 90));
		//Routes vers voisin du Doubs (sauf dept dont num <)
		routes.add(new Route(villes.get(24),villes.get(38), 88, 78));
		routes.add(new Route(villes.get(24),villes.get(69), 49, 49));
		routes.add(new Route(villes.get(24),villes.get(89), 95, 70));
		//Routes vers voisin de la DrÃ´me (sauf dept dont num <)
		routes.add(new Route(villes.get(25),villes.get(83), 128, 82));
		routes.add(new Route(villes.get(25),villes.get(37), 92, 62));
		routes.add(new Route(villes.get(25),villes.get(68), 102, 70));
		//Routes vers voisin de l'Eure (sauf dept dont num <)
		routes.add(new Route(villes.get(26),villes.get(75), 56, 49));
		routes.add(new Route(villes.get(26),villes.get(59), 100, 102));
		routes.add(new Route(villes.get(26),villes.get(94), 84, 73));
		routes.add(new Route(villes.get(26),villes.get(77), 87, 67));
		routes.add(new Route(villes.get(26),villes.get(27), 85, 75));
		routes.add(new Route(villes.get(26),villes.get(60), 114, 92));
		//Routes vers voisin de l'Eure-et-Loir (sauf dept dont num <)
		routes.add(new Route(villes.get(27),villes.get(77), 77, 70));
		routes.add(new Route(villes.get(27),villes.get(90), 83, 65));
		routes.add(new Route(villes.get(27),villes.get(44), 77, 70));
		routes.add(new Route(villes.get(27),villes.get(40), 108, 100));
		routes.add(new Route(villes.get(27),villes.get(71), 122, 75));
		routes.add(new Route(villes.get(27),villes.get(60), 121, 109));
		//Routes vers voisin du FinistÃ¨re (sauf dept dont num <)
		routes.add(new Route(villes.get(28),villes.get(55), 120, 77));
		//Routes vers voisin du Gard (sauf dept dont num <)
		routes.add(new Route(villes.get(29),villes.get(33), 58, 60));
		routes.add(new Route(villes.get(29),villes.get(47), 145, 150));
		routes.add(new Route(villes.get(29),villes.get(83), 45, 45));
		//Routes vers voisin de la Haute-Garonne (sauf dept dont num <)
		routes.add(new Route(villes.get(30),villes.get(64), 154, 99));
		routes.add(new Route(villes.get(30),villes.get(31), 79, 71));
		routes.add(new Route(villes.get(30),villes.get(81), 54, 49));
		routes.add(new Route(villes.get(30),villes.get(80), 76, 54));
		//Routes vers voisin de la Gers (sauf dept dont num <)
		routes.add(new Route(villes.get(31),villes.get(64), 72, 72));
		routes.add(new Route(villes.get(31),villes.get(63), 117, 102));
		routes.add(new Route(villes.get(31),villes.get(39), 104, 92));
		routes.add(new Route(villes.get(31),villes.get(46), 71, 72));
		routes.add(new Route(villes.get(31),villes.get(81), 92, 77));
		//Routes vers voisin de la Gironde (sauf dept dont num <)
		routes.add(new Route(villes.get(32),villes.get(46), 141, 89));
		routes.add(new Route(villes.get(32),villes.get(39), 134, 84));																				
		//Routes vers voisin de l'HÃ©rault (sauf dept dont num <)
		routes.add(new Route(villes.get(33),villes.get(80), 198, 155));
		//Routes vers voisin de l'Ille-et-Vilaine (sauf dept dont num <)
		routes.add(new Route(villes.get(34),villes.get(49), 149, 86));
		routes.add(new Route(villes.get(34),villes.get(52), 75, 56));
		routes.add(new Route(villes.get(34),villes.get(48), 127, 100));
		routes.add(new Route(villes.get(34),villes.get(43), 113, 79));
		routes.add(new Route(villes.get(34),villes.get(55), 116, 75));
		//Routes vers voisin de l'Indre (sauf dept dont num <)
		routes.add(new Route(villes.get(35),villes.get(36), 124, 96));
		routes.add(new Route(villes.get(35),villes.get(40), 99, 88));
		routes.add(new Route(villes.get(35),villes.get(86), 122, 73));
		routes.add(new Route(villes.get(35),villes.get(85), 120, 106));
		//Routes vers voisin de l'Indre (sauf dept dont num <)
		routes.add(new Route(villes.get(36),villes.get(40), 66, 46));
		routes.add(new Route(villes.get(36),villes.get(85), 109, 76));
		routes.add(new Route(villes.get(36),villes.get(48), 128, 79));
		routes.add(new Route(villes.get(36),villes.get(71), 104, 68));
		//Routes vers voisin de l'IsÃ¨re (sauf dept dont num <)
		routes.add(new Route(villes.get(37),villes.get(72), 59, 45));
		routes.add(new Route(villes.get(37),villes.get(68), 114, 74));										
		//Routes vers voisin du Jura (sauf dept dont num <)
		routes.add(new Route(villes.get(38),villes.get(70), 102, 66));
		routes.add(new Route(villes.get(38),villes.get(69), 156, 102));		
		//Routes vers voisin des Landes (sauf dept dont num <)
		routes.add(new Route(villes.get(39),villes.get(46), 108, 97));
		routes.add(new Route(villes.get(39),villes.get(63), 105, 69));	
		//Routes vers voisin du Loir-et-Cher (sauf dept dont num <)
		routes.add(new Route(villes.get(40),villes.get(71), 113, 102));
		routes.add(new Route(villes.get(40),villes.get(44), 63, 46));	
		//Routes vers voisin de la Loire (sauf dept dont num <)
		routes.add(new Route(villes.get(41),villes.get(42), 77, 65));
		routes.add(new Route(villes.get(41),villes.get(68), 63, 53));
		routes.add(new Route(villes.get(41),villes.get(70), 131, 94));
		routes.add(new Route(villes.get(41),villes.get(62), 144, 93));
		//Routes vers voisin de la Haute-Loire (sauf dept dont num <)
		routes.add(new Route(villes.get(42),villes.get(47), 92, 81));
		routes.add(new Route(villes.get(42),villes.get(68), 135, 101));
		routes.add(new Route(villes.get(42),villes.get(62), 126, 102));
		//Routes vers voisin de la Loire-Atlantique (sauf dept dont num <)
		routes.add(new Route(villes.get(43),villes.get(55), 114, 78));
		routes.add(new Route(villes.get(43),villes.get(52), 135, 108));
		routes.add(new Route(villes.get(43),villes.get(48), 91, 60));
		routes.add(new Route(villes.get(43),villes.get(84), 69, 52));
		//Routes vers voisin du Loiret (sauf dept dont num <)
		routes.add(new Route(villes.get(44),villes.get(90), 123, 78));
		routes.add(new Route(villes.get(44),villes.get(76), 144, 93));
		routes.add(new Route(villes.get(44),villes.get(57), 169, 124));
		routes.add(new Route(villes.get(44),villes.get(88), 168, 101));
		//Routes vers voisin du Lot (sauf dept dont num <)
		routes.add(new Route(villes.get(45),villes.get(46), 86, 83));
		routes.add(new Route(villes.get(45),villes.get(81), 60, 48));
		//Routes vers voisin du Lot-et-garonne (sauf dept dont num <)
		routes.add(new Route(villes.get(46),villes.get(81), 86,57));
		//Routes vers voisin de la LozÃ¨re(sauf dept dont num <)
		//Routes vers voisin du Maine-et-Loire (sauf dept dont num <)
		routes.add(new Route(villes.get(48),villes.get(52), 81,69));
		routes.add(new Route(villes.get(48),villes.get(71), 95,62));
		routes.add(new Route(villes.get(48),villes.get(85), 149, 122));
		routes.add(new Route(villes.get(48),villes.get(78),157, 128));
		routes.add(new Route(villes.get(48),villes.get(84), 135,81));
		//Routes vers voisin de la Manche (sauf dept dont num <)
		routes.add(new Route(villes.get(49),villes.get(60), 141, 82));
		routes.add(new Route(villes.get(49),villes.get(52), 161, 108));	
		//Routes vers voisin de la Marne (sauf dept dont num <)
		routes.add(new Route(villes.get(50),villes.get(76), 153, 113));
		routes.add(new Route(villes.get(50),villes.get(51), 135,101));
		routes.add(new Route(villes.get(50),villes.get(54), 70,59));
		//Routes vers voisin de la Haute-Marne (sauf dept dont num <)
		routes.add(new Route(villes.get(51),villes.get(69), 110,98));
		routes.add(new Route(villes.get(51),villes.get(87), 126, 100));
		routes.add(new Route(villes.get(51),villes.get(54), 95, 74));
		//Routes vers voisin de la Mayenne (sauf dept dont num <)
		routes.add(new Route(villes.get(52),villes.get(71), 85, 54));
		routes.add(new Route(villes.get(52),villes.get(60), 95, 75));
		//Routes vers voisin de la Meurthe-et-Moselle (sauf dept dont num <)
		routes.add(new Route(villes.get(53),villes.get(56), 56, 45));
		routes.add(new Route(villes.get(53),villes.get(66), 160, 105));
		routes.add(new Route(villes.get(53),villes.get(87), 73, 52));
		routes.add(new Route(villes.get(53),villes.get(54), 97, 73));
		//Routes vers voisin de la Meuse (sauf dept dont num <)
		routes.add(new Route(villes.get(54),villes.get(87), 154, 102));
		//Routes vers voisin du Morbihan (sauf dept dont num <)										
		//Routes vers voisin de la Moselle (sauf dept dont num <)
		routes.add(new Route(villes.get(56),villes.get(66), 167,99));
		routes.add(new Route(villes.get(56),villes.get(87), 134,86));
		//Routes vers voisin de la NiÃ¨vre (sauf dept dont num <)
		routes.add(new Route(villes.get(57),villes.get(70), 191, 138));
		routes.add(new Route(villes.get(57),villes.get(88), 119, 101));
		//Routes vers voisin du Nord (sauf dept dont num <)
		routes.add(new Route(villes.get(58),villes.get(79), 144, 89));
		routes.add(new Route(villes.get(58),villes.get(61), 52,40));
		//Routes vers voisin de l'Oise (sauf dept dont num <)
		routes.add(new Route(villes.get(59),villes.get(79), 71,53));
		routes.add(new Route(villes.get(59),villes.get(75), 81, 85));
		routes.add(new Route(villes.get(59),villes.get(94), 65, 48));
		routes.add(new Route(villes.get(59),villes.get(76), 140, 97));
		//Routes vers voisin de l'Orne (sauf dept dont num <)
		routes.add(new Route(villes.get(60),villes.get(71), 55, 41));
		//Routes vers voisin du Pas-de-Calais (sauf dept dont num <)
		routes.add(new Route(villes.get(61),villes.get(79), 62, 70));						
		//Routes vers voisin du Puy-de-DÃ´me (sauf dept dont num <)
		//Routes vers voisin des PyrÃ©nÃ©es-Atlantique (sauf dept dont num <)
		routes.add(new Route(villes.get(63),villes.get(64), 43,43));						
		//Routes vers voisin des Hautes-PyrÃ©nÃ©es (sauf dept dont num <)
		//Routes vers voisin des PyrÃ©nÃ©es-Orientales (sauf dept dont num <)
		//Routes vers voisin du Bas-Rhin (sauf dept dont num <)
		routes.add(new Route(villes.get(66),villes.get(67), 114,73));
		routes.add(new Route(villes.get(66),villes.get(87), 130,117));
		//Routes vers voisin du Haut-Rhin (sauf dept dont num <)
		routes.add(new Route(villes.get(67),villes.get(89), 41,37));
		routes.add(new Route(villes.get(67),villes.get(69), 112,86));
		routes.add(new Route(villes.get(67),villes.get(87), 154,104));
		//Routes vers voisin du RhÃ´ne (sauf dept dont num <)
		routes.add(new Route(villes.get(68),villes.get(70), 73,55));
		//Routes vers voisin de la Haute-SaÃ´ne (sauf dept dont num <)
		routes.add(new Route(villes.get(69),villes.get(89), 75,62));								
		routes.add(new Route(villes.get(69),villes.get(87), 90,68));								
		//Routes vers voisin de la SaÃ´ne-et-Loire (sauf dept dont num <)
		//Routes vers voisin de la Sarthe (sauf dept dont num <)
		//Routes vers voisin de la Savoie (sauf dept dont num <)
		routes.add(new Route(villes.get(72),villes.get(73), 54,44));								
		//Routes vers voisin de la Haute-Savoie (sauf dept dont num <)
		//Routes vers voisin de Paris (sauf dept dont num <)
		routes.add(new Route(villes.get(74),villes.get(91), 12,28));
		routes.add(new Route(villes.get(74),villes.get(92), 22,27));
		routes.add(new Route(villes.get(74),villes.get(93), 14,17));
		//Routes vers voisin de la Seine-MarÃ®time (sauf dept dont num <)
		routes.add(new Route(villes.get(75),villes.get(79), 120,79));								
		//Routes vers voisin de la Seine-et-Marne (sauf dept dont num <)
		routes.add(new Route(villes.get(76),villes.get(88), 121, 83 ));	
		routes.add(new Route(villes.get(76),villes.get(94), 91, 70));	
		routes.add(new Route(villes.get(76),villes.get(90), 24, 21));	
		//Routes vers voisin des Yvelines (sauf dept dont num <)
		routes.add(new Route(villes.get(77),villes.get(94), 32, 46));	
		routes.add(new Route(villes.get(77),villes.get(90), 41, 36));	
		routes.add(new Route(villes.get(77),villes.get(91), 19, 27));
		//Routes vers voisin des Deux-SÃ¨vres (sauf dept dont num <)
		routes.add(new Route(villes.get(78),villes.get(84), 91, 67));	
		routes.add(new Route(villes.get(78),villes.get(85), 80, 63));	
		//Routes vers voisin de la Somme (sauf dept dont num <)		
		//Routes vers voisin du Tarn (sauf dept dont num <)
		routes.add(new Route(villes.get(80),villes.get(81), 76, 64));	
		//Routes vers voisin du Tarn-et-Garonne (sauf dept dont num <)		
		//Routes vers voisin du Var (sauf dept dont num <)
		routes.add(new Route(villes.get(82),villes.get(83), 169, 107));
		//Routes vers voisin du Vaucluse (sauf dept dont num <)
		//Routes vers voisin de la VendÃ©e (sauf dept dont num <)
		//Routes vers voisin de la Vienne (sauf dept dont num <)
		routes.add(new Route(villes.get(85),villes.get(86), 129,111));
		//Routes vers voisin de la Haute-Vienne (sauf dept dont num <)
		//Routes vers voisin des Vosges (sauf dept dont num <)
		routes.add(new Route(villes.get(87),villes.get(89), 117, 79));
		//Routes vers voisin de l'Yonne (sauf dept dont num <)
		//Routes vers voisin du Territoire de Belfort (sauf dept dont num <)
		//Routes vers voisin de l'Essonne (sauf dept dont num <)
		routes.add(new Route(villes.get(90),villes.get(91), 46, 45));	
		routes.add(new Route(villes.get(90),villes.get(93), 34, 27));
		//Routes vers voisin de l'Essonne (sauf dept dont num <)
		routes.add(new Route(villes.get(91),villes.get(94), 33,32));	
		routes.add(new Route(villes.get(91),villes.get(92), 23, 25));
		//Routes vers voisin des Hauts-de-Seine (sauf dept dont num <)
		routes.add(new Route(villes.get(91),villes.get(94), 33,32));	
		routes.add(new Route(villes.get(91),villes.get(92), 23, 25));
		//Routes vers voisin de Seine-Saint-Denis (sauf dept dont num <)
		routes.add(new Route(villes.get(92),villes.get(93), 21, 22));	
		routes.add(new Route(villes.get(92),villes.get(94), 35, 32));
		//Routes vers voisin du Val-de-Marne (sauf dept dont num <)
		//Routes vers voisin du Val-d'Oise (sauf dept dont num <)
	}
	
	public String fromVillesToString()
	{
		String s="";
		int i=1;
		for(Ville v : villes)
		{			
			s+=v.toString();
			int nbTab=3-(v.toString().length()/8);
			for(int a=0;a<nbTab;a++)
				s+="\t";
			if(i%4==0)
				s+="\n";
			i++;
		}
		return s;
	}


	public Ville getVille(int villeIndex) {
		return villes.get(villeIndex);
	}
	
	public int getNbVilles()
	{
		return villes.size();
	}
	
	public int getNbRoutes()
	{
		return routes.size();
	}

}
