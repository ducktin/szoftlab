package szoftlab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Map map = new Map();
		String menucontrol = null;
		menucontrol=reader.readLine();
		while(!menucontrol.equals("exit")){
		System.out.println("Alabbi szekvenciak kozul valaszthatsz:\n (exit:kilepes)"
				+"1. Vonat mozgása\n"
				+"2. Kocsi állomáshoz érkezése\n"
				+"3. Alagútszáj aktiválása\n"
				+"4. Váltó állítása\n"
				);
		
		
		menucontrol=reader.readLine();
		switch(menucontrol){
		case "1":
			SkeletonMethods.TrainMover(map);
			break;
		case "2":
			SkeletonMethods.StationArrive();
			break;
		case "3":
			SkeletonMethods.TunnelActivate();
			break;
		case "4":
			SkeletonMethods.Switchswitch();
			break;
		}
		
		}
		

		

		
	}



}
