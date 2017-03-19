package szoftlab;

import java.util.Scanner;

public class TunnelEntrace {

	private String Name;
	
	public String toString() //ki�rjuk a nev�t a bej�ratnak
		{
			return "Name: " + Name; 
		}

	
	public void activate() //akt�v�ljuk a bej�ratot
		{
			TunnelManager tm=new TunnelManager(); //ez�ltal hivatkozunk a tunnel managerre
			System.out.println("activate: Aktiv?");
			Scanner s1=new Scanner(System.in);
			if(s1.equals(true)) //akt�v az adott bej�rat?
				{
					tm.Substractactive(this); //megh�vjuk a TM deaktiv�l� f�ggv�ny�t
					s1.close();
				}
			else
			{
				s1.close();
				tm.Addactive(this); //a TM aktiv�l� f�ggv�ny�t h�vjuk
			}
			
		}
	
}
