package szoftlab;

public class Station {
  private Color color;
  
  public String toString() {	//Ez a Station toString függvénye ami a felhasználó számára fontos infókat kiírja std kimenetre
		return "Station: " + name;
  }
  
  public Station(){}
  
  /* Kiüríti a paraméterként kapott kocsit
   * 
   */
  public void emptyCart(TrainCart t){
    System.out.println(toString()+" kiüríti a " t.toString()+"kocsit");
    t.empty();
  }
  
  /* Beállítja, hogy ki van rajta,
   * Lekérdezi a színét, majd ha jó akkor kiüríti
   */
  public void setUsedBy(Movable usedby){
		this.usedby=usedby;
    
  }
}
