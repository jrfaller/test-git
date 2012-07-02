package foo;

public class Foo extends Bar {
	
	private Foo() {
		System.out.println("Foo!");
		id = 0;
	}

	protected void bar() {
		System.out.println("Bar!");
	}
	
}
