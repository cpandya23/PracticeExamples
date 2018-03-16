package CollectionSort;

import java.util.ArrayList;
import java.util.List;

public class Prototype {
	public static void main(String[] args) throws CloneNotSupportedException {
		EmployeePrototype emp1= new EmployeePrototype();
		emp1.addData();
		EmployeePrototype emp2= (EmployeePrototype) emp1.clone();
		emp2.getData().remove(1);
		EmployeePrototype emp3= (EmployeePrototype) emp1.clone();
		emp3.addData();
		
		System.out.println(emp1.getData());
		System.out.println(emp2.getData());
		System.out.println(emp3.getData());
	}
}

class EmployeePrototype implements Cloneable {
	List<String> list;

	EmployeePrototype() {

	}

	EmployeePrototype(List<String> list) {
		this.list = list;
	}

	public void addData() {
		if(list==null) {
			list= new ArrayList<>();
		}
		list.add("ABC");
		list.add("PQR");
		list.add("XYZ");
	}

	public List<String> getData() {
		return this.list;
	}
	@Override
	public Object clone() throws CloneNotSupportedException{
		List<String> templist = new ArrayList<>();

		for (String x : getData()) {
			templist.add(x);
		}

		return new EmployeePrototype(templist);
	}

}
