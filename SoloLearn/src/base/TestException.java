package base;

public class TestException {

	public static void main(String[] args) {
		
		try {
			int a [] = new int [2];
			System.out.println(a[1]);
		} catch (Exception e) {
			System.out.println("An error occured" + " " + "(" + e.getMessage() + ")");
			System.out.println(e);
			// si può usare il metodo seguente x maggiorni dettagli su exception
			//e.printStackTrace();
		}
		
		System.out.println("\n +++++ ciclo array con un ciclo for +++++ \n");
		
		try {
			int b [] = new int [6];
			b [0] = 5;
			b [1] = 7;
			b [2] = 3;
			b [3] = 6;
			b [4] = 5;
			b [5] = 4;
			
			for (int i = 0; i < b.length; i++) {
				System.out.println(b[i]);
			}
		} catch ( Exception x) {
			System.out.println("An error occured" + " " + "(" + x.getMessage() + ")");
			System.out.println(x);
		}
			
		
	}

}
