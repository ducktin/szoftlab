package szoftlab;

import java.awt.Color;

public class TrainCart extends Movable{
	public Color cartColor; //A kocsi sz�ne
	private boolean empty;  //Az �rt�k, hogy a kocsi �res-e
	private boolean isFirst; //Ezzel menti, hogy az els� nem �res kocsi-e
	
	@Override
	public String toString() {	//A saj�t fv-nye amivel ki�r a konzol ablakba
		return "TrainCart: "+"name"+" Currently on: "+currentPlace.toString()
		+" Color: "+cartColor.toString();
	}

	public boolean isEmpty() {
		return empty;
	}

	public void setEmpty(boolean empty) {
		this.empty = empty;
	}

	public boolean isFirst() { //Lek�rdezhet�, hogy ez-e az els� nem�res kocsi.
		return isFirst;
	}

	public void setFirst(boolean isFirst) { //Els� nem�res kocsiv� �ll�t�s
		this.isFirst = isFirst;
	}

}
