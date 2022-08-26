package week3.day2.Assignments;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicateNumber {

	public static void main(String[] args) {
		/*
		 * Problem Statement : Print only duplicate values
		 * Expected output: 4 and 8
		 * 
		 * How to solve?
		 * 1) Regular for loop
		 * 2) Using Set
		 * 
		 * Using Set 
		 * 
		 * a) Add every element into Set
		 * b) If it is already there in the Set -> Print duplicate
		 * 
		 */

		int[] data = {4,3,6,8,29,1,2,4,7,8};
        Set<Integer> set = new LinkedHashSet<Integer>();

		
		for (int j=0;j< data.length;j++)
			
		 {
				if (set.contains(data[j])) {
					System.out.println("Duplicate Number = " + data[j]);
				} else {
					set.add(data[j]);
				}
			}
	}
		
		

}
