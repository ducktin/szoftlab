package szoftlab;

public class Main {

	public static void main(String[] args) {
		
		Map map = new Map();
		Rail r1 = new Rail("r1");
		Rail r2 = new Rail("r2");
		Locomotive l1 = new Locomotive(r1, null, "l1");
		map.rails.add(r1);
		map.rails.add(r2);
		map.locomotives.add(l1);
		SkeletonMethods.TrainMover(map);
		
	}



}
