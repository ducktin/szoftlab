package szoftlab;

public class Locomotive extends Movable{
	
	
	public Locomotive(Rail lastPlace, Rail currentPlace, Movable nextCart, String name){
		this.lastPlace=lastPlace;
		this.currentPlace=currentPlace;
		this.nextCart=nextCart;
		this.name=name;
	}
	
	public String toString() {	//Ez a Locomotive toString f�ggv�nye ami a felhaszn�l� sz�m�ra fontos inf�kat ki�rja std kimenetre
		return "Locomotive: "+name+" Currently on: "+currentPlace.toString();
	}

}
