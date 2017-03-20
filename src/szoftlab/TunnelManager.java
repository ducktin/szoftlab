package szoftlab;

import java.util.Scanner;

public class TunnelManager {

	private String Name;
	
	public String toString() //kiirjuk a nevet a managernek
		{
			return "Name: " + Name; 
		}
	
	public boolean checkActives()	//ellenorizzuk, hogy kettonel kevesebb bejarat aktiv-e
		{
			System.out.println("checkActives: Aktiv ket bejarat?");
			Scanner s1=new Scanner(System.in);
			String answer=s1.nextLine();
			if(answer.equals("true")) //aktiv ket bejarat, igy ujat nem lehet felvenni
				{
					System.out.println("Nem lehet uj bejaratot aktivva tenni");
					s1.close();
					return true;
				}
			else
			{
				s1.close();
				return false;
			}
			 
		}
	
	public void Addactive(TunnelEntrace te) //az adott tunnelentrace-t aktivva tesszük, ha nem aktiv
		{
			if(checkActives()==false)	//azt mondta a felhasznalo, hogy nincs ket aktiv bejarat	
			{
				System.out.println("Addactive: Aktivva tegyem?"+ te.toString());
				Scanner s1=new Scanner(System.in);
				String answer=s1.nextLine();
				if(answer.equals("true")) //aktivva tesszuk a bejaratot
				{
					System.out.println(te.toString()+" aktiv lett");
					System.out.println("Van mar ket aktiv bejarat?");
					Scanner s2=new Scanner(System.in);
					String answer2=s1.nextLine();
						if(answer2.equals("true")) //volt ket aktiv, ki kell epiteni koztuk az alagutat
							{
								System.out.println("Kiepitem az alagutat koztuk");
							}
						s1.close();
						s2.close();
						
				}
				else System.out.println("Nem tettem aktivva"+ te.toString()+"-t" ); //nem tettuk aktivva a bejaratot
				s1.close();
			}
			
			
		}
	
	public void Substractactive(TunnelEntrace te) //deaktiválása a bejáratnak
		{
			System.out.println("deactive: Deaktiváljam?" +te.toString());
			Scanner s1=new Scanner(System.in);
			if(s1.equals("true")) //deaktiválni kell
				{
					System.out.println(te.toString() +" Deaktiváltam");
					s1.close();
				}
			else System.out.println(te.toString() +" Aktív maradt"); 
			s1.close();
		}										
	
}

