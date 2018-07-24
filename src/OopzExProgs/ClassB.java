package OopzExProgs;

public class ClassB extends ClassA {

	public ClassB() {
		super();
		System.out.println("Child Class Constructor");
	}

	public ClassB(int i, int j) {
		super(i, j);
		System.out.println("Child Class Constructor");
	}

	public ClassB(String str, int j) {
		super(str, j);
		System.out.println("Child Class Constructor");
	}

	public static void main(String[] args) {
		ClassB obj = new ClassB();
		ClassB obj1 = new ClassB(10, 20);
		ClassB obj2 = new ClassB("Srinivaas", 600000);

	}

}
