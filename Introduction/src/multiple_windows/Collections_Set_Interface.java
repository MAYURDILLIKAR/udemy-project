package multiple_windows;

import java.util.HashSet;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Collections_Set_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Set:--> Set is a unorder collection of objects.
		 */

		Set<String> set = new HashSet<String>();
		set.add("IDE");
		set.add("RC");
		set.add("WD");
		set.add("GRID");

		// Convert Collectin of objects into iterators
		java.util.Iterator<String> itr = set.iterator();

		// Read next itertor object at collection
		String obj1 = itr.next();
		System.out.println(obj1);

		// Read next itertor object at collection
		String obj2 = itr.next();
		System.out.println(obj2);

		// Read next itertor object at collection
		String obj3 = itr.next();
		System.out.println(obj3);

		// Read next itertor object at collection
		String obj4 = itr.next();
		System.out.println(obj4);

	}

}
