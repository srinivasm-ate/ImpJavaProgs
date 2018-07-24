package OopzExProgs;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		Hashtable h = new Hashtable();
		h.put(1, 2345);
		h.put(2, "Matta Srinivaas");
		h.put(3, 'M');
		h.put(4, 45.36);

		for (int i = 1; i <= h.size(); i++) {
			System.out.println(h.get(i));
		}

		Hashtable<Integer, Integer> h1 = new Hashtable<Integer, Integer>();
		h1.put(1, 100);
		Hashtable<Integer, String> h2 = new Hashtable<Integer, String>();
		h2.put(1, "ssss");
		Hashtable<Character, String> h3 = new Hashtable<Character, String>();
		h3.put('h', "ssss");

	}

}
