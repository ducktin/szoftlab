package szoftlab;

import java.util.ArrayList;

public class Map {
	ArrayList<Locomotive> locomotives = new ArrayList<Locomotive>();
	ArrayList<Rail> rails = new ArrayList<Rail>();
	ArrayList<TrainCart> traincarts = new ArrayList<TrainCart>();
	ArrayList<Station> stats = new ArrayList<Station>();
	TunnelManager tunnelman;
	
	public void createTrain(EntryPoint e, Color c){
		System.out.println("createTrain() l�trej�tt a vonat az e bel�p�pontn�l");
	}
}
