package szoftlab;

import java.awt.Color;

public class TrainCart extends Movable{
	public Color cartColor; //A kocsi sz�ne
	private Boolean empty;  //Az �rt�k, hogy a kocsi �res-e
	private Boolean isFirst; //Ezzel menti, hogy az els� nem �res kocsi-e
	
	public TrainCart(String name, Color cartColor){
		this.name=name;
		this.cartColor=cartColor;
		this.empty=false;
	}
	
	@Override
	public String toString() {	//A saj�t fv-nye amivel ki�r a konzol ablakba
		return "TrainCart: "+"name"+" Currently on: "+currentPlace.toString()
		+" Color: "+cartColor.toString();
	}

	public Boolean isEmpty() {
		return empty;
	}

	public void setEmpty(Boolean empty) {
		this.empty = empty;
	}

	public Boolean getIsFirst() { //Lek�rdezhet�, hogy ez-e az els� nem�res kocsi.
		return isFirst;
	}

	public void setFirst(Boolean isFirst) { //Els� nem�res kocsiv� �ll�t�s
		this.isFirst = isFirst;
	}
	public void empty(){ //Ki�r�ti a kocsit. Ide�lis esetben az �llom�s h�vja meg.
		this.setEmpty(true);
		System.out.println("Az al�bbi kocsi ki�r�lt: "+this.toString());
	}

	@Override
	public boolean move(Rail tohere) {		//A mozg�s f�ggv�nye a val�s�ghoz hasonl�an passz�v. Megkapja az el�tte l�v�t�l, hogy hova kell mennie.
		System.out.println("Ez a kocsi: "+toString()+"innen: "+currentPlace.toString()+"ide mozgott: "+tohere.toString());
		lastPlace = currentPlace;
		currentPlace=tohere;
		if (nextCart!=null)			//Elh�zza k�vetkez� kocsit, ha van ilyen.
			nextCart.move(lastPlace);
		return true;
	}
	

}
