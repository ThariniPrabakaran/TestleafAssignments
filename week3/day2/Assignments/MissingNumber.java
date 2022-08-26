package week3.day2.Assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		
		/*
		 * Problem 
		 * 
		 * There will be running number between 1 to 10
		 * One of the unique number will be missing
		 * Find the missing number
		 * 
		 * 
		 */
		
		/*
		 * Psuedocode
		 * 
		 * a) Remove the duplicates using Set
		 * b) Make sure the set is in the ascending order
		 * c) Iterate from the starting number and verify the next number is + 1
		 * d) If did not match, that is the number
		 * 
		 */
		
		
		int data[] = {1,2,3,2,1,5,6,3,7,7,8,10};
		List<Integer> list = new ArrayList<Integer>();
		//adding the value to list
		
		for (int i =0 ;i<data.length;i++)
		{
			list.add(data[i]);
		}
		System.out.print(list);
		Set<Integer> set = new TreeSet<Integer>();
		
		//assigning it to a Treeset to remove duplicate and sort 
		set.addAll(list);
		System.out.println("--------------------");

		System.out.print(set);
	
		for (int j=1;j<10;j++) {
		
		if(!set.contains(j))
	    {
	    	
	    System.out.println("This missing number :" + (j));
	  
	    }
	   
	    }
		
		
		
	}

}
