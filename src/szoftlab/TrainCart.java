package szoftlab;

import java.awt.Color;

public class TrainCart extends Movable{
	public Color cartColor; //A kocsi színe
	private boolean empty;  //Az érték, hogy a kocsi üres-e
	private boolean isFirst; //Ezzel menti, hogy az elsõ nem üres kocsi-e
	
	@Override
	public String toString() {	//A saját fv-nye amivel kiír a konzol ablakba
		return "TrainCart: "+"name"+" Currently on: "+currentPlace.toString()
		+" Color: "+cartColor.toString();
	}

	public boolean isEmpty() {
		return empty;
	}

	public void setEmpty(boolean empty) {
		this.empty = empty;
	}

	public boolean isFirst() { //Lekérdezhetõ, hogy ez-e az elsõ nemüres kocsi.
		return isFirst;
	}

	public void setFirst(boolean isFirst) { //Elsõ nemüres kocsivá állítás
		this.isFirst = isFirst;
	}

}
