package OopzExProgs;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		ar.add(100);
		ar.add("Hello");
		ar.add('M');
		ar.add(12.33);
		
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

		System.out.println(ar.size());

		ar.remove(3);
		System.out.println(ar.size());

		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(23);
		System.out.println(ar1.get(0));

		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("srinivaas");
		ar2.add("Automation Tester");
		ar2.add("Delloit");

		ArrayList<String> ar3 = new ArrayList<String>();
		ar3.add("Selenium");
		ar3.add("Java");
		ar3.add("Testing Team");

		ar2.addAll(ar3);

		for (int i = 0; i < ar2.size(); i++) {
			System.out.println(ar2.get(i));
		}
		System.out.println("******************");
		ar2.removeAll(ar3);
		for (int i = 0; i < ar2.size(); i++) {
			System.out.println(ar2.get(i));
		}
		Employee e1 = new Employee("srinivaas", 50000, "Delloit");
		Employee e2 = new Employee("ramesh", 40000, "Wipro");
		Employee e3 = new Employee("suresh", 30000, "Capegemini");

		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		System.out.println("********************************");
		Iterator<Employee> it = emp.iterator();
		while (it.hasNext()) {
			Employee er = it.next();
			System.out.println(er.name + " " + er.salary + " " + er.company);

		}
	}

}
