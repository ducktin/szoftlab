package szoftlab;

public class TrainCart extends Movable{
	public Color cartColor; //A kocsi szine
	private Boolean empty;  //Az ertek, hogy a kocsi ures-e
	private Boolean isFirst = true; //Ezzel menti, hogy az elso nem ures kocsi-e
									//a skeleton miatt rogzitve a true ertek
		
	public TrainCart(Rail currentPlace, Movable nextCart, String name, Color cartColor){
		this.currentPlace = currentPlace;
		this.nextCart = nextCart;
		//this.isFirst = isF;
		this.name=name;
		this.cartColor=cartColor;
		this.empty=false;
		System.out.println(toString()+" letrehozva itt: "+currentPlace.toString());
		if(nextCart!=null){
			System.out.println("Moge kotve: "+nextCart.toString());
		}
	}
	public Color getColor(){
		return cartColor;
	}
	
	@Override
	public String toString() {	//A sajat fv-nye amivel kiir a konzol ablakba
		return "TrainCart: "+"name"+" Currently on: "+currentPlace.toString()
		+" Color: "+cartColor.toString();
	}

	public Boolean isEmpty() {
		return empty;
	}

	public void setEmpty(Boolean empty) {
		this.empty = empty;
	}

	public Boolean getIsFirst() { //Lekerdezheto, hogy ez-e az elso nemures kocsi.
		return isFirst;
	}

	public void setFirst(Boolean isFirst) { //Elso nemures kocsiva allitas
		this.isFirst = isFirst;
	}
	public void empty(){ //Kiuriti a kocsit. Idealis esetben az allomas hivja meg.
		this.setEmpty(true);
		System.out.println("Az alabbi kocsi kiurult: "+this.toString());
	}

	@Override
	public boolean move(Rail tohere) {		//A mozgas fuggvenye a valosaghoz hasonloan passziv. Megkapja az elitte levotol, hogy hova kell mennie.
		System.out.println("Ez a kocsi: "+toString()+"innen: "+currentPlace.toString()+"ide mozgott: "+tohere.toString());
		lastPlace = currentPlace;
		currentPlace=tohere;
		if (nextCart!=null)			//Elhuzza kovetkezo kocsit, ha van ilyen.
			nextCart.move(lastPlace);
		return true;
	}
	

}
