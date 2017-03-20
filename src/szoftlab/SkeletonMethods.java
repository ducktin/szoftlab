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
	
	
	
	
}
