package base;

public class B extends A {
	
	protected int num1 = 200;
	
	public B () {
		System.out.println("i'm B!");
		System.out.println(num1);
		System.out.println(super.num1);
	}

}
