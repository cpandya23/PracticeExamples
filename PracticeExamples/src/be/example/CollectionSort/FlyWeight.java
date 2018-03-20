package CollectionSort;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class FlyWeight {
	 private static String[] playerType =
         {"Terrorist", "CounterTerrorist"};
private static String[] weapons =
{"AK-47", "Maverick", "Gut Knife", "Desert Eagle"};
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			Player p=PlayerFactory.getPlayer(getRandomPlayer());
			p.assignWeapon(getRandomWeapon());
			p.mission();
		}
	}
	
	public static String getRandomPlayer() {
		Random r= new Random();
		return playerType[r.nextInt(playerType.length)];
		
		
	}
	public static String getRandomWeapon() {
		Random r= new Random();
		return weapons[r.nextInt(weapons.length)];
		
		
	}

}

interface Player{
	public void assignWeapon(String x);
	public void mission();
}

class CounterTerrorist implements Player{
	private final String TASK;
	private String weapon;
	
	public CounterTerrorist() {
		TASK="DEFUSE";
	}
	@Override
	public void assignWeapon(String x) {
		this.weapon=x;
		
	}

	@Override
	public void mission() {
		System.out.println("CounterTerrorist with weapon->"+this.weapon+" assigned "
				+ "task->"+TASK);
		
	}
	
}


class Terrorist implements Player{
	private final String TASK;
	private String weapon;
	
	public Terrorist() {
		TASK="PLANT";
	}
	@Override
	public void assignWeapon(String x) {
		this.weapon=x;
		
	}

	@Override
	public void mission() {
		System.out.println("Terrorist with weapon->"+this.weapon+" assigned "
				+ "task->"+TASK);
		
	}
	
}

class PlayerFactory{
	private static Map<String,Player> playerMap= new HashMap<>();
	private static Player p;
	static Player getPlayer(String x) {
		if(playerMap.get(x)!=null) {
			p= playerMap.get(x);
			return p;
		}
		else {
			if(x.equals("CounterTerrorist")) {
				p=new CounterTerrorist();
			}
			else if(x.equals("Terrorist")) {
				p=new Terrorist();
			}
			
			else {
				p=null;
			}
			return p;
		}
		
	}
}
