package szoftlab;

import java.util.ArrayList;
import java.util.Scanner;

public class Switch extends Rail{
	
	private ArrayList<Rail> additionalNeighbours = new ArrayList<Rail>();

	public Switch(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString(){
		return "Switch "+ name;
		
	}
	
	@Override
	public void setNeighbourTwo(Scanner s1){
		System.out.println("Ki legyen a szomszed?\n");
		for(Rail items : additionalNeighbours){		//Kilistazzuk a lehetseges szomszedokat
			System.out.println(items.toString());
		}	
		String forthis = s1.nextLine();		//Bekerjuk a valsztast	
		for (Rail items : additionalNeighbours){		//Ellenorizzuk, hogy jo volt-e a valasztas
			if(items.name.equals(forthis)){
				neighbour_two = items;		//Ha igen akkor beallitjuk
				return;
			}
		}
		System.out.println("Nincs ilyen szomszedja ennek a valtonak!");
		
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
			System.out.println(item.toString());
		}
		
	}
	
}
