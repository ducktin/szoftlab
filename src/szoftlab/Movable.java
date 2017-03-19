package szoftlab;

public abstract class Movable {		//A Locomotive és a TrainCart õsosztálya
	protected Rail lastPlace;		//Tárolja melyik helyen jártunk utoljára
	protected Rail currentPlace;	//Illetve azt is, hogy most hol van
	protected Movable nextCart;		//Az elsõ kocsi referenciája ami utána jön
	protected String name;			//Az objektum neve, ez a Szkeletonhoz fontos
	
	public Movable getNextCart() {
		return nextCart;
	}
	public void setNextCart(Movable nextCart) {
		this.nextCart = nextCart;
	}
	public Rail getCurrentPlace() {
		return currentPlace;
	}
	public void setCurrentPlace(Rail currentPlace) {
		this.currentPlace = currentPlace;
	}
	public Rail getLastPlace() {
		return lastPlace;
	}
	public void setLastPlace(Rail lastPlace) {
		this.lastPlace = lastPlace;
	}
	public abstract boolean move(Rail tohere);		//Ez a mozgás függvény, majd felül kell írni.
		
	public abstract String toString();
	
}
