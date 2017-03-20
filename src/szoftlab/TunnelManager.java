package szoftlab;

import java.util.Scanner;

public class TunnelManager {

	private String Name;
	
	public String toString() //kiirjuk a nevet a managernek
		{
			return "Name: " + Name; 
		}
	
	public boolean checkActives(Scanner s1)	//ellenorizzuk, hogy kettonel kevesebb bejarat aktiv-e
		{
			System.out.println("checkActives: Aktiv ket bejarat?");
			String answer=s1.nextLine();
			if(answer.equals("true")) //aktiv ket bejarat, igy ujat nem lehet felvenni
				{
					System.out.println("Nem lehet uj bejaratot aktivva tenni");					
					return true;
				}
			else return false;
			 
		}
	
	public void Addactive(TunnelEntrace te, Scanner s1) //az adott tunnelentrace-t aktivva tesszük, ha nem aktiv
		{
			if(checkActives(s1)==false)	//azt mondta a felhasznalo, hogy nincs ket aktiv bejarat	
			{
				System.out.println("Addactive: Aktivva tegyem?"+ te.toString());
				String answer=s1.nextLine();
				if(answer.equals("true")) //aktivva tesszuk a bejaratot
				{
					System.out.println(te.toString()+" aktiv lett");
					System.out.println("Van mar ket aktiv bejarat?");
					String answer2=s1.nextLine();
						if(answer2.equals("true")) //volt ket aktiv, ki kell epiteni koztuk az alagutat
							{
								System.out.println("Kiepitem az alagutat koztuk");
							}
						
				}
				else System.out.println("Nem tettem aktivva"+ te.toString()+"-t" ); //nem tettuk aktivva a bejaratot
			}
			
			
		}
	
	public void Substractactive(TunnelEntrace te, Scanner s1) //deaktiválása a bejáratnak
		{
			System.out.println("deactive: Deaktiváljam? " +te.toString());
			String answer=s1.nextLine();
			if(answer.equals("true")) //deaktiválni kell
				{
					System.out.println(te.toString() +" Deaktiváltam");
				}
			else System.out.println(te.toString() +" Aktív maradt"); 
		}										
	
}

