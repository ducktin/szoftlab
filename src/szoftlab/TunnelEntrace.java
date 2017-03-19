package szoftlab;

import java.util.Scanner;

public class TunnelEntrace {

	private String Name;
	
	public String toString() //kiírjuk a nevét a bejáratnak
		{
			return "Name: " + Name; 
		}

	
	public void activate() //aktíváljuk a bejáratot
		{
			TunnelManager tm=new TunnelManager(); //ezáltal hivatkozunk a tunnel managerre
			System.out.println("activate: Aktiv?");
			Scanner s1=new Scanner(System.in);
			if(s1.equals(true)) //aktív az adott bejárat?
				{
					tm.Substractactive(this); //meghívjuk a TM deaktiváló függvényét
					s1.close();
				}
			else
			{
				s1.close();
				tm.Addactive(this); //a TM aktiváló függvényét hívjuk
			}
			
		}
	
}
