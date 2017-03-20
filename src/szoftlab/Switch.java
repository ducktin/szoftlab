package szoftlab;

import java.util.ArrayList;
import java.util.Scanner;

public class Switch extends Rail{
	
	private ArrayList<Rail> additionalNeighbours = new ArrayList<Rail>();

	public Switch(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public String toString(){
		return "Switch "+ name;
		
	}
	
	public void setNeighbourTwo(){
		System.out.println("Ki legyen a szomszed?\n");
		for(Rail items : additionalNeighbours){		//Kilistazzuk a lehetseges szomszedokat
			System.out.println(items.toString()+"\n");
		}
		Scanner s1 = new Scanner(System.in);	//Bekerjuk a valsztast
		String forthis = s1.nextLine();			
		for (Rail items : additionalNeighbours){		//Ellenorizzuk, hogy jo volt-e a valasztas
			if(items.name.equals(forthis)){
				neighbour_two = items;		//Ha igen akkor beallitjuk
			}
		}
		System.out.println("Nincs ilyen szomszedja ennek a valtonak!");
		s1.close();
		
	}
	
	public void addNeighbour(Rail r){
		additionalNeighbours.add(r);
	}
	
	@Override
	public void connect(Rail r1, Rail r2){
		neighbour_one=r1;
		neighbour_two=r2;
		System.out.println("A valto ide van kotve: "+r1.toString()+" default allasa: "+r2.toString()+" Lehetseges allasai: ");
		for(Rail item : additionalNeighbours){
			System.out.println(item.toString()+"\n");
		}
		
	}
	
}
