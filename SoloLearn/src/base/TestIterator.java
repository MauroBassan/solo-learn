package base;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestIterator {

	public static void main(String[] args) {
		List <String> animals = new LinkedList <>();
		
		animals.add("fox");
		animals.add("cat");
		animals.add("dog");
		animals.add("rabbit");
		
		Iterator <String> it = animals.iterator();
		
		Collections.sort(animals);
		
		//iterate all collection
		//.hasNext() return true if there is one more element
		//it.next() returns the next obj and moves the iterator
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
