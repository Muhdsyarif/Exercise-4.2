
public class Fruits {
	
	String name, colour, taste;
	
	public Fruits(String name) {
		this.name = name;
	    System.out.println("Fruit constructor is invoked");
	  }
}


class Apple extends Fruits{
	
	public Apple(String name, String colour, String taste) {
		
		super(name);
		this.colour = colour;
		this.taste = taste;
		
		
		
	}
}


class Banana extends Fruits{
	
	public Banana(String name, String colour, String taste) {
		
		super(name);
		this.colour = colour;
		this.taste = taste;
		
		//System.out.println(this.name + " constructor is invoked");
		//System.out.println(this.colour);
		//System.out.println(this.taste);
		
	}
}


class Orange extends Fruits{
	
	public Orange(String name, String colour, String taste) {
		
		super(name);
		this.colour = colour;
		this.taste = taste;
		
		//System.out.println(this.name + " constructor is invoked");
		//System.out.println(this.colour);
		//System.out.println(this.taste);
		
	}
}


class Watermelon extends Fruits{
	
	public Watermelon(String name, String colour, String taste) {
		
		super(name);
		this.colour = colour;
		this.taste = taste;
		
		//System.out.println(this.name + "constructor is invoked");
		//System.out.println(this.colour);
		//System.out.println(this.taste);
		
	}
}


class Mango extends Fruits{
	
	public Mango(String name, String colour, String taste) {
		
		super(name);
		this.colour = colour;
		this.taste = taste;;
		
		//System.out.println(this.name + "constructor is invoked");
		//System.out.println(this.colour);
		//System.out.println(this.taste);
		
	}
}


class Main {
	
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
	}
}







