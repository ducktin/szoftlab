package szoftlab;

import java.util.Scanner;

public class SkeletonMethods {
		
	public static void TrainMover(){
		System.out.println("Ki mozogjon? Kerem a nevet:");
		Scanner s1 = new Scanner(System.in);
		String tomove = s1.nextLine(); // Itt kell megn�zni, hogy van-e ilyen vonatunk.
		System.out.println(tomove);
		
		System.out.println("Hova mozogjon? Kerem a nevet:");
		String tohere = s1.nextLine(); // Itt kell megn�zni, hogy van-e ilyen hely ahova mehet�nk.
		s1.close();
		System.out.println(tohere);
		
	}
}
