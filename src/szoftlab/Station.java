package szoftlab;

public class Station extends Rail {
  

  private Color color;
  private Movable usedby;
  public  Rail r;
  
  public String toString() {	//Ez a Station toString fuggvenye ami a felhasznalo szamara fontos infókat kiirja std kimenetre
		return "Station: " + name;
  }
 
  public Station(String name, Color c,Rail place){
	  super(name);
	  color = c;
	  r = place; //helye
	  
	  
  }
  public Color getColor(){
	  return color;
  }
  
  /* kiüriti a parameterkent kapott kocsit
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
