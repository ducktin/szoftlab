package szoftlab;

import java.util.Scanner;

public class SkeletonMethods {
		
	public void TrainMover(){
		System.out.println("Ki mozogjon? Kerem a nevet:");
		Scanner s = new Scanner(System.in);
		String tomove = s.nextLine(); // Itt kell megnézni, hogy van-e ilyen vonatunk.
		s.close();
		
		
		System.out.println(tomove);
		
	}
}
