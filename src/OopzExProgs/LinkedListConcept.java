package OopzExProgs;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) 
	{
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Srinivaas");
		ll.add("Selenium Tester");
		ll.add("MALE");
		ll.add("Permanent");
		
		ll.addFirst("Mr.");
		ll.addLast("Senior");
		System.out.println(ll);
		ll.set(0, "Mister");
		
		System.out.println(ll.get(1));
		System.out.println(ll.set(1, "Matta Srinivaas"));
		System.out.println(ll);
		
		System.out.println("*********Using For Loop");
		for(int i=0;i<ll.size();i++)
		{
			System.out.println(ll.get(i));
		}
		System.out.println("*********Using For Each Loop");
		for(String str:ll)
		{
			System.out.println(str);
		}
		System.out.println("*********Using Iterator");
		Iterator<String> it=ll.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("*********Using While Loop");
		int n=0;
		while(ll.size()>n)
		{
			System.out.println(ll.get(n));
			n++;
		}
		
		
		
	}

}
