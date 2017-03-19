package szoftlab;

import java.util.Scanner;

public class TunnelEntrace {

	private String Name;
	
	public String toString() //kiirjuk a nevet a bejaratnak
		{
			return "Name: " + Name; 
		}

	
	public void activate() //aktivaljuk a bejaratot
		{
			TunnelManager tm=new TunnelManager(); //ezaltal hivatkozunk a tunnel managerre
			System.out.println("activate: Aktiv?");
			Scanner s1=new Scanner(System.in);
			if(s1.equals(true)) //aktiv az adott bejárat?
				{
					tm.Substractactive(this); //meghivjuk a TM deaktiváló fuggvenyet
					s1.close();
				}
			else
			{
				s1.close();
				tm.Addactive(this); //a TM aktivalo fuggvenyet hivjuk
			}
			
		}
	
}
