package szoftlab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		
		
		
		
		Map map = new Map();
		
		String choice = null;
        //Scanner scan = new Scanner(System.in);
		
		do{
			
			System.out.println("Alabbi szekvenciak kozul valaszthatsz:\n (0:kilepes)"
					+"1. Tesztpalya inicializasa\n"
					+"2. Vonat mozgasa\n"
					+"3. Kocsi allomasokhoz erkezese\n"
					+"4. Alagutszaj aktivalasa\n"
					+"5. Valto allitasa\n"
					);
			Scanner scan = new Scanner(System.in);
			//Scanner scan = new Scanner(System.in);
			//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			//if(line.equals("0")) break;
			//br.close();
			choice = scan.nextLine();
			
			switch(choice){
			case "1":
				
				SkeletonMethods.Init(map);
				break;
			
			case "2":
				SkeletonMethods.TrainMover(map, scan);
				break;
			case "3":
				
				Rail r3 = new Rail("r3");
				Rail r4 = new Rail("r4");
				Rail r5 = new Rail("r5");
				TrainCart tr1 = new TrainCart(r3,null,"tr1",Color.GREEN); // R3-on a tr1
				Locomotive l2 = new Locomotive(r4, tr1, "l2"); // R4-en a loco
				Station st1 = new Station("st1", Color.GREEN,r4); // R4 az allomas --> r3rol r4rer green green hivodik az emptCart
				//Palya kialakitasa
				map.stats.add(st1);
				map.locomotives.add(l2);
				map.traincarts.add(tr1);
				map.rails.add(r3);
				map.rails.add(r4);	
				map.rails.add(r5);
				SkeletonMethods.TrainMover(map, scan);
				//Stationra erkezes szimulacioja
				
				
				if(tr1.getIsFirst()){ //ha if nincs akkor no line found
					
					if((tr1.currentPlace == st1.r) && (tr1.cartColor == st1.getColor())){
						tr1.empty();//kiurul a kocsi es az empty true lesz 
						
						
					}
					else
						System.out.println("Nem egyezik a szinuk");
				}
					
			
				
				
				
				
				break;
			case "4":
				//Implementalasa kikommentezbe a TunnelEntrace es TunnelManager osztalyokban
				TunnelEntrace te1 = new TunnelEntrace("te1");
				TunnelEntrace te2 = new TunnelEntrace("te2");
				TunnelEntrace te3 = new TunnelEntrace("te3");
				te1.activate();
				te2.activate();
				te3.activate();
				
				
				
				break;
			case "5":
				SkeletonMethods.Switchswitcher(map, scan);
				break;
					
			default:
				break;
			}
			//scan.close();
		}while(true);
		

        /*System.out.println("lefutas:\n1. Tesztpalya inicializasa\n"
					+"2. Vonat mozgasa\n"
					+"3. Kocsi allomasokhoz erkezese\n"
					+"4. Alagutszaj aktivalasa\n"
					+"5. Valto allitasa\n"
					);
        
        SkeletonMethods.Init(map);
		
		
		
        SkeletonMethods.TrainMover(map);
        
        
        Rail r3 = new Rail("r3");
		Rail r4 = new Rail("r4");
		Rail r5 = new Rail("r5");
		TrainCart tr1 = new TrainCart(r3,null,"tr1",Color.GREEN); // R3-on a tr1
		Locomotive l2 = new Locomotive(r4, tr1, "l2"); // R4-en a loco
		Station st1 = new Station("st1", Color.GREEN,r4); // R4 az allomas --> r3rol r4rer green green hivodik az emptCart
		//Palya kialakitasa
		map.stats.add(st1);
		map.locomotives.add(l2);
		map.traincarts.add(tr1);
		map.rails.add(r3);
		map.rails.add(r4);	
		map.rails.add(r5);
		SkeletonMethods.TrainMover(map);
		//Stationra erkezes szimulacioja
		
		if(tr1.getIsFirst()){ //ha if nincs akkor no line found
			
			if((tr1.currentPlace == st1.r) && (tr1.cartColor == st1.getColor())){
				tr1.empty();//kiurul a kocsi es az empty true lesz 
				
				
			}
			else
				System.out.println("Nem egyezik a szinuk");
		}
		
		
		//Implementalasa kikommentezbe a TunnelEntrace es TunnelManager osztalyokban
		TunnelEntrace te1 = new TunnelEntrace("te1");
		TunnelEntrace te2 = new TunnelEntrace("te2");
		TunnelEntrace te3 = new TunnelEntrace("te3");
		te1.activate();
		te2.activate();
		te3.activate();
		
		 
		
		SkeletonMethods.Switchswitcher(map);*/
	}



}
