package assignment4java.sol;

import java.util.TreeSet;

//#3. Create TreeSet with Strings, use Stream and convert each string into capital case, print the result

public class Q3AnsSol {
	public static void main(String[] args) {
		
		TreeSet<String> countrys = new TreeSet<String>();
		
		countrys.add("India");
		countrys.add("Us");
		countrys.add("Russia");
		countrys.add("Australia");
		countrys.add("England");
		
		countrys.stream().forEach(val -> { System.out.println(val.toUpperCase());} );
		
	}
}
