package practice1;

public class Vacation {

	// The Parent Class
	public int pizzaPrice = 20;
	static String pizzaSize = "Large";
	
	// The Child class
	public static class Food {
		
	int sodaPrice = 2;
	static String sodaBrand = "Coke";

	public static void main(String[] args) {
		
		Food object2 = new Food();
		Vacation object3 = new Vacation();
		
		System.out.println(Food.sodaBrand);
		System.out.println(object2.sodaPrice);
		System.out.println(Vacation.pizzaSize);
		System.out.println(object3.pizzaPrice);
		
	}
}
	
public static void main(String[] args) {
		
		Vacation object1 = new Vacation();
		Food object4 = new Food();
		
		System.out.println(Vacation.pizzaSize);
		System.out.println(object1.pizzaPrice);
		System.out.println(Food.sodaBrand);
		System.out.println(object4.sodaPrice);
		
	}
}
