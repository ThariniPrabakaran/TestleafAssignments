package week3.day2.Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {
public static void main(String[] args) {

	// Here is the input
	int[] data = {3,2,11,4,6,7,2,3,3,6,7};
			//       output= 7;

			/*
			 * Pseudo Code: 
			 * a) Create a empty Set Using TreeSet
			 * b) Declare for loop iterator from 0 to data.length and add into Set 
			 * c) converted Set into List
			 * d) Print the second last element from List
			 * 
			 * 
			 */
// Create a empty set - tree set w- output is ordered based on ASCII 
	Set<Integer> set = new TreeSet<Integer>();
    
//iterate a for to add value to set 
	for ( int i =0;i<data.length;i++) {
    	set.add(data[i]);
    }
	System.out.println(set);

//create a empty list
	List<Integer> list = new ArrayList<Integer>();

//converting set to List
	
	list.addAll(set);
	System.out.println("-------------------------");
	System.out.println(list);
	System.out.println("-------------------------");

//getting the size of list
	int size = list.size();

	
//printing the second last element 
	System.out.println("second last element:" +list.get(size-2));
	
	}

}
