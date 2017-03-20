package szoftlab;

public class Station extends Rail {
  

  private Color color;
  
  public String toString() {	//Ez a Station toString fuggvenye ami a felhasznalo szamara fontos infókat kiirja std kimenetre
		return "Station: " + name;
  }
	
 /* Station konstruktora
  * 
  */
  public Station(String name, Color c){
	  super(name);
	  color = c;
  }
  /* Visszaadja a Station szinet
   *
   */
  public Color getColor(){
	  return color;
  }
  
  /* Kiuriti a parameterkent kapott kocsit
   * 
   */
  public void emptyCart(TrainCart t){
    System.out.println(toString()+" kiirja a " + t.toString()+"kocsit");
    t.empty();
  }
  
  /* Beallitja, hogy ki van rajta,
   * 
   */
  public void setUsedBy(Movable usedby){
		this.usedby=usedby;
    
  }
}
