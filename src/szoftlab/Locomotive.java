package szoftlab;

public class Locomotive extends Movable{
	
	
	public Locomotive(Rail currentPlace, Movable nextCart, String name){
		this.currentPlace=currentPlace;
		this.nextCart=nextCart;
		this.name=name;
	}
	
	public String toString() {	//Ez a Locomotive toString f�ggv�nye ami a felhaszn�l� sz�m�ra fontos inf�kat ki�rja std kimenetre
		return "Locomotive: "+name;
	}

	@Override	//M�g meg kell �rni ,hogy be�ll�tsa a s�n usedby-j�t
	public boolean move(Rail tohere) {
		// currentPlace = currentPlace.whosNext(lastPlace);	//�tveszi hova kell mennie �s elmenti honnan j�tt, majd a szkeleton ut�n
		lastPlace = this.currentPlace;
		currentPlace = tohere;
		
		System.out.println(this.toString()+" Atmozgott innen: "+lastPlace.toString()+" ide: "+currentPlace.toString() );	//Ezt ki is �rjuk
		if (nextCart!=null){			//Ha van r�k�tve kocsink akkor azt is "h�zzuk"
			nextCart.move(lastPlace);
		}
		return true;
	}

}
