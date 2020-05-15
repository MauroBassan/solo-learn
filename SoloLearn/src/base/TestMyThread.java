package base;

public class TestMyThread {

	public static void main(String[] args) {
		
		MyThread m1 = new MyThread();
		m1.start();
		MyThread m2 = new MyThread();
		m2.start();
		MyThread m3 = new MyThread();
		m3.start();
	}

}
