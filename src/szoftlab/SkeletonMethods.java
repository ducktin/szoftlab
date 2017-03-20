package szoftlab;

import java.util.Scanner;

public class SkeletonMethods {
		
	public static void TrainMover(Map map){
		System.out.println("Ki mozogjon? Kerem a nevet:");
		Scanner s1 = new Scanner(System.in);
		String tomove = s1.nextLine(); 
		for (Locomotive item : map.locomotives) {	// Itt kell megnezni, hogy van-e ilyen vonatunk.
		    if (item.name.equals(tomove)){
		    	System.out.println(tomove+" moving");
		    	System.out.println("Hova mozogjon? Kerem a nevet:");
				String tohere = s1.nextLine(); 
				for(Rail place : map.rails){	// Itt kell megnezni, hogy van-e ilyen hely ahova mehetunk.
					if (place.name.equals(tohere)){  //Ha minden stimmel, mozgatunk.
						item.move(place);
						s1.close();
						return;
					}
				}
				System.out.println("Nincs ilyen palyaelem!");
				
		    }
		}
		s1.close();
		System.out.println("Nincs ilyen vonat!");
	}
	
	public static void Switchswitcher(Map map){		//Valtoallitas a felhasznalo kereseinek megfeleloen
		System.out.println("Kit valtsunk? Kerem a nevet:");
		Scanner s1 = new Scanner(System.in);
		String who = s1.nextLine(); 
		for(Rail item : map.rails){
			if(item.name.equals(who)){
				item.setNeighbourtwo();
				System.out.println(item.toString()+" allasa mostantol "+item.neighbour_two.toString()+" fele all.");
			}
		}
	}
	
	public static void Init(Map map){		//Egy proba palya amin lehet tesztelni
		Rail r1 = new Rail("rail1");
		TunnelEntrace t1 = new TunnelEntrace("tunnel1");
		Rail r2 = new Rail("rail2");
		Station s1 = new Station("station1", Color.GREEN, r1);
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
		
	}
	
	
	
}
