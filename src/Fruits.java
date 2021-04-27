
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
			
	}
}

class Orange extends Fruits{
	
	public Orange(String name, String colour, String taste) {
		
		super(name);
		this.colour = colour;
		this.taste = taste;
	
	}
}

class Watermelon extends Fruits{
	
	public Watermelon(String name, String colour, String taste) {
		
		super(name);
		this.colour = colour;
		this.taste = taste;
			
	}
}


class Mango extends Fruits{
	
	public Mango(String name, String colour, String taste) {
		
		super(name);
		this.colour = colour;
		this.taste = taste;;
			
	}
}










