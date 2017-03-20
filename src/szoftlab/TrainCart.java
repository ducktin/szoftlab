package szoftlab;

public class TrainCart extends Movable{
	public Color cartColor; //A kocsi színe
	private Boolean empty;  //Az érték, hogy a kocsi üres-e
	private Boolean isFirst; //Ezzel menti, hogy az elsõ nem üres kocsi-e
	
	public TrainCart(Rail currentPlace, Movable nextCart, String name, Color cartColor){
		this.currentPlace = currentPlace;
		this.nextCart = nextCart;
		//this.isFirst = isF;
		this.name=name;
		this.cartColor=cartColor;
		this.empty=false;
	}
	public Color getColor(){
		return cartColor;
	}
	@Override
	public String toString() {	//A saját fv-nye amivel kiír a konzol ablakba
		return "TrainCart: "+name+" Currently on: "+currentPlace.toString()
		+" Color: "+cartColor.toString();
	}

	public Boolean isEmpty() {
		return empty;
	}

	public void setEmpty(Boolean empty) {
		this.empty = empty;
	}

	public Boolean getIsFirst() { //Lekérdezhetõ, hogy ez-e az elsõ nemüres kocsi.
		return isFirst;
	}

	public void setFirst(Boolean isFirst) { //Elsõ nemüres kocsivá állítás
		this.isFirst = isFirst;
	}
	public void empty(){ //Kiüríti a kocsit. Ideális esetben az állomás hívja meg.
		this.setEmpty(true);
		System.out.println("Az alábbi kocsi kiürült: "+this.toString());
	}

	@Override
	public boolean move(Rail tohere) {		//A mozgás függvénye a valósághoz hasonlóan passzív. Megkapja az elõtte lévõtõl, hogy hova kell mennie.
		System.out.println("Ez a kocsi: "+toString()+"innen: "+currentPlace.toString()+"ide mozgott: "+tohere.toString());
		lastPlace = currentPlace;
		currentPlace=tohere;
		if (nextCart!=null)			//Elhúzza következõ kocsit, ha van ilyen.
			nextCart.move(lastPlace);
		return true;
	}
	

}
