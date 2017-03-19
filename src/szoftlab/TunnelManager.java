package szoftlab;

import java.util.Scanner;

public class TunnelManager {
	
	public boolean checkActives()	//ellenorizzuk, hogy kettonel kevesebb bejarat aktiv-e
		{
			System.out.println("checkActives: Aktív két bejárat?");
			Scanner s1=new Scanner(System.in);
			if(s1.equals(true)) //aktív két bejárat, így újat nem lehet felvenni
				{
					System.out.println("Nem lehet új bejáratot aktívvá tenni");
					s1.close();
					return true;
				}
			else
			{
				s1.close();
				return false;
			}
			 
		}
	
	public void Addactive(TunnelEntrace te) //az adott tunnelentrace-t aktívvá tesszük, ha nem aktív
		{
			if(checkActives()==false)	//azt mondta a felhasználó, hogy nincs két aktív bejárat	
			{
				System.out.println("Addactive: Aktívvá tegyem?"+ te.toString());
				Scanner s1=new Scanner(System.in);
				if(s1.equals(true)) //aktívvá tesszük a bejáraot
				{
					System.out.println(te.toString()+" aktív lett");
					System.out.println("Van már két aktív bejárat?");
					Scanner s2=new Scanner(System.in);
						if(s2.equals(true)) //volt két aktív, ki kell építeni köztük az alagutat
							{
								System.out.println("Kiépítem az alagutat köztük");
							}
						s1.close();
						s2.close();
						
				}
				else System.out.println("Nem tettem aktívvá"+ te.toString()+"-t" ); //nem tettük aktívvá a bejératot
				s1.close();
			}
			
			
		}
	
	public void Substractactive(TunnelEntrace te) //deaktiválása a bejáratnak
		{
			System.out.println("deactive: Deaktiváljam?" +te.toString());
			Scanner s1=new Scanner(System.in);
			if(s1.equals(true)) //deaktiválni kell
				{
					System.out.println(te.toString() +" Deaktiváltam");
					s1.close();
				}
			else System.out.println(te.toString() +" Aktív maradt"); 
			s1.close();
		}										
	
}

