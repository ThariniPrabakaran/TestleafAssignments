package week3.day2.Assignments;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueNumber {

	public static void main(String[] args) {
		//PrintUniqueCharacter
		/*
		 * Problem
		 * 
		 * a) Take your name as input
		 * b) Print all unique characters only (any order)
		 * 
		 * Input:  babu
		 * Output: a u 
		 * 
		 */

		/*
		 * Psuedocode
		 * 
		 * a) Convert String to Character array
		 * b) Create a new Set -> HashSet
		 * c) Add each character to the Set and if it is already there, remove it
		 * d) Finally, print the set
		 * 
		 */
		
		
				String name = "Tharini";
				char[] nameArray = name.toCharArray();
				System.out.println(nameArray);
				
				Set<Character> set = new HashSet<Character>();

				for (int i = 0; i < nameArray.length; i++) {
					if (set.contains(nameArray[i])) {
						set.remove(nameArray[i]);
					} else {
						set.add(nameArray[i]);
					}
				}
				System.out.println(set);
		
		
	}

}
