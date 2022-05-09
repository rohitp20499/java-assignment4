package assignment4java.sol;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;

class Cities {
	private String name;

	public Cities(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Cities [name=" + name + "]";
	}

}

public class Q4AnsSol {

	public static void main(String[] args) {

//		#4. Create a Nested Collection, in a HashMap, Key is String which is state name, and value is LinkedList 
//		of City names in that specific state. Iterate thru and display each State with various Cities in that State. 

		HashMap<String, LinkedList<Cities>> hMap = new HashMap<String, LinkedList<Cities>>();

		LinkedList<Cities> ll1 = new LinkedList<Cities>();
		ll1.add(new Cities("Bhopal"));
		ll1.add(new Cities("Indore"));
		ll1.add(new Cities("Jabalpur"));
		ll1.add(new Cities("Satna"));

		LinkedList<Cities> ll2 = new LinkedList<Cities>();
		ll2.add(new Cities("Jagdalpur"));
		ll2.add(new Cities("Raipur"));
		ll2.add(new Cities("Bhilai"));
		ll2.add(new Cities("Raigarh"));

		hMap.put("MP", ll1);
		hMap.put("CG", ll2);

		for(Entry<String, LinkedList<Cities>> val : hMap.entrySet()) {
			System.out.println(val.getKey()+" "+val.getValue());
		}

	}

}
