package szoftlab;

public class EntryPoint extends Rail {
  
  public String toString() {	//Ez a EntryPoint toString fuggvenye ami a felhasznalo szamara fontos infokat kiirja std kimenetre
		return "EntryPoint: " + name;
  }
 
  /* EntryPoint konstruktora
   *
   */
  public EntryPoint(String name){
	  super(name);
    neighbour_two = null;
  }
  /* Keszit egy vonatot makjd elhelyezi a Locomotive-ot sajat magan
   *
   */
  public void createTrain(){
    System.out.println(toString()+" letrehozott egy vonatot ";
  }
  
  /* Beallitja, hogy ki van rajta
   * 
   */
  public void setUsedBy(Movable usedby){
		this.usedby=usedby;
    
  /* Osszekoti az EntryPointot a megadott Rail-el
   * Neki a Rail-lel ellentétben csak egy szomszeda lesz
   */
  }
  public void connect(Rail r){
		this.neighbour_one=r;
		System.out.println(toString()+" szomszeda mostantol: "+r.toString();
  }
}
