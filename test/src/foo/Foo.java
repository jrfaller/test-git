package foo;

public class Foo extends Bar {

	/**
	* The foo constructor.
	*/
	private Foo() {
		System.out.println("Foo!");
		id = 0;
		System.out.println(bar(1337));
	}

	/**
	* The bar method for the win.
	* @param fu is a dummy value.
	* @return is useless.
	*/
	protected int bar(int fu) {
		System.out.println("Bar!");
		return fu - 1;
	}

}
