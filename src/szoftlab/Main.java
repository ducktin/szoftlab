package szoftlab;

public class Main {

	public static void main(String[] args) {
		System.out.println("teszt");
		System.out.println("teszt2");
		
		System.out.println(add(3,4));
		System.out.println(x(2,3));
	}
	
	static int add(int a, int b){
		return a+b;
	}
	static int x(int a, int b){
		return a*b;
	}

}