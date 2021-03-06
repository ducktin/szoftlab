package szoftlab;

import java.util.Scanner;

public class SkeletonMethods {
		
	public static void TrainMover(Map map, Scanner s1){
		System.out.println("Ki mozogjon? Kerem a nevet:");
		String tomove = s1.nextLine(); 
		for (Locomotive item : map.locomotives) {	// Itt kell megnezni, hogy van-e ilyen vonatunk.
		    if (item.name.equals(tomove)){
		    	System.out.println(tomove+" moving");
		    	System.out.println("Hova mozogjon? Kerem a nevet:");
				String tohere = s1.nextLine(); 
				System.out.println("Van ott vki?");
				String use=s1.nextLine();
				if(use.equals("true"))
					{
						System.out.println("�tk�z�s t�rt�nt");
					}
				else
					{
						for(Rail place : map.rails)
						{	// Itt kell megnezni, hogy van-e ilyen hely ahova mehetunk.
							if (place.name.equals(tohere))
							{  //Ha minden stimmel, mozgatunk.
								item.move(place);
								return;
							}
						}
					}
				
				System.out.println("Nincs ilyen palyaelem!");
				
		    }
		}
		System.out.println("Nincs ilyen vonat!");
	}
	
	public static void Switchswitcher(Map map, Scanner s1){		//Valtoallitas a felhasznalo kereseinek megfeleloen
		System.out.println("Kit valtsunk? Kerem a nevet:");
		String who = s1.nextLine(); 
		for(Rail item : map.rails){
			if(item.name.equals(who)){
				item.setNeighbourTwo(s1);
				System.out.println(item.toString()+" allasa mostantol "+item.neighbour_two.toString()+" fele all.");
			}
		}
	}
	
	public static void Init(Map map){		//Egy proba palya amin lehet tesztelni
		Rail r1 = new Rail("rail1");
		TunnelEntrace t1 = new TunnelEntrace("tunnel1");
		Rail r2 = new Rail("rail2");
		Station s1 = new Station("station1", Color.GREEN);
		Switch sw1 = new Switch("switch1");
		TunnelEntrace t2 = new TunnelEntrace("tunnel2");
		Rail r3 = new Rail("rail3");
		Rail r4 = new Rail("rail4");
		Rail r5 = new Rail("rail5");
		Switch sw2 = new Switch("switch2");
		r1.connect(sw2, t1);		//Kapcsolatok kiepitese
		t1.connect(r1, r2);
		r2.connect(t1, s1);
		s1.connect(r2, sw1);
		sw1.addNeighbour(t2);
		sw1.addNeighbour(r3);
		sw1.addNeighbour(r4);
		sw1.connect(s1, t2);
		t2.connect(sw1, sw2);
		r3.connect(sw1, sw2);
		r4.connect(sw1, r5);
		r5.connect(r4, sw2);
		sw2.addNeighbour(r1);
		sw2.addNeighbour(r3);
		sw2.addNeighbour(r5);
		sw2.connect(t2, r1);
		
		TrainCart tc1 = new TrainCart(sw2, null, "cart1", Color.GREEN);		//Kocsi letrehozasa
		Locomotive l1 = new Locomotive(r1, tc1, "locomotive1");				//Mozdony letrehozasa
		
		map.locomotives.add(l1);		//Palyara tenni minden elemet
		map.traincarts.add(tc1);
		map.rails.add(r1);
		map.rails.add(t1);
		map.rails.add(r2);
		map.rails.add(s1);
		map.rails.add(sw1);
		map.rails.add(t2);
		map.rails.add(r3);
		map.rails.add(r4);
		map.rails.add(sw2);
		map.rails.add(r5);
		System.out.println("\n A fentieket olvasd el, fontos! \n");
		
		
		
	}
	
	
	
}
