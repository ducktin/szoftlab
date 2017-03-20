package szoftlab;

import java.util.Scanner;

public class Station extends Rail {
  

  private Color color;
  
  public String toString() {	//Ez a Station toString fuggvenye ami a felhasznalo szamara fontos infÃ³kat kiirja std kimenetre
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
  public void emptyCart(TrainCart t, Scanner s1){
	  System.out.println("emptyCart: Egyezik az állomás és a kocsi színe");
	  String answer=s1.nextLine();
	  if(answer.equals("true"))
	  	{
		  System.out.println(toString()+" kuriti a " + t.toString()+"kocsit");
		    t.empty();
	  	}
    
  }
  
  /* Beallitja, hogy ki van rajta,
   * 
   */
  public void setUsedBy(Movable usedby){
		this.usedby=usedby;
    
  }
}
