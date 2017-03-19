package szoftlab;

public abstract class Movable {
	private Rail lastPlace;
	private Rail currentPlace;
	private Movable nextCart;
	private String name;
	
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
	public Rail move(Rail lastPlace){
		
		//toDo
		return lastPlace;
		
	}
	public abstract String toString();
	
}
