package szoftlab;

import java.util.Scanner;

public class SkeletonMethods {
		
	public static void TrainMover(Map map){
		System.out.println("Ki mozogjon? Kerem a nevet:");
		Scanner s1 = new Scanner(System.in);
		String tomove = s1.nextLine(); 
		for (Locomotive item : map.locomotives) {	// Itt kell megnézni, hogy van-e ilyen vonatunk.
		    if (item.name.equals(tomove)){
		    	System.out.println(tomove+" moving");
		    	System.out.println("Hova mozogjon? Kerem a nevet:");
				String tohere = s1.nextLine(); 
				for(Rail place : map.rails){	// Itt kell megnézni, hogy van-e ilyen hely ahova mehetünk.
					if (place.name.equals(tohere)){
						item.move(place);
					}
				}	
				
		    }
		}
		s1.close();
		System.out.println("Nincs ilyen vonat!");
	}
}
