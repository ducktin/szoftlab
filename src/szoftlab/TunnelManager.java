package szoftlab;

import java.util.ArrayList;

public class TunnelManager {
		
	private ArrayList<TunnelEntrace> entraces; //tunnel lista
	private int activeEntraces=0;	//számon tartjuk, hogy hány darab aktív alagút szájunk van
	
	public boolean checkActives()	//ellenorizzuk, hogy kettonel kevesebb bejarat aktiv-e
		{
			if(activeEntraces<2)	
				{
					return true;
				}
			else return false;
		}
	
	public void Addactive(TunnelEntrace te) //az adott tunnelentrace-t aktívvá tesszük, ha nem aktív
		{
			if(checkActives()==true)
				{
					if(te.GetActive()==false)	//aktivitás vizsgálat
						{
							te.activate();
							activeEntraces++;
							if(activeEntraces==2)
								BuildTunnel();
						}
					else Substractactive(te);
				}
			
		}
	
	public void Substractactive(TunnelEntrace te)
		{
			te.deactivate();
			activeEntraces--;
		}
	public void Connect(TunnelEntrace te1, TunnelEntrace te2)
		{
			System.out.print("Kiépül a kapcsolat a "+ te1.GetName()
								+ " és " + te2.GetName()+ " között.");
		}
	
	public void BuildTunnel() //megkeresi a tunnel listában az aktív tunnelentraceket, 
							  //és kiépit köztük egy alagutat
		{
			int i=0,j=i+1; //a listát ezen változók segítségével járjuk be
			while(i <entraces.size())
				{
					if(entraces.get(i).GetActive()==true) //aktív-e?
						break; //elsõ aktív tunnelt megtaláltuk
					else i++;
				}
			
			while(j <entraces.size()) //mivel j=i+1, ezért rögtön 
										//az elsõ aktív utáni tunnelt vizsgálja
				{
					if(entraces.get(j).GetActive()==true)
						break; //második aktív tunnelt megtaláltuk
					else j++;
				}
				Connect(entraces.get(i), entraces.get(j)); //összekapcsolja a két tunnelentrace-t
		}												
	
}

