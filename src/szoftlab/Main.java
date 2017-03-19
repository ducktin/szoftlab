package szoftlab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		

		Scanner scan = new Scanner(System.in);
		Map map = new Map();
		
		String line;
		
		while(true){
			
			System.out.println("Alabbi szekvenciak kozul valaszthatsz:\n (0:kilepes)"
					+"1. Vonat mozgása\n"
					+"2. Kocsi állomáshoz érkezése\n"
					+"3. Alagútszáj aktiválása\n"
					+"4. Váltó állítása\n"
					);
			
			
			
			line = scan.nextLine();
			if(line.equals("0")) break;
			
			
			switch(line){
			case "1":
				Rail r1 = new Rail("r1");
				Rail r2 = new Rail("r2");
				Locomotive l1 = new Locomotive(r1, null, "l1");
				map.rails.add(r1);
				map.rails.add(r2);
				map.locomotives.add(l1);
				SkeletonMethods.TrainMover(map);
				break;
			case "2":
				//SkeletonMethods.StationArrive();
				break;
			case "3":
				//SkeletonMethods.TunnelActivate();
				break;
			case "4":
				//SkeletonMethods.Switchswitch();
				break;
					
			default:
				break;
			}
			
		}
		


		/*Rail r1 = new Rail("r1");		//Ez egy proba a mukodes Zoli
		Rail r2 = new Rail("r2");
		Locomotive l1 = new Locomotive(r1, null, "l1");
		map.rails.add(r1);
		map.rails.add(r2);
		map.locomotives.add(l1);

		SkeletonMethods.TrainMover(map);*/


		SkeletonMethods.TrainMover(map);

		
	}



}
