package szoftlab;

public class Locomotive extends Movable{
	
	
	public Locomotive(Rail currentPlace, Movable nextCart, String name){
		this.currentPlace=currentPlace;
		this.nextCart=nextCart;
		this.name=name;
		System.out.println(toString()+" letrehozva itt: "+currentPlace.toString());
		if(nextCart!=null){
			System.out.println("Moge kotve: "+nextCart.toString());
		}
	}
	
	public String toString() {	//Ez a Locomotive toString fuggvenye ami a felhasznalo szamara fontos infokat kiirja a std kimenetre
		return "Locomotive: "+name;
	}

	@Override	//Meg meg kell irni ,hogy beallitsa a san usedby-jat
	public boolean move(Rail tohere) {
		// currentPlace = currentPlace.whosNext(lastPlace);	//atveszi hova kell mennie es elmenti honnan jott, majd a szkeleton utan
		lastPlace = this.currentPlace;
		currentPlace = tohere;
		
		System.out.println(this.toString()+" Atmozgott innen: "+lastPlace.toString()+" ide: "+currentPlace.toString() );	//Ezt ki is irjuk
		if (nextCart!=null){		//Ha van rakotve kocsink akkor azt is "huzzuk"
			
			nextCart.move(lastPlace);
			
		}
		return true;
	}

}
