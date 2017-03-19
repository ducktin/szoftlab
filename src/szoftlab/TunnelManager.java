package szoftlab;

import java.util.Scanner;

public class TunnelManager {
	
	public boolean checkActives()	//ellenorizzuk, hogy kettonel kevesebb bejarat aktiv-e
		{
			System.out.println("checkActives: Akt�v k�t bej�rat?");
			Scanner s1=new Scanner(System.in);
			if(s1.equals(true)) //akt�v k�t bej�rat, �gy �jat nem lehet felvenni
				{
					System.out.println("Nem lehet �j bej�ratot akt�vv� tenni");
					s1.close();
					return true;
				}
			else
			{
				s1.close();
				return false;
			}
			 
		}
	
	public void Addactive(TunnelEntrace te) //az adott tunnelentrace-t akt�vv� tessz�k, ha nem akt�v
		{
			if(checkActives()==false)	//azt mondta a felhaszn�l�, hogy nincs k�t akt�v bej�rat	
			{
				System.out.println("Addactive: Akt�vv� tegyem?"+ te.toString());
				Scanner s1=new Scanner(System.in);
				if(s1.equals(true)) //akt�vv� tessz�k a bej�raot
				{
					System.out.println(te.toString()+ "akt�v lett");
					System.out.println("Van m�r k�t akt�v bej�rat?");
					Scanner s2=new Scanner(System.in);
						if(s2.equals(true)) //van k�t akt�v, ki kell �p�teni k�zt�k az alagutat
							{
								System.out.println("Ki�p�tem az alagutat k�zt�k");
							}
						s1.close();
						s2.close();
						
				}
				else System.out.println("Nem tettem akt�vv�"+ te.toString()+"-t" ); //nem tett�k akt�vv� a bej�ratot
				s1.close();
			}
			
			
		}
	
	public void Substractactive(TunnelEntrace te) //deaktiv�l�sa a bej�ratnak
		{
			System.out.println("deactive: Deaktiv�ljam?" +te.toString());
			Scanner s1=new Scanner(System.in);
			if(s1.equals(true)) //deaktiv�lni kell
				{
					System.out.println(te.toString() + "Deaktiv�ltam");
					s1.close();
				}
			else System.out.println(te.toString() + "Akt�v maradt"); 
			s1.close();
		}										
	
}

