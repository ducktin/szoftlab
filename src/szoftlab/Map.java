package szoftlab;

import java.util.ArrayList;

public class Map {
	ArrayList<Locomotive> locomotives;
	ArrayList<Rail> rails;
	TunnelManager tunnelman;
	
	public void createTrain(EntryPoint e, Color c){
		System.out.println("createTrain() l�trej�tt a vonat az e bel�p�pontn�l");
	}
}
