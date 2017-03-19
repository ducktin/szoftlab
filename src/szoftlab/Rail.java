package szoftlab;

public class Rail {		//A sín osztály, a többi pályaelem is ebből származik.
	protected Rail neighbour_one;
	protected Rail neighbour_two;
	public String name;
	protected Movable usedby;
	
	public Rail(String name){
		this.name=name;
	}
	
	public Rail whosNext(Rail lastplace){ //Ezzel keri a mozdony, hogy melyik sinre kell mennie
		if (lastplace==neighbour_one){
		return neighbour_two;}		//Attol fuggoen, hogy honnan jottunk adja vissza
		return neighbour_one;		//az egyik szomszedot.
	}
	
	public String toString(){ //Saját toString fv.
		return "Rail "+name;
	}
	
	public Movable amIUsed(){ //Megkérdezzük, hogy ki használja
		return usedby;
	}
	
	public void setUsedBy(Movable usedby){ //Beallitjuk, hogy ki hasznalja a sint
		this.usedby=usedby;
	}
	
	public void connect(Rail one, Rail two){
		this.neighbour_one=one;
		this.neighbour_two=two;
	}
	
}
