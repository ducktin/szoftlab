package szoftlab;

public class Locomotive extends Movable{
	
	
	public Locomotive(Rail currentPlace, Movable nextCart, String name){
		this.currentPlace=currentPlace;
		this.nextCart=nextCart;
		this.name=name;
		System.out.println(toString()+" letrehozva itt: "+currentPlace.toString());
	}
	
	public String toString() {	//Ez a Locomotive toString fuggvenye ami a felhasznalo szamara fontos infokat kiirja a std kimenetre
		return "Locomotive: "+name;
	}

	@Override	//Meg meg kell irni ,hogy beallitsa a san usedby-jat
	public boolean move(Rail tohere) {
		// currentPlace = currentPlace.whosNext(lastPlace);	//Átveszi hova kell mennie és elmenti honnan jött, majd a szkeleton után
		lastPlace = this.currentPlace;
		currentPlace = tohere;
		
		System.out.println(this.toString()+" Atmozgott innen: "+lastPlace.toString()+" ide: "+currentPlace.toString() );	//Ezt ki is írjuk
		if (nextCart!=null){			//Ha van rakötve kocsink akkor azt is "huzzuk"
			nextCart.move(lastPlace);
		}
		return true;
	}

}
