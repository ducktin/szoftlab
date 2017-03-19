package szoftlab;

public abstract class Movable {		//A Locomotive és a TrainCart ososztalya
	protected Rail lastPlace;		//Tarolja melyik helyen jartunk utoljara
	protected Rail currentPlace;	//Illetve azt is, hogy most hol van
	protected Movable nextCart;		//Az elso kocsi referenciaja ami utana jon
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
	public abstract boolean move(Rail tohere);		//Ez a mozgas fuggveny, majd felul kell irni.
		
	public abstract String toString();
	
}
