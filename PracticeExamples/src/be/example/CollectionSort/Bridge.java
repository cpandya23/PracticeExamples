package CollectionSort;

public class Bridge {

public static void main(String[] args) {
	Vehicle c= new Car(new Producer(),new Assembler());	
	c.manufacture();
	
	Vehicle b= new Bike(new Producer(),new Assembler());
	b.manufacture();
}
}

interface Workstation{
	public void doWork();
	
}

class Producer implements Workstation{

	@Override
	public void doWork() {
		System.out.println("Produced");
		
	}
	
}
class Assembler implements Workstation{

	@Override
	public void doWork() {
		System.out.println("Assembled");
		
	}
	
}
abstract class Vehicle{
	Workstation ws1;
	Workstation ws2;
	Vehicle(Workstation input1,Workstation input2){
		this.ws1=input1;
		this.ws2=input2;
	}
	
	abstract void manufacture();
}

class Car extends Vehicle{

	Workstation ws1;
	Workstation ws2;
	Car(Workstation input1, Workstation input2) {
		super(input1, input2);
		this.ws1=input1;
		this.ws2=input2;
	}

	@Override
	void manufacture() {
		ws1.doWork();
		ws2.doWork();
		System.out.println("Car Manufactored");
		
	}
	
}

class Bike extends Vehicle{

	Workstation ws1;
	Workstation ws2;
	Bike(Workstation input1, Workstation input2) {
		super(input1, input2);
		this.ws1=input1;
		this.ws2=input2;
	}

	@Override
	void manufacture() {
		ws1.doWork();
		ws2.doWork();
		System.out.println("Bike Manufactored");
		
	}
	
}