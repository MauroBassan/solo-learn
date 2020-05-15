package base;

public class TestLoader {

	public static void main(String[] args) {
		
		Thread obj = new Thread(new Loader());
		obj.start();

	}

}
