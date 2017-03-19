package szoftlab;

import java.util.ArrayList;

public class TunnelManager {
		
	private ArrayList<TunnelEntrace> entraces; //tunnel lista
	private int activeEntraces=0;	//sz�mon tartjuk, hogy h�ny darab akt�v alag�t sz�junk van
	
	public boolean checkActives()	//ellenorizzuk, hogy kettonel kevesebb bejarat aktiv-e
		{
			if(activeEntraces<2)	
				{
					return true;
				}
			else return false;
		}
	
	public void Addactive(TunnelEntrace te) //az adott tunnelentrace-t akt�vv� tessz�k, ha nem akt�v
		{
			if(checkActives()==true)
				{
					if(te.GetActive()==false)	//aktivit�s vizsg�lat
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
			System.out.print("Ki�p�l a kapcsolat a "+ te1.GetName()
								+ " �s " + te2.GetName()+ " k�z�tt.");
		}
	
	public void BuildTunnel() //megkeresi a tunnel list�ban az akt�v tunnelentraceket, 
							  //�s ki�pit k�zt�k egy alagutat
		{
			int i=0,j=i+1; //a list�t ezen v�ltoz�k seg�ts�g�vel j�rjuk be
			while(i <entraces.size())
				{
					if(entraces.get(i).GetActive()==true) //akt�v-e?
						break; //els� akt�v tunnelt megtal�ltuk
					else i++;
				}
			
			while(j <entraces.size()) //mivel j=i+1, ez�rt r�gt�n 
										//az els� akt�v ut�ni tunnelt vizsg�lja
				{
					if(entraces.get(j).GetActive()==true)
						break; //m�sodik akt�v tunnelt megtal�ltuk
					else j++;
				}
				Connect(entraces.get(i), entraces.get(j)); //�sszekapcsolja a k�t tunnelentrace-t
		}												
	
}

