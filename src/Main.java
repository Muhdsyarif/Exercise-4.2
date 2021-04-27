
public class Main{

	public static void main(String[] args) {
		Apple a = new Apple("Apple", "Red", "Sour");
		System.out.println("Fruits name: " + a.name);
		System.out.println("Colour: " + a.colour);
		System.out.println("Taste: " + a.taste);
		System.out.println();
		
		Banana b = new Banana("Banana", "Yellow", "Sweet");
		System.out.println("Fruits name: " + b.name);
		System.out.println("Colour: " + b.colour);
		System.out.println("Taste: " + b.taste);
		System.out.println();
		
		Orange o = new Orange("Mandarin Orange", "Yellow-Orange", "Less sour and sweeter");
		System.out.println("Fruits name: " + o.name);
		System.out.println("Colour: " + o.colour);
		System.out.println("Taste: " + o.taste);
		System.out.println();
		
		Watermelon w = new Watermelon("Watermelon", "Green", "Sweet");
		System.out.println("Fruits name: " + w.name);
		System.out.println("Colour: " + w.colour);
		System.out.println("Taste: " + w.taste);
		System.out.println();
		
		Mango m = new Mango("Mango", "Yellow", "Sweet");
		System.out.println("Fruits name: " + m.name);
		System.out.println("Colour: " + m.colour);
		System.out.println("Taste: " + m.taste);
		System.out.println();
	}
}
