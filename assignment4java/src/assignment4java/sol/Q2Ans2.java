package assignment4java.sol;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;


//#2. In above example, Use TreeMap, with key as State name, Value as object of Capital 
//city(with data members, name, population, brief). Iterate and display Key & Value.

public class Q2Ans2 {
	public static void main(String[] args) {
		
		TreeMap<String, CapitalCity> tMap = new TreeMap<String, CapitalCity>();
		tMap.put("MadhyaPradesh", new CapitalCity("Bhopal", 234243, "city of lakes"));
		tMap.put("Chhattisgarh", new CapitalCity("Raipur",4534423,"City of forests and mine"));
		tMap.put("Maharastra",new CapitalCity("Mumbai",99484,"Beaches sea"));
		tMap.put("Telangana", new CapitalCity("Hyderabad",34321,"IT Sector hub"));
		
		Set<String> keys = tMap.keySet();
		System.out.println("Using treemap output will come in ascending order : ");
		System.out.println("__________________________________________________________________________");
		for(Entry<String, CapitalCity> tm : tMap.entrySet()) {
			System.out.println("Capital is : "+tm.getKey()+" and city is : "+tm.getValue());
		}
		System.out.println("__________________________________________________________________________");
	}
}
