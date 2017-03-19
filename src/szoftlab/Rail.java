package szoftlab;

public class Rail {		//A sín osztály, a többi pályaelem is ebbõl származik.
	protected Rail neighbour_one;
	protected Rail neighbour_two;
	public String name;
	protected Rail usedby;
	
	public Rail whosNext(Rail lastplace){ //Ezzel kéri a mozdony, hogy melyik sínre kell mennie
		if (lastplace==neighbour_one){
		return neighbour_two;}		//Attól függõen honnan jöttünk adja vissza
		return neighbour_one;		//az egyik szomszédot.
	}
	
	public String toString(){ //Saját toString fv.
		return "Rail "+name;
	}
	
	public Rail amIUsed(){ //Megkérdezzük, hogy használatban van-e
		return usedby;
	}
	
	public void setUsedBy(Rail usedby){ //Beállítjuk, hogy használva van-e a sín
		this.usedby=usedby;
	}
	
	public void connect(Rail one, Rail two){
		this.neighbour_one=one;
		this.neighbour_two=two;
	}
	
}
