package szoftlab;

public class Rail {		//A s�n oszt�ly, a t�bbi p�lyaelem is ebb�l sz�rmazik.
	protected Rail neighbour_one;
	protected Rail neighbour_two;
	public String name;
	protected Rail usedby;
	
	public Rail whosNext(Rail lastplace){ //Ezzel k�ri a mozdony, hogy melyik s�nre kell mennie
		if (lastplace==neighbour_one){
		return neighbour_two;}		//Att�l f�gg�en honnan j�tt�nk adja vissza
		return neighbour_one;		//az egyik szomsz�dot.
	}
	
	public String toString(){ //Saj�t toString fv.
		return "Rail "+name;
	}
	
	public Rail amIUsed(){ //Megk�rdezz�k, hogy haszn�latban van-e
		return usedby;
	}
	
	public void setUsedBy(Rail usedby){ //Be�ll�tjuk, hogy haszn�lva van-e a s�n
		this.usedby=usedby;
	}
	
	public void connect(Rail one, Rail two){
		this.neighbour_one=one;
		this.neighbour_two=two;
	}
	
}
