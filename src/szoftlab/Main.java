package szoftlab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		
		
		Map map = new Map();
		
		String choice = null;
        Scanner scan = new Scanner(System.in);
		
		do{
			
			System.out.println("Alabbi szekvenciak kozul valaszthatsz:\n (0:kilepes)"
					+"1. Vonat mozgasa\n"
					+"2. Kocsi allomasokhoz erkezese\n"
					+"3. Alagutszaj aktivalasa\n"
					+"4. Valto allitasa\n"
					);
			
			//Scanner scan = new Scanner(System.in);
			/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			line = br.readLine();
			if(line.equals("0")) break;
			//br.close();*/
			choice = scan.nextLine();
			
			switch(choice){
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
				Rail r3 = new Rail("r3");
				Rail r4 = new Rail("r4");
				Rail r5 = new Rail("r5");
				TrainCart tr1 = new TrainCart(r3,null,"tr1",Color.GREEN); // R3-on a tr1
				Locomotive l2 = new Locomotive(r4, tr1, "l2"); // R4-en a loco
				Station st1 = new Station("st1", Color.GREEN,r4); // R4 az allomas --> r3rol r4rer green green hivodik az emptCart
				//Palya kialakitasa
				map.locomotives.add(l2);
				map.traincarts.add(tr1);
				map.rails.add(r3);
				map.rails.add(r4);	
				map.rails.add(r5);
				SkeletonMethods.TrainMover(map);
				//Stationra erkezes szimulacioja
				
				
				if(tr1.getIsFirst()) //ha if nincs akkor no line found
					
					/*tr1.move(l2.lastPlace);
					if((tr1.currentPlace == st1.r) && (tr1.cartColor == st1.getColor())){
						System.out.println("asd2");
						tr1.empty();//kiurul a kocsi es az empty true lesz 
						
						
					}
					else
						System.out.println("Nem egyezik a szinuk");
				}
					*/
			
				
				
				
				
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
			//scan.close();
		}while(true);
		


		/*Rail r1 = new Rail("r1");		//Ez egy proba a mukodes Zoli
		Rail r2 = new Rail("r2");
		Locomotive l1 = new Locomotive(r1, null, "l1");
		map.rails.add(r1);
		map.rails.add(r2);
		map.locomotives.add(l1);

		SkeletonMethods.TrainMover(map);*/
		

		//SkeletonMethods.TrainMover(map);

		
	}



}
