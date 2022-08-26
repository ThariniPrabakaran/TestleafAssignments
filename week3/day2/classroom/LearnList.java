package week3.day2.classroom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class LearnList {


	public static void main(String[] args) {
		
		List <Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(22);
		list.add(3);
		list.add(54);
		list.add(65);
		list.add(22);
		list.add(43);
		list.add(67);
		list.add(98);
		list.add(1);
		
		
		int size = list.size();
		
		for (int i=0 ;i<size;i++)
		{
			
			for (int j=i+1;j<size;j++)
			{
				if (list.get(i)==list.get(j))
				{
					
					System.out.println("Duplicate value is" +list.get(i));

				}
				
				
			}
		}
		
		
		Set<Integer> set = new HashSet<Integer>();
		set.addAll(list);
		System.out.println(set);
		
	}
}
