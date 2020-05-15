package base;

import java.util.ArrayList;
import java.util.Iterator;

public class TestNewArrayList {

	public static void main(String[] args) {
		// creo arraylist e lo popolo con ciclofor
		ArrayList <Integer> list = new ArrayList <Integer>();
		
		for(int i = 0; i < 6; i++) {
			list.add(i);
		}

		int x = 0;
		Iterator <Integer> it = list.iterator();
		
		while(it.hasNext()) {
			x+= it.next();
		}
		System.out.println("il valore di x è: " + x);
	}

}
