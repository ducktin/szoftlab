package szoftlab;

public class Main {

	public static void main(String[] args) {
		System.out.println("new import");
		System.out.println("teszt");
		System.out.println("teszt2");
		System.out.println("Nagyon team projeccct");
		System.out.println(add(3,4));
		System.out.println(x(2,3));
		System.out.println("Zsenialis");
		System.out.println("Igen, t�nyleg az. �r�l�k hogy v�gre siker�lt."
				+ " Biztosan kell ez a sok felesleges f�ggv�ny?");
	}
	
	static int add(int a, int b){
		return a+b;
	}
	static int x(int a, int b){
		return a*b;
	}
	public int test(int c, int b){
		return c-b;
	}



}
