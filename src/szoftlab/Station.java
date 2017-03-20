package szoftlab;

public class Station {
  

private Color color;
  private String name;
  private Movable usedby;
  public  Rail r;
  
  public String toString() {	//Ez a Station toString fuggvenye ami a felhasznalo szamara fontos infókat kiirja std kimenetre
		return "Station: " + name;
  }
 
  public Station(String name, Color c,Rail place){
	  
	 
	  color = c;
	  r = place; //helye
	  
	  
  }
  public Color getColor(){
	  return color;
  }
  
  /* kiirja a parameterkent kapott kocsit
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
