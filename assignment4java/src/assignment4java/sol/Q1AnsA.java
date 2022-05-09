package assignment4java.sol;

import java.util.Set;
import java.util.TreeMap;

//#1. a) Change given HashMap example, to use TreeMap. Please share yoru observations on output?

public class Q1AnsA {
	public static void main(String[] args) {
		
		TreeMap<String, String> tMap = new TreeMap<String, String>();
		tMap.put("MadhyaPradesh", "Bhopal");
		tMap.put("Chhattisgarh", "Raipur");
		tMap.put("Maharastra","Mumbai");
		tMap.put("Telangana", "Hyderabad");
		
		Set<String> keys = tMap.keySet();
		System.out.println("Using treemap output will come in ascending order : ");
		System.out.println("__________________________________________________________________________");
		for(String key : keys) {
			String val = tMap.get(key);
			System.out.println(key+" "+val);
		}
		System.out.println("__________________________________________________________________________");
	}
}
