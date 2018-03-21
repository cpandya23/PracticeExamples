package CollectionSort;

public class Decorator {
	public static void main(String[] args) {
			Pizza p1= new PizzaMargheritta();
			p1= new Jalepeno(p1);
			p1= new Tomato(p1);
			System.out.println(p1.getDescription());
			System.out.println(p1.getCost());
	}
}

abstract class Pizza{
	String name;
	public String description="Normal Pizza ";;
	
	public String getDescription() {
		
		return this.description;
	}
	
	public abstract int getCost();
	
	
}

class PizzaPaneer extends Pizza{
	String name;
	PizzaPaneer(){
		this.description="Panner ";
	}
	public int getCost() {
		return 100;
	}
}

class PizzaMargheritta extends Pizza{
	String name;
	PizzaMargheritta(){
		this.description="Margheritta ";
	}
	public int getCost() {
		return 100;
	}
}

abstract class PizzaDecorator extends Pizza{
	public abstract String getDescription();
	
}

class Jalepeno extends PizzaDecorator{
	Pizza p;
	Jalepeno(Pizza in){
		this.p=in;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.p.getDescription()+"with Jalepeno ";
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return this.p.getCost()+20;
	}
	
}

class Tomato extends PizzaDecorator{
	Pizza p;
	Tomato(Pizza in){
		this.p=in;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.p.getDescription()+"with Tomato";
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return this.p.getCost()+30;
	}
	
}