package szoftlab;

public class Locomotive extends Movable{
	
	
	public Locomotive(Rail lastPlace, Rail currentPlace, Movable nextCart, String name){
		this.lastPlace=lastPlace;
		this.currentPlace=currentPlace;
		this.nextCart=nextCart;
		this.name=name;
	}
	
	public String toString() {	//Ez a Locomotive toString függvénye ami a felhasználó számára fontos infókat kiírja std kimenetre
		return "Locomotive: "+name;
	}

	@Override	//Még meg kell írni ,hogy beállítsa a sín usedby-ját
	public boolean move(Rail tohere) {
		Rail templastplace = this.currentPlace;		
		// currentPlace = currentPlace.whosNext(lastPlace);	//Átveszi hova kell mennie és elmenti honnan jött, majd a szkeleton után
		currentPlace = tohere;
		lastPlace = templastplace;
		System.out.println(this.toString()+" Atmozgott innen: "+lastPlace.toString()+" ide: "+currentPlace.toString() );	//Ezt ki is írjuk
		if (nextCart!=null){			//Ha van rákötve kocsink akkor azt is "húzzuk"
			nextCart.move(lastPlace);
		}
		return true;
	}

}
