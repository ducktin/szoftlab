package szoftlab;

public abstract class Movable {		//A Locomotive �s a TrainCart �szoszt�lya
	protected Rail lastPlace;		//T�rolja melyik helyen j�rtunk utolj�ra
	protected Rail currentPlace;	//Illetve azt is, hogy most hol van
	protected Movable nextCart;		//Az els� kocsi referenci�ja ami ut�na j�n
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
	public Rail move(Rail lastPlace){		//Ez a mozg�s f�ggv�ny.
		
		//toDo
		return lastPlace;
		
	}
	public abstract String toString();
	
}