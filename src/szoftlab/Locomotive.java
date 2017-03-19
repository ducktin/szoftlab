package szoftlab;

public class Locomotive extends Movable{
	
	
	public Locomotive(Rail lastPlace, Rail currentPlace, Movable nextCart, String name){
		this.lastPlace=lastPlace;
		this.currentPlace=currentPlace;
		this.nextCart=nextCart;
		this.name=name;
	}
	
	public String toString() {	//Ez a Locomotive toString függvénye ami a felhasználó számára fontos infókat kiírja std kimenetre
		return "Locomotive: "+name+" Currently on: "+currentPlace.toString();
	}

}
