package week3.day2.Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {
public static void main(String[] args) {

	
	
//	Declare a String as PayPal India
	String name = "PayPal India";

//	Convert it into a character array
	char[] charArray = name.toCharArray();

//	Declare a Set as charSet for Character
	Set<Character> charSet = new TreeSet<Character>();
	
//	Declare a Set as dupCharSet for duplicate Character
	
	Set<Character> dupCharset = new TreeSet<Character>();

//	Iterate character array and add it into charSet
	
	for (int i = 0; i < charArray.length; i++) {
		if (charSet.contains(charArray[i])) {
			dupCharset.add(charArray[i]);
		} else {
			charSet.add(charArray[i]);
		}
	}
	List<Character> list = new ArrayList<Character>();
	
	list.addAll(charSet);
	for (int i = 0; i < list.size(); i++) {
		if (list.get(i) == ' ') {
			list.remove(list.get(i));
		}
	}
	System.out.println(list);
}

}
