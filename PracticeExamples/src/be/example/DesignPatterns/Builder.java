package DesignPatterns;

public class Builder {

	public static void main(String[] args) {
		
		CivilEngineer ce= new CivilEngineer(new WoodHouseBuilder());
		System.out.println(ce.getHouse());
		ce.constructHouse();
		System.out.println(ce.getHouse());
	}

}

class CivilEngineer{
	private HouseBuilder houseBuilder;
	
	public CivilEngineer(HouseBuilder hb) {
		this.houseBuilder=hb;
	}
	public House getHouse() {
		return this.houseBuilder.getHouse();
	}
	public void constructHouse() {
		
		this.houseBuilder.buildBasement();
		this.houseBuilder.buildInterior();
		this.houseBuilder.buildRoof();
		this.houseBuilder.buildStructure();
	}
	
}

interface HousePlan{
	public void setBasement(String basement); 
	public void setRoof(String roof);
	public void setStructure(String structure);
	public void setInterior(String interior);
	
}

class House implements HousePlan{
	
	private String basement;
	private String roof;
	private String structure;
	private String interior;

	@Override
	public void setBasement(String basement) {
		this.basement=basement;
		
	}

	@Override
	public void setRoof(String roof) {
		this.roof=roof;
		
	}

	

	@Override
	public void setStructure(String structure) {
		this.structure=structure;
		
	}

	@Override
	public void setInterior(String interior) {
		this.interior=interior;
		
	}
	@Override
	public String toString() {
		return "House [basement=" + basement + ", roof=" + roof + ", structure=" + structure + ", interior=" + interior
				+ "]";
	}
	
}

interface HouseBuilder{
	public void buildBasement(); 
	public void buildRoof();
	public void buildStructure();
	public void buildInterior();
	public House getHouse();
}

class IglooHouseBuilder implements HouseBuilder{
	private House house;
	
	public IglooHouseBuilder(){
		this.house=new House();
	}
	@Override
	public void buildBasement() {
		this.house.setBasement("Ice Basement");
		
	}

	@Override
	public void buildRoof() {
		this.house.setRoof("Ice roof");
		
	}

	@Override
	public void buildStructure() {
		this.house.setStructure("Ice Structure");
		
	}

	@Override
	public void buildInterior() {
		this.house.setInterior("Ice interior");
		
	}

	@Override
	public House getHouse() {
		// TODO Auto-generated method stub
		return this.house;
	}
	
}

class WoodHouseBuilder implements HouseBuilder{
	private House house;
	
	public WoodHouseBuilder(){
		this.house=new House();
	}
	@Override
	public void buildBasement() {
		this.house.setBasement("Wood Basement");
		
	}

	@Override
	public void buildRoof() {
		this.house.setRoof("Wood roof");
		
	}

	@Override
	public void buildStructure() {
		this.house.setStructure("Wood Structure");
		
	}

	@Override
	public void buildInterior() {
		this.house.setInterior("Wood interior");
		
	}

	@Override
	public House getHouse() {
		// TODO Auto-generated method stub
		return this.house;
	}
	
}
