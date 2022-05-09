package assignment4java.sol;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

//b) Now make changes such that TreeMap sorts state name in descending order
//str2.compareTo(str1)

public class Q1AnsB {
	public static void main(String[] args) {
		
		TreeMap<String, String> tMap = new TreeMap<String, String>(new MyComparator());
		tMap.put("MadhyaPradesh", "Bhopal");
		tMap.put("Chhattisgarh", "Raipur");
		tMap.put("Maharastra","Mumbai");
		tMap.put("Telangana", "Hyderabad");
	
		Set<String> keys = tMap.keySet();
		System.out.println("Using treemap output will come in descending order : ");
		
		System.out.println("__________________________________________________________________________");
		for(String key : keys) {
			String val = tMap.get(key);
			System.out.println(key+" "+val);
		}
		System.out.println("__________________________________________________________________________");
		
	}
}
class MyComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2)*-1;
	}
	
}
