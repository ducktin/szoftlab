package szoftlab;

import java.util.Scanner;

public class TunnelEntrace extends Rail {

	public TunnelEntrace(String name) {
		super(name);	
	}
	
	
	public String toString() //kiirjuk a nevet a bejaratnak
		{ 
			return "TunnelEntrace " + name; 

		}
	

	
	public void activate(Scanner s1) //aktivaljuk a bejaratot
		{
			TunnelManager tm=new TunnelManager(); //ezaltal hivatkozunk a tunnel managerre
			System.out.println("activate: Aktiv?" +name);
			String answer=s1.nextLine();
			
			if(answer.equals("true")) //aktiv az adott bejárat?
				{
					tm.Substractactive(this, s1); //meghivjuk a TM deaktiváló fuggvenyet
				}
			else
			{
				tm.Addactive(this,s1); //a TM aktivalo fuggvenyet hivjuk
				
			}
			
		}
	
}
