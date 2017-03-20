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
	

	
	public void activate() //aktivaljuk a bejaratot
		{
			TunnelManager tm=new TunnelManager(); //ezaltal hivatkozunk a tunnel managerre
			System.out.println("activate: Aktiv?" +name);
			Scanner s1=new Scanner(System.in);
			String answer=s1.nextLine();
			
			if(answer.equals("true")) //aktiv az adott bejárat?
				{
					tm.Substractactive(this); //meghivjuk a TM deaktiváló fuggvenyet
					s1.close();
				}
			else
			{
				tm.Addactive(this); //a TM aktivalo fuggvenyet hivjuk
				s1.close();
				
			}
			
		}
	
}
