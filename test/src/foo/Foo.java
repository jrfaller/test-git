package foo;

public class Foo extends Bar {
	
	private Foo() {
		System.out.println("Foo!");
		id = 0;
	}

	public void bar() {
		System.out.println("Bar!");
	}
	
}
